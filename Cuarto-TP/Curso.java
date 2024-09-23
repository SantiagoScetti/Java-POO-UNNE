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
    public Curso(String p_nombre, Alumno p_alumno)
    {
        setNombre(p_nombre);
        setAlumnos(new HashMap<>());
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
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
    
    
    
    public void inscribirAlumno (Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    
    public Alumno quitarAlumno(Alumno p_alumno){
        if( this.getAlumnos().remove(p_alumno.getLu(), p_alumno)){
            return p_alumno;
        }
        return null;
    }
    

    public int cantidadDeAlumnos(){
        int contador = 0;
        for (Alumno unAlumno : this.getAlumnos().values() ) {
            if(unAlumno != null){
                contador++;
            }
        }
        return contador;
    }

    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }

    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }

    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }

    public void imprimirPromedioDelAlumno(int p_lu){
        Alumno estudiante = this.buscarAlumno(p_lu);
        System.out.println("****__Mostrar promedio del alumno" +  estudiante.getLu() + "__**** \n Pomedio:" + estudiante.promedio());
    }

    public void mostrarInscriptos(){

        System.out.println("Cantidad de Inscriptos: " + this.cantidadDeAlumnos());
        for (Alumno unAlumno : this.getAlumnos().values() ) {
            if(unAlumno != null){
                System.out.println(unAlumno.getLu() + " " + unAlumno.nomYApe());
            }
        }
    }

}
