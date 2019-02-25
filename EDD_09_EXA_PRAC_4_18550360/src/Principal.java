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
        // TODO code application logic here
        int[] aiArreglo = new int[15];
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)((Math.random() * 20) + 1);
        }
        System.out.print("Arreglo original\n");
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        }
        System.out.println("");
        System.out.println("\nCopia del arreglo SIN duplicados");
        int[] aiCopia = aiArreglo;
        int len = aiCopia.length;
        int temp[] = new int[aiCopia.length];
        int num = 0;
        for (int i = 0; i < aiCopia.length-1; i++) {
            if(aiCopia[i] != aiCopia[i+1]){
                temp[num++] = aiCopia[i];
            }
        }
        temp[num++] = aiCopia[len - 1];
        for (int i = 0; i < num; i++) {
            System.out.print("[" + temp[i] + "]");
        }
        System.out.println("");
    }
    
}
