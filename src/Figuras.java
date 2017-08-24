
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriela
 */
/*
Cree una aplicacion que nos calcule, el area de un circulo, cuadrado o triangulo. Pediremos que figura queremos calcular su area y según lo introducido
pedira los valores necesarios para calcular el área. Crea un método por cada figura para calcular cada área, muestre resultado por pantalla.
*/
public class Figuras {
    
    public void Circulo(){
        double areacirculo;
       int radio;
        double pi=3.1416;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio");
     
        radio = sc.nextInt();
        areacirculo=(radio*radio)*pi;
        System.out.println("areacirculo");
        
        
    }
     public void Cuadrado(){
         
     }
      public void Triangulo(){
          
      }
    

    public static void main(String[] args) {
       String Opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la forma geometrica que desea realizar");
        //nextLine se utiliza cuando intentamos leer cadenas de caracteres desde el teclado.
        Opcion = sc.nextLine();
       
     if (Opcion.equals("circulo")){

        }
     if (Opcion.equals("cuadrado")){
      
        System.out.println("cu");

    }
    if (Opcion.equals("triangulo")){
        System.out.println("tri");

    }

    }
    
    
    
}
