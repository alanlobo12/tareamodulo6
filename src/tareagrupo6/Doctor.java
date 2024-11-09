package tareagrupo6;

public class Doctor extends Persona {

    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarInformacionDoctor() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Número de ID: " + getNumId());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Especialidad: " + especialidad);
    }
}
