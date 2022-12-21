/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author OLIVER SARAGURO
 */
public class Ejemplo2 {


    public static void main(String[] args) {
        // Creación de arreglo bidimensionales

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}}; //
        /*
            1   4   3
            36  64  9
         */

        double[][] resultado = new double[2][3];

        for(int f = 0; f < dato1.length; f++) {
            for (int c = 0; c < dato1[f].length; c++) {
                if (dato1[f][c] % 2 == 0) {
                    resultado[f][c] = dato1[f][c] * dato1[f][c];
                } else {
                    resultado[f][c] = dato1[f][c];
                }
            }
        }

        for(int f = 0; f < resultado.length; f++) {
            for(int c = 0; c < resultado[f].length; c++) {
                System.out.printf("%s\t", resultado[f][c]);
            }
            System.out.println(); // salto de línea

        }

    }

}
