import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Alumno extends Usuario{

    public Alumno(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
    }

    public ArrayList<String> asignaturas = new ArrayList<>();
    public Map<String, ArrayList<Double>> notas = new HashMap<>();
    public String curso;


    // Metodos;

    public void agregarAsignaturas(String... asignaturas){
        for(String materia: asignaturas){
            this.asignaturas.add(materia);
        }
    }

    public static Map<String, ArrayList<Double>> poblarNotas(ArrayList<String> materia){
        Map<String, ArrayList<Double>> poblarNotas = new HashMap<>();
        for(String asignatura: materia){
            poblarNotas.put(asignatura, new ArrayList<Double>());
        }
        return poblarNotas;
    }


}
