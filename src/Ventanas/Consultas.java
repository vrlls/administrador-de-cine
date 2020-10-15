/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static Ventanas.Administrador.arch5;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class Consultas extends javax.swing.JFrame {
Metodos m= new Metodos();
    /**
     * Creates new form Consultas
     */
    public Consultas() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        Nodo ptr= m.agregarNodosDescripcion(arch5);
        peliculas.addItem("Escoja una pelicula");
        m.ComboboxPeliculas(ptr, peliculas);
        nombre.setText("");
        nombre.setEditable(false);
        desc.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        peliculas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        VolverVUsuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("¿Qué película deseas buscar?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 152, -1));

        peliculas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja una pelicula" }));
        peliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peliculasMouseClicked(evt);
            }
        });
        peliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculasActionPerformed(evt);
            }
        });
        getContentPane().add(peliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 152, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel2.setText("DESCRIPCIÓN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        VolverVUsuario.setBackground(new java.awt.Color(0, 0, 0));
        VolverVUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        VolverVUsuario.setForeground(new java.awt.Color(255, 255, 255));
        VolverVUsuario.setText("Volver");
        VolverVUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverVUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(VolverVUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 35));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 84, 35));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setText("Tu-FILM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 141, 27));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/movie-theater-background-8.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_peliculasActionPerformed

    private void peliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliculasMouseClicked
        // TODO add your handling code here: 
      
    }//GEN-LAST:event_peliculasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
         
        if (!peliculas.getSelectedItem().equals("Escoja una pelicula")){
          String Peli=  peliculas.getSelectedItem().toString();
          Nodo ptr;
          ptr = m.agregarNodosDescripcion(arch5);  
          Nodo q=m.buscarDescripcion(Peli, ptr);
          if (q!=null){
              nombre.setText(q.pelicula);
              desc.setText(q.descripcion);
          }
        } else{
            JOptionPane.showMessageDialog(null, "Elija una pelicula");
            nombre.setText("");
        }
        } catch (IOException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VolverVUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverVUsuarioActionPerformed
        new Usuario().setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_VolverVUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consultas().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VolverVUsuario;
    private javax.swing.JTextArea desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> peliculas;
    // End of variables declaration//GEN-END:variables
}
