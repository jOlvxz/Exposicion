public class Usuario{
    public String rut;
    public String nombre;
    public String apellido;
    public boolean esFuncionario;
    public Apoderado apoderado;

    public Usuario(String rut, String nombre, String apellido){
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
    }

}