import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a description of class Banco here.
 * 
 * @author santi
 * @version 1.0
 */
public class Banco
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    /**
     * Constructores
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>());
        this.empleados.add(p_empleado); 
    }
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleados, ArrayList p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        setCuentasBancarisa(p_cuentas);
    }

    // SETTERS
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setNroSucursal(int p_nroSucursal) {
        this.nroSucursal = p_nroSucursal;
    }
    private void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }
    private void setEmpleados(ArrayList<Empleado> p_empleados) {
        this.empleados = p_empleados;
    }
    private void setCuentasBancarisa(ArrayList<CuentaBancaria> p_cuentas) {
        this.cuentasBancarias = p_cuentas;
    }

    // GETTERS
    public String getNombre() {
        return this.nombre;
    }
    public int getNroSucursal() {
        return this.nroSucursal;
    }
    public Localidad getLocalidad() {
        return this.localidad;
    }
    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }
    public ArrayList<CuentaBancaria> getCuentasBancarias(){
        return this.cuentasBancarias;
    }

    
    //METODOS

    public boolean agregarEmpleado(Empleado p_empleado) {
        if (p_empleado != null) {
            empleados.add(p_empleado);  // Agrega el empleado a la lista
            return true;  //fue agregado exitosamente
        }
        return false;  //no se pudo agregar el empleado
    }

   
    public boolean quitarEmpleado(Empleado p_empleado) {
        if (p_empleado != null && empleados.contains(p_empleado)) {  // Verifica que el empleado no sea nulo y esté en la lista
            empleados.remove(p_empleado);  // Quita el empleado de la lista
            return true;  //eliminado exitosamente
        }
        return false;  //no se pudo eliminar el empleado
    }


    public void listarSueldos(){
        for (Empleado empleado : empleados) {
             System.out.printf("%-15s %-15s %-30s $%-15.2f%n", empleado.getCuil(), empleado.apeYNom(), "-----------------------", empleado.getSueldoBasico());
        }
       
    }

    public double sueldosAPagar(){
        double total = 0;
         for (Empleado empleado : empleados) {
            total += empleado.getSueldoBasico();
         }
        return total;
    }

    public void mostrar(){
        // Imprime la información del banco
        System.out.println("Banco: " + this.getNombre() + " Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + " Provincia: " + this.getLocalidad().getProvincia());

        // Imprime la cabecera de los empleados
        System.out.println("---------------------------------------------------------------------");
        listarSueldos();

        // Imprime el total a pagar
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("Total a Pagar%66s $%-15.2f%n", 
                      "------------------------------------------------------------", 
                      this.sueldosAPagar());
    }

    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
         if (p_cuenta != null) {
            cuentasBancarias.add(p_cuenta);  
            return true;  //fue agregada exitosamente
        }
        return false;  //no se pudo agregar la cuenta
    }
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
         if (p_cuenta != null && cuentasBancarias.contains(p_cuenta)) {  
            cuentasBancarias.remove(p_cuenta);  
            return true;  
        }
        return false;
    }

    public void listarCuentasConSaldoCero(){
        System.out.printf("Cuentas sin saldo: " );
        System.out.printf("%20s $%20s", 
                    "--- Cuenta --------------------", 
                    "Apellido y Nombre ---------------");

        for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
            if(cuentaBancaria.getSaldo() == 0){
                System.out.printf("%20s $%20s", 
                                cuentaBancaria.getNroCuenta(), 
                                cuentaBancaria.getTitular().apeYNom());
            }
        }
    }

    public  HashSet<Persona> listaDeTitulares(){
        Set<Persona> listaDeTitulares = new HashSet<>();

        
    }

    private int cuentasSaldoActivo(){
        // Activo = totales - saldoCero
        for (int i = 0; i < cuentasBancarias.size(); i++) {
            
        }

    }

    public void mostrarResumen(){

    }
}