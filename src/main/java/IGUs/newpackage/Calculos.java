/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGUs.newpackage;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author FLIA PEREZ
 */
class Calculos {
    private int[] vector;
    private int tamaño;
    private int[] PosVector;
    private int[] NegVector;
    private int posCount;
    private int negCount;

    //Metodo construtor de atracion de datos. 
    Calculos(int[] vector, int tamaño, int[] PosVector, int[] NegVector, int posCount, int negCount) {
        this.vector = vector;
        this.tamaño = tamaño;
        this.PosVector = PosVector;
        this.NegVector = NegVector;
        this.posCount = posCount;
        this.negCount = negCount;
    }
        
    // Metodo Suma del vector tanto postivo como negativo
    private int[] SumaVector() {
        int[] suma1 = new int[1]; 
        int suma = 0; // Variable para acumular la suma

        for (int i = 0; i < tamaño; i++) {
            suma += vector[i]; // Sumar todos los elementos
        }

        suma1[0] = suma; // Almacenar la suma total en la primera posición
       
        return suma1; 
    }
    
    // Metodo Suma de Vector Positivo
    private int[] SumaPositivos(){
        int [] SumPos = new int [1];
        int suma = 0; 
        
        for (int i = 0; i < posCount; i++){
            suma += PosVector[i];
        }
        
        SumPos[0] = suma;
        return SumPos;
    }
    
    //metodo de suma de Negativos 
    private int[] SumaNegativos(){
        //Suma de vector negativos 
        int [] sumNeg = new int[1];
        int suma = 0;
    
        for (int i = 0; i < negCount; i++ ){
            suma += NegVector[i];
        }
        
        sumNeg[0] = suma;
        return sumNeg;
    }

    //Metodo para ordenar un vector positivo 
    private int [] OrdenarVectorPos(){
        // Crear un nuevo arreglo con el tamaño del vector de positivos
        int[] vectorOrdenado = new int[posCount];
        
        // Copiar los elementos del PosVector al nuevo arreglo
        for (int i = 0; i < posCount; i++) {
            vectorOrdenado[i] = PosVector[i];
        }

        // Ordenar el nuevo arreglo
        Arrays.sort(vectorOrdenado);

        return vectorOrdenado;  
    }
    
    //Metodo para Ordenar un vector negativo
    private Integer [] OrdenarNegativos(){
        //Crear un nuevo arreglo con el tamaño del vector de positivos 
        Integer [] vectorOrdenado = new Integer [negCount];
        
        for (int i=0; i< negCount; i++){
            vectorOrdenado[i] = NegVector[i];
        }
        
        Arrays.sort(vectorOrdenado,Collections.reverseOrder());
        
        return vectorOrdenado;
    }
    //Metodos para devolver los resulados de cada operacion 
    public int[] getSumaTotal() {
        return SumaVector(); 
    }
    public int [] getSumaPositivos(){
        return SumaPositivos();
    }
    public int[] getSumaNegativos(){
        return SumaNegativos();
    }
    public int[] getOrdenarPositivos(){
        return OrdenarVectorPos();
    }
    public Integer [] getOrdenarNegativos(){
        return OrdenarNegativos();
    }
}
