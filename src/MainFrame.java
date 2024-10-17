
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * This class design and implement the main screen after user successfully
 * log in to the system.
 * 
 * @author
 */
  class MainFrame extends javax.swing.JFrame {

   
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents(); 
      setLocationRelativeTo(null);
        //setSize(791, 525);
        this.setVisible(true);
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
        orderManagementb = new javax.swing.JButton();
        StockManagementb = new javax.swing.JButton();
        logoutb = new javax.swing.JButton();
        NewOrderb = new javax.swing.JButton();
        customerManagementb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Books Account Management");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        jPanel1.setAlignmentX(300.0F);
        jPanel1.setAlignmentY(300.0F);

        orderManagementb.setBackground(java.awt.SystemColor.activeCaption);
        orderManagementb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderManagementb.setText("Order Management ");
        orderManagementb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(51, 0, 51), new java.awt.Color(102, 204, 255)));
        orderManagementb.setFocusPainted(false);
        orderManagementb.setPreferredSize(new java.awt.Dimension(103, 31));
        orderManagementb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderManagementbActionPerformed(evt);
            }
        });

        StockManagementb.setBackground(java.awt.SystemColor.activeCaption);
        StockManagementb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StockManagementb.setText("Stock Management ");
        StockManagementb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StockManagementb.setPreferredSize(new java.awt.Dimension(103, 31));
        StockManagementb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockManagementbActionPerformed(evt);
            }
        });

        logoutb.setBackground(new java.awt.Color(255, 51, 51));
        logoutb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logoutb.setText("  ");
        logoutb.setAutoscrolls(true);
        logoutb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutb.setIconTextGap(0);
        logoutb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbActionPerformed(evt);
            }
        });

        NewOrderb.setBackground(java.awt.SystemColor.activeCaption);
        NewOrderb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NewOrderb.setText("New Order ");
        NewOrderb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NewOrderb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrderbActionPerformed(evt);
            }
        });

        customerManagementb.setBackground(java.awt.SystemColor.activeCaption);
        customerManagementb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerManagementb.setText("Customer Management ");
        customerManagementb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerManagementb.setPreferredSize(new java.awt.Dimension(103, 31));
        customerManagementb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerManagementbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StockManagementb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewOrderb, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(orderManagementb, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addComponent(customerManagementb, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewOrderb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderManagementb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerManagementb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StockManagementb, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(logoutb, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe_1.png"))); // NOI18N

        Name.setBackground(new java.awt.Color(153, 204, 255));
        Name.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        Name.setForeground(new java.awt.Color(102, 0, 0));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Cafe  Management System");
        Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbActionPerformed
        // close this window and make login screen visible
        
        this.dispose();
    }//GEN-LAST:event_logoutbActionPerformed

    private void orderManagementbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderManagementbActionPerformed
       new OrderHandlerDashboard().setVisible(true);
    }//GEN-LAST:event_orderManagementbActionPerformed

    private void NewOrderbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewOrderbActionPerformed
OrderFrame f=new OrderFrame();

f.setLocation(20, 20);


 Dimension size 
            = Toolkit.getDefaultToolkit().getScreenSize();
f.setSize(size.width, size.height); 
f.setVisible(true);
     

    }//GEN-LAST:event_NewOrderbActionPerformed

    private void customerManagementbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerManagementbActionPerformed
        new CustomerHandlerDashboard().setVisible(true);
    }//GEN-LAST:event_customerManagementbActionPerformed

    private void StockManagementbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockManagementbActionPerformed
        new StockHandlerDashboard().setVisible(true);
    }//GEN-LAST:event_StockManagementbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JButton NewOrderb;
    private javax.swing.JButton StockManagementb;
    private javax.swing.JButton customerManagementb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutb;
    private javax.swing.JButton orderManagementb;
    // End of variables declaration//GEN-END:variables
}