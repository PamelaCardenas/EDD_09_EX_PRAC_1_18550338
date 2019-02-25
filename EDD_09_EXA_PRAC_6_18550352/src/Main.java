
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisa
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int aiArreglo[] = new int[15];
        
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)(Math.random()*100+1);
            System.out.print(aiArreglo[i] + " ");
        }
        System.out.println("\nInserte la primera posicion a copiar");
        int c1 = sc.nextInt();
        System.out.println("Inserte la ultima posicion a copiar");
        int c2 = sc.nextInt();
        int c3 = (c2-c1)+1;
        int aiCopia[] = new int[c3];
        
        for (int i = 0; i < aiCopia.length; i++) {
            aiCopia[i] = aiArreglo[c1];
            c1++;
            System.out.print(aiCopia[i] + " ");
        }
        
    }
    
}
