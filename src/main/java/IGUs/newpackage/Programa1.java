/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGUs.newpackage;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ANTHONY PEREZ
 */
public class Programa1 extends javax.swing.JFrame {

    /**
     * Creates new form Programa1
     */
    public Programa1() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SolUs = new javax.swing.JLabel();
        Cant = new javax.swing.JTextField();
        GuardarTam = new javax.swing.JButton();
        SolUs1 = new javax.swing.JLabel();
        Op1 = new javax.swing.JCheckBox();
        Op2 = new javax.swing.JCheckBox();
        Op3 = new javax.swing.JCheckBox();
        Op4 = new javax.swing.JCheckBox();
        Op5 = new javax.swing.JCheckBox();
        result1 = new javax.swing.JLabel();
        result2 = new javax.swing.JLabel();
        result3 = new javax.swing.JLabel();
        MenuPrincipal = new javax.swing.JButton();
        result4 = new javax.swing.JTextField();
        result5 = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--Bienvenido Al Programa 1--");

        SolUs.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        SolUs.setForeground(new java.awt.Color(255, 255, 255));
        SolUs.setText("-Ingrese La Cantidad de Numeros  A Ingresar: ");

        GuardarTam.setBackground(new java.awt.Color(51, 51, 255));
        GuardarTam.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        GuardarTam.setForeground(new java.awt.Color(255, 255, 255));
        GuardarTam.setText("Guardar");
        GuardarTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTamActionPerformed(evt);
            }
        });

        SolUs1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        SolUs1.setForeground(new java.awt.Color(255, 255, 255));
        SolUs1.setText("-- Elija una acción a realizar ");

        Op1.setBackground(new java.awt.Color(255, 255, 255));
        Op1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        Op1.setForeground(new java.awt.Color(0, 0, 0));
        Op1.setText("Suma de Vector positivo y negativo:");
        Op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op1ActionPerformed(evt);
            }
        });

        Op2.setBackground(new java.awt.Color(255, 255, 255));
        Op2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        Op2.setForeground(new java.awt.Color(0, 0, 0));
        Op2.setText("Suma Vector Positivo: ");
        Op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op2ActionPerformed(evt);
            }
        });

        Op3.setBackground(new java.awt.Color(255, 255, 255));
        Op3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        Op3.setForeground(new java.awt.Color(0, 0, 0));
        Op3.setText("Suma Vector Negativo: ");
        Op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op3ActionPerformed(evt);
            }
        });

        Op4.setBackground(new java.awt.Color(255, 255, 255));
        Op4.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        Op4.setForeground(new java.awt.Color(0, 0, 0));
        Op4.setText("Ordenar Vector Positivo: ");
        Op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op4ActionPerformed(evt);
            }
        });

        Op5.setBackground(new java.awt.Color(255, 255, 255));
        Op5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        Op5.setForeground(new java.awt.Color(0, 0, 0));
        Op5.setText("Ordenar Vector Negativo:");
        Op5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op5ActionPerformed(evt);
            }
        });

        result1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        result1.setForeground(new java.awt.Color(255, 255, 255));
        result1.setText("= ");

        result2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        result2.setForeground(new java.awt.Color(255, 255, 255));
        result2.setText("=");

        result3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        result3.setForeground(new java.awt.Color(255, 255, 255));
        result3.setText("=");

        MenuPrincipal.setBackground(new java.awt.Color(204, 255, 204));
        MenuPrincipal.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        MenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        MenuPrincipal.setText("Menu Principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        result4.setEditable(false);
        result4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        result5.setEditable(false);
        result5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        limpiar.setBackground(new java.awt.Color(153, 255, 153));
        limpiar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setText("Limpiar Resultados");
        limpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MenuPrincipal)
                .addGap(14, 14, 14))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SolUs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GuardarTam)
                            .addComponent(Cant, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(SolUs1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(Op1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Op2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Op3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Op4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Op5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(result5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(result1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(result2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(result3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(result4)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(limpiar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SolUs)
                    .addComponent(Cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GuardarTam)
                .addGap(37, 37, 37)
                .addComponent(SolUs1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Op1)
                    .addComponent(result1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Op2)
                    .addComponent(result2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Op3)
                    .addComponent(result3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Op4)
                .addGap(3, 3, 3)
                .addComponent(result4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(Op5)
                .addGap(7, 7, 7)
                .addComponent(result5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(limpiar)
                .addGap(8, 8, 8)
                .addComponent(MenuPrincipal)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton Guardar tamaño de vector
    private int [] vector; //El vecttor donde se va acumular los numeros.
    private int tamaño; // EL tamaño que le va a dar el usuario.
    private int [] PosVector; //Vector donde se acumula los numeros positivos; 
    private int [] NegVector; //Vector donde se acumula los numeros negativos;
    private int posCount = 0, negCount = 0;
    private Calculos result; //para almacenar lo de la clase
    private void GuardarTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTamActionPerformed
        //Guardando el tamaño del vector. 
        String cantidad = Cant.getText();
        
        try{
            //Comprovacion que e usuario no ingrese letras y deje em blanco. 
            if (cantidad.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor, Ingrese un tamaño para el vector.");
                Cant.setText("");
            }//fin del if 
            
            tamaño = Integer.parseInt(cantidad);
            
            //Verificando que la cantidad sea positiva y que no este vacia 
            if (tamaño <= 0){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores postivos y mayor a 0.");
                Cant.setText("");
                return;
            }//fin del if 
            
            vector = new int [tamaño];//declarando el tamaño del vector 
            PosVector = new int [tamaño];
            NegVector = new int [tamaño];
            
            
            //recorrido e ingreso de los numeros
            for (int i = 0; i < tamaño; i++){
                 String num = JOptionPane.showInputDialog(null, "Ingrese los datos de vector: [" +i+ "]:");
                 vector[i] = Integer.parseInt(num);
                 
            }//Fin del for de ingreso de datos
            
            // Separar números positivos y negativos
            for (int i = 0; i < tamaño; i++) {
                int num = vector[i];
                if (num > 0) {
                    PosVector[posCount++] = num; // Agregar a PosVector y aumentar el contador
                } else {
                    NegVector[negCount++] = num; // Agregar a NegVector y aumentar el contador
                }
            } //fin de for separar pos y neg. 

            //Clase calculos para los distintos check box
            result = new Calculos(vector ,tamaño,PosVector, NegVector, posCount, negCount);
                    
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese números válidos para el vector.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_GuardarTamActionPerformed

    //Boton de regreso al menu principal. 
    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // Boton de retorno al menu 
         Menu menu = new Menu ();
        
         menu.setVisible(true);
         menu.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    
     
    
    
    // Ordenar vector positivos
    private void Op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op4ActionPerformed
        if (result != null) {
            int[] vectorPosOrdenado = result.getOrdenarPositivos(); // Llama al método de ordenación
            result4.setText(Arrays.toString(vectorPosOrdenado)); // Convertir a String y mostrar en el JTextField
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, primero ingrese los datos.");
            // Si no se cumple, desmarcar el checkbox
            Op4.setSelected(false);
        }
    }//GEN-LAST:event_Op4ActionPerformed

    //Opcion Suma de ambos vectores positivos y negativos
    private void Op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op1ActionPerformed
        if (result != null){ 
            int sumTot [] = result.getSumaTotal();
            int vectorSum [] = new int [1];
            vectorSum[0] = sumTot[0];
            result1.setText(String.valueOf(vectorSum [0])); // Convertir el entero a String y asignar a result1
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, primero ingrese los datos.");
            // Si no se cumple, desmarcar el checkbox
             Op1.setSelected(false);
        }
    }//GEN-LAST:event_Op1ActionPerformed

    //Suma de vector positivo
    private void Op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op2ActionPerformed
         if (result != null){
            int sumTot [] = result.getSumaPositivos();
            int sumPos [] = new int [1];
            sumPos[0] = sumTot[0];
            result2.setText(String.valueOf(sumPos [0])); // Convertir el entero a String y asignar a result
         }else{
             JOptionPane.showMessageDialog(null, "Por favor, primero ingrese los datos.");
             // Si no se cumple, desmarcar el checkbox
             Op2.setSelected(false);
         }
    }//GEN-LAST:event_Op2ActionPerformed

    // Suma de vector negativo.
    private void Op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op3ActionPerformed
        if (result != null){
            int suma [] = result.getSumaNegativos();
            int sumaneg [] = new int [1];
            sumaneg[0] = suma [0];
            result3.setText(String.valueOf(sumaneg[0]));//Convertir el entero a String y asignar el result3
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, primero ingrese los datos.");
            // Si no se cumple, desmarcar el checkbox
            Op3.setSelected(false);
        }
        
    }//GEN-LAST:event_Op3ActionPerformed

    //Ordenar vector Negativo. 
    private void Op5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op5ActionPerformed
        if (result != null) {
        try {
            Integer[] ordenarnegativos = result.getOrdenarNegativos(); // Llama al método de ordenación
            //JOptionPane.showMessageDialog(null,ordenarnegativos);
            if (ordenarnegativos != null && ordenarnegativos.length > 0) {
                result5.setText(Arrays.toString(ordenarnegativos)); // Convertir a String y mostrar en el JTextField
            } else {
                result5.setText("No hay números negativos para ordenar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ordenar: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, primero ingrese los datos.");
        // Si no se cumple, desmarcar el checkbox
        Op5.setSelected(false);
    }
    }//GEN-LAST:event_Op5ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        //Limpiar el tamaño del vector
        Cant.setText("");

        //Limpiar los check box
        Op1.setSelected(false);
        Op2.setSelected(false);
        Op3.setSelected(false);
        Op4.setSelected(false);
        Op5.setSelected(false);
        //Dejar los Jlabel y JtextArea en Blanco
        result1.setText("");
        result2.setText("");
        result3.setText("");
        result4.setText("");
        result5.setText("");
        // Limpiar estado interno de los vectores
        vector = null;
        PosVector = null;
        NegVector = null;
        result = null;
        posCount = 0;
        negCount = 0;
    }//GEN-LAST:event_limpiarActionPerformed

    static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cant;
    private javax.swing.JButton GuardarTam;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JCheckBox Op1;
    private javax.swing.JCheckBox Op2;
    private javax.swing.JCheckBox Op3;
    private javax.swing.JCheckBox Op4;
    private javax.swing.JCheckBox Op5;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel SolUs;
    private javax.swing.JLabel SolUs1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel result2;
    private javax.swing.JLabel result3;
    private javax.swing.JTextField result4;
    private javax.swing.JTextField result5;
    // End of variables declaration//GEN-END:variables
}
