package view;

import javax.swing.JOptionPane;
import utils.IPCalculator;

/**
 *
 * @author Evandro Henrique Weyand
 */
public class MainFrame extends javax.swing.JFrame {

    IPCalculator c;

    public MainFrame() {
        initComponents();
        this.getRootPane().setDefaultButton(btnCalcular);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIp = new javax.swing.JPanel();
        tfdMaskBits = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdOct4 = new javax.swing.JTextField();
        tfdOct3 = new javax.swing.JTextField();
        tfdOct2 = new javax.swing.JTextField();
        tfdOct1 = new javax.swing.JTextField();
        panelBin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdBinIP = new javax.swing.JTextField();
        tfdBinNetID = new javax.swing.JTextField();
        tfdBinBc = new javax.swing.JTextField();
        tfdBinMask = new javax.swing.JTextField();
        panelDec = new javax.swing.JPanel();
        tfdDecMask = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfdDecNetID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfdDecIP = new javax.swing.JTextField();
        tfdDecBc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        panelOthers = new javax.swing.JPanel();
        tfdNumberOfHosts = new javax.swing.JTextField();
        tfdNumberOfNetworks = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfdWildcardMask = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora IPv4");

        panelIp.setBorder(javax.swing.BorderFactory.createTitledBorder("Digite o endereço IP desejado"));

        tfdMaskBits.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfdMaskBits.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdMaskBits.setText("24");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("/");

        tfdOct4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfdOct4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdOct4.setPreferredSize(new java.awt.Dimension(40, 23));

        tfdOct3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfdOct3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdOct3.setPreferredSize(new java.awt.Dimension(40, 23));

        tfdOct2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfdOct2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdOct2.setPreferredSize(new java.awt.Dimension(40, 23));

        tfdOct1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfdOct1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfdOct1.setPreferredSize(new java.awt.Dimension(40, 23));

        javax.swing.GroupLayout panelIpLayout = new javax.swing.GroupLayout(panelIp);
        panelIp.setLayout(panelIpLayout);
        panelIpLayout.setHorizontalGroup(
            panelIpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIpLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(tfdOct1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdOct2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdOct3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdOct4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdMaskBits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelIpLayout.setVerticalGroup(
            panelIpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdOct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdOct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdOct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdOct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfdMaskBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBin.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores binários"));
        panelBin.setPreferredSize(new java.awt.Dimension(355, 165));

        jLabel2.setText("Endereço IP:");

        jLabel3.setText("Máscara:");

        jLabel4.setText("Network ID:");

        jLabel5.setText("Broadcast:");

        tfdBinIP.setEditable(false);
        tfdBinIP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdBinIP.setForeground(new java.awt.Color(0, 0, 102));

        tfdBinNetID.setEditable(false);
        tfdBinNetID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdBinNetID.setForeground(new java.awt.Color(0, 0, 102));

        tfdBinBc.setEditable(false);
        tfdBinBc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdBinBc.setForeground(new java.awt.Color(0, 0, 102));

        tfdBinMask.setEditable(false);
        tfdBinMask.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdBinMask.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout panelBinLayout = new javax.swing.GroupLayout(panelBin);
        panelBin.setLayout(panelBinLayout);
        panelBinLayout.setHorizontalGroup(
            panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfdBinNetID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(tfdBinMask, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdBinBc)
                    .addComponent(tfdBinIP, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBinLayout.setVerticalGroup(
            panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdBinIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfdBinMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfdBinNetID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdBinBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDec.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores decimais"));
        panelDec.setPreferredSize(new java.awt.Dimension(355, 399));

        tfdDecMask.setEditable(false);
        tfdDecMask.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdDecMask.setForeground(new java.awt.Color(0, 0, 102));

        jLabel9.setText("Endereço IP:");

        tfdDecNetID.setEditable(false);
        tfdDecNetID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdDecNetID.setForeground(new java.awt.Color(0, 0, 102));

        jLabel6.setText("Broadcast:");

        jLabel8.setText("Máscara:");

        tfdDecIP.setEditable(false);
        tfdDecIP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdDecIP.setForeground(new java.awt.Color(0, 0, 102));

        tfdDecBc.setEditable(false);
        tfdDecBc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdDecBc.setForeground(new java.awt.Color(0, 0, 102));

        jLabel7.setText("Network ID:");

        javax.swing.GroupLayout panelDecLayout = new javax.swing.GroupLayout(panelDec);
        panelDec.setLayout(panelDecLayout);
        panelDecLayout.setHorizontalGroup(
            panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdDecIP, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdDecNetID, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdDecBc, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdDecMask, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelDecLayout.setVerticalGroup(
            panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfdDecIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfdDecMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfdDecNetID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfdDecBc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 102));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calc-icon.png"))); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        panelOthers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfdNumberOfHosts.setEditable(false);
        tfdNumberOfHosts.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdNumberOfHosts.setForeground(new java.awt.Color(0, 0, 102));

        tfdNumberOfNetworks.setEditable(false);
        tfdNumberOfNetworks.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdNumberOfNetworks.setForeground(new java.awt.Color(0, 0, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Número disponível de hosts:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Número disponível de redes:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Máscara inversa:");

        tfdWildcardMask.setEditable(false);
        tfdWildcardMask.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfdWildcardMask.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout panelOthersLayout = new javax.swing.GroupLayout(panelOthers);
        panelOthers.setLayout(panelOthersLayout);
        panelOthersLayout.setHorizontalGroup(
            panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOthersLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdWildcardMask, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfdNumberOfNetworks, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addComponent(tfdNumberOfHosts)))
                .addGap(29, 29, 29))
        );
        panelOthersLayout.setVerticalGroup(
            panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOthersLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdWildcardMask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNumberOfHosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(panelOthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNumberOfNetworks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(35, 35, 35))
        );

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-icon.png"))); // NOI18N
        btnFechar.setText("FECHAR");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOthers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBin, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(panelIp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelDec, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelIp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDec, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(panelBin, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelOthers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (tfdOct1.getText().length() > 0 && tfdOct2.getText().length() > 0 && tfdOct3.getText().length() > 0 && tfdOct4.getText().length() > 0) {
            if (Integer.parseInt(tfdMaskBits.getText()) >= 2 && Integer.parseInt(tfdMaskBits.getText()) <= 30) {
                // Catching IP
                String ip = tfdOct1.getText() + "." + tfdOct2.getText() + "." + tfdOct3.getText() + "." + tfdOct4.getText();
                c = new IPCalculator(ip, Integer.valueOf(tfdMaskBits.getText()));

                //Setting values on fields
                tfdBinIP.setText(c.getIPAddressBinary());
                tfdBinMask.setText(c.getSubnetMaskBinary());
                tfdBinNetID.setText(c.getNetworkIDAddressBinary());
                tfdBinBc.setText(c.getBroadcastAddressBinary());

                tfdDecIP.setText(c.getIPAddress());
                tfdDecMask.setText(c.getSubnetMask());
                tfdDecNetID.setText(c.getNetworkIDAddress());
                tfdDecBc.setText(c.getBroadcastAddress());

                tfdWildcardMask.setText(String.valueOf(c.getWildcardMask()));
                tfdNumberOfHosts.setText(String.valueOf(c.getNumberOfHostsAvailable()));
                tfdNumberOfNetworks.setText(String.valueOf(c.getNumberOfNetworksAvailable()));
            } else {
                JOptionPane.showMessageDialog(this, "Defina uma máscara válida: 2 a 30", "Aviso!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha os valores corretamente", "Erro!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelBin;
    private javax.swing.JPanel panelDec;
    private javax.swing.JPanel panelIp;
    private javax.swing.JPanel panelOthers;
    private javax.swing.JTextField tfdBinBc;
    private javax.swing.JTextField tfdBinIP;
    private javax.swing.JTextField tfdBinMask;
    private javax.swing.JTextField tfdBinNetID;
    private javax.swing.JTextField tfdDecBc;
    private javax.swing.JTextField tfdDecIP;
    private javax.swing.JTextField tfdDecMask;
    private javax.swing.JTextField tfdDecNetID;
    private javax.swing.JTextField tfdMaskBits;
    private javax.swing.JTextField tfdNumberOfHosts;
    private javax.swing.JTextField tfdNumberOfNetworks;
    private javax.swing.JTextField tfdOct1;
    private javax.swing.JTextField tfdOct2;
    private javax.swing.JTextField tfdOct3;
    private javax.swing.JTextField tfdOct4;
    private javax.swing.JTextField tfdWildcardMask;
    // End of variables declaration//GEN-END:variables
}
