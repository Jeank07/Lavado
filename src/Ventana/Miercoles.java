/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author ADM
 */
public class Miercoles extends javax.swing.JFrame {

    /**
     * Creates new form Lunes
     */
    public Miercoles() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono = new javax.swing.JLabel();
        Reserva = new javax.swing.JLabel();
        Linea_Azul = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Placa_Cliente = new javax.swing.JTextField();
        Placa = new javax.swing.JLabel();
        Nombre_Cliente = new javax.swing.JTextField();
        Normal = new javax.swing.JRadioButton();
        Tipo = new javax.swing.JLabel();
        Espumoso = new javax.swing.JRadioButton();
        S_Espumoso = new javax.swing.JRadioButton();
        Intensidad = new javax.swing.JLabel();
        Suave = new javax.swing.JRadioButton();
        Intermedio = new javax.swing.JRadioButton();
        Extremo = new javax.swing.JRadioButton();
        Extra = new javax.swing.JLabel();
        Aspirado = new javax.swing.JRadioButton();
        Encerado = new javax.swing.JRadioButton();
        Lavado_Alfombra = new javax.swing.JRadioButton();
        Lavado_Tapiceria = new javax.swing.JRadioButton();
        Lavado_Motor = new javax.swing.JRadioButton();
        BTN_Lavar_Ya = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lunes");
        setBackground(new java.awt.Color(0, 0, 0));
        setName("Frame_Lunes"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono negro2.jpg"))); // NOI18N
        icono.setText("jLabel3");
        getContentPane().add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Reserva.setBackground(new java.awt.Color(0, 0, 0));
        Reserva.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Reserva.setForeground(new java.awt.Color(255, 255, 255));
        Reserva.setText("Reservas");
        getContentPane().add(Reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        Linea_Azul.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout Linea_AzulLayout = new javax.swing.GroupLayout(Linea_Azul);
        Linea_Azul.setLayout(Linea_AzulLayout);
        Linea_AzulLayout.setHorizontalGroup(
            Linea_AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        Linea_AzulLayout.setVerticalGroup(
            Linea_AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(Linea_Azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 130, 10));

        Nombre.setBackground(new java.awt.Color(0, 0, 0));
        Nombre.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre del cliente:");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        Placa_Cliente.setBackground(new java.awt.Color(0, 0, 0));
        Placa_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Placa_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Placa_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 200, -1));

        Placa.setBackground(new java.awt.Color(0, 0, 0));
        Placa.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Placa.setForeground(new java.awt.Color(255, 255, 255));
        Placa.setText("Placa del vehiculo:");
        getContentPane().add(Placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, -1));

        Nombre_Cliente.setBackground(new java.awt.Color(0, 0, 0));
        Nombre_Cliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nombre_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Nombre_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, -1));

        Normal.setBackground(new java.awt.Color(0, 0, 0));
        Normal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Normal.setForeground(new java.awt.Color(255, 255, 255));
        Normal.setText("Normal");
        getContentPane().add(Normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        Tipo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Tipo.setForeground(new java.awt.Color(255, 255, 255));
        Tipo.setText("Seleccione el tipo de lavado:");
        getContentPane().add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        Espumoso.setBackground(new java.awt.Color(0, 0, 0));
        Espumoso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Espumoso.setForeground(new java.awt.Color(255, 255, 255));
        Espumoso.setText("Espumoso");
        getContentPane().add(Espumoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        S_Espumoso.setBackground(new java.awt.Color(0, 0, 0));
        S_Espumoso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        S_Espumoso.setForeground(new java.awt.Color(255, 255, 255));
        S_Espumoso.setText("Super Espumoso");
        getContentPane().add(S_Espumoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        Intensidad.setBackground(new java.awt.Color(0, 0, 0));
        Intensidad.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Intensidad.setForeground(new java.awt.Color(255, 255, 255));
        Intensidad.setText("Seleccione intensidad de lavado:");
        getContentPane().add(Intensidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        Suave.setBackground(new java.awt.Color(0, 0, 0));
        Suave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Suave.setForeground(new java.awt.Color(255, 255, 255));
        Suave.setText("Suave");
        getContentPane().add(Suave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        Intermedio.setBackground(new java.awt.Color(0, 0, 0));
        Intermedio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Intermedio.setForeground(new java.awt.Color(255, 255, 255));
        Intermedio.setText("Intermedio");
        getContentPane().add(Intermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        Extremo.setBackground(new java.awt.Color(0, 0, 0));
        Extremo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Extremo.setForeground(new java.awt.Color(255, 255, 255));
        Extremo.setText("Extremo");
        getContentPane().add(Extremo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        Extra.setBackground(new java.awt.Color(0, 0, 0));
        Extra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Extra.setForeground(new java.awt.Color(255, 255, 255));
        Extra.setText("Desea agregar algo extra:");
        getContentPane().add(Extra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, -1, -1));

        Aspirado.setBackground(new java.awt.Color(0, 0, 0));
        Aspirado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Aspirado.setForeground(new java.awt.Color(255, 255, 255));
        Aspirado.setText("Aspirado");
        getContentPane().add(Aspirado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));

        Encerado.setBackground(new java.awt.Color(0, 0, 0));
        Encerado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Encerado.setForeground(new java.awt.Color(255, 255, 255));
        Encerado.setText("Encerado");
        getContentPane().add(Encerado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, -1));

        Lavado_Alfombra.setBackground(new java.awt.Color(0, 0, 0));
        Lavado_Alfombra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lavado_Alfombra.setForeground(new java.awt.Color(255, 255, 255));
        Lavado_Alfombra.setText("Lavado de alfombras");
        getContentPane().add(Lavado_Alfombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 230, -1));

        Lavado_Tapiceria.setBackground(new java.awt.Color(0, 0, 0));
        Lavado_Tapiceria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lavado_Tapiceria.setForeground(new java.awt.Color(255, 255, 255));
        Lavado_Tapiceria.setText("Lavado de tapiceria");
        getContentPane().add(Lavado_Tapiceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, -1, -1));

        Lavado_Motor.setBackground(new java.awt.Color(0, 0, 0));
        Lavado_Motor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lavado_Motor.setForeground(new java.awt.Color(255, 255, 255));
        Lavado_Motor.setText("Lavado de motor");
        getContentPane().add(Lavado_Motor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 630, -1, -1));

        BTN_Lavar_Ya.setBackground(new java.awt.Color(0, 0, 0));
        BTN_Lavar_Ya.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        BTN_Lavar_Ya.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Lavar_Ya.setText("¡ Lavar Ya !");
        BTN_Lavar_Ya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Lavar_YaActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_Lavar_Ya, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        btn_Cancelar.setBackground(new java.awt.Color(0, 0, 0));
        btn_Cancelar.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuración de lavado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 350, 10));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/negroo.jpg"))); // NOI18N
        Fondo.setText("jLabel1");
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 819, 716));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Trabajo T = new Trabajo();
        T.setVisible(true);
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void BTN_Lavar_YaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Lavar_YaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BTN_Lavar_YaActionPerformed

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
            java.util.logging.Logger.getLogger(Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Miercoles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Aspirado;
    private javax.swing.JButton BTN_Lavar_Ya;
    private javax.swing.JRadioButton Encerado;
    private javax.swing.JRadioButton Espumoso;
    private javax.swing.JLabel Extra;
    private javax.swing.JRadioButton Extremo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Intensidad;
    private javax.swing.JRadioButton Intermedio;
    private javax.swing.JRadioButton Lavado_Alfombra;
    private javax.swing.JRadioButton Lavado_Motor;
    private javax.swing.JRadioButton Lavado_Tapiceria;
    private javax.swing.JPanel Linea_Azul;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Nombre_Cliente;
    private javax.swing.JRadioButton Normal;
    private javax.swing.JLabel Placa;
    private javax.swing.JTextField Placa_Cliente;
    private javax.swing.JLabel Reserva;
    private javax.swing.JRadioButton S_Espumoso;
    private javax.swing.JRadioButton Suave;
    private javax.swing.JLabel Tipo;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
