import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Alumno extends Usuario{
    public Map<String, ArrayList<Double>> notas;
    public ArrayList<String> asignaturas;
    public String curso;
    public Alumno(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
        this.notas = new Hashmap<>();
        this.asignaturas = new ArrayList<>();
    
    }




    // Metodos;
    public void verNotas(){
        System.out.println(this.notas);

    }
    


}
