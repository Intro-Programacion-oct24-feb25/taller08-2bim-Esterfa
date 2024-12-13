/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;


public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her

        StringBuilder salida = new StringBuilder(); // Acumulador para la salida final
        
        for (int i = 30; i >= 10; i--) { // Recorre desde 30 hasta 10
            for (int j = 1; j <= 4; j++) { // Genera los 4 valores de cada fila
                salida.append(i * j); // Multiplica el índice de la fila por la columna actual
                if (j < 4) { // Agrega un guion si no es el último valor de la fila
                    salida.append("-");
                }
            }
            salida.append("\n"); // Salto de línea al terminar cada fila
        }
        
        // Imprime la salida acumulada
        System.out.println(salida.toString());
    }
}

        
        
    
    

