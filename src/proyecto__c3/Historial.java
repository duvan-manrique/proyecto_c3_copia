/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto__c3;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class Historial extends javax.swing.JFrame {
    javax.swing.JFrame padre;
ArrayList<Evento> lista_eventos_validar;
private DefaultTableModel table_model_eventos;
    /**
     * Creates new form Historial
     */
    public Historial() {
        initComponents();
        configComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setVisible(false);
    }
     public void recibir (javax.swing.JFrame padre1){
        this.padre=padre1;
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cancelar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        cancelar.setBackground(new java.awt.Color(255, 0, 0));
        cancelar.setForeground(new java.awt.Color(255, 0, 0));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_c3/imagen/no.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 380));
        setMinimumSize(new java.awt.Dimension(650, 380));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABLA DE HISTORIAL DE JUGADORES ");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 493, 37);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 590, 190);

        cancelar1.setBackground(new java.awt.Color(255, 0, 0));
        cancelar1.setForeground(new java.awt.Color(255, 0, 0));
        cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_c3/imagen/no.png"))); // NOI18N
        cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar1ActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar1);
        cancelar1.setBounds(490, 290, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_c3/imagen/milky-way-2695569__340_1.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 640, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar1ActionPerformed
     this.setVisible(false);

    }//GEN-LAST:event_cancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    public javax.swing.JButton cancelar1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 private void configComponents() {
        DefaultTableModel table_model_eventos = new DefaultTableModel();
        table_model_eventos.addColumn("id");
        table_model_eventos.addColumn("cedula");
        table_model_eventos.addColumn("nombre");
        table_model_eventos.addColumn("apellido");
        table_model_eventos.addColumn("edad");
        table_model_eventos.addColumn("fecha de nacimiento");
        table_model_eventos.addColumn("fecha de registro");
        table_model_eventos.addColumn("nombre de la imagen");
        table_model_eventos.addColumn("puntaje");

        jTable1.setModel(table_model_eventos);
      setTableModel1(table_model_eventos);
        refreshTableModel();
      
    }
     public void setTableModel1(DefaultTableModel table_model_eventos){
        this.table_model_eventos = table_model_eventos;//recibe el modelo de la tabla de eventos
    }
   public void refreshTableModel()
    {
        //metodo que actualisa la tabla despues de ser agregaado un evento
        ArrayList<Evento> lista_eventos = Repositorio1.obtenerTodos();
        lista_eventos_validar=lista_eventos;
        while (table_model_eventos.getRowCount() > 0) {
            table_model_eventos.removeRow(0);
        }
        
        for(Evento e: lista_eventos)
        {
            String[] data = {Integer.toString(e.getId()), e.getCedula(),e.getNombre(), e.getApellido(), e.getEdad(),e.getFechanacimiento().toString(), e.getFecharegistro().toString(), e.getNomimagen(), e.getPuntaje()};
            
            table_model_eventos.addRow(data);
        }
       
    }





}
