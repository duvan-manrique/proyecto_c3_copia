/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto__c3;

/**
 *
 * @author rojas
 */
public class tablero_juego extends javax.swing.JFrame {
    Movimientos_rojas roja;
    Movimientos_azules azul;
    Movimientos_verdes verde;
    Movimientos_amarillas amarillo;
    public tablero_juego() {
        initComponents();    
        iniciar();
    }
    void iniciar(){
      roja= new Movimientos_rojas(f_roja,0);
      roja.start();
      azul= new Movimientos_azules(f_azul,0);
      azul.start();
      verde = new Movimientos_verdes(f_verde,0);
      verde.start();
      amarillo = new Movimientos_amarillas(f_amarilla,0);
      amarillo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        f_azul = new javax.swing.JLabel();
        f_roja = new javax.swing.JLabel();
        f_amarilla = new javax.swing.JLabel();
        f_verde = new javax.swing.JLabel();
        btnTirar = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        resul = new javax.swing.JLabel();
        lblD1 = new javax.swing.JLabel();
        lblD2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDado2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblDado1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_juego1 = new proyecto__c3.Panel_juego();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1015, 640));
        setMinimumSize(new java.awt.Dimension(1015, 640));
        setPreferredSize(new java.awt.Dimension(1015, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        f_azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_c3/imagen/peque5.png"))); // NOI18N
        f_azul.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                f_azulMouseDragged(evt);
            }
        });
        getContentPane().add(f_azul);
        f_azul.setBounds(480, 240, 20, 20);

        f_roja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_c3/imagen/peque2.png"))); // NOI18N
        f_roja.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                f_rojaMouseDragged(evt);
            }
        });
        getContentPane().add(f_roja);
        f_roja.setBounds(480, 220, 20, 20);

        f_amarilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_c3/imagen/peque3.png"))); // NOI18N
        f_amarilla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                f_amarillaMouseDragged(evt);
            }
        });
        getContentPane().add(f_amarilla);
        f_amarilla.setBounds(480, 180, 20, 20);

        f_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_c3/imagen/peque4.png"))); // NOI18N
        f_verde.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                f_verdeMouseDragged(evt);
            }
        });
        getContentPane().add(f_verde);
        f_verde.setBounds(480, 200, 20, 20);

        btnTirar.setText("Tirar");
        btnTirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirarActionPerformed(evt);
            }
        });
        getContentPane().add(btnTirar);
        btnTirar.setBounds(870, 310, 55, 23);

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(700, 310, 59, 23);

        resul.setText("la suma es : 0");
        getContentPane().add(resul);
        resul.setBounds(780, 280, 66, 14);

        lblD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblD1.setText("0");
        getContentPane().add(lblD1);
        lblD1.setBounds(690, 250, 60, 14);

        lblD2.setText("0");
        getContentPane().add(lblD2);
        lblD2.setBounds(870, 250, 40, 14);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("dado2"));

        lblDado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDado2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(810, 90, 158, 150);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("dado1"));

        lblDado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDado1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(620, 90, 157, 151);

        jLabel1.setText("dado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(770, 30, 24, 14);
        getContentPane().add(panel_juego1);
        panel_juego1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f_amarillaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_amarillaMouseDragged
       
    }//GEN-LAST:event_f_amarillaMouseDragged

    private void f_verdeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_verdeMouseDragged
 
    }//GEN-LAST:event_f_verdeMouseDragged

    private void f_rojaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_rojaMouseDragged

    }//GEN-LAST:event_f_rojaMouseDragged

    private void f_azulMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_azulMouseDragged

    }//GEN-LAST:event_f_azulMouseDragged

    private void btnTirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirarActionPerformed
        // TODO add your handling code here:
        generanumero objDado=new generanumero();
        imagenesResul objImag1=new imagenesResul();
        int num1= objDado.calculanumero();
        lblD1.setText(""+num1);
        lblDado1.setIcon(objImag1.Imaen(num1));

        generanumero objDado2=new generanumero();
        imagenesResul objImag2=new imagenesResul();
        int num2= objDado.calculanumero();
        lblD2.setText(""+num2);
        lblDado2.setIcon(objImag1.Imaen(num2));
        int r= num1+num2;
        resul.setText(" la suma es : "+r);
    }//GEN-LAST:event_btnTirarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
        generanumero objDado=new generanumero();
        int dados1 = objDado.calculanumero();
        imagenes1 objImag1 = new imagenes1();
        lblDado1.setIcon(objImag1.gifDado1(dados1));

        generanumero objDado2=new generanumero();
        int dados2 = objDado.calculanumero();
        imagenes2 objImag2 = new imagenes2();
        lblDado2.setIcon(objImag2.gifDado2(dados2));
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(tablero_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablero_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablero_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablero_juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero_juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnTirar;
    private javax.swing.JLabel f_amarilla;
    private javax.swing.JLabel f_azul;
    private javax.swing.JLabel f_roja;
    private javax.swing.JLabel f_verde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblD1;
    private javax.swing.JLabel lblD2;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private proyecto__c3.Panel_juego panel_juego1;
    private javax.swing.JLabel resul;
    // End of variables declaration//GEN-END:variables
}
