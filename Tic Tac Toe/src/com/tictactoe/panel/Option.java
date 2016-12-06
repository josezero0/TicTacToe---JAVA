/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoe.panel;

/**
 *
 * @author BuenSeñor
 */
public class Option extends javax.swing.JPanel {

    /**
     * Creates new form Option
     */
    public Option() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlayer = new javax.swing.JButton();
        btnPlayerCPU = new javax.swing.JButton();
        btnCPU = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnPlayer.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnPlayer.setText("Player vs Player");

        btnPlayerCPU.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnPlayerCPU.setText("Player vs CPU");

        btnCPU.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnCPU.setText("CPU vs CPU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlayerCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPlayer)
                .addGap(18, 18, 18)
                .addComponent(btnPlayerCPU)
                .addGap(18, 18, 18)
                .addComponent(btnCPU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCPU;
    private javax.swing.JButton btnPlayer;
    private javax.swing.JButton btnPlayerCPU;
    // End of variables declaration//GEN-END:variables
}