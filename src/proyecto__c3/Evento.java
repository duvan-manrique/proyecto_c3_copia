package proyecto__c3;


import java.sql.Timestamp;
import java.util.Date;
//formato de varibles de un evento
public class Evento {//clase contenedora de los atributos del registro 
	//variables
    private int id = 0;
    private String  cedula,
                    nombre, 
                    apellido, 
                    edad,
                    puntaje,
                    nomimagen;
     private  Timestamp fecharegistro;//variable fecha de registro
     private   Date   fechanacimiento;//fecha de nacimiento

    public Evento(int id,  String cedula, String nombre, String apellido,String edad, Date fechanacimiento,Timestamp fecharegistro, String nomimagen ,  String puntaje) {
            //llenado de datos en las variables        
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechanacimiento = fechanacimiento;
        this.fecharegistro = fecharegistro;
        this.nomimagen = nomimagen;
        this.puntaje = puntaje;
    }

    public static Evento crear(int id,  String cedula, String nombre, String apellido,String edad, Date fechanacimiento,Timestamp fecharegistro, String nomimagen,  String puntaje) {
        //retorna un objeto de tipo evento 
        return new Evento( id,cedula,nombre,apellido,edad,fechanacimiento,fecharegistro,nomimagen,puntaje);
    }
//inicio de metodos de encapsulacion

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the puntaje
     */
    public String getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the nomimagen
     */
    public String getNomimagen() {
        return nomimagen;
    }

    /**
     * @param nomimagen the nomimagen to set
     */
    public void setNomimagen(String nomimagen) {
        this.nomimagen = nomimagen;
    }

    /**
     * @return the fecharegistro
     */
    public Timestamp getFecharegistro() {
        return fecharegistro;
    }

    /**
     * @param fecharegistro the fecharegistro to set
     */
    public void setFecharegistro(Timestamp fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    /**
     * @return the fechanacimiento
     */
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * @param fechanacimiento the fechanacimiento to set
     */
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
  
    

}
