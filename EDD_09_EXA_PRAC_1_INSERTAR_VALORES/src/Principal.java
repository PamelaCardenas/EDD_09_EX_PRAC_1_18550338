
import java.util.Scanner;

/*
 * Agregar valores a un arreglo y ordenarlos mientras se ingresan
 */

/**
 *
 * @author INTEGRANTES DEL EQUIPO:

	---> Luisa María González Ordóñez 18550352
	---> Karla Pamela Cárdenas Leyva 18550338
	---> Josué David Martínez García 18550360
	---> Roberto Antonio Pedroza Fernández 18550354
	---> Irving Gerardo Mancera Mejía 18550317
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sCaptu = new Scanner(System.in);
        int [] aiArreglo = new int[15]; //Creacion del arreglo
        int aux=0; //Variabel
        
        //Ingresar numeros en el arreglo
        for (int j=0, i = 0; i < aiArreglo.length; i++) {
            System.out.println("Ingrese un valor");
            aiArreglo[i] = sCaptu.nextInt(); //Solicitar valor ingresado por el usuario
            j=i; //Variable j tendra el mismo valor que tiene actualmente la i
            //El ciclo while se ejecuta mientras j sea mayor a 0
            while(j>0){
             if(aiArreglo[j]<aiArreglo[j-1]){ //Si el numero actual es menor al numero anterior
                 //Intercambio de valores
                    aux = aiArreglo[j]; //aux toma el valor del numero actual
                    aiArreglo[j] = aiArreglo[j-1];//La posicion actual se ocupa con el numero de la posicion anterior
                    aiArreglo[j-1] = aux;//La posicion anterior toma el valor asignado de aux
                }
             j--;
            }
             
            sCaptu.nextLine();
        }
        //Mostrar arreglo
        for (int i = 0; i < aiArreglo.length; i++) {
            
            System.out.println("[" + aiArreglo[i] + "]");
            
        }
        
    }
    
    
}
