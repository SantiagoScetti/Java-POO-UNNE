
/**
 * Ejercicio 4
 * @author Santiago
 * @version 1.0
 */
public class Triangulo {
    
    public static void main(String[] args) {
        // Verificar que se ingresen tres argumentos
        if (args.length == 3) {
           
                // Convertir los argumentos de String a double
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);

                // Calcular el semiperímetro
                double semiperimetro = (a + b + c) / 2;

                // Calcular el área usando la fórmula area= raíz cuadrada(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c))
                double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));

                // Mostrar los resultados
                System.out.println("Lados del triángulo: a = " + a + ", b = " + b + ", c = " + c);
                System.out.println("Semiperímetro: " + semiperimetro);
                System.out.println("Área: " + area);
           
        } else {
            System.out.println("Por favor, ingresa exactamente tres argumentos numéricos para los lados del triángulo.");
        }
    }
}

