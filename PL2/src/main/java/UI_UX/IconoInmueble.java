/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_UX;

import Logica.Inmueble;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class IconoInmueble extends javax.swing.JPanel {

    private Inmueble i;

    /**
     * Creates new form IconoInmueble
     */
    public IconoInmueble() {
        initComponents();
    }

    public void init(Inmueble i) {
        this.i = i;
        nombre.setText(this.i.getTitulo());
        precio.setText(String.valueOf(this.i.getPrecioNoche()) + "€/noche");
        fotoboton.setIcon(resizeIMG(this.i.getFotografia()));
        calificacionlabel.setText("Calificación: " + Double.toString(i.getCalificacion()));

    }

    public ImageIcon resizeIMG(String img) {
        try {
            File imagePath = new File(img);
            BufferedImage originalImage = ImageIO.read(imagePath);
            int width = 264; //fotoboton.getWidth();
            int height = 173; //fotoboton.getHeight();
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(resizedImage);
            return imageIcon;
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
            return null;
        }
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
        fotoboton = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        calificacionlabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(295, 400));
        setPreferredSize(new java.awt.Dimension(295, 400));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setMaximumSize(new java.awt.Dimension(295, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(295, 400));

        fotoboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casa1.jpg"))); // NOI18N
        fotoboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotobotonMouseClicked(evt);
            }
        });
        fotoboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotobotonActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nombre.setText("Titulo");

        precio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precio.setText("Precio €/noche");

        calificacionlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        calificacionlabel.setText("Calificación: 4.5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calificacionlabel)
                            .addComponent(precio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fotoboton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(fotoboton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(nombre)
                .addGap(25, 25, 25)
                .addComponent(precio)
                .addGap(18, 18, 18)
                .addComponent(calificacionlabel)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fotobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotobotonActionPerformed
        Aplicacion.loadBuildingView(this.i);

    }//GEN-LAST:event_fotobotonActionPerformed

    private void fotobotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotobotonMouseClicked

    }//GEN-LAST:event_fotobotonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calificacionlabel;
    private javax.swing.JButton fotoboton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
}
