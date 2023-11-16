/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;
import DAO.Baraja;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class vistaBaraja extends javax.swing.JFrame implements MouseListener{
    
    private Baraja mazo;
    private ArrayList<VistaCartas> vc;
    
    public vistaBaraja() {
        mazo = new Baraja();
        mazo.generarBaraja();
        
        vc = new ArrayList<>();
        
        initComponents();
        agregarCartas();
    }

    public Baraja getMazo() {
        return mazo;
    }

    public void setMazo(Baraja mazo) {
        this.mazo = mazo;
    }
    
    public void agregarCartas(){
        vc.removeAll(vc);
        for(int i = 0; i < mazo.getBaraja().size(); i++){
            vc.add(new  VistaCartas(mazo.getBaraja().get(i)));
            vc.get(i).addMouseListener(this);
            jPanel1.add(vc.get(i));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBarajar = new javax.swing.JButton();
        btnOrganizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBarajar.setBackground(new java.awt.Color(0, 102, 102));
        btnBarajar.setForeground(new java.awt.Color(0, 0, 0));
        btnBarajar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/poker-completo.png"))); // NOI18N
        btnBarajar.setText("Barajar");
        btnBarajar.setBorder(new javax.swing.border.MatteBorder(null));
        btnBarajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarajarActionPerformed(evt);
            }
        });

        btnOrganizar.setBackground(new java.awt.Color(0, 102, 102));
        btnOrganizar.setForeground(new java.awt.Color(0, 0, 0));
        btnOrganizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/poker-completo.png"))); // NOI18N
        btnOrganizar.setText("Organizar");
        btnOrganizar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnOrganizar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnOrganizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridLayout(4, 13, 8, 8));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBarajar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrganizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrganizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBarajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBarajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarajarActionPerformed
        jPanel1.removeAll();
        mazo.revolver();
        agregarCartas();
        jPanel1.revalidate();
    }//GEN-LAST:event_btnBarajarActionPerformed

    private void btnOrganizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizarActionPerformed
           jPanel1.removeAll();
           mazo = new Baraja();
           mazo.generarBaraja();
           agregarCartas();
           jPanel1.revalidate();
           
    }//GEN-LAST:event_btnOrganizarActionPerformed

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
            java.util.logging.Logger.getLogger(vistaBaraja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaBaraja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaBaraja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaBaraja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaBaraja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarajar;
    private javax.swing.JButton btnOrganizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        String tipo ="";
        for (int i = 0; i < vc.size(); i++){
            if (e.getSource() == vc.get(i))
            {
              switch(vc.get(i).getCarta().getTipo()){
                  case 1:
                      tipo= "Pica";
                      break;
                  case 2:
                      tipo= "Corazon";
                      break;
                  case 3:
                      tipo= "Trebol";
                      break;
                  case 4:
                      tipo= "Diamante";
                      break;
                      
              }
              
                      JOptionPane.showMessageDialog(this, "Carta numero="+(vc.get(i).getCarta().getId())+"||"+vc.get(i).getCarta().getNumero()+"de"+ tipo);
                      System.out.println("Carta="+vc.get(i).getCarta().getId());
                      System.out.println(vc.get(i).getCarta().getNumero()+"de"+ tipo);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
}
