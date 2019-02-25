
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author escritorio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        
        Arreglo bidimensional 
         String arrayPalabras[][] = new String[5][5];
        
        arrayPalabras[0][0] = "C";
        arrayPalabras[0][1] = "O";
        arrayPalabras[0][2] = "M";
        arrayPalabras[0][3] = "E";
        arrayPalabras[0][4] = "R";
        
        arrayPalabras[1][0] = "O";
        arrayPalabras[1][1] = "S";
        arrayPalabras[1][1] = "T";
        arrayPalabras[1][3] = "I";
        arrayPalabras[1][4] = "A";
        
        arrayPalabras[2][0] = "C";
        arrayPalabras[2][1] = "T";
        arrayPalabras[2][2] = "C";
        arrayPalabras[2][3] = "L";
        arrayPalabras[2][4] = "O";
        
        arrayPalabras[3][0] = "P";
        arrayPalabras[3][1] = "E";
        arrayPalabras[3][2] = "D";
        arrayPalabras[3][3] = "R";
        arrayPalabras[3][4] = "O";
        
        arrayPalabras[4][0] = "P";
        arrayPalabras[4][1] = "E";
        arrayPalabras[4][2] = "R";
        arrayPalabras[4][3] = "R";
        arrayPalabras[4][4] = "O";
        
        for( i =0 ; i<arrayPalabras.lenght ; i++){
        for( j =0 ; i<arrayPalabras[i].lenght ; i++){
        System.out.print("[" + arrayPalabras[i][j] + "]");
        }
        System.out.println(");
        }
        */
        
        int intentostot = 5; 
        int intentosfall = 6; 
        int intentos = 0;
        int intentos1 = 0;
        int aciertos = 0;
        char resp;
        Scanner xd = new Scanner(System.in);
        xd.useDelimiter("\n");   //los delimitadores por defecto son los espacios en blanco 
        
                      
        // Random para escoger una posiciion bien chidori en el arreglo
                     Random ran= new Random();
        // Creamos unas palabras en este cuaso nuestros nombres y le asignamos una aleatoria a una varibale
        
        
                     String arrayPalabras[] = new String[5];
                     arrayPalabras[0] = "pamela";                    
                     arrayPalabras[1] = "luisa";
                     arrayPalabras[2] = "josue";
                     arrayPalabras[3] = "roberto";
                     arrayPalabras[4] = "irving";
         
                     
        do {    
        // Descomprimimos la palabra y la guardamos en un array de caracteres
        int yolo = ran.nextInt(5);  //Aqui escogemos una palabra dentro del parametro seleccionado en este caso 5
        char[] pala = ahor(arrayPalabras[yolo]);    
        char[] copia = ahor(arrayPalabras[yolo]);//Este es un auxiliar 
        
        
        // Usamos el array para el espacio que se mostrara de la letra
        char[] tusRespuestas = new char[pala.length];
 
        // Rellenamos palabras con espacios
        for(int i = 0; i < tusRespuestas.length; i++){
            tusRespuestas[i] = ' ';
        }
        

           
           
            System.out.println("Adivina la palabra!");
        
        //Tenemos 5 intentos si fallamos una letra acumula 1 pero si le atinamos a uno se elimina
        
        
        while(intentos1 < intentostot && aciertos != tusRespuestas.length){
            imprimecorch(tusRespuestas);
            // Preguntamos mierdas por teclado
            System.out.println("");
            System.out.println("Introduce una letra: ");
            resp = xd.next().toLowerCase().charAt(0);
            // Recorremos el array y comprobamos si se ha producido un acierto
            for(int i = 0; i < pala.length; i++){
                if(pala[i]==resp){
                    tusRespuestas[i] = pala[i];
                    pala[i] = ' ';
                    aciertos++;
                    System.out.println("Llevas de acierto: " +aciertos);
                   intentos1--;
                    intentosfall++;
                }   
                
            }    
             intentosfall--;
             intentos1++;
             intentos++;
             System.out.println("Intento: " +intentos);
             System.out.println("");
             System.out.println("Oportunidades" +   intentosfall);
            
        }
        
        
        // Si le atinamos a todas imprimimos un mensaje
        if(aciertos == tusRespuestas.length){
             System.out.print("\n Ala, eres muy bueno xD : ");
             imprimecorch(tusRespuestas);
        }
        // Si no otro
        else{
            System.out.println("Perdiste");
            System.out.println("-------");
            System.out.println("|     |");
            System.out.println("|     0");
            System.out.println("|    -|-");
            System.out.println("|     |");
            System.out.println("|    | |");
            System.out.println("|     ");
            System.out.println("|_________     ");
            System.out.println("Que malo eres jugando (La palabra es) =  ");
            
           
            for(int i = 0; i < copia.length; i++){
                System.out.print("[ " + copia[i] + " ]");
            }
        }
        intentos = 0;
        intentos1 = 0;         // Reinicio todo sad :P
        aciertos = 0;
        intentosfall=5;
        // Preguntamos si quiere volver a jugar
        resp = preguntabonita("\n\nQuieres volver a jugar?",xd);
        }while(resp != 'n');   //Sale del do while
       
    }

    private static char[] ahor(String palAzar){
        char[] letras;
        letras = new char[palAzar.length()];
        for(int i = 0; i < palAzar.length(); i++){           //
            letras[i] = palAzar.charAt(i);
        }
        return letras;
    }    
    
    private static void imprimecorch(char[] tusRespuestas){
        // Esto imprime la palabra con corchetes
        for(int i = 0; i < tusRespuestas.length; i++){
            System.out.print("[ " +tusRespuestas[i] + " ]");
        }
    } 
    public static char preguntabonita(String men, Scanner xd) {          //Por la clase que nos dio de recursividad y los problemas de eliminar la x de un texto salio esto
        char resp;
        System.out.println(men + " (s/n)");
        resp = xd.next().toLowerCase().charAt(0);
        while (resp != 's'  && resp != 'n') {        
            System.out.println("Solo se admite s o n");
            resp = xd.next().toLowerCase().charAt(0);
        }
        return resp;
    }
    }
    

