public class persona {
    //Atributos
    private String Nombre;
    private String Apellido;
    private String Direccion;

    //Colocar vacio la herencia
    public persona(){

    }
    //Constructores
    public persona(String nombre, String apellido, String direccion) {
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
    }

    //Getters and Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    //Metodos
    public void caminar(){
        System.out.println("Este es el metodo para caminar que pertenece a persona");
    }
}
