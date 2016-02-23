/*
 *Clase DAO dedicada al paciente;
 */
package DAO;

import ClasesBase.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

                            //Consulta para traer todo de todo de los pacientes:
                           //SELECT * FROM paciente AS P INNER JOIN antecedentesgenerales AS AGEN ON P.dni = AGEN.pacienteGen 
                          //                            INNER JOIN antecedentesfamiliares AS AF ON AF.pacienteFam = AGEN.pacienteGen
                         //                            INNER JOIN antecedentesginecologicos AS AGINEC ON AF.pacienteFam = AGINEC.pacienteGinec;
/**
 *
 * @author Fran
 */
public class DAOPaciente {
    
    private DAOConexion conexion;
    private DAOObraSocial daoObraSocial;
    private DAOAntecedentesFamiliares daoAntecFam;
    private DAOAntecedentesGenerales daoAntecGen;
    private DAOAntecedentesGinecologicos daoAntecGinec;
    private LinkedList<Paciente> pacientes;
    private ResultSet rs;
    private Connection conn;
    private Paciente p;
    private String consulta;
    private Statement st;
    
    public DAOPaciente() {
        conexion = new DAOConexion();
        daoObraSocial = new DAOObraSocial();
        daoAntecFam = new DAOAntecedentesFamiliares();
        daoAntecGen = new DAOAntecedentesGenerales();
        daoAntecGinec = new DAOAntecedentesGinecologicos();
    }
    
    public boolean registrarPaciente(Paciente p)
    {
        String cons = "INSERT INTO sistemaCarla.Paciente VALUES ("+p.getDni()+",'"
                      +p.getNombre()+"','"+p.getApellido()+"',"+p.getTelefono()+","
                      +"str_to_date('"+p.getFechaNacimiento()+"', '%d/%c/%Y')"+
                      ",'"+p.getGrupoSanguineo()+"',"+p.getFactor()+","
                      +p.getObraSocial().getId()+",'"+p.getNumeroAfiliado()+"')";
        
       
       return (conexion.executeNonQuery(cons) && registrarAntecedentes(p));

    }

    private boolean registrarAntecedentes(Paciente p) 
    { 
        return (daoAntecFam.registrarAntecedentesFamiliares(p.getAntecFam(),p.getDni()) && 
                daoAntecGen.registrarAntecedentesGenerales(p.getAntecGen(),p.getDni()) &&
                daoAntecGinec.registrarAntecedentesGinecologicos(p.getAntecGinec(),p.getDni()));
     }
    
    public LinkedList<Paciente> getAllPacientes(String nombre,String apellido)
    {
        pacientes = new LinkedList<>();
        
        if(apellido.isEmpty() && !nombre.isEmpty())
            consulta = "SELECT dni, nombre, apellido, fechaNacimiento FROM sistemaCarla.paciente WHERE nombre LIKE '"+nombre+"%' ORDER BY nombre ASC";
        else if(!apellido.isEmpty() && nombre.isEmpty())
            consulta = "SELECT dni, nombre, apellido, fechaNacimiento FROM sistemaCarla.paciente WHERE apellido LIKE '"+apellido+"%' ORDER BY apellido ASC";
        else if(!apellido.isEmpty() && !nombre.isEmpty())
            consulta = "SELECT dni, nombre, apellido, fechaNacimiento FROM sistemaCarla.paciente WHERE nombre LIKE '"+nombre+"%' AND"
                    + " apellido LIKE '"+apellido+"%' ORDER BY apellido ASC";
        else{
            consulta = "";
            return pacientes;
            }
        
        conn = conexion.conectarBD();
        
       
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next())
            {
                p = new Paciente();
                p.setDni(rs.getLong("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                String fecha = rs.getString("fechaNacimiento");
                String año = fecha.substring(0, 4);
                String mes = fecha.substring(5, 7);
                String dia = fecha.substring(8, 10);
                p.setFechaNacimiento(dia+"/"+mes+"/"+año);
                //FALTAN LA FECHA DE LA ULTIMA CONSULTA
                pacientes.add(p);
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return pacientes;
    }
    
    public Paciente getPacienteBusqueda(long dni)
    {
    p = null;
    conn = conexion.conectarBD();
        consulta = "SELECT nombre, apellido, fechaNacimiento FROM paciente WHERE dni = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                p = new Paciente();
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setFechaNacimiento(rs.getString("fechaNacimiento"));
                //FALTAN LA FECHA DE LA ULTIMA CONSULTA
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return p;
    }

    public boolean verificarPaciente(long dni)
    {
    boolean verificacion = false;
    conn = conexion.conectarBD();
        consulta = "SELECT 1 FROM sistemaCarla.paciente WHERE dni = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
              verificacion = true;
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
    return verificacion;
    }
    
    public Paciente getPacienteCompleto(long dni)
    {
    p = null;
    conn = conexion.conectarBD();
        consulta = "SELECT * FROM paciente WHERE dni = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                p = new Paciente();
                p.setDni(dni);
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setFechaNacimiento(rs.getString("fechaNacimiento"));
                p.setFactor(rs.getBoolean("factor"));
                p.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                p.setNumeroAfiliado(rs.getString("numeroAfiliado"));
                p.setObraSocial(daoObraSocial.getObraSocial(rs.getInt("obraSocial")));
                p.setTelefono(rs.getString("telefono"));
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        conexion.desconectarBD(conn);
        
        p.setAntecFam(daoAntecFam.getAntecedenteFamiliar(dni));
        p.setAntecGinec(daoAntecGinec.getAntecedenteGinecologico(dni));
        p.setAntecGen(daoAntecGen.getAntecedenteGeneral(dni));
        
        return p;
    }

    public Paciente getPaciente(long dni)
    {
    p = null;
    conn = conexion.conectarBD();
        consulta = "SELECT * FROM paciente WHERE dni = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                p = new Paciente();
                p.setDni(dni);
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                p.setFechaNacimiento(rs.getString("fechaNacimiento"));
                p.setFactor(rs.getBoolean("factor"));
                p.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                p.setNumeroAfiliado(rs.getString("numeroAfiliado"));
                p.setObraSocial(daoObraSocial.getObraSocial(rs.getInt("obraSocial")));
                p.setTelefono(rs.getString("telefono"));
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        conexion.desconectarBD(conn);
        
        return p;
    }

    
    public boolean actualizarPaciente(Paciente p,long dniAnterior) {
        
        String cons = "UPDATE sistemaCarla.Paciente SET "+
                      "dni = "+p.getDni()+  
                      ",nombre='"+p.getNombre()+
                      "',apellido='"+p.getApellido()+
                      "',telefono="+p.getTelefono()+
                      ",fechaNacimiento="+"str_to_date('"+p.getFechaNacimiento()+"', '%d/%c/%Y')"+
                      ",grupoSanguineo='"+p.getGrupoSanguineo()+
                      "',factor="+p.getFactor()+
                      ",obraSocial="+p.getObraSocial().getId()+
                      ",numeroAfiliado='"+p.getNumeroAfiliado()+
                      "' WHERE dni ="+dniAnterior;
        
       
       return (conexion.executeNonQuery(cons) && actualizarAntecedentes(p));

    }

    private boolean actualizarAntecedentes(Paciente p) {
       long dni = p.getDni();
       return (daoAntecFam.actualizarAntecedente(p.getAntecFam(),dni) &&
               daoAntecGen.actualizarAntecedente(p.getAntecGen(),dni) &&
               daoAntecGinec.actualizarAntecedente(p.getAntecGinec(),dni));
   
    }

    public boolean borrarPaciente(long dni) {
        
        String cons = "DELETE FROM PACIENTE WHERE dni = "+dni;
       
       return conexion.executeNonQuery(cons);
    }


}
