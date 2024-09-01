
/**
 * PUNTO 10
 * La clase Hombre representa a un hombre con un nombre, apellido, edad, estado civil y esposa.
 *
 * @author santi y franco
 * @version 1.1
 */
public class Hombre
{
    // variables de instancia
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    /**
    * Constructor para crear un objeto Hombre ya casado.
    * 
    * @param p_nombre El nombre del hombre.
    * @param p_apellido El apellido del hombre.
    * @param p_edad La edad del hombre.
    * @param p_esposa La esposa del hombre.
    */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        setNombre(p_nombre);
        setApellido(p_apellido);
        setEdad(p_edad);
        setEstadoCivil("Casado");
        setEsposa(p_esposa);
    }

    /**
    * Constructor para crear un objeto Hombre soltero.
    * 
    * @param p_nombre El nombre del hombre.
    * @param p_apellido El apellido del hombre.
    * @param p_edad La edad del hombre.
    */
    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        setNombre(p_nombre);
        setApellido(p_apellido);
        setEdad(p_edad);
        setEstadoCivil("Soltero");
    }

    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
    }
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public Mujer getEsposa(){
        return this.esposa;
    } 
    
    /**
     * Permite a un hombre casarse con una mujer.
     * Si ambos están solteros, se establecerá el estado civil como "Casado" en ambos objetos.
     *
     * @param p_mujer La mujer con la que se va a casar.
     */
    public void casarseCon(Mujer p_mujer) {
        System.out.println(this.getNombre() + " intenta casarse con " + p_mujer.getNombre());
        if (!"Casado".equals(this.getEstadoCivil()) && !"Casada".equals(p_mujer.getEstadoCivil()) || p_mujer.getEsposo() == this) {
            this.setEsposa(p_mujer);
            this.setEstadoCivil("Casado");
            System.out.println(this.getNombre() + " ahora está casado con " + p_mujer.getNombre());
            if (p_mujer.getEsposo() != this) { // Evitar el bucle infinito
                p_mujer.casarseCon(this);
            }
        } else {
            System.out.println("El matrimonio no es posible porque uno de ellos ya está casado.");
        }
    }
    
    /**
     * Permite a un hombre divorciarse de su esposa actual.
     * Actualiza el estado civil de ambos a "Divorciado" y "Divorciada", respectivamente.
     */
    public void divorcio() {
        if (this.esposa != null) {  // Verificamos si el hombre está casado
            Mujer esposaActual = this.esposa;
            this.setEsposa(null);  
            this.setEstadoCivil("Divorciado");
            System.out.println(this.getNombre() + " ahora está divorciado.");
            if (esposaActual.getEsposo() == this) {
                esposaActual.divorcio(); 
            }
        } else {
            System.out.println(this.getNombre() + " no está casado, por lo que no se puede divorciar.");
        }
    }
    
    public String datos(){
        return (getNombre() + " " + getApellido() + ", de " + getEdad() + " años");
    }
    public void mostrarEstadoCivil(){
        System.out.println (getNombre() + " " + getApellido() + ", de " + getEdad() + " años - " + getEstadoCivil());
    }
    public void casadoCon() {
        if (getEsposa() != null) {
            System.out.println(getNombre() + " " + getApellido() + ", de " + getEdad() + " años está casado con " +
            getEsposa().getNombre() + " " + getEsposa().getApellido() + ", de " + getEsposa().getEdad() + " años");
        } else {
            System.out.println(getNombre() + " " + getApellido() + " no está casado.");
        }
    }
}
