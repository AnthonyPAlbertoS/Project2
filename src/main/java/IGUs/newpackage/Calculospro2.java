/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IGUs.newpackage;

import java.text.DecimalFormat;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UserA
 */
public class Calculospro2 {
    private float [][] Ventas;
    private int f,c; //Se refiere a filas y columnas.
    private String [] title1 = {"Vendedor", "Suma Ventas"};
    private String [] title2 = {"Vendedor", "Proemdio Ventas"};
    private String [] title3 = {"Meses", "Suma Mes Vendedor"};
    private String [] title4 = {"Meses", "Promedio Mensuales Vendedor"};
    DecimalFormat dc = new DecimalFormat("##.##");
    
    public Calculospro2(float[][] Ventas, int c, int f) {
        this.Ventas = Ventas;
        this.c = c;
        this.f = f;
    }

    public void SumVentasVendedor(DefaultTableModel model){
        //Aplicar la cantidad de filas y columnas a implemtar en Table.
        model.setRowCount(f); 
        model.setColumnCount(c);
       
        model.setColumnIdentifiers(title1); //Identificando la primera columnas de con los titulos. 
        
        //Realizando la opercacion de suma por vendedor. 
        for (int i = 0; i < f; i++){
            float sum = 0;
            for (int j = 0; j < c; j++){
                sum += Ventas[i][j];
            } 
            model.setValueAt("Vendedor"+ (i+1),i,0); //se refiere a cambiar la primera fila con los vendedores. 
            model.setValueAt(dc.format(sum),i,1);
        }//Fin de los ciclos for 
    }//Fin de Sumas Por Vendedor 
    
    public void PromVentasVenedor(DefaultTableModel model){
        model.setRowCount(f);
        model.setColumnCount(c);
        
        model.setColumnIdentifiers(title2);
        
        //Recorrido para encontrar el promdeio de las ventas por vendedor
        for (int i=0; i<f; i++){
            float suma = 0;
            for (int j = 0; j <c; j++){
                suma += Ventas[i][j];
            }
            float promedio = 0;
            promedio = suma / c; //Calculando el promedio con los meses ingresados. 
            
            model.setValueAt("Vendedor"+ (i+1),i,0); //se refiere a cambiar la primera fila con los vendedores. 
            model.setValueAt(dc.format(promedio),i,1);
        }
        
    }//Fin de la clase promedio de ventas
    
    public void SumaVentasMensuales(DefaultTableModel model){
        model.setRowCount(f);
        model.setColumnCount(c);
        
        model.setColumnIdentifiers(title3);
        
        for (int i = 0; i < f; i++){
            float sumMes = 0;
            for (int j = 0; j < c; j++){
                sumMes += Ventas[j][i];
            }
            model.setValueAt("Mes" + (i+1), i,0);
            model.setValueAt(dc.format(sumMes),i,1);
        }
    }//Fin del suma mensuales. 
    
    public void PromVentasMensuales(DefaultTableModel model){
        model.setRowCount(f);
        model.setColumnCount(c);
        
        model.setColumnIdentifiers(title4);
        
        for (int i = 0; i < f; i++){
            float suma = 0;
            for (int j = 0; j < c; j++){
                suma+= Ventas[j][i];
            }
            float promedio = 0;
            promedio = suma / f;
            model.setValueAt("Mes "+(i+1),i,0);
            model.setValueAt(dc.format(promedio),i,1);
        }
    }//Promedio de los meses. 
    
    private float TotalVentas(){
        float total_ventas = 0;
        for (int i = 0; i< f; i++){
            
            for (int j = 0; j < c; j++){
                total_ventas += Ventas[i][j];
            }
        }//fin del for. 
           dc.format(total_ventas);
        return total_ventas;
    }//fin  de la clase total ventas
    
    public float Total_ventas(){
        return TotalVentas();
    }
    
}
