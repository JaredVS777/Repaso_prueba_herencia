public class main {
    public static void main(String[] args) {
        persona mipersona = new persona("Jared", "Valenzuela","Recreo");
        System.out.println(mipersona.getDireccion());
        System.out.println("--------------------------------------------");
        estudiante miEstudiante = new estudiante("Alejadnro","Moreira","DosPuentes",21324132,"alejadro@hotmail.com");
        System.out.println("Nombre: "+miEstudiante.getNombre());
        System.out.println("Apellido: "+miEstudiante.getApellido());
        System.out.println("Direccion: "+miEstudiante.getDireccion());
        System.out.println("Codigo: "+miEstudiante.getCodigo());
        System.out.println("Correo: "+miEstudiante.getCorreo());
        System.out.println("--------------------------------------------");
        doctor miDoctor = new doctor ();
        miDoctor.setNombre("Esteban");
        System.out.println("Nombre: "+miDoctor.getNombre());
        miDoctor.setApellido("Valenzuela");
        System.out.println("Apellido: "+miDoctor.getApellido());
        miDoctor.setCodigo_doctor(21432432);
        System.out.println("Codigo: "+miDoctor.getCodigo_doctor());
        miDoctor.setEspecialidad("general");
        System.out.println("Especialidad: "+miDoctor.getEspecialidad());
        miDoctor.setDireccion("Ibarra");
        System.out.println("Direccion: "+miDoctor.getDireccion());
    }
}
