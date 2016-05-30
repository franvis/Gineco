/*
 * Clase DAO dedicada a los antecedentes ginecologicos
 */
package DAO;

import ClasesBase.AntecedentesGinecologicos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOAntecedentesGinecologicos {
    
     private DAOConexion conexion;
    private ResultSet rs;
    private Connection conn;
    private AntecedentesGinecologicos ag;
    private Statement st;

    public DAOAntecedentesGinecologicos() {
        conexion = new DAOConexion();
    }
    
    /**
     * Metodo utilizado para registrar un antecedente ginecologico
     * @param aginec Antecedente Ginecologico a registrar
     * @param dni dni del paciente que posee ese antecedente ginecologico
     * @return true si se registra correctamente, false si no se registra
     */
    public boolean registrarAntecedentesGinecologicos(AntecedentesGinecologicos aginec,long dni)
    {
        String cons = "INSERT INTO sistemaCarla.AntecedentesGinecologicos VALUES (null,"
                    +aginec.getMenarca()+",'"+aginec.getTelarca()+"',"
                    +aginec.getMenopausia()+","+aginec.getDuracionMenstrual()+","
                    +aginec.getPeriodoMenstrual()+","+aginec.getGestaciones()+","
                    +aginec.getAbortos()+ ","+aginec.getVivos()+","
                    +aginec.getMuertos()+ ","+aginec.isDispareunia()+","
                    +aginec.isDismenorrea()+ ","+aginec.isSdpm()+",'"
                    +aginec.getAnticonceptivos()+ "',"+aginec.getPartos()+","
                    +aginec.getCesareas()+ ",'"+aginec.getObservaciones()+"',"
                    +dni+ ")";
         
         return conexion.executeNonQuery(cons);
    }
    
    /**
     * Metodo utilizado para obtener un antecedente ginecologico
     * @param dni dni del paciente cuyo antecedente se quiere obtener
     * @return Antecedente Ginecologico buscado
     */
    public AntecedentesGinecologicos getAntecedenteGinecologico(long dni)
    {
    ag = null;
    conn = conexion.conectarBD();
        String cons = "SELECT * FROM sistemaCarla.AntecedentesGinecologicos WHERE dniPaciente = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(cons);
            if(rs.next())
            {
                ag = new AntecedentesGinecologicos();
                ag.setAbortos(rs.getInt("abortos"));
                ag.setAnticonceptivos(rs.getString("anticonceptivos"));
                ag.setCesareas(rs.getInt("cesareas"));
                ag.setDismenorrea(rs.getBoolean("dismenorrea"));
                ag.setDispareunia(rs.getBoolean("dispareunia"));
                ag.setDuracionMenstrual(rs.getInt("duracionMenstrual"));
                ag.setGestaciones(rs.getInt("gestaciones"));
                ag.setMenarca(rs.getInt("menarca"));
                ag.setMenopausia(rs.getInt("menopausia"));
                ag.setMuertos(rs.getInt("muertos"));
                ag.setObservaciones(rs.getString("observaciones"));
                ag.setPartos(rs.getInt("partos"));
                ag.setPeriodoMenstrual(rs.getInt("periodoMenstrual"));
                ag.setSdpm(rs.getBoolean("sdpm"));
                ag.setTelarca(rs.getString("telarca"));
                ag.setVivos(rs.getInt("vivos"));
                
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        conexion.desconectarBD(conn);
        return ag;
    }
    
    /**
     * Metodo utilizado para actualizar un antecedente ginecologico
     * @param aginec Antecedente Ginecologico modificado para actualizar
     * @param dni dni del paciente que posee ese antecedente familiar
     * @return true si se actualiza correctamente, false si no se actualiza
     */
    public boolean actualizarAntecedente(AntecedentesGinecologicos aginec, long dni) {
        
        String cons = "UPDATE sistemaCarla.AntecedentesGinecologicos SET "+
                    " menarca = "+aginec.getMenarca()+
                    ",telarca = '"+aginec.getTelarca()+
                    "',menopausia = "+aginec.getMenopausia()+
                    ",duracionMenstrual = "+aginec.getDuracionMenstrual()+
                    ",periodoMenstrual = "+aginec.getPeriodoMenstrual()+
                    ",gestaciones = "+aginec.getGestaciones()+
                    ",abortos = "+aginec.getAbortos()+
                    ",vivos = "+aginec.getVivos()+
                    ",muertos = "+aginec.getMuertos()+ 
                    ",dispareunia = "+aginec.isDispareunia()+
                    ",dismenorrea = "+aginec.isDismenorrea()+
                    ",sdpm = "+aginec.isSdpm()+
                    ",anticonceptivos = '"+aginec.getAnticonceptivos()+
                    "',partos = "+aginec.getPartos()+
                    ",cesareas = "+aginec.getCesareas()+
                    ",observaciones = '"+aginec.getObservaciones()+
                    "' WHERE dniPaciente = "+dni;
         
         return conexion.executeNonQuery(cons);
    }
    
    
    
}
