/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp.conversor;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author manusanti
 */
public class VistaConversor extends javax.swing.JFrame {

    /**
     * Creates new form VistaConversor
     */
    public VistaConversor() {
        initComponents();
       
        contenedor.setVisible(true);
       
        option.setVisible(true);
        frameMonedas.setVisible(false);
        frameGrados.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    DecimalFormat formato1 = new DecimalFormat("#.00");
    public void operacion( double pesos, double cambio){
        try{
           
        double resultado = pesos/cambio;
               String result =formato1.format(resultado);
               result1.setText(result);
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "por favor ingresar un numero ");
        }
    }
    public void aPesos( double pesos, double cambio){
       try{
        double resultado = pesos*cambio;
               String result =formato1.format(resultado);
               inMonedas.setText(result);
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "por favor ingresar un numero ");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        option = new javax.swing.JPanel();
        monedas = new javax.swing.JButton();
        temperatura = new javax.swing.JButton();
        conversor = new javax.swing.JLabel();
        alura = new javax.swing.JLabel();
        contenedor = new javax.swing.JDesktopPane();
        frameMonedas = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        conver = new javax.swing.JTextArea();
        monedasBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cambiobox = new javax.swing.JComboBox<>();
        inPesos = new javax.swing.JTextArea();
        inMonedas = new javax.swing.JTextArea();
        convertirPesos = new javax.swing.JButton();
        result1 = new javax.swing.JTextArea();
        convertirAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        frameGrados = new javax.swing.JInternalFrame();
        inarea = new javax.swing.JTextArea();
        convertir = new javax.swing.JButton();
        outarea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("conversor-Alura");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(470, 405));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        option.setBackground(new java.awt.Color(102, 102, 102));

        monedas.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        monedas.setText("Monedas");
        monedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedasActionPerformed(evt);
            }
        });

        temperatura.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        temperatura.setText("Temperatura");
        temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturaActionPerformed(evt);
            }
        });

        conversor.setBackground(new java.awt.Color(255, 255, 255));
        conversor.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 15)); // NOI18N
        conversor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conversor.setText("conversor");
        conversor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        alura.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        alura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alura.setText("#Alura challenge");

        javax.swing.GroupLayout optionLayout = new javax.swing.GroupLayout(option);
        option.setLayout(optionLayout);
        optionLayout.setHorizontalGroup(
            optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alura)
                .addGap(53, 53, 53)
                .addComponent(conversor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monedas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(temperatura)
                .addGap(49, 49, 49))
        );
        optionLayout.setVerticalGroup(
            optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(optionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temperatura)
                    .addComponent(monedas)
                    .addComponent(conversor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 60));

        contenedor.setBackground(new java.awt.Color(153, 153, 153));
        contenedor.setInheritsPopupMenu(true);
        contenedor.setMaximumSize(new java.awt.Dimension(500, 350));
        contenedor.setPreferredSize(new java.awt.Dimension(500, 350));

        frameMonedas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        frameMonedas.setClosable(true);
        frameMonedas.setIconifiable(true);
        frameMonedas.setResizable(true);
        frameMonedas.setTitle("conversor de monedas");
        frameMonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameMonedas.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        frameMonedas.setMaximumSize(new java.awt.Dimension(400, 200));
        frameMonedas.setMinimumSize(new java.awt.Dimension(400, 200));
        frameMonedas.setPreferredSize(new java.awt.Dimension(400, 200));
        frameMonedas.setVisible(true);

        conver.setBackground(new java.awt.Color(153, 153, 153));
        conver.setColumns(20);
        conver.setForeground(new java.awt.Color(0, 0, 0));
        conver.setRows(5);

        monedasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro","Libra E." , "Yen", "won" }));
        monedasBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monedasBoxItemStateChanged(evt);
            }
        });
        monedasBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedasBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesos AR");

        cambiobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro","Libra E." , "Yen", "won" }));

        inPesos.setBackground(new java.awt.Color(153, 153, 153));
        inPesos.setColumns(20);
        inPesos.setForeground(new java.awt.Color(0, 0, 0));
        inPesos.setRows(5);

        inMonedas.setEditable(false);
        inMonedas.setBackground(new java.awt.Color(0, 0, 0));
        inMonedas.setColumns(20);
        inMonedas.setForeground(new java.awt.Color(255, 255, 255));
        inMonedas.setRows(5);

        convertirPesos.setText("convertir a AR");
        convertirPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirPesosActionPerformed(evt);
            }
        });

        result1.setEditable(false);
        result1.setBackground(new java.awt.Color(0, 0, 0));
        result1.setColumns(20);
        result1.setForeground(new java.awt.Color(255, 255, 255));
        result1.setRows(5);
        result1.setToolTipText("");

        convertirAll.setText("convertir");
        convertirAll.setBorderPainted(false);
        convertirAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirAllActionPerformed(evt);
            }
        });

        jLabel2.setText("$AR");

        jLabel3.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(monedasBox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(conver, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cambiobox, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(convertirAll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(convertirPesos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(result1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(inPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(convertirAll, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(monedasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(conver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(convertirPesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cambiobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout frameMonedasLayout = new javax.swing.GroupLayout(frameMonedas.getContentPane());
        frameMonedas.getContentPane().setLayout(frameMonedasLayout);
        frameMonedasLayout.setHorizontalGroup(
            frameMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(frameMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameMonedasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        frameMonedasLayout.setVerticalGroup(
            frameMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(frameMonedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameMonedasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        frameGrados.setClosable(true);
        frameGrados.setIconifiable(true);
        frameGrados.setResizable(true);
        frameGrados.setTitle("conversor de grados");
        frameGrados.setMaximumSize(new java.awt.Dimension(400, 200));
        frameGrados.setMinimumSize(new java.awt.Dimension(400, 200));
        frameGrados.setPreferredSize(new java.awt.Dimension(400, 200));
        frameGrados.setVisible(true);

        inarea.setColumns(20);
        inarea.setRows(5);

        convertir.setText("convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        outarea.setEditable(false);
        outarea.setColumns(20);
        outarea.setRows(5);

        jLabel4.setText("°C");

        jLabel5.setText("°F");

        javax.swing.GroupLayout frameGradosLayout = new javax.swing.GroupLayout(frameGrados.getContentPane());
        frameGrados.getContentPane().setLayout(frameGradosLayout);
        frameGradosLayout.setHorizontalGroup(
            frameGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameGradosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(inarea, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addComponent(convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outarea, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        frameGradosLayout.setVerticalGroup(
            frameGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameGradosLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(frameGradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inarea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outarea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(121, 121, 121))
        );

        contenedor.setLayer(frameMonedas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        contenedor.setLayer(frameGrados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameMonedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(frameGrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameMonedas, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(frameGrados, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void monedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedasActionPerformed
      
        if(!frameMonedas.isVisible()){
        frameMonedas.setVisible(true); 
        }else{
        frameMonedas.setVisible(false);
        }
        
    }//GEN-LAST:event_monedasActionPerformed

    private void temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturaActionPerformed

         if(!frameGrados.isVisible()){
        frameGrados.setVisible(true); 
        }else{
        frameGrados.setVisible(false);
        }
    }//GEN-LAST:event_temperaturaActionPerformed

    private void convertirAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirAllActionPerformed
        String clave = (String) monedasBox.getSelectedItem();
        double pesos = 0;
        try{
            pesos = Double.parseDouble(inPesos.getText());
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "por favor ingresa un numero");
        }
        switch(clave){
            case "Dolar":
               double dolar = 215.00; 
               operacion(pesos,dolar);
               
                break;

                
            case "Euro":
                double euro =231.80;
                operacion(pesos,euro);
                break;
                
            case "Libra E.":
                double libras =257.15 ;
                operacion(pesos,libras);
                break;
                
            case "Yen":
                double yen =1.57 ;
                operacion(pesos,yen);
                break;
            
            case "won":
                double won =0.16;
                operacion(pesos,won);
                break;
            
        
        
        }
    }//GEN-LAST:event_convertirAllActionPerformed

    private void monedasBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedasBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedasBoxActionPerformed

    private void monedasBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monedasBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_monedasBoxItemStateChanged

    private void convertirPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirPesosActionPerformed
        String clave = (String) cambiobox.getSelectedItem();
        double pesos=0;
        try{
        pesos = Double.parseDouble(conver.getText());
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "por favor ingresar un numero ");
        }
        switch(clave){
            case "Dolar":
               double dolar = 215.00; 
               aPesos(pesos,dolar);
                break;

                
            case "Euro":
                double euro =231.80;
                aPesos(pesos,euro);
                break;
                
            case "Libra E.":
                double libras = 257.15 ;
                aPesos(pesos,libras);
                break;
                
            case "Yen":
                double yen =1.57 ;
                aPesos(pesos,yen);
                break;
            
            case "won":
                double won =0.16;
                aPesos(pesos,won);
                break;
        }
    }//GEN-LAST:event_convertirPesosActionPerformed

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        double grado = 0;
        try{
        grado = Double.parseDouble(inarea.getText());
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "por favor ingresar un numero ");
        }
        
        double resultado = grado *1.8 + 32;
        String result =formato1.format(resultado);
        outarea.setText(result);
        
    }//GEN-LAST:event_convertirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VistaConversor().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alura;
    private javax.swing.JComboBox<String> cambiobox;
    private javax.swing.JDesktopPane contenedor;
    private javax.swing.JTextArea conver;
    private javax.swing.JLabel conversor;
    private javax.swing.JButton convertir;
    private javax.swing.JButton convertirAll;
    private javax.swing.JButton convertirPesos;
    private javax.swing.JInternalFrame frameGrados;
    private javax.swing.JInternalFrame frameMonedas;
    private javax.swing.JTextArea inMonedas;
    private javax.swing.JTextArea inPesos;
    private javax.swing.JTextArea inarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton monedas;
    private javax.swing.JComboBox<String> monedasBox;
    private javax.swing.JPanel option;
    private javax.swing.JTextArea outarea;
    private javax.swing.JTextArea result1;
    private javax.swing.JButton temperatura;
    // End of variables declaration//GEN-END:variables
}
