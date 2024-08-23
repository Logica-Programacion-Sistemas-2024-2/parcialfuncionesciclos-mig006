
package parcial1g2;

import java.util.Scanner;

public class App {
    // Función para calcular el valor total de impuestos
    public static double calcularTotalImpuestos(String modelo, int avaluo) {
        try {
            double tasa = 0;
            double tasa2 = 0;

            if (modelo.equals("90")) {
                tasa = 0.0409;
                tasa2 = 0.00816;
            } else if (modelo.equals("00")) {
                tasa = 0.0434;
                tasa2 = 0.00798;
            } else if (modelo.equals("10")) {
                tasa = 0.0493;
                tasa2 = 0.00712;
            } else if (modelo.equals("20")) {
                tasa = 0.05680;
                tasa2 = 0.00699;
            } else {
                tasa = 0;
                tasa2 = 0;
            }
            return (int)(avaluo*tasa)+(avaluo*tasa2);
        } catch (Exception e) {
            return -1;
        }
    }
    
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // Datos de entrada
            String modelo = "";
            int avaluo = 0;
            int cantidadVehiculos = 0;
            
            // Datos de salida
            int valorFinal = 0;

            // Proceso
            System.out.println("Bienvenido a la oficina de Impuestos");

            System.out.println("¿Cuantos vehiculos desea calcular?");
            cantidadVehiculos = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cantidadVehiculos; i++) {

                System.out.println("\nVehiculo:"+(i+1));
                System.out.println("Ingrese el modelo de su vehiculo (90,00,10,20):");
                modelo = sc.nextLine();
                System.out.println("Ingrese el valor del avalúo $:");
                avaluo = sc.nextInt();
                sc.nextLine();

                if (avaluo < 0) {
                    System.out.println("\nVALOR NO VALIDO");
                    break;
                }

                valorFinal = (int)calcularTotalImpuestos(modelo, avaluo);
        
                System.out.println(" ");
                System.out.println("Decada del modelo: "+modelo);
                System.out.println("Valor de avalúo: $" + avaluo+" COP");
                System.out.println("Valor total a pagar: $" + valorFinal+" COP");
                
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    
    //------------------------------------------------------------------

}
