
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Antonio 18550354
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] aiArray = new int[15];
        int [] aiImpares = new int[15];
        int [] aiPares = new int[15];
        
        llenar(aiArray);
        
        System.out.println("Arreglo original: ");
        imprimir(aiArray);
        
        par(aiArray, aiPares);
        System.out.println("\nArreglo de pares: ");
        impresionEsp(aiPares);
        
        impar(aiArray, aiImpares);
        System.out.println("\nArreglo de impares: ");
        impresionEsp(aiImpares);
        
        System.out.println("\n Valores primos del arreglo original: ");
        primo(aiArray);
        
    }
    
    public static void llenar(int [] aiArreglo){
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)(Math.random() * 100 + 1);
        }
    }
    
    public static void imprimir(int aiArreglo[]){
        for (int i : aiArreglo) {
            System.out.print("[" + i + "]");
        }
    }
    
    public static void impar (int aiArreglo[], int aiArreglo2[]){
       for (int i = 0; i < aiArreglo.length; i++) {//Si el valor dentro del 
        if (aiArreglo[i] % 2 != 0){                //Arreglo es impar se le
            aiArreglo2[i] = aiArreglo[i];          //Asigna dicho valor al otro
        }                                          //Arreglo
        }
    }
    
    public static void par (int aiArreglo[], int aiArreglo2[]){
       for (int i = 0; i < aiArreglo.length; i++) { 
        if (aiArreglo[i] % 2 == 0){                
            aiArreglo2[i] = aiArreglo[i];          
        }                                          
        }
       /*
       Similar al método impar, si los valores del arreglo original son iguales 
       pares, le serán asignados al arreglo, si no son pares, dicha poscición
       quedará en 0
       */
    }
    
    public static void primo (int aiArreglo[]){
        /*for (int i = 0; i < aiArreglo.length; i++) {
            for (int j = 2; j < aiArreglo[i]; j++) {
            if(aiArreglo[i] % j == 0){
                break;
            }else{
            System.out.print("[" + aiArreglo[i] +"]");
            }
            }
        }*/
       /* for (int i = 0; i < sqrt(aiArreglo[i]); i++) {
            if(aiArreglo[i]/2 != 0){
                System.out.println("[" + aiArreglo[i] + "]");
            }
        }*/
       
        for (int i = 0; i < aiArreglo.length; i++) {
            boolean primo = true;//Automáticamente supone que el valor será primo
            if (aiArreglo[i] == 1)
                primo = false;//Condición que de ser cumplida se concluye
            else {            //Que el valor no es primo  
                
                for (int j = 2; j <= aiArreglo[i] / 2; j++) {
                    if (aiArreglo[i] % j == 0) { 
                        primo = false;//Otra condición para descartar valores no primos
                        break;
                    }
                }
            }
            //Imprime los valores que no cumplían las condiciones anteriores
            if (primo)//Por lo que son valores primos
                System.out.print("[" + aiArreglo[i] + "]");
        }
    }
    
    public static void impresionEsp (int aiArreglo[]){
        for (int i : aiArreglo) {
            if (i != 0){
                System.out.print("[" + i + "]");
            }
        }
        /*
        Este método imprime los valores de un arreglo siempre y cuando no sean 
        iguales a 0, ya que los métodos impar y par asignas ciertos valores a un
        arreglo si estos cumplen ciertas condiciones, i no la cumplen el espacio
        quedará en 0 y entonces no lo queremos imprimir.
        */
   }
}

