package pkgview;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblnumaprobados = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblnumnotaregular = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblbestmatter = new javax.swing.JLabel();
        lblbeststudent = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfdatos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfdimensiondelista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Fira Code", 1, 15)); // NOI18N
        jLabel5.setText("Resultado:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 25, 238, -1));

        jLabel6.setText("% Aprobados:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 63, -1, -1));

        lblnumaprobados.setText("0");
        jPanel2.add(lblnumaprobados, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 80, -1));

        jLabel7.setText("Nota Regular:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 91, -1, -1));

        lblnumnotaregular.setText("0");
        jPanel2.add(lblnumnotaregular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 90, -1));

        jLabel8.setText("Mejor materia:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 119, -1, -1));

        lblbestmatter.setText("0");
        jPanel2.add(lblbestmatter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 90, -1));

        lblbeststudent.setText("0");
        jPanel2.add(lblbeststudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 90, -1));

        jLabel9.setText("Mejor estudiante:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 147, -1, -1));

        btncalcular.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        btncalcular.setText("Calcular");
        jPanel2.add(btncalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 238, 36));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfdatos.setColumns(20);
        txtfdatos.setRows(5);
        jScrollPane1.setViewportView(txtfdatos);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 166, 275, 203));

        jLabel4.setFont(new java.awt.Font("Fira Code", 0, 18)); // NOI18N
        jLabel4.setText("|idstu|idge|idmate|notas|");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 136, -1, -1));

        jLabel3.setFont(new java.awt.Font("Fira Code", 1, 15)); // NOI18N
        jLabel3.setText("Ingrese los siguientes codigos:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 110, -1, -1));
        jPanel3.add(txtfdimensiondelista, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 56, 270, 36));

        jLabel2.setFont(new java.awt.Font("Fira Code", 1, 14)); // NOI18N
        jLabel2.setText("Numero de examenes:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 31, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel1.setText("Sistema Estadistico");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 16, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        jLabel10.setText("By: Braleehn");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 58, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btncalcular;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblbestmatter;
    public javax.swing.JLabel lblbeststudent;
    public javax.swing.JLabel lblnumaprobados;
    public javax.swing.JLabel lblnumnotaregular;
    public javax.swing.JTextArea txtfdatos;
    public javax.swing.JTextField txtfdimensiondelista;
    // End of variables declaration//GEN-END:variables

    public void displayErrorMessage(String por_favor_ingresa_un_número_válido_para_l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
