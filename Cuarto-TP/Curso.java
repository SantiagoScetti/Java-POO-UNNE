import java.util.HashMap;

/**
 * TP 4 punto 5
 * 
 * @author santi 
 * @version 1.0
 */
public class Curso
{
    // instance variables
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    
    //Constructores
     
    public Curso(String p_nombre)
    {
        setNombre(p_nombre);
        setAlumnos(new HashMap<>());
    }
    public Curso(String p_nombre, HashMap p_alumnos)
    {
        setNombre(p_nombre);
        setAlumnos(p_alumnos);
    }


    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
     private void setAlumnos(HashMap<Integer, Alumno> p_alumnos) {
        this.alumnos = p_alumnos;
    }

    // GETTERS
    public String getNombre() {
        return this.nombre;
    }
    public HashMap<Integer, Alumno> getAlumnos() {
        return this.alumnos;
    }

    //METODOS
    
    
    
    public void inscribirAlumno (){
        
    }
    public Alumno quitarAlumno(){

    }
    
    

    public int cantidadDeAlumnos(){

    }

    public boolean estaInscripto(int p_lu){
        
    }

    public boolean estaInscripto(Alumno p_alumno){
        
    }

    public Alumno buscarAlumno(int p_lu){

    }

    public void imprimirPromedioDelAlumno(int p_lu){

    }

    public void mostrarInscriptos(){

    }

}
