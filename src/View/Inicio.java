package View;

import Controller.AlmacenController;
import Controller.ControllerListener;
import Controller.ListenerRutas;
import Model.Almacen;
import Model.Rutas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Conten = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Almacen = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAlmacen = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jtotal = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Rutas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AsignacionPollo = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listapolloreja = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        AsignacionRutas = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaruta = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        AsignarTransporte = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listatransporte = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Clientes = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Ventas = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Empleados = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        iconoInicio = new javax.swing.JLabel();
        iconoAlmacen = new javax.swing.JLabel();
        iconoRutas = new javax.swing.JLabel();
        iconoClientes = new javax.swing.JLabel();
        iconoVentas = new javax.swing.JLabel();
        iconoEmpleados = new javax.swing.JLabel();
        txtSalir = new javax.swing.JLabel();
        iconoSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnAlmacen = new javax.swing.JButton();
        btnRutas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Conten.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenido al sistema de venta");
        Home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel5.setBackground(new java.awt.Color(245, 185, 171));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Chicken_96px.png"))); // NOI18N

        jLabel10.setText("Almacen");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
        );

        Home.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, 150));

        jPanel6.setBackground(new java.awt.Color(245, 185, 171));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Journey_100px.png"))); // NOI18N

        jLabel11.setText("signacion de rutas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Home.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 200, 150));

        jPanel7.setBackground(new java.awt.Color(245, 185, 171));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Business Building_96px.png"))); // NOI18N

        jLabel12.setText("Cliente");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel12)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Home.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 200, 150));

        jPanel8.setBackground(new java.awt.Color(245, 185, 171));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Small Business_100px.png"))); // NOI18N

        jLabel13.setText("Ventas");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(48, 48, 48))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Home.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, 150));

        jPanel9.setBackground(new java.awt.Color(245, 185, 171));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Workers_96px.png"))); // NOI18N

        jLabel14.setText("Empleados");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(56, 56, 56))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Home.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 200, 150));

        jPanel10.setBackground(new java.awt.Color(245, 185, 171));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User Account_96px.png"))); // NOI18N

        jLabel15.setText("Usuarios");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(60, 60, 60))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Home.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 200, 150));

        jPanel11.setBackground(new java.awt.Color(245, 185, 171));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Line Chart_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(48, 48, 48))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Home.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 200, 150));

        jPanel12.setBackground(new java.awt.Color(245, 185, 171));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Services_100px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(48, 48, 48))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Home.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 200, 150));

        jPanel13.setBackground(new java.awt.Color(245, 185, 171));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        Home.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 200, 150));

        Conten.add(Home, "card2");

        Almacen.setBackground(new java.awt.Color(255, 255, 255));
        Almacen.setForeground(new java.awt.Color(153, 153, 153));
        Almacen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Almacen");
        Almacen.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jAlmacen.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre del Almacen", "Pollos VIvos", "Pollos Muertos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jAlmacen);

        Almacen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 580, 280));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Vivos", "Muertos" }));
        Almacen.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jTextField1.setText("Ingrese a Buscar");
        Almacen.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 170, 30));

        jtotal.setBackground(new java.awt.Color(141, 214, 210));
        jtotal.setPreferredSize(new java.awt.Dimension(210, 100));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Todo List_96pxblanco.png"))); // NOI18N

        javax.swing.GroupLayout jtotalLayout = new javax.swing.GroupLayout(jtotal);
        jtotal.setLayout(jtotalLayout);
        jtotalLayout.setHorizontalGroup(
            jtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtotalLayout.createSequentialGroup()
                .addGroup(jtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtotalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21))
                    .addGroup(jtotalLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jtotalLayout.setVerticalGroup(
            jtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtotalLayout.createSequentialGroup()
                .addGroup(jtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jtotalLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Almacen.add(jtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Total avez existentes");
        Almacen.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N
        jLabel23.setEnabled(false);
        Almacen.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 40, 30));

        Conten.add(Almacen, "card4");

        Rutas.setBackground(new java.awt.Color(255, 255, 255));
        Rutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.CardLayout());

        AsignacionPollo.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Etc.." }));

        listapolloreja.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        listapolloreja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N de Rejas", "Numero", "KG", "Precio", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(listapolloreja);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_naranja.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel26.setText("Agregar Pollo");

        javax.swing.GroupLayout AsignacionPolloLayout = new javax.swing.GroupLayout(AsignacionPollo);
        AsignacionPollo.setLayout(AsignacionPolloLayout);
        AsignacionPolloLayout.setHorizontalGroup(
            AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionPolloLayout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 526, Short.MAX_VALUE))
            .addGroup(AsignacionPolloLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel26))
                .addGap(58, 58, 58))
        );
        AsignacionPolloLayout.setVerticalGroup(
            AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionPolloLayout.createSequentialGroup()
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsignacionPolloLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AsignacionPolloLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)))
                .addGap(0, 111, Short.MAX_VALUE))
        );

        jPanel2.add(AsignacionPollo, "card3");

        AsignacionRutas.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Etc.." }));

        listaruta.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        listaruta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre Empleado", "Ruta", "Precio en KG", "Fecha entrada", "Fecha Salida"
            }
        ));
        jScrollPane3.setViewportView(listaruta);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_naranja.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setText("Asignar Ruta");

        javax.swing.GroupLayout AsignacionRutasLayout = new javax.swing.GroupLayout(AsignacionRutas);
        AsignacionRutas.setLayout(AsignacionRutasLayout);
        AsignacionRutasLayout.setHorizontalGroup(
            AsignacionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionRutasLayout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 526, Short.MAX_VALUE))
            .addGroup(AsignacionRutasLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(AsignacionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(54, 54, 54))
        );
        AsignacionRutasLayout.setVerticalGroup(
            AsignacionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionRutasLayout.createSequentialGroup()
                .addGroup(AsignacionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AsignacionRutasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsignacionRutasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AsignacionRutasLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)))
                .addGap(0, 111, Short.MAX_VALUE))
        );

        jPanel2.add(AsignacionRutas, "card2");

        AsignarTransporte.setBackground(new java.awt.Color(255, 255, 255));

        listatransporte.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        listatransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Trasporte", "Nombre Empleado", "Descripcion"
            }
        ));
        jScrollPane4.setViewportView(listatransporte);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Etc.." }));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_naranja.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });

        jLabel30.setText("Asignar Trasporte");

        javax.swing.GroupLayout AsignarTransporteLayout = new javax.swing.GroupLayout(AsignarTransporte);
        AsignarTransporte.setLayout(AsignarTransporteLayout);
        AsignarTransporteLayout.setHorizontalGroup(
            AsignarTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignarTransporteLayout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 526, Short.MAX_VALUE))
            .addGroup(AsignarTransporteLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addGroup(AsignarTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsignarTransporteLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel29))
                    .addGroup(AsignarTransporteLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel30)))
                .addContainerGap())
        );
        AsignarTransporteLayout.setVerticalGroup(
            AsignarTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignarTransporteLayout.createSequentialGroup()
                .addGroup(AsignarTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AsignarTransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsignarTransporteLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AsignarTransporteLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)))
                .addGap(0, 90, Short.MAX_VALUE))
        );

        jPanel2.add(AsignarTransporte, "card4");

        Rutas.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 800, 410));

        jButton1.setText("Asignacion de Pollo-rejas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Rutas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jButton2.setText("Asignacion de Rutas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Rutas.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jButton3.setText("Asignacion de Transporte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Rutas.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        Conten.add(Rutas, "card3");

        Clientes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setText("Clientes");

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel18)
                .addContainerGap(506, Short.MAX_VALUE))
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addContainerGap(565, Short.MAX_VALUE))
        );

        Conten.add(Clientes, "card5");

        Ventas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("Ventas");

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jLabel19)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addContainerGap(571, Short.MAX_VALUE))
        );

        Conten.add(Ventas, "card6");

        Empleados.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setBackground(new java.awt.Color(102, 102, 0));
        jLabel20.setText("Empleados");

        javax.swing.GroupLayout EmpleadosLayout = new javax.swing.GroupLayout(Empleados);
        Empleados.setLayout(EmpleadosLayout);
        EmpleadosLayout.setHorizontalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadosLayout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel20)
                .addContainerGap(456, Short.MAX_VALUE))
        );
        EmpleadosLayout.setVerticalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpleadosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel20)
                .addContainerGap(555, Short.MAX_VALUE))
        );

        Conten.add(Empleados, "card7");

        getContentPane().add(Conten, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 950, 600));

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images1.png"))); // NOI18N
        Dashboard.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 37, -1, -1));

        iconoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home_96px.png"))); // NOI18N
        Dashboard.add(iconoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        iconoAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Chicken_96px_marron.png"))); // NOI18N
        Dashboard.add(iconoAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        iconoRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Journey_96pxcafe.png"))); // NOI18N
        Dashboard.add(iconoRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        iconoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Business Building_96pxCAFE.png"))); // NOI18N
        Dashboard.add(iconoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        iconoVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Small Business_96px_marron.png"))); // NOI18N
        Dashboard.add(iconoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        iconoEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Workers_96pxcafe.png"))); // NOI18N
        Dashboard.add(iconoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        txtSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        txtSalir.setText("Salir");
        txtSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSalirMouseClicked(evt);
            }
        });
        Dashboard.add(txtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        iconoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit_96px.png"))); // NOI18N
        Dashboard.add(iconoSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jPanel3.setBackground(new java.awt.Color(249, 133, 112));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        Dashboard.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 10, 600));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        Dashboard.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 145, 90, 30));

        btnAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        btnAlmacen.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setBorder(null);
        btnAlmacen.setBorderPainted(false);
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });
        Dashboard.add(btnAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 30));

        btnRutas.setBackground(new java.awt.Color(255, 255, 255));
        btnRutas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnRutas.setText("Asn.Rutas");
        btnRutas.setBorder(null);
        btnRutas.setBorderPainted(false);
        btnRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutasActionPerformed(evt);
            }
        });
        Dashboard.add(btnRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 30));

        btnClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        Dashboard.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 90, 30));

        btnVentas.setBackground(new java.awt.Color(255, 255, 255));
        btnVentas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setBorder(null);
        btnVentas.setBorderPainted(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        Dashboard.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 90, 30));

        btnEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        Dashboard.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 490, 90, 30));

        getContentPane().add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalirMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir?", "Exit",dialog);
        
        if (result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_txtSalirMouseClicked

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Home.setVisible(true);
        Animacion.Animacion.mover_izquierda(1100, 0, 4, 20, Home);
        Animacion.Animacion.mover_derecha(1100, 0, 4, 20, Home);
        btnInicio.setBackground(new java.awt.Color(249,133,112));
        Almacen.setVisible(false);
        btnAlmacen.setBackground(new java.awt.Color(255,255,255));
        Rutas.setVisible(false);
        btnRutas.setBackground(new java.awt.Color(255,255,255));
        Clientes.setVisible(false);
        btnClientes.setBackground(new java.awt.Color(255,255,255));
        Ventas.setVisible(false);
        btnVentas.setBackground(new java.awt.Color(255,255,255));
        Empleados.setVisible(false);
        btnEmpleados.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        Almacen almacen = new Almacen();
        AlmacenController almacenes = new AlmacenController();
        ControllerListener listener = new ControllerListener(this,almacen);
        try {
            listener.llenarTabla(jAlmacen);
            listener.totalpollos(txtTotal);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }     
        Home.setVisible(false);
        btnInicio.setBackground(new java.awt.Color(255,255,255));
        Almacen.setVisible(true);
        //Animacion.Animacion.mover_izquierda(1100, 0, 4, 20, Almacen);
        //Animacion.Animacion.mover_derecha(1100, 0, 4, 20, Almacen);
        btnAlmacen.setBackground(new java.awt.Color(249,133,112));
        Rutas.setVisible(false);
        btnRutas.setBackground(new java.awt.Color(255,255,255));
        Clientes.setVisible(false);
        btnClientes.setBackground(new java.awt.Color(255,255,255));
        Ventas.setVisible(false);
        btnVentas.setBackground(new java.awt.Color(255,255,255));
        Empleados.setVisible(false);
        btnEmpleados.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutasActionPerformed
        Rutas rutas = new Rutas();
        ListenerRutas listru = new ListenerRutas(this,rutas);
        try {
            rutas.ListaRejas();
            listru.llenarRejas(listapolloreja);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        Home.setVisible(false);
        btnInicio.setBackground(new java.awt.Color(255,255,255));
        Animacion.Animacion.bajar(-50, 100, 30, 8, jLabel16);
        Almacen.setVisible(false);
        btnAlmacen.setBackground(new java.awt.Color(255,255,255));
        Rutas.setVisible(true);
        Animacion.Animacion.mover_izquierda(1100, 0, 4, 20, Rutas);
        Animacion.Animacion.mover_derecha(1100, 0, 4, 20, Rutas);
        btnRutas.setBackground(new java.awt.Color(249,133,112));
        Clientes.setVisible(false);
        btnClientes.setBackground(new java.awt.Color(255,255,255));
        Ventas.setVisible(false);
        btnVentas.setBackground(new java.awt.Color(255,255,255));
        Empleados.setVisible(false);
        btnEmpleados.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnRutasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Home.setVisible(false);
        btnInicio.setBackground(new java.awt.Color(255,255,255));
        Almacen.setVisible(false);
        btnAlmacen.setBackground(new java.awt.Color(255,255,255));
        Rutas.setVisible(false);
        btnRutas.setBackground(new java.awt.Color(255,255,255));
        Clientes.setVisible(true);
        Animacion.Animacion.mover_izquierda(1100, 0, 4, 20, Clientes);
        Animacion.Animacion.mover_derecha(1100, 0, 4, 20, Clientes);
        btnClientes.setBackground(new java.awt.Color(249,133,112));
        Ventas.setVisible(false);
        btnVentas.setBackground(new java.awt.Color(255,255,255));
        Empleados.setVisible(false);
        btnEmpleados.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Home.setVisible(false);
        btnInicio.setBackground(new java.awt.Color(255,255,255));
        Almacen.setVisible(false);
        btnAlmacen.setBackground(new java.awt.Color(255,255,255));
        Rutas.setVisible(false);
        btnRutas.setBackground(new java.awt.Color(255,255,255));
        Clientes.setVisible(false);
        btnClientes.setBackground(new java.awt.Color(255,255,255));
        Ventas.setVisible(true);
        Animacion.Animacion.mover_izquierda(1100, 0, 4, 20, Ventas);
        Animacion.Animacion.mover_derecha(1100, 0, 4, 20, Ventas);
        btnVentas.setBackground(new java.awt.Color(249,133,112));
        Empleados.setVisible(false);
        btnEmpleados.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        Home.setVisible(false);
        btnInicio.setBackground(new java.awt.Color(255,255,255));
        Almacen.setVisible(false);
        btnAlmacen.setBackground(new java.awt.Color(255,255,255));
        Rutas.setVisible(false);
        btnRutas.setBackground(new java.awt.Color(255,255,255));
        Clientes.setVisible(false);
        btnClientes.setBackground(new java.awt.Color(255,255,255));
        Ventas.setVisible(false);
        btnVentas.setBackground(new java.awt.Color(255,255,255));
        Empleados.setVisible(true);
        Animacion.Animacion.mover_izquierda(1100, 0, 4, 20, Empleados);
        Animacion.Animacion.mover_derecha(1100, 0, 4, 20, Empleados);
        btnEmpleados.setBackground(new java.awt.Color(249,133,112));
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AsignacionPollo.setVisible(true);
        Animacion.Animacion.bajar(-50, 100, 30, 8, jLabel16);
        AsignacionRutas.setVisible(false);
        AsignarTransporte.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Rutas rutas = new Rutas();
        ListenerRutas listru = new ListenerRutas(this,rutas);
        try {
            rutas.Asignar_Ruta();
            listru.llenarRutasAsignadas(listaruta);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        AsignacionPollo.setVisible(false);
        AsignacionRutas.setVisible(true);
        Animacion.Animacion.bajar(-50, 100, 30, 8, jLabel27);
        AsignarTransporte.setVisible(false);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Rutas rutas = new Rutas();
        ListenerRutas listru = new ListenerRutas(this,rutas);
        try {
            rutas.Asignar_Transporte();
            listru.llenarTrasporte(listatransporte);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        AsignacionPollo.setVisible(false);
        AsignacionRutas.setVisible(false);
        Animacion.Animacion.bajar(-50, 100, 30, 8, jLabel29);
        AsignarTransporte.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        AsignacionPollo apollo = new AsignacionPollo();
        apollo.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        AsignacionRutas ar = new AsignacionRutas();
        ar.setVisible(true);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        AsignarTransporte at = new AsignarTransporte();
        at.setVisible(true);
    }//GEN-LAST:event_jLabel29MouseClicked

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Almacen;
    private javax.swing.JPanel AsignacionPollo;
    private javax.swing.JPanel AsignacionRutas;
    private javax.swing.JPanel AsignarTransporte;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel Conten;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Empleados;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Rutas;
    private javax.swing.JPanel Ventas;
    public javax.swing.JButton btnAlmacen;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRutas;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel iconoAlmacen;
    private javax.swing.JLabel iconoClientes;
    private javax.swing.JLabel iconoEmpleados;
    private javax.swing.JLabel iconoInicio;
    private javax.swing.JLabel iconoRutas;
    private javax.swing.JLabel iconoSalir;
    private javax.swing.JLabel iconoVentas;
    public javax.swing.JTable jAlmacen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel jtotal;
    public javax.swing.JTable listapolloreja;
    public javax.swing.JTable listaruta;
    private javax.swing.JTable listatransporte;
    private javax.swing.JLabel txtSalir;
    public javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
