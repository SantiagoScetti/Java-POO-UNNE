public class Circulo extends Elipse  {
    // variables de instancia
    private double radio;

    /**
     * Constructores
     */
    public Circulo(double p_radio, Punto p_centro){
      super(0, 0, p_centro); //esto siempre va primero
      setRadio(p_radio);
    }
    public Circulo(double p_radio){
        super(p_radio, p_radio, new Punto(0, 0));
        setRadio(p_radio);
    }
    
    //settes
    private void setRadio(double p_radio) {
        this.radio = p_radio;
    }


    //getters
    public double getRadio() {
        return this.radio;
    }

    /**
     * Métodos
     */

    public void caracteristicas() {
        //super.caracteristicas();
        System.out.println(this.getOrigen().coordenadas() + " - Perimetro: " + this.perimetro());
        System.out.println("Superficie: "+ this.superficie());
    }

    public double perimetro() {
        return 2 * 3.14 * radio;
    }

    public double superficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double distanciaA(Circulo otroCirculo) {
        return super.distanciaA(otroCirculo);
    }

    public Circulo elMayor(Circulo otroCirculo) {
        return (Circulo)super.elMayor(otroCirculo);
    }

}
