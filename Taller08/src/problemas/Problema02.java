/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
 

        StringBuilder reporte = new StringBuilder(); 
        int inicioFahrenheit = 20; 
        int incremento = 4; 
        int operaciones = 20;

        for (int i = 0; i <= operaciones; i++) {
            double fahrenheit = inicioFahrenheit + (i * incremento); 
            double celsius = (fahrenheit - 32) * 5 / 9; 
            reporte.append(String.format("Operación(%d) Fahrenheit: %.2f ===> Celsius: %.2f%n", 
                                          i, fahrenheit, celsius));
        }

    
        System.out.println(reporte.toString());
    }
}

    
       

