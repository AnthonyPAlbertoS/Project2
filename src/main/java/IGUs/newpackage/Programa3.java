/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IGUs.newpackage;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANTHONY PEREZ
 */
public class Programa3 extends javax.swing.JFrame {

    ArrayList array = new ArrayList();
    DefaultListModel model = new DefaultListModel();
    /**
     * Creates new form Programa3
     */
    public Programa3() {
        initComponents();
        ListNombre.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Parcial1 = new javax.swing.JTextField();
        Parcial2 = new javax.swing.JTextField();
        Parcial3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Letras = new javax.swing.JComboBox<>();
        GuardarInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableResult = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Semestral = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListNombre = new javax.swing.JList<>();
        GuardarEs = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--Bienvenido Al Programa 3--");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cedula:");

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });

        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parcial 1");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Parcial 2");

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Parcial 3");

        Parcial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parcial2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Listado Promedio Del Estudiante: ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Letras.setBackground(new java.awt.Color(255, 255, 255));
        Letras.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Letras.setForeground(new java.awt.Color(0, 0, 0));
        Letras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        Letras.setAlignmentX(10.0F);
        Letras.setAlignmentY(10.0F);

        GuardarInfo.setBackground(new java.awt.Color(153, 153, 153));
        GuardarInfo.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        GuardarInfo.setForeground(new java.awt.Color(0, 0, 0));
        GuardarInfo.setText("Guardar Datos");
        GuardarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarInfoActionPerformed(evt);
            }
        });

        TableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cedula", "Parcial", "Parcial 2", "Parcial 3", "Semestral", "Porcentaje Parciales", "Porcentaje Semestral", "Nota Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableResult.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TableResult);
        if (TableResult.getColumnModel().getColumnCount() > 0) {
            TableResult.getColumnModel().getColumn(0).setResizable(false);
            TableResult.getColumnModel().getColumn(1).setResizable(false);
            TableResult.getColumnModel().getColumn(2).setResizable(false);
            TableResult.getColumnModel().getColumn(3).setResizable(false);
            TableResult.getColumnModel().getColumn(4).setResizable(false);
            TableResult.getColumnModel().getColumn(5).setResizable(false);
            TableResult.getColumnModel().getColumn(6).setResizable(false);
            TableResult.getColumnModel().getColumn(7).setResizable(false);
            TableResult.getColumnModel().getColumn(8).setResizable(false);
            TableResult.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Semestral");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Elija La Calificación");

        jScrollPane3.setViewportView(ListNombre);

        GuardarEs.setBackground(new java.awt.Color(153, 153, 153));
        GuardarEs.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        GuardarEs.setForeground(new java.awt.Color(0, 0, 0));
        GuardarEs.setText("Agregar Estudiante");
        GuardarEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEsActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        MenuPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        MenuPrincipal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        MenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        MenuPrincipal.setText("Menu Principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GuardarInfo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(Parcial1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Parcial2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel6))))
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Parcial3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Semestral, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Letras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(GuardarEs)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(MenuPrincipal)
                .addContainerGap(823, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(270, 270, 270))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(GuardarEs)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Parcial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Parcial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Parcial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Semestral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(GuardarInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Letras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuPrincipal)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cargando de Regreso al Menu Principal. 
    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
        // Boton de retorno al menu
        Menu menu = new Menu ();

        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_MenuPrincipalActionPerformed
 
    //No funciona
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    //Boton de guardar estudiante selecionar estudiante del Jlis
    private void GuardarEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEsActionPerformed
        //Pendiente 

    }//GEN-LAST:event_GuardarEsActionPerformed

    //Meetodo para actualizar el Jlist directamente
    private void actualizarJList(String nombre) {
        // Añadir el nuevo nombre directamente al modelo del JList
        model.addElement(nombre);
    }
    
    //No funciona
    private void Parcial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parcial2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Parcial2ActionPerformed
  
    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed

    }//GEN-LAST:event_ApellidoActionPerformed

    //Boton Guardar Datos de Ingreso
    //Creando una clase para instanciar los resultaodos
    private Calculospro3 calculos;  //clase para hacer los distintos calculos que ser requieran 
    private ValidarPro3 validar;
    private int  N = 100; 
    private Object[][] estudiantes; 
    private int contador; 
    private void GuardarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarInfoActionPerformed
        // Inicializar la matriz para los estudiantes
        estudiantes = new Object[N][10]; //8 columnas para los datos 
        contador = 0;
        DefaultTableModel tableModel = (DefaultTableModel) TableResult.getModel();

        //Inicio de guardar imformacion en el Table 
        try{
            //Capturar los datos Ingresados por el Usuario desde EL JTexfield 
            String nombre = Nombre.getText().trim();
            String apellido = Apellido.getText().trim();
            String cedula = Cedula.getText().trim(); 
            String parcial1 = Parcial1.getText().trim();
            String parcial2 = Parcial2.getText().trim();
            String parcial3 = Parcial3.getText().trim();
            String semestral = Semestral.getText().trim();
           
             // Validaciones De completar todos los campos antes de guardar informacion.
            if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || 
                parcial1.isEmpty() || parcial2.isEmpty() || parcial3.isEmpty() || semestral.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir si hay campos vacíos
            }
            //Validando el Apellido 
            validar = new ValidarPro3(apellido,nombre,cedula);
            if(!validar.validarNombre()){//Llamar metodo de verificacion de nombre
                JOptionPane.showMessageDialog(null,"Error en el Nombre, solo ingrese letras");
                Nombre.setText("");
                return;
            }
            if(!validar.validarApellido()){//Llamar metodo de verificacion de nombre
                JOptionPane.showMessageDialog(null,"Error en el Apellido solo ingrese letras");
                Apellido.setText("");
                return;
            }
            if(!validar.ValidarCedula()){
                JOptionPane.showMessageDialog(null,"Error en el Cedula, Ingrese una cedula Valida");
                Cedula.setText("");
                return;
            }
            //Convertir datos que se necesitan dato numerico 
            float parcial_1, parcial_2, parcial_3,exam_sem;
            parcial_1 = Float.parseFloat(parcial1);
            parcial_2 = Float.parseFloat(parcial2);
            parcial_3 = Float.parseFloat(parcial3);
            exam_sem = Float.parseFloat(semestral);
            // Validar que los parciales estén entre 0 y 100
            if (parcial_1 < 0 || parcial_1 > 100) {
                JOptionPane.showMessageDialog(null, "El valor del Parcial 1 debe estar entre 0 y 100.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Parcial1.setText("");
                return; // Salir si la validación falla
            }
            if (parcial_2 < 0 || parcial_2 > 100) {
                JOptionPane.showMessageDialog(null, "El valor del Parcial 2 debe estar entre 0 y 100.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Parcial2.setText("");
                return; // Salir si la validación falla
            }
            if (parcial_3 < 0 || parcial_3 > 100) {
                JOptionPane.showMessageDialog(null, "El valor del Parcial 3 debe estar entre 0 y 100.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                Parcial3.setText("");
                return; // Salir si la validación falla
            }
            if(exam_sem < 0 || exam_sem > 100){
                JOptionPane.showMessageDialog(null,"El valor de Examen Semestral debe estar entre 0 y 100.",
                        "Eroor", JOptionPane.ERROR_MESSAGE);
                Semestral.setText("");
                return; //salir si la vlidacion falla. 
            }
            
            //Llamando la clase calculos 
            calculos = new Calculospro3(parcial_1,parcial_2,parcial_3, exam_sem);
            //resultados de la clase 
            float PorcentajeParcial = calculos.PorcentajeParciales();
            float PorcentajeExamen  = calculos.PorcentajeExamen();
            float Promedio = calculos.PorcentajeExamen();
            
            // Almacenar los datos en la matriz
            if (contador < N) {
                estudiantes[contador] = new Object[]{nombre, apellido, cedula, parcial_1, parcial_2, 
                    parcial_3, exam_sem, PorcentajeParcial,PorcentajeExamen,Promedio};
                
                // Actualizar el JTable
               tableModel.addRow(estudiantes[contador]);
               contador++;
               
               // Actualizar el JList con el nuevo nombre
                actualizarJList(nombre);
               // Limpiar los campos después de guardar
                Nombre.setText("");
                Apellido.setText("");
                Cedula.setText("");
                Parcial1.setText("");
                Parcial2.setText("");
                Parcial3.setText("");
                Semestral.setText("");
                
            } else {
                JOptionPane.showMessageDialog(null, "Capacidad máxima de estudiantes alcanzada.", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurio un Erroro en el Programa. "+ ERROR);
        }
    }//GEN-LAST:event_GuardarInfoActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Programa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Cedula;
    private javax.swing.JButton GuardarEs;
    private javax.swing.JButton GuardarInfo;
    private javax.swing.JComboBox<String> Letras;
    private javax.swing.JList<String> ListNombre;
    private javax.swing.JButton MenuPrincipal;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Parcial1;
    private javax.swing.JTextField Parcial2;
    private javax.swing.JTextField Parcial3;
    private javax.swing.JTextField Semestral;
    private javax.swing.JTable TableResult;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
