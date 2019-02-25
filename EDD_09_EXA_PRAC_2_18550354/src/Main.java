
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Inpt = new Scanner(System.in);
        int [] aiArray = new int[15];
        llenar(aiArray);
        
        System.out.println("Arreglo");
        imprimir(aiArray);
        
        System.out.println("");
        
        System.out.println("Ingresa un valor entre 1 y 100");
        int iValue = Inpt.nextInt();
        
        /*for (int i = 0; i < aiArray.length; i++) {
            if(iValue == aiArray[i]){
                System.out.println("El valor " + aiArray[i] + " se encuentra en"
                        + " el arreglo");
            }else{
                System.out.println("El valor que ingresaste no se encuentra "
                        + "en el arreglo");
            }
        }*/
        
        for (int i = 0; i < aiArray.length; i++) {
            if (iValue == aiArray[i]){//Busca
                aiArray[i] = 0;
            }
        }
        
        System.out.println("El arreglo queda así");
        impresionEsp(aiArray);
    }
    
    public static void llenar(int aiArreglo[]){//mètodo para llenar el arreglo con nùmeros aleatoreos
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)((Math.random()*100)+1);
            
        }
    }
        public static void imprimir (int aiArreglo[]){// imprime los valores del arreglo
        for (int b : aiArreglo) {
            System.out.print("[" + b + "]");
        }
    }
        public static void impresionEsp (int aiArreglo[]){//Imprime valores dif.
        for (int i : aiArreglo) {                        //De 0
            if (i != 0){
                System.out.print("[" + i + "]");
            }
        }
   }
}
