package tareagrupo6;

public class Persona {

    public String nombre;
    public String NumId;
    public String edad;
    public String ocupacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumId() {
        return NumId;
    }

    public void setNumId(String NumId) {
        this.NumId = NumId;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void mostrarInformacion() {
        System.out.println("La ocupacion de la persona es: " + ocupacion);
        System.out.println("EL nombre es: " + nombre);
        System.out.println("Numero de Id: " + NumId);
        System.out.println("La edad es: " + edad + " años");
    }
}
