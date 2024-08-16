
/**
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
     * Constructor de clase Alumno
     */
    public Alumno(int p_lu, String p_apellido, String p_nombre)
    {
        this.lu = p_lu;
        this.apellido = p_apellido;
        this.nombre = p_nombre;
    }

    
    // Métodos de la clase Alumno
    public void setNota1(double p_nota)
    {
        this.nota1 = p_nota;     
        System.out.println("Nota 1" + nota1);
    }
    
    public void setNota2(double p_nota)
    {
        this.nota2 = p_nota;     
        System.out.println("Nota 2" + nota2);
    }
    
    private boolean aprueba()
    {
        // Variables temporales
        boolean bull = false;
        double promedio = promedio();
        
        if (promedio > 7 && (nota1 > 6 && nota2 > 6)){
            bull = true;
            
        }
        
        return bull;
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
    
    public double promedio()
    {
        double promedio = ((nota1 + nota2) /2);
        return promedio;
    }
    
    public String nomYApe()
    {
        String nya = nombre + apellido;
        return nya;
    }
    public String apeYnom()
    {
        String ayn = apellido + nombre;
        return ayn;
    }
    
    
    public void mostrar()
    {    
        System.out.println("Nombre y Apellido:" + nomYApe());
        System.out.println("lu:" + lu + "Notas: " + nota1 + " - " + nota2);
        System.out.println("Promedio:" + promedio() + " " + leyendaAprueba());
    }
    
    
    
    
    
}
