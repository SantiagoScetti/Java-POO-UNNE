import java.util.HashMap;

/**
 * Write a description of class Comercio here.
 * 
 * @author Santi y Franco
 * @version 1.0 (por ahora)
 */

public class Comercio{
    private String nombre;
    private HashMap<Long, Empleado> empleados;

    public Comercio(String p_nombre){
        setNombre(p_nombre);
        setEmpleados(new HashMap<>());
    }
    public Comercio(String p_nombre, HashMap p_empleados){
        setNombre(p_nombre);
        setEmpleados(p_empleados);
    }


    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
     private void setEmpleados(HashMap<Long, Empleado> p_empleados) {
        this.empleados = p_empleados;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    
    
    public void altaEmpleadoo(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    
    }
    public Empleado bajaEmpleado(Empleado p_empleado){
        return this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }

    public int cantidadEmpleado(){
    
        int contador = 0;
        for (Empleado unEmpleado : this.getEmpleados().values() ) {
            if(unEmpleado != null){
                contador++;
            }
        }
        return contador;
    }
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    public void sueldoNeto(long p_cuil){
        System.out.println(this.getEmpleados().get(p_cuil).getSueldoNeto());
    }
    public void nomina(){
        
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("****NOMINA DE EMPLEADOS DE AVANTI SRL****\n"); //%66s $%-15.2f%n"

        for (Empleado unEmpleado : empleados.values()){
           unEmpleado.mostrarLinea();
        }
    }
}


