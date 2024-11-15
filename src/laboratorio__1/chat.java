/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio__1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.json.JSONObject;
import javax.swing.SwingWorker;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isabc
 */
public class chat extends javax.swing.JFrame {

    int c;
    int indice;
    String historial[][];
    String chat[];
    String in[];

    /**
     * Creates new form chat
     */
    public chat() {
        c = 0;
        historial = new String[10000][9999];
        chat = new String[9999];
        in = new String[9999];
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("bot.png")).getImage());
        enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("send.png")));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("out.png")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCaja = new javax.swing.JTextField();
        enviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hstrl = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Chat = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setLocationByPlatform(true);
        getContentPane().setLayout(null);

        txtCaja.setText("Escribe un mensaje aquí");
        txtCaja.setToolTipText("");
        txtCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCajaMouseExited(evt);
            }
        });
        getContentPane().add(txtCaja);
        txtCaja.setBounds(79, 338, 406, 58);

        enviar.setText("Enviar");
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });
        getContentPane().add(enviar);
        enviar.setBounds(503, 352, 118, 31);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E.V.A.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(88, 6, 70, 32);

        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(278, 402, 140, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Historial:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(576, 56, 47, 16);

        hstrl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hstrlMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(hstrl);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(576, 78, 120, 242);

        jButton3.setText("Nuevo Chat");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(576, 16, 130, 40);

        jScrollPane3.setViewportView(Chat);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(47, 44, 511, 282);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jButton2.setText("Limpiar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(electronic virtual assistant)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(504, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, -3, 780, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void enviar(String x){
    String prpt = x;
     // Obtiene el texto del usuario
        if (prpt.equals("")) {
            JOptionPane.showMessageDialog(null, "Entrada vacía, envía un mensaje o instrucción para E.V.A.","Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String mensajePensando = "Eva: Pensando..."; // Mensaje de espera

// Agrega mensaje del usuario y "pensando..." al arreglo chat
            boolean s = false;
            for (int i = 0; i < chat.length - 1; i += 2) {
                if (chat[i] == null) {
                    chat[i] = "Usuario: " + prpt;
                    chat[i + 1] = mensajePensando; // Mensaje temporal
                    txtCaja.setText(""); // Limpia la caja de texto del usuario
                    s = true;
                    break;
                }
            }


            if (s) {
                Chat.setListData(chat); // Actualiza la lista con el mensaje "pensando..."
            }

// Usa SwingWorker para realizar la llamada a la API en segundo plano
            new SwingWorker<String, Void>() {
                @Override
                protected String doInBackground() {
                    try {
                        // Llama a la API de la IA y retorna la respuesta
                        return ChatBotAPI.sendMessage(prpt);
                    } catch (Exception ex) {
                        Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
                        return "Error al obtener respuesta"; // Mensaje en caso de error
                    }
                }

                @Override
                protected void done() {
                    try {
                        String respuesta = get(); // Obtiene la respuesta de la IA

                        // Reemplaza el mensaje "pensando..." con la respuesta real
                        for (int i = 0; i < chat.length - 1; i += 2) {
                            if (chat[i] != null && chat[i + 1].equals(mensajePensando)) {
                                chat[i + 1] = "Eva: " + respuesta;
                                break;
                            }
                        }

                        // Actualiza la interfaz con la respuesta
                        Chat.setListData(chat);

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }.execute();
        }

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    }
    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        String mensaje = txtCaja.getText();
        enviar(mensaje);
    }//GEN-LAST:event_enviarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCajaMouseEntered
        txtCaja.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaMouseEntered

    private void txtCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCajaMouseExited

    }//GEN-LAST:event_txtCajaMouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    public void historial(){
    indice = hstrl.getSelectedIndex();
        for (int i = 0; i < chat.length - 1; i++) {
            chat[i] = historial[indice][i + 1];
        }
        Chat.setListData(chat);
    }
    private void hstrlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hstrlMouseClicked
        historial();
    }//GEN-LAST:event_hstrlMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        hstrl();
    }//GEN-LAST:event_jButton3MouseClicked
    public void hstrl(){
    historial[c][0] = "Chat " + (c + 1);
        for (int i = 0; i < chat.length - 1; i++) {
            if (chat[i] != null) {
                historial[c][i + 1] = chat[i];
                chat[i] = "";
            }
        }
        c = c + 1;
        for (int i = 0; i < in.length - 1; i++) {
            if (historial[i][0] != null) {
                in[i] = historial[i][0];
            }

        }
        hstrl.setListData(in);
        Chat.setListData(chat);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void nuevo(){
    for (int i = 0; i < chat.length - 1; i++) {
            if (chat[i] != null) {
                chat[i] = "";
            }
        }
        Chat.setListData(chat);
    }
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        nuevo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new chat().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Chat;
    private javax.swing.JButton enviar;
    private javax.swing.JList<String> hstrl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCaja;
    // End of variables declaration//GEN-END:variables
}
