

package com.mycompany.pooherencia;

//Importar las clases

import Operaciones.ClaseHija_suma;
import Operaciones.ClaseHija_resta;

public class PooHerencia {

    public static void main(String[] args) {
        
        //Para la SUMA
        //Objeto comunicador con la "ClaseHija_suma"
        ClaseHija_suma mensajeroSuma = new ClaseHija_suma();
        
        //Traer metodos desde la "ClasePadre" por medio de ClaseHija_suma
        mensajeroSuma.PedirDatos();
        
        //Traer directamente de ClaseHija_suma el metodo Sumar
        mensajeroSuma.Sumar();
        
        //Salida
        System.out.println("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        
        ////////////////////////////////////////////////////////////////////
        
        //Para la RESTA
        //Objeto comunicador con la "ClaseHija_resta"
        ClaseHija_resta mensajeroResta = new ClaseHija_resta();
        
        //Traer metodos desde la "ClasePadre" por medio de ClaseHija_resta
        mensajeroResta.PedirDatos();
        
        //Traer directamente de ClaseHija_suma el metodo Restar
        mensajeroResta.Restar();
        
        //Salida
        System.out.println("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
        
    }
}