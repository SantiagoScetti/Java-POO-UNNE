/**
 * La clase {@code Alumno} representa a un estudiante con información personal y notas de dos evaluaciones.
 * Incluye métodos para calcular el promedio de las notas, determinar si aprueba y mostrar la información del alumno.
 * 
 * @author Santiago
 * @version 1.0
 */

public class Alumno
{
    // Atributos de la clase
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1 = 0;
    private double nota2 = 0;
    
     /**
     * Constructor de la clase {@code Alumno}.
     * 
     * @param p_lu       El número de libreta universitaria del alumno.
     * @param p_apellido El apellido del alumno.
     * @param p_nombre   El nombre del alumno.
     */
    public Alumno(int p_lu, String p_apellido, String p_nombre)
    {
        setLu(p_lu);
        setNombre(p_apellido);
        setApellido(p_nombre);
    }

    //SETTERS
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    private void setNombre(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setApellido(String p_nombre){
        this.nombre = p_nombre;
    }

    //Getters
    public int getLu(){
        return this.lu;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String apellido(){
        return this.apellido;
    }
    
    // Métodos de la clase Alumno

    /**
     * Establece la primera nota del alumno.
     * 
     * @param p_nota La nota obtenida en la primera evaluación.
     */
    public void setNota1(double p_nota)
    {
        this.nota1 = p_nota;     
        System.out.println("Nota 1" + this.nota1);
    }

    /**
     * Establece la segunda nota del alumno.
     * 
     * @param p_nota La nota obtenida en la segunda evaluación.
     */
    public void setNota2(double p_nota)
    {
        this.nota2 = p_nota;     
        System.out.println("Nota 2" + this.nota2);
    }
    
    
    private boolean aprueba(){
          return (promedio() > 7 && (this.nota1 > 6 && this.nota2 > 6));
    }

    private String leyendaAprueba()
    {
        if (aprueba()){
            return "APROBADO";
        }
        else{
           return "DESAPROBADO";
        }
        
    }
    

    /**
     * Calcula el promedio de las dos notas del alumno.
     * 
     * @return El promedio de las notas.
     */
    public double promedio()
    {
        double promedio = ((this.nota1 + this.nota2) /2);
        return promedio;
    }
    
    public String nomYApe()
    {
        String nya = this.nombre + this.apellido;
        return nya;
    }
    public String apeYnom()
    {
        String ayn = this.apellido + this.nombre;
        return ayn;
    }
    

    /**
     * Muestra la información completa del alumno, incluyendo su nombre, apellido,
     * LU, notas, promedio y si aprueba o no.
     */
    public void mostrar()
    {    
        System.out.println("Nombre y Apellido:" + nomYApe());
        System.out.println("lu:" + lu + "Notas: " + this.nota1 + " - " + this.nota2);
        System.out.println("Promedio:" + promedio() + " " + leyendaAprueba());
    }
    
}