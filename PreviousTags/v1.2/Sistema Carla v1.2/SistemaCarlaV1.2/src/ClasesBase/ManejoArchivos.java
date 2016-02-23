/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

import java.awt.Component;
import java.io.*;
import java.util.Calendar;

public class ManejoArchivos {
    
    private static final int BUFFER = 1024;
    //para guardar en memoria
    private static StringBuffer temp = null;
    //para guardar el archivo SQL
    private static FileWriter  fichero = null;
    private static PrintWriter pw = null;
    //datos de la BD
    private static String host = VariablesLocales.host;
    private static String port = VariablesLocales.port;
    private static String user = VariablesLocales.user;
    private static String password = VariablesLocales.password;
    private static String db = VariablesLocales.db;
    private static String dia, mes, año, hora, minuto, segundo;
    
    public static boolean backUp(Component j, File destino){
        try {
            if(destino == null)
                return false;
            
            Process run = Runtime.getRuntime().exec(
            VariablesLocales.rutaBackUp + " --host=" + host + " --port=" + port +
            " --user=" + user + " --password=" + password +
            " --compact --complete-insert --extended-insert --skip-quote-names" +
            " --skip-comments --skip-triggers " + db);
            
            InputStream in = run.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            temp = new StringBuffer();
            int count;
            char[] cbuf = new char[BUFFER];
            while ((count = br.read(cbuf, 0, BUFFER)) != -1)
                temp.append(cbuf, 0, count);
            br.close();
            in.close();        
            
            Calendar c  = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH) +"";
            mes = c.get(Calendar.MONTH)+1+"";
            año = c.get(Calendar.YEAR)+"";
            hora = c.get(Calendar.HOUR)+"";
            minuto = c.get(Calendar.MINUTE)+"";
            segundo = c.get(Calendar.SECOND)+"";
            
            fichero = new FileWriter(destino.getAbsolutePath()+"\\BackUp "+dia+"-"+mes+"-"+año+"-"+hora+"h"+minuto+"m"+segundo+"s.sql");
            pw = new PrintWriter(fichero);                                                    
            pw.println(temp.toString());  
 
            MensajesValidaciones.mostrarInformacion(j, "Back Up exitoso en "+destino.getAbsolutePath());
            run.destroy();
            return true;
        }
        catch (IOException e){
            MensajesValidaciones.mostrarError(j, "Back Up fallido en "+destino.getAbsolutePath()+". "+e.getMessage());
            return false;
        }
        finally{
            try {           
                if (null != fichero)
                    fichero.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
        
}
