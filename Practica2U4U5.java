
package practica2u4u5;

/**
 *
 * @author Zu'
 */
public class Practica2U4U5 {

    public static void main(String[] args) {

        double numero1 = 45.2;
        double numero2 = 98.5;

        System.out.println("Suma: " + suma (numero1, numero2));
        System.out.println("Resta: " + resta(numero1, numero2));
        System.out.println("Multiplicacion: " + multiplicacion(numero1, numero2));
        
        try {
            System.out.println("Division: " + division(numero1, numero2));
        } catch (ArithmeticException e) {
           
        }
    }
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            
        }
        return num1 / num2;
    }
}
