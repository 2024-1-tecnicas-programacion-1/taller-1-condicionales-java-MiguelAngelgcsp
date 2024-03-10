package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
       
        if (numVictoriasA < 0 || numVictoriasB < 0 || numVictoriasB > 7 || numVictoriasA > 7 || numVictoriasA >= numVictoriasB +3 && numVictoriasA >= 6 ||  numVictoriasB >= numVictoriasA +3 && numVictoriasB >= 6)
        {
           return("El resultado es invalido");           
        }
        else if (numVictoriasA == numVictoriasB && numVictoriasA <= 6 && numVictoriasB <= 6 || numVictoriasA == numVictoriasB +1 || numVictoriasB == numVictoriasA +1)
        {
          return("Aun no termina");
        }
        else if (numVictoriasA > numVictoriasB +1)
        {
           return("El ganador es el A"); 
        }
        else if (numVictoriasB > numVictoriasA + 1)
        {
           return("El ganador es el B");            
        }

        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
