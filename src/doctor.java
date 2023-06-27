public class doctor extends persona {
    //Atributos
    private int codigo_doctor;
    private String especialidad;

    //Colocar vacio la herencia
    public doctor (){super();
    }

    public doctor(String nombre, String apellido, String direccion, int codigo_doctor, String especialidad) {
        super(nombre, apellido, direccion);
        this.codigo_doctor = codigo_doctor;
        this.especialidad = especialidad;
    }

    public int getCodigo_doctor() {
        return codigo_doctor;
    }

    public void setCodigo_doctor(int codigo_doctor) {
        this.codigo_doctor = codigo_doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void examinar(){
        System.out.println("Este es el metodo examinar de la clase doctor");
    }
}
