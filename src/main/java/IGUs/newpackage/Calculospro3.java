/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGUs.newpackage;

import java.text.DecimalFormat;

/**
 *
 * @author UserA
 */
class Calculospro3 {
    private float parcial_1, parcial_2, parcial_3, exam_sem;
    DecimalFormat porcentaje  = new DecimalFormat("##.##%"); 
    //Metodo constructor 
    Calculospro3(float parcial_1, float parcial_2, float parcial_3, float exam_sem) {
        this.parcial_1 = parcial_1;
        this.parcial_2 = parcial_2;
        this.parcial_3 = parcial_3;
        this.exam_sem = exam_sem;
    }
    
    //Metodo para cacular el porcentaje de los parciales. 
    public float PorcentajeParciales(){
       float porcentajeParciales = 0;
       //calculo
       porcentajeParciales = ((parcial_1 + parcial_2 + parcial_3) / 100) * 100;
       porcentaje.format(porcentajeParciales);
        return porcentajeParciales;
    }
    
    //Metodo para calcular el porcentaje del examen final. 
    public float PorcentajeExamen(){
        float porcentajeExamen = 0;
        //calculo
        porcentajeExamen = (exam_sem / 100) * 100;
        porcentaje.format(porcentajeExamen);
        return porcentajeExamen; 
    }
    
    // Metodo para el calculo de calificacion final
    public float NotaFinal (){
        float sumNotas= 0, promedio = 0;
        DecimalFormat dc = new DecimalFormat("##.##");
        sumNotas = ((parcial_1 + parcial_2 + parcial_3)/3); 
        promedio = (sumNotas + exam_sem) / 2;
        dc.format(promedio);
        return promedio; 
    }
    
}
