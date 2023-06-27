public class estudiante extends persona {
    //Atributos
    private int codigo;
    private String correo;

    //Colocar vacio las herencias
    public estudiante(){ super();

    }

    //Contructores
    public estudiante(String nombre, String apellido, String direccion, int codigo, String correo) {
        super(nombre, apellido, direccion);
        this.codigo = codigo;
        this.correo = correo;
    }

    //Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void estudiar(){
        System.out.println("Este es el metodo estudiar de la clase estudiante");
    }


}
