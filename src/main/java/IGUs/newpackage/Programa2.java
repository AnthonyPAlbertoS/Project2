/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGUs.newpackage;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FLIA PEREZ
 */
public class Programa2 extends javax.swing.JFrame {

    /**
     * Creates new form Programa2
     */
    public Programa2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MenuOp = new javax.swing.JComboBox<>();
        FilasC = new javax.swing.JTextField();
        ColumM = new javax.swing.JTextField();
        GuardarItem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ReturnMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        GuardarMatriz = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableResult = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--Programa 2");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total de Coloboradores: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total de Meses: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Elija una Opcion del Menu: ");

        MenuOp.setBackground(new java.awt.Color(255, 255, 255));
        MenuOp.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        MenuOp.setForeground(new java.awt.Color(0, 0, 0));
        MenuOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Informacion Coloboradores", "Suma Ventas Vendedor", "Promedio Ventas Vendedor", "Suma Ventas Mensuales", "Promedio Por Mes" }));

        GuardarItem.setBackground(new java.awt.Color(153, 153, 153));
        GuardarItem.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        GuardarItem.setForeground(new java.awt.Color(0, 0, 0));
        GuardarItem.setText("Guardar Opción");
        GuardarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarItemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Resultados de la Selección: ");

        ReturnMenu.setBackground(new java.awt.Color(153, 153, 153));
        ReturnMenu.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        ReturnMenu.setForeground(new java.awt.Color(0, 0, 0));
        ReturnMenu.setText("Menú Pricipal");
        ReturnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnMenuActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Limpiar Opcion.");

        GuardarMatriz.setBackground(new java.awt.Color(204, 204, 255));
        GuardarMatriz.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        GuardarMatriz.setForeground(new java.awt.Color(0, 0, 0));
        GuardarMatriz.setText("Guardar");
        GuardarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarMatrizActionPerformed(evt);
            }
        });

        TableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableResult);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GuardarMatriz)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ColumM, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FilasC, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GuardarItem)
                                        .addComponent(jButton1)))
                                .addGap(18, 18, 18)
                                .addComponent(MenuOp, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReturnMenu)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FilasC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ColumM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(GuardarMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(MenuOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuardarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ReturnMenu)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton de Retorno Al menu Principal
    private void ReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnMenuActionPerformed
        // Boton de retorno al menu 
         Menu menu = new Menu ();
        
         menu.setVisible(true);
         menu.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_ReturnMenuActionPerformed

    //Boton de Guardar Matriz
    private float Ventas [][]; //Matriz para guardar la cantidad de coloboradores y mes.
    private int c = 0, f= 0;
    private Calculospro2 result; 
    private void GuardarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarMatrizActionPerformed
        String filas = FilasC.getText(); //Abstrayendo lo ingresado en TexField
        String Columnas = ColumM.getText(); 
        
        try{
            //Comprovacion que e usuario no ingrese letras y deje em blanco. 
            if (filas.isEmpty() && Columnas.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor, Ingrese un tamaño para el vector.");
                FilasC.setText("");
                ColumM.setText(""); //Limpiado el TextField
            }//fin del if 
            
            f = Integer.parseInt(filas);
            c = Integer.parseInt(Columnas); //F = FILAS Y C = COLUMNAS. 
            
            //Verificando que la cantidad de la matriz sea positiva y mayor a 0 
            if (f <= 0 && c <= 0){
                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores postivos y mayor a 0.");
                FilasC.setText("");
                ColumM.setText("");
                return;
            } //fin del if. 
            
            Ventas = new float [f][c];//Cargando tamaño de matriz 
            
            //Cargando la Matriz con datos ingresados por el usuario 
            for (int i = 0; i < f; i++){
                for (int j = 0; j < c; j++){
                    String datos = JOptionPane.showInputDialog(null, 
                    "Ingrese el valor para el vendedor " + (i + 1) + " en el mes " + (j + 1) + ":");
                try {
                    // Convertir el valor ingresado a float y almacenarlo en la matriz
                    Ventas[i][j] = Float.parseFloat(datos);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un número válido.");
                    j--; // Repetir la iteración actual si el ingreso fue inválido
                }
                }
            } //Fin de la carga de la matriz
            
            //Cargando mi clase calculos 
            result = new Calculospro2 (Ventas, c,f);
            
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese números válidos para la Matriz.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
        
    }//GEN-LAST:event_GuardarMatrizActionPerformed

    
    //Configurando la Opcion de Jcombox A Travez del Boton
    private String opcion = " "; 
    
    private void GuardarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarItemActionPerformed
        opcion = MenuOp.getSelectedItem().toString(); //Acogiendo la opcion del Jcombox
        
        //usando un case para la opcion del usuario. 
        try {
            switch (opcion) {
                case "Informacion Coloboradores":
                    this.MostraMatriz();
                    break;

                case "Suma Ventas Vendedor":
                    // Código para calcular la suma de ventas por vendedor
                    //Llamando el metodo donde esta el resultado 
                    result.SumVentasVendedor((DefaultTableModel)TableResult.getModel());
                    break;

                case "Promedio Ventas Vendedor":
                    // Código para calcular el promedio de ventas por vendedor
                    result.PromVentasVenedor((DefaultTableModel) TableResult.getModel());
                    break;

                case "Suma Ventas Mensuales":
                    // Código para calcular la suma de ventas mensuales
                    result.SumaVentasMensuales((DefaultTableModel) TableResult.getModel());
                    break;

                case "Promedio Por Mes":
                    // Código para calcular el promedio de ventas por mes
                    result.PromVentasMensuales((DefaultTableModel) TableResult.getModel());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el programa: " + e.getMessage());
        }
    }//GEN-LAST:event_GuardarItemActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa2().setVisible(true);
            }
        });
    }
    
    // Vinculo para mostrar la matriz en tiempo de ejecucion en Table. 
    public void MostraMatriz() {
        DefaultTableModel model = (DefaultTableModel) TableResult.getModel();
        model.setRowCount(f);
        model.setColumnCount(c + 1); // Incrementa en 1 para incluir la columna de Vendedores

        // Definir títulos de las columnas
        String[] titulos = new String[c + 1]; // Incrementa en 1 para incluir la columna de Vendedores
        titulos[0] = "Vendedor"; // Nombre de la primera columna
        for (int j = 1; j <= c; j++) {
            titulos[j] = "Mes " + j; 
        }
        model.setColumnIdentifiers(titulos);

        // Definir filas con el nombre de vendedor
        // Asignar nombres de vendedores en las filas
        for (int i = 0; i < f; i++) {
            model.setValueAt("Vendedor " + (i + 1), i, 0); // Establece el nombre del vendedor en la primera columna
            for (int j = 0; j < c; j++) {
                model.setValueAt(Ventas[i][j], i, j + 1); // Llena los datos de ventas en las siguientes columnas
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ColumM;
    private javax.swing.JTextField FilasC;
    private javax.swing.JButton GuardarItem;
    private javax.swing.JButton GuardarMatriz;
    private javax.swing.JComboBox<String> MenuOp;
    private javax.swing.JButton ReturnMenu;
    private javax.swing.JTable TableResult;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
