
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] aiMatriz = new int[4][4];
        int sumaFilas, sumaColum;
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.println("Ingrese un numero " + " Rango 0-9");
                aiMatriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                System.out.print("[" + aiMatriz[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < aiMatriz.length; i++) {
            sumaFilas = 0;
            for (int j = 0; j < aiMatriz[i].length; j++) {
                sumaFilas += aiMatriz[i][j];
            }
            System.out.print("\nLa suma de la fila " + (i + 1) + " es: " + sumaFilas);
            
        }
        System.out.println("\n");
        
        for (int j = 0; j < aiMatriz.length; j++) {
            sumaColum = 0;
            for (int i = 0; i < aiMatriz[j].length; i++) {
                sumaColum += aiMatriz[i][j];
            }
            System.out.println("La suma de la columna " + (j + 1) + " es: " + sumaColum);
        }
        System.out.println("");
    }
}