
package Programas;

import java.util.Scanner;
import java.util.Random;

public class ProgramaPila {
    
    public static void main (String[] args) {
        
        Scanner sc= new Scanner (System.in);
        
        int tope =0, opt=0;
        char[ ] pila= new char[26];
        
        do {
            System.out.println("¿Qué desea hacer?\n1. Llenar\n" 
                    +"2. Eliminar\n" 
                    +"3. Mostrar\n" 
                    +"4. Salir\n"
                    +"5. Repetidos"); 
            opt = sc.nextInt();
                 
            switch (opt) {
                case 1:

                Random r = new Random();//num aleatorio
                    char letra = (char)(r.nextInt(26) + 'A');
                        for (int i=0; i<26; i++)
                        {
                            if (tope < 26) {
                                pila [tope] = letra;
                               
                                letra++;
                                tope++;

                            }
                            else{
                                System.out.println("Pila llena...");
                                break;
                            }
                        }
                        break;
                    
                case 2:
                    
                    System.out.println(tope);
                        if (tope > 0) {
                            System.out.println("Dato eliminado " + tope);
                            tope--;

                        }else{
                            System.out.println("No hay elementos para eliminar...");
                            tope--;   
                }
                        break;

                case 3:
                
                    if (tope>0) {
                      
                      for (char i = (char) (tope-1); i>= 0; i--) {
                      System.out.println(" "+ pila[i]);
                     }
                    } else { 
                       System.out.println("Pila vacia");
                    }
                       break;   
                        
                case 4:
                    
                    System.exit(0);
                    break;
                    
                    
                case 5:   

                    char [] Arraycadena;
                    char caracter;
                    int contador =0;
                   
                    char[] car=pila;
                    Arraycadena = car;
                    
                    for(int i=0; i<Arraycadena.length; i++){

                        caracter = Arraycadena[i];
                          for (int j =0; j<Arraycadena.length; j++){
                                if (Arraycadena [j]== caracter){

                                   contador++;

                                 }
                        } 
                    }
                    System.out.println("El caracter se repite " + contador + "veces");
                    break;
                }
           }
                    
        while (opt!=5);
    }
}
 

