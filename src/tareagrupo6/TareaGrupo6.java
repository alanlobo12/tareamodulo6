package tareagrupo6;

public class TareaGrupo6 {

    public static void main(String[] args) {
        Persona person = new Persona();

        person.setNombre("Leonard");
        person.setEdad("32");
        person.setOcupacion("Doctor");
        person.setNumId("0801193456");

        person.mostrarInformacion();

        System.out.println("-------------------------");

        Doctor doctor = new Doctor();

        doctor.setNombre("Carlos");
        doctor.setEdad("35");
        doctor.setNumId("010119874");
        doctor.setEspecialidad("Dermatología");

        doctor.mostrarInformacionDoctor();
    }
}