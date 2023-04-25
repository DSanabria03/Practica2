package uva.ipc.practica1.vista;

import java.awt.Color;
import java.util.ArrayList;
import uva.ipc.practica1.modelo.Libro;
import uva.ipc.practica1.modelo.Biblioteca;
/**
 *
 * @author saant
 */
public class VistaMenu extends javax.swing.JFrame {
    
    private ControladorMenu miControlador;
    private ControladorBuscador miBuscador;
    /**
     * Creates new form VistaMenu
     */
    public VistaMenu() {
        initComponents();
        miControlador=new ControladorMenu(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        numeroLibrosLabel = new javax.swing.JLabel();
        leidosLabel = new javax.swing.JLabel();
        precioMedioLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        edicManualButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        buscadorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 300));
        setPreferredSize(new java.awt.Dimension(450, 300));

        jPanel1.setLayout(new java.awt.GridLayout(3, 0));

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        tituloLabel.setFont(new java.awt.Font("Script MT Bold", 0, 36)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Biblioteca");
        jPanel2.add(tituloLabel);

        jPanel1.add(jPanel2);

        jPanel3.setToolTipText("");
        jPanel3.setLayout(new java.awt.GridLayout(3, 1));

        numeroLibrosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroLibrosLabel.setText("Número de libros");
        numeroLibrosLabel.setToolTipText("");
        numeroLibrosLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(numeroLibrosLabel);

        leidosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leidosLabel.setText("Número de libros leídos");
        jPanel3.add(leidosLabel);

        precioMedioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precioMedioLabel.setText("Precio medio");
        jPanel3.add(precioMedioLabel);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        edicManualButton.setText("Edición Manual Libro");
        edicManualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicManualButtonActionPerformed(evt);
            }
        });
        jPanel5.add(edicManualButton);

        jPanel4.add(jPanel5);

        buscadorButton.setText("Biblioteca Libro");
        buscadorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorButtonActionPerformed(evt);
            }
        });
        jPanel6.add(buscadorButton);

        jPanel4.add(jPanel6);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorButtonActionPerformed
        //miBuscador.procesaEnviar();
        miControlador.procesaEventoIrABuscador();
    }//GEN-LAST:event_buscadorButtonActionPerformed

    private void edicManualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicManualButtonActionPerformed
        miControlador.procesaEventoIrAEdicionManual();
    }//GEN-LAST:event_edicManualButtonActionPerformed
    
    public void mostrarMensaje(int numLibros, int librosLeidos, int librosNoLeidos, double precioMedio) { 
        numeroLibrosLabel.setText(numLibros+" libro(s) en la biblioteca");
        leidosLabel.setText(librosLeidos+" libros leídos y "+librosNoLeidos+" libros no leídos");
        precioMedioLabel.setText(precioMedio+"€ es el precio medio de los libro que hay en la biblioteca");
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscadorButton;
    private javax.swing.JButton edicManualButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel leidosLabel;
    private javax.swing.JLabel numeroLibrosLabel;
    private javax.swing.JLabel precioMedioLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
