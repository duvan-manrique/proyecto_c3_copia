package proyecto__c3;

import Basedatos.DBManager;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Repositorio1 {
	
    private static DBManager database = new DBManager();
     LocalDateTime ahora;
    static java.sql.Date fecha_1;

    public static void crear (Evento evento) {//envia datos a la vase de datos
        try {
            
            String query = "INSERT INTO eventos ( cedula,nombre,apellido,edad,fechanacimiento,fecharegistro,nomimagen,puntaje) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, evento.getCedula());
            sentenciaP.setString(2, evento.getNombre());
            sentenciaP.setString(3, evento.getApellido());
            sentenciaP.setString(4, evento.getEdad());
            //se obtiene de todos los datos
            fecha_1 =new java.sql.Date(evento.getFechanacimiento().getTime());
            sentenciaP.setDate(5, fecha_1);
            sentenciaP.setTimestamp(6, evento.getFecharegistro());
            sentenciaP.setString(7, evento.getNomimagen());
            sentenciaP.setString(8, evento.getPuntaje());
            sentenciaP.executeUpdate();
            sentenciaP.close();
            database.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

 
    

    public static Evento obtener(int id) {//metodo que obtiene la informacion de la base de datos
        try {
            String query = "SELECT * FROM eventos WHERE id = ?;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            sentenciaP.setString(1, Integer.toString(id));

            ResultSet resultado = sentenciaP.executeQuery();

            sentenciaP.close();
            database.close();

            while (resultado.next()) {
              //crea eventos segun los que estan en la base de datos 
                return Evento.crear(resultado.getInt("id"), resultado.getString("cedula"),  resultado.getString("nombre"), resultado.getString("apellido"),resultado.getString("edad"),java.sql.Date.valueOf(resultado.getString("fechanacimiento")),resultado.getTimestamp("fecharegistro"),resultado.getString("nomimagen"), resultado.getString("puntaje"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    
    
   
    //static  ArrayList<Evento> eventos;
    public static ArrayList<Evento> obtenerTodos() {//metodo que obtiene todo los eventos de la base de datos
       ArrayList<Evento> eventos = new ArrayList<Evento>();

        try {
            String query = "SELECT * FROM eventos;";
            PreparedStatement sentenciaP = database.open().prepareStatement(query);
            ResultSet resultado = sentenciaP.executeQuery();

            while (resultado.next()) {
                eventos.add(Evento.crear(resultado.getInt("id"), resultado.getString("nom_evento"), java.sql.Date.valueOf(resultado.getString("fecha_even")), resultado.getString("h_inicio"), resultado.getString("h_final"), resultado.getString("descripcion") ,resultado.getString("recreador"),resultado.getTimestamp("fecha_seguriti1")));
            }

            sentenciaP.close();
            database.close();

            return eventos;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return eventos;
    }

    public Repositorio1() {//metodo que actualisa la hora usada para seguriti 
        this.ahora = LocalDateTime.now();
    }
}
