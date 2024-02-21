
package Operaciones;

//Librerias
import java.util.Scanner;

public class ClasePadre {
    
    //Variables
    protected int valor1, valor2, resultado;
    
    //Teclado
    Scanner teclado = new Scanner(System.in);
    
    //Metodo para pedir los datos
    public void PedirDatos()
    {
        
        System.out.print("Primer valor: ");
        valor1 = teclado.nextInt();
        
        System.out.print("Segundo valor: ");
        valor2 = teclado.nextInt();
        
    }
    
    //Metodo para mostrar el resultado
    public void MostrarResultado()
    {
        System.out.println("Resultado es: " + resultado);
    }
    
}
