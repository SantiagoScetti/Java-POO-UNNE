
/**
 *  Punto 10
 *  La clase Mujer representa a una mujer con un nombre, apellido, edad, estado civil y esposo.
 * 
 * @author Santiago
 * @version 1.1
 */
public class Mujer
{
    // variables de instancia
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    

    /**
    * Constructor para crear un objeto Mujer ya casada.
    * 
    * @param p_nombre El nombre de la mujer.
    * @param p_apellido El apellido de la mujer.
    * @param p_edad La edad de la mujer.
    * @param p_esposo El esposo de la mujer.
    */
    public Mujer(String p_nombre ,String p_apellido ,int p_edad ,Hombre p_esposo ){
        setNombre( p_nombre);
        setApellido( p_apellido);
        setEdad( p_edad);
        setEstadoCivil("Casada");
        setEsposo( p_esposo);
    }

    /**
    * Constructor para crear un objeto Mujer soltera.
    * 
    * @param p_nombre El nombre de la mujer.
    * @param p_apellido El apellido de la mujer.
    * @param p_edad La edad de la mujer.
    */
    public Mujer(String p_nombre ,String p_apellido ,int p_edad ){
        setNombre( p_nombre);
        setApellido( p_apellido);
        setEdad( p_edad);
        setEstadoCivil("Soltera");
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
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
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
    public Hombre getEsposo(){
        return this.esposo;
    } 
    
     /**
     * Permite a una mujer casarse con un hombre.
     * Si ambos están solteros, se establecerá el estado civil como "Casada" en ambos objetos.
     *
     * @param p_hombre El hombre con el que se va a casar.
     */
    public void casarseCon(Hombre p_hombre) {
        System.out.println(this.getNombre() + " intenta casarse con " + p_hombre.getNombre());
        if (!"Casada".equals(this.getEstadoCivil()) && !"Casado".equals(p_hombre.getEstadoCivil()) || p_hombre.getEsposa() == this) {
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada");
            System.out.println(this.getNombre() + " ahora está casada con " + p_hombre.getNombre());
            if (p_hombre.getEsposa() != this) { // Evitar el bucle infinito
                p_hombre.casarseCon(this);
            }
        } else {
            System.out.println("El matrimonio no es posible porque uno de ellos ya está casado.");
        }
    }
    
    /**
     * Permite a una mujer divorciarse de su esposo actual.
     * Actualiza el estado civil de ambos a "Divorciada" y "Divorciado", respectivamente.
     */
    public void divorcio() {
        if (this.esposo != null) {  // Verificamos si la mujer está casada
            Hombre esposoActual = this.esposo;
            setEsposo(null);
            setEstadoCivil("Divorciada");
            System.out.println(this.getNombre() + " ahora está divorciada.");
            if (esposoActual.getEsposa() == this){
                esposoActual.divorcio();
            } 
        } else {
            System.out.println(this.getNombre() + " no está casada, por lo que no se puede divorciar.");
        }
    }
    
     /**
     * Devuelve una cadena con los datos de la mujer.
     *
     * @return Una cadena con el nombre, apellido y edad de la mujer.
     */
    public String datos(){
        return (getNombre() + " " + getApellido() + ", de " + getEdad() + " años");
    }

    /**
     * Muestra el estado civil de la mujer en la consola.
     */
    public void mostrarEstadoCivil(){
        System.out.println (this.getNombre() + " " + this.getApellido() + ", de " + this.getEdad() + " años - " + this.getEstadoCivil());
    }

    /**
     * Muestra en la consola con quién está casada la mujer.
     * Si no está casada, muestra un mensaje indicando que no está casada.
     */
    public void casadaCon() {
        if (this.getEsposo() != null) {
            System.out.println(this.getNombre() + " " + this.getApellido() + ", de " + getEdad() + " años está casada con " +
            this.getEsposo().getNombre() + " " + this.getEsposo().getApellido() + ", de " + this.getEsposo().getEdad() + " años");
        } else {
            System.out.println(this.getNombre() + " " + this.getApellido() + " no está casada.");
        }
    }
}
