package views;

//@author Luneth
public class Menu extends javax.swing.JFrame{
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu.class.getName());

    //Creates new form Menu
    public Menu(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ListarVehiculoBtn = new javax.swing.JButton();
        AgregarVehiculoBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú Principal");

        ListarVehiculoBtn.setText("Listar Vehículo");
        ListarVehiculoBtn.addActionListener(this::ListarVehiculoBtnActionPerformed);

        AgregarVehiculoBtn.setText("Agregar Vehículo");
        AgregarVehiculoBtn.addActionListener(this::AgregarVehiculoBtnActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarVehiculoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListarVehiculoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AgregarVehiculoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(ListarVehiculoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void AgregarVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVehiculoBtnActionPerformed
        IngresarVehiculo ingresar = new IngresarVehiculo();
        ingresar.setMenu(this);
        ingresar.setLocationRelativeTo(null);
        ingresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarVehiculoBtnActionPerformed

    private void ListarVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarVehiculoBtnActionPerformed
        ListarVehiculosView listar = new ListarVehiculosView();
        listar.setMenu(this);
        listar.setLocationRelativeTo(null);
        listar.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_ListarVehiculoBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVehiculoBtn;
    private javax.swing.JButton ListarVehiculoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
