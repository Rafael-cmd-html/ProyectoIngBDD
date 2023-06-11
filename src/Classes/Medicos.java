
package Classes;

/**
 *
 * @author Rafael Castillejos
 */
public class Medicos {
    
    String nombre, especialidad, fecha_ingreso, cedula, numeroTel, correo, idMedico;
    
    public Medicos(){
        
        
        
    }
    public Medicos(String nombre, String especialidad, String fecha_ingreso, String cedula, String numeroTel, String correo, String idMedico){
        
        this.nombre= nombre;
        this.especialidad= especialidad;
        this.fecha_ingreso= fecha_ingreso;
        this.cedula= cedula;
        this.numeroTel= numeroTel;
        this.correo= correo;
        this.idMedico= idMedico;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }
    
}
