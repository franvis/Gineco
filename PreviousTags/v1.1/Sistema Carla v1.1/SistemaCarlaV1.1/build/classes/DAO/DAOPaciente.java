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
    
    /**
     * Metodo utilizado para registrar un paciente
     * @param p Paciente a registrar
     * @return true si se registra correctamente, false si no se registra
     */ 
    public boolean registrarPaciente(Paciente p)
    {
        String cons ="";
        
        if (p.getObraSocial().getId()!=0)
                    cons = "INSERT INTO sistemaCarla.Paciente VALUES ("+p.getDni()+",'"
                      +p.getNombre()+"','"+p.getApellido()+"',"+p.getTelefono()+","
                      +"str_to_date('"+p.getFechaNacimiento()+"', '%d/%c/%Y')"+
                      ",'"+p.getGrupoSanguineo()+"',"+p.getFactor()+","
                      +p.getObraSocial().getId()+ ",'"+p.getNumeroAfiliado()+"')";
        
        else
            cons = "INSERT INTO sistemaCarla.Paciente (dni, nombre, apellido, telefono, fechaNacimiento, grupoSanguineo, factor) VALUES ("+p.getDni()+",'"
                      +p.getNombre()+"','"+p.getApellido()+"',"+p.getTelefono()+","
                      +"str_to_date('"+p.getFechaNacimiento()+"', '%d/%c/%Y')"+
                      ",'"+p.getGrupoSanguineo()+"',"+p.getFactor()+")";
       return (conexion.executeNonQuery(cons) && registrarAntecedentes(p));

    }
    
    /**
     * Metodo utilizado para registrar los antecedentes de un paciente
     * @param p Paciente que posee los antecedentes a registrar
     * @return true si se registran correctamente, false si no se registran
     */
    private boolean registrarAntecedentes(Paciente p) 
    { 
        return (daoAntecFam.registrarAntecedentesFamiliares(p.getAntecFam(),p.getDni()) && 
                daoAntecGen.registrarAntecedentesGenerales(p.getAntecGen(),p.getDni()) &&
                daoAntecGinec.registrarAntecedentesGinecologicos(p.getAntecGinec(),p.getDni()));
    }
    
    /**
     * Metodo utilizado para obtener todos los pacientes segun filtro
     * @param nombre nombre a partir del cual filtrar
     * @param apellido apellido a partir del cual filtrar
     * @param dni dni a partir del cual filtrar
     * @return Lista que contiene todos los pacientes segun filtros
     */
    public LinkedList<Paciente> getAllPacientes(String nombre,String apellido, String dni)
    {
        pacientes = new LinkedList<>();
        
        
        consulta = "SELECT dni, nombre, apellido, fechaNacimiento, MAX(fecha) AS fechaUltimaConsulta FROM sistemaCarla.paciente LEFT JOIN sistemaCarla.consulta ON dni=dniPaciente ";
        String where = "";
        String orderBy = "";
        
        if (!dni.isEmpty()){
            if (!where.isEmpty())
                where +=  " AND ";
            where += " CONVERT(dni, CHAR) LIKE '"+dni+"%' ";
            if (!orderBy.isEmpty())
                orderBy +=  " , ";
            orderBy += " dni ASC ";
        }
        
        if (!apellido.isEmpty()){
            if (!where.isEmpty())
                where +=  " AND ";
            where += " apellido LIKE '"+apellido+"%' ";
            if (!orderBy.isEmpty())
                orderBy +=  " , ";
            orderBy += " apellido ASC ";
        }
        
        if (!nombre.isEmpty()){
            if (!where.isEmpty())
                where +=  " AND ";
            where += " nombre LIKE '"+nombre+"%' ";
            if (!orderBy.isEmpty())
                orderBy +=  " , ";
            orderBy += " nombre ASC ";
        }
        
        if(!where.isEmpty())
            consulta += " WHERE "+where+" GROUP BY dni, nombre, apellido, fechaNacimiento ORDER BY "+ orderBy;
        else
            return pacientes;
        
        
        conn = conexion.conectarBD();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next())
            {
                p = new Paciente();
                p.setDni(rs.getLong("dni"));
                if (p.getDni() == 0)
                   break;
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                String año, mes, dia;
                String fecha = rs.getString("fechaNacimiento");
                año = fecha.substring(0, 4);
                mes = fecha.substring(5, 7);
                dia = fecha.substring(8, 10);
                p.setFechaNacimiento(dia+"/"+mes+"/"+año);
                String fechaUltimaConsulta = "Sin consultas";
                if(rs.getObject("fechaUltimaConsulta") != null){
                    fechaUltimaConsulta = rs.getString("fechaUltimaConsulta");
                    año = fechaUltimaConsulta.substring(0, 4);
                    mes = fechaUltimaConsulta.substring(5, 7);
                    dia = fechaUltimaConsulta.substring(8, 10);
                    fechaUltimaConsulta = dia+"/"+mes+"/"+año;
                }
                p.setFechaUltimaConsulta(fechaUltimaConsulta);
                pacientes.add(p);
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        conexion.desconectarBD(conn);
        return pacientes;
    }
    
    /**
     * Metodo utilizado para verificar la existencia de un paciente
     * @param dni dni del paciente a validar
     * @return true si se encuentra, false si no se encuentra
     */
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
    
    /**
     * Metodo utilizado para obtener datos básicos de un paciente
     * @param dni
     * @return Paciente con datos básicos para ventana principal: dni, nombre, apellido, fechaNacimiento, fechaUltimaConsulta
     */
    public Paciente getPacienteBasico(long dni)
    {
    p = null;
    conn = conexion.conectarBD();
        consulta = "SELECT dni, nombre, apellido, fechaNacimiento, MAX(fecha) AS fechaUltimaConsulta FROM sistemaCarla.paciente LEFT JOIN sistemaCarla.consulta ON dni=dniPaciente WHERE dni = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                p = new Paciente();
                p.setDni(dni);
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                String fecha = rs.getString("fechaNacimiento");
                String año = fecha.substring(0, 4);
                String mes = fecha.substring(5, 7);
                String dia = fecha.substring(8, 10);
                p.setFechaNacimiento(dia+"/"+mes+"/"+año);
                String fechaUltimaConsulta = "Sin consultas";
                if(rs.getObject("fechaUltimaConsulta") != null){
                    fechaUltimaConsulta = rs.getString("fechaUltimaConsulta");
                    año = fechaUltimaConsulta.substring(0, 4);
                    mes = fechaUltimaConsulta.substring(5, 7);
                    dia = fechaUltimaConsulta.substring(8, 10);
                    fechaUltimaConsulta = dia+"/"+mes+"/"+año;
                }
                p.setFechaUltimaConsulta(fechaUltimaConsulta);
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return p;
    }
    
    /**
     * Metodo utilizado para obtener un paciente completo
     * @param dni
     * @return Paciente completo requerido
     */
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
                if(rs.getObject("obraSocial") != null && rs.getInt("obraSocial") != 0 )
                    p.setObraSocial(daoObraSocial.getObraSocial(rs.getInt("obraSocial")));
                else
                    p.setObraSocial(new ObraSocial(0, "Sin Obra Social"));
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
    
    /**
     * Metodo utilizado para obtener un paciente sin antecedentes
     * @param dni dni del paciente buscado
     * @return Paciente buscado
     */
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
                if(rs.getObject("obraSocial") != null && rs.getInt("obraSocial") != 0 )
                    p.setObraSocial(daoObraSocial.getObraSocial(rs.getInt("obraSocial")));
                else
                    p.setObraSocial(new ObraSocial(0, "Sin Obra Social"));
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

    /**
     * Metodo utilizado para actualizar un paciente
     * @param dniAnterior dni del paciente anterior a la modificacion
     * @param p Paciente a actualizar
     * @return true si se actualiza correctamente, false si no se actualiza
     */
    public boolean actualizarPaciente(Paciente p,long dniAnterior) {
        boolean rtdo = false;
        try{
        String cons = "";
        if(p.getObraSocial().getId() != 0)
            cons = "UPDATE sistemaCarla.Paciente SET "+
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
        else
            cons = "UPDATE sistemaCarla.Paciente SET "+
                      "dni = "+p.getDni()+  
                      ",nombre='"+p.getNombre()+
                      "',apellido='"+p.getApellido()+
                      "',telefono="+p.getTelefono()+
                      ",fechaNacimiento="+"str_to_date('"+p.getFechaNacimiento()+"', '%d/%c/%Y')"+
                      ",grupoSanguineo='"+p.getGrupoSanguineo()+
                      "',factor="+p.getFactor()+
                      ",obraSocial=null"+
                      ",numeroAfiliado=null"+
                      " WHERE dni ="+dniAnterior;
        rtdo = (conexion.executeNonQuery(cons) && actualizarAntecedentes(p));
        }
        catch(Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
       return rtdo;

    }
    
    /**
     * Metodo utilizado para actualizar los antecedentes de un paciente
     * @param p Paciente que contiene los antecedentes a actualizar
     * @return true si se actualizan correctamente, false si no se actualizan
     */
    private boolean actualizarAntecedentes(Paciente p) {
       long dni = p.getDni();
       return (daoAntecFam.actualizarAntecedente(p.getAntecFam(),dni) &&
               daoAntecGen.actualizarAntecedente(p.getAntecGen(),dni) &&
               daoAntecGinec.actualizarAntecedente(p.getAntecGinec(),dni));
   
    }
    
    /**
     * Metodo utilizado para eliminar un paciente
     * @param dni dni del paciente a eliminar
     * @return true si se elimina correctamente, false si no se elimina
     */
    public boolean borrarPaciente(long dni) {
        
        String cons = "DELETE FROM PACIENTE WHERE dni = "+dni;
       
       return conexion.executeNonQuery(cons);
    }


}
