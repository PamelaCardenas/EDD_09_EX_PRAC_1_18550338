

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
            aiArreglo[i] = (int)((Math.random() * 15) + 1);
        }
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        }
        for (int i = 0; i < aiArreglo.length-1; i++) {
            int num = 0;
            for (int j = 0; j < aiArreglo.length; j++) {
                if(i != j && aiArreglo[i] == aiArreglo[j]){
                    num = num + 1;
                    System.out.println("\nEl primer numero repetido es " + aiArreglo[i] + " y su posición está en el puesto " + i);
                    break;
                }
            }
            if(num > 0){
                break;
            }
        }
    }
}