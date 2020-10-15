/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Ventanas.Sala1.arch;
import static Ventanas.Sala2.arch2;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 8.1
 */
public class VUsuario extends javax.swing.JFrame {

    static File arch3 = new File("reservas.txt");
    Metodos mt = new Metodos();
    Sala1 s1 = new Sala1();
    Sala2 s2 = new Sala2();
    Nodo nd = new Nodo();

    /**
     * Creates new form VUsuario
     */
    public VUsuario() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        Nodo ptrs1 = mt.agregarnodos(arch);
        Nodo ptrs2 = mt.agregarnodos(arch2);
        Nodo ptr = mt.crearMultilista(ptrs1, ptrs2);
        if (ptr != null) {
            mt.mostrarTablaReservas(jTable1, ptr);
        }
        peliculan.setEditable(false);
        horadeinicio.setEditable(false);
        horafinal.setEditable(false);
        Salatf.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salirVUsuario = new javax.swing.JButton();
        VolverVUsuario = new javax.swing.JButton();
        titulovusuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        peliculan = new javax.swing.JTextField();
        horadeinicio = new javax.swing.JTextField();
        horafinal = new javax.swing.JTextField();
        numerodeboletas = new javax.swing.JTextField();
        ConfirmarReserva = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Salatf = new javax.swing.JTextField();
        fondoVUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirVUsuario.setBackground(new java.awt.Color(255, 51, 51));
        salirVUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        salirVUsuario.setForeground(new java.awt.Color(255, 255, 255));
        salirVUsuario.setText("Salir");
        salirVUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirVUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(salirVUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 80, 30));

        VolverVUsuario.setBackground(new java.awt.Color(255, 50, 50));
        VolverVUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        VolverVUsuario.setForeground(new java.awt.Color(255, 255, 255));
        VolverVUsuario.setText("Volver");
        VolverVUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverVUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(VolverVUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        titulovusuario.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        titulovusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulovusuario.setText("Tu-FILM");
        getContentPane().add(titulovusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 350, 120));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sala1", "Hora inicio", "Hora final", "Pelicula", "boletas disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, 260));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Elegir pelicula");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        peliculan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculanActionPerformed(evt);
            }
        });
        getContentPane().add(peliculan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 90, -1));
        getContentPane().add(horadeinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 90, -1));
        getContentPane().add(horafinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 100, -1));

        numerodeboletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerodeboletasActionPerformed(evt);
            }
        });
        numerodeboletas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerodeboletasKeyTyped(evt);
            }
        });
        getContentPane().add(numerodeboletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 90, -1));

        ConfirmarReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConfirmarReserva.setText("Confirmar reserva");
        ConfirmarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarReservaActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, -1, -1));

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pelicula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora inicio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora final:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("# Boletas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cedula:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sala");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        Salatf.setText(" ");
        getContentPane().add(Salatf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 70, -1));

        fondoVUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/theatre.jpg"))); // NOI18N
        getContentPane().add(fondoVUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirVUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirVUsuarioActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirVUsuarioActionPerformed

    private void VolverVUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverVUsuarioActionPerformed
        new Usuario().setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_VolverVUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int k = 0;
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Favor seleccione una fila");
        } else {
            DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
            int j = jTable1.getSelectedRow();
            Salatf.setText(table.getValueAt(j, 0).toString());
            peliculan.setText(table.getValueAt(j, 3).toString());
            horadeinicio.setText(table.getValueAt(j, 1).toString());
            horafinal.setText(table.getValueAt(j, 2).toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void peliculanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculanActionPerformed


    }//GEN-LAST:event_peliculanActionPerformed

    private void ConfirmarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarReservaActionPerformed
if(!Salatf.getText().equals("") && !peliculan.getText().equals("") && !horadeinicio.getText().equals("") && !horafinal.getText().equals("") && !numerodeboletas.getText().equals("") && !cedula.getText().equals("")){
        File arch3 = new File("reservas.txt");
        if (!arch3.exists()) {
            try {
                arch3.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Sala1.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        try {
            Nodo q = null;
            Nodo ptr3 = mt.agregarnodosReserva(arch3);
            Nodo l = new Nodo(Salatf.getText(), peliculan.getText().toString(), horadeinicio.getText().toString(), horafinal.getText().toString(), numerodeboletas.getText().toString(), cedula.getText().toString());
            if(mt.consultarReserva(ptr3, l.id)==null){
               
            if (Salatf.getText().equals("S1")) {
                Nodo ptr = mt.agregarnodos(arch);
                q = mt.comprar(ptr, horadeinicio.getText(), peliculan.getText(), numerodeboletas.getText());
                if (q != null) {
                    mt.guardar(arch, q);
                    mt.insertarreserva(arch3, l, ptr3);
                    TablaR t = new TablaR(mt.creararchivo(Salatf.getText() + peliculan.getText().toString(), horadeinicio.getText()));
                    t.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de boletas que necesita, no esta disponible");
                }
            } else {
                if (Salatf.getText().equals("S2")) {
                   // System.out.println("hole");
                    Nodo ptr = mt.agregarnodos(arch2);
                    q = mt.comprar(ptr, horadeinicio.getText(), peliculan.getText(), numerodeboletas.getText());
                    if (q != null) {
                        mt.guardar(arch2, q);
                        mt.insertarreserva(arch3, l, ptr3);
                      //  System.out.println("hey");
                        TablaR t = new TablaR(mt.creararchivo(Salatf.getText() + peliculan.getText().toString(), horadeinicio.getText()));
                        t.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cantidad de boletas que necesita, no esta disponible");
                    }
                }

            }
            }else{
                 JOptionPane.showMessageDialog(null, "este id ya tiene reservas");
            }
            

        } catch (IOException ex) {
            Logger.getLogger(Sala1.class.getName()).log(Level.SEVERE, null, ex);
        }}else{JOptionPane.showMessageDialog(null, "Llene todos los campos");}
    }//GEN-LAST:event_ConfirmarReservaActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void numerodeboletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerodeboletasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numerodeboletasActionPerformed

    private void numerodeboletasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerodeboletasKeyTyped
     char c= evt.getKeyChar();
    if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_numerodeboletasKeyTyped

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
    char c= evt.getKeyChar();
    if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_cedulaKeyTyped

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
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VUsuario().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmarReserva;
    private javax.swing.JTextField Salatf;
    private javax.swing.JButton VolverVUsuario;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel fondoVUsuario;
    private javax.swing.JTextField horadeinicio;
    private javax.swing.JTextField horafinal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numerodeboletas;
    private javax.swing.JTextField peliculan;
    private javax.swing.JButton salirVUsuario;
    private javax.swing.JLabel titulovusuario;
    // End of variables declaration//GEN-END:variables
}