import java.util.ArrayList;
import java.util.HashSet;

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
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>()); 
    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<Empleado>());
        this.empleados.add(p_empleado); 
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>()); 
    }
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
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
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentas) {
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
        return empleados.add(p_empleado);  
    }

    public boolean quitarEmpleado(Empleado p_empleado) {
        return empleados.remove(p_empleado);
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
        return cuentasBancarias.add(p_cuenta);     
    }
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return cuentasBancarias.remove(p_cuenta);      
    }

    public void listarCuentasConSaldoCero(){
        System.out.println("Cuentas sin saldo:");
        System.out.printf("%20s %30s%n", 
                    "--- Cuenta --------------------", 
                            "Apellido y Nombre ---------------");
    
        for (CuentaBancaria unacuenta : this.getCuentasBancarias()) {
            if (unacuenta != null && unacuenta.getSaldo() == 0) {
                System.out.printf("%20s %20s%n", 
                                    unacuenta.getNroCuenta(), 
                                    unacuenta.getTitular().apeYNom());
            }
        }
    }


    public  HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> lista = new HashSet<>();
        
        for (CuentaBancaria unacuenta : cuentasBancarias) {
            lista.add(unacuenta.getTitular());
        }
        
        return lista;
    }

    private int cuentasSaldoActivo(){
        // Activo = totales - saldoCero   || activo = for loop (unaCuenta.getSaldo() > 0)   averiguar cual es más rápido
        int contador = 0;

        for (CuentaBancaria unaCuenta : this.getCuentasBancarias()) {
            if(unaCuenta.getSaldo() > 0){
               contador ++;
            }
        }
        return contador;
    }

    public void mostrarResumen() {
        // Cabecera con información del banco y sucursal
        System.out.printf("Banco: %s  -  Sucursal: %d%n", this.getNombre(), this.getNroSucursal());
        System.out.printf("Localidad: %s       Provincia: %s%n", this.getLocalidad().getNombre(), this.getLocalidad().getProvincia());
        System.out.println("************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("************************************************************");
        
        // Número total de cuentas, cuentas activas, y cuentas con saldo cero
        int totalCuentas = this.getCuentasBancarias().size();
        int cuentasActivas = cuentasSaldoActivo();
        int cuentasSaldoCero = totalCuentas - cuentasActivas;
        
        System.out.printf("Número total de Cuentas Bancarias: %d%n", this.getCuentasBancarias().size());
        System.out.printf("Cuentas Activas: %6d%n", cuentasSaldoActivo());
        System.out.printf("Cuentas Saldo Cero: %d.%n", cuentasSaldoCero);
        
        // Separador
        System.out.println("-------------------------------------------------------------------------------------------");
        
        // Cuentas sin saldo
        listarCuentasConSaldoCero();
    
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        // Listado de clientes
        System.out.print("Listado de Clientes: ");
        HashSet<Persona> listaTitulares = listaDeTitulares();
        for (Persona titular : listaTitulares) {
            System.out.print(titular.apeYNom() + "; ");
        }
        
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    
}