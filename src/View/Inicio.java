package View;

import Controller.AlmacenController;
import Controller.AsignarRutaController;
import Controller.AsignarRutaListener;
import Controller.ClienteController;
import Controller.ClienteListener;
import Controller.ControllerListener;
import Controller.EmpleadoController;
import Controller.ListenerEmpleados;
import Controller.ListenerRutas;
import Controller.VentaController;
import Controller.VentaListener;
import Model.Almacen;
import Model.Empleado;
import Model.Rutas;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Inicio extends javax.swing.JFrame {

    ClienteController cc = new ClienteController();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnGuardarActualizacionTransporte.setEnabled(false);
    }
    
    public void getRuta() throws InstantiationException, IllegalAccessException, SQLException, ClassNotFoundException{
        jAsignarRuta.removeAllItems();
        jRutaCreditoCliente.removeAllItems();
        ArrayList<String> listaRuta = new ArrayList<String>();
        listaRuta = cc.listaRuta();
        for (int i = 0; i<listaRuta.size(); i ++){
            jAsignarRuta.addItem(listaRuta.get(i));
            jRutaCreditoCliente.addItem(listaRuta.get(i));
        }
    }
    
    public void getEmpleado() throws InstantiationException, IllegalAccessException, SQLException, ClassNotFoundException{
        jTrabajador.removeAllItems();
        ArrayList<String> listaRuta = new ArrayList<String>();
        listaRuta = cc.listaEmpleado();
        for (int i = 0; i<listaRuta.size(); i ++){
            jTrabajador.addItem(listaRuta.get(i));
        }
    }
    
    public void getTransporte() throws InstantiationException, IllegalAccessException, SQLException, ClassNotFoundException{
        jTransporte.removeAllItems();
        ArrayList<String> listaRuta = new ArrayList<String>();
        listaRuta = cc.ListaTransporte();
        for (int i = 0; i<listaRuta.size(); i ++){
            jTransporte.addItem(listaRuta.get(i));
        }
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
        jPanel19 = new javax.swing.JPanel();
        Nuevo_pollos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAlmacen = new javax.swing.JTable();
        SearchAlmacen = new javax.swing.JTextField();
        jtotal3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtTotal3 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btnUpdateAlmacen = new javax.swing.JButton();
        btnDeleteAlmacen = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPollosVivos = new javax.swing.JSpinner();
        jLabel68 = new javax.swing.JLabel();
        jPollosMuertos = new javax.swing.JSpinner();
        jLabel69 = new javax.swing.JLabel();
        jPrecioPollos = new javax.swing.JSpinner();
        btnAgregarPollos = new javax.swing.JButton();
        txtAlmacenNew = new javax.swing.JTextField();
        brnGuardarUpdate = new javax.swing.JButton();
        Nuevo_Transporte = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListaTransporte = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jDescripcionTransporte = new javax.swing.JTextField();
        jNombreTransporte = new javax.swing.JTextField();
        btnAgregarTransporte = new javax.swing.JButton();
        btnModificarTransporte = new javax.swing.JButton();
        btnDeleteTransporte = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        btnGuardarActualizacionTransporte = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        btnNuevoTransporte = new javax.swing.JButton();
        Rutas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AsignacionPollo = new javax.swing.JPanel();
        jSearchPR = new javax.swing.JTextField();
        jarc = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listapolloreja = new javax.swing.JTable();
        btnAsignarRuta = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jNReja = new javax.swing.JSpinner();
        jNPollo = new javax.swing.JSpinner();
        jLabel40 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jKg = new javax.swing.JSpinner();
        jLabel48 = new javax.swing.JLabel();
        jPrecioKg = new javax.swing.JSpinner();
        jLabel49 = new javax.swing.JLabel();
        jAsignarRuta = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        jTrabajador = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPrecioTotal = new javax.swing.JSpinner();
        jLabel70 = new javax.swing.JLabel();
        jTransporte = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Clientes = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();
        RegistroVenta = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jClienteCredito = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        btnReporteCliente = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnEliminarCliente = new javax.swing.JButton();
        btnCargarDatosCliente = new javax.swing.JButton();
        btnGuargarActualizacionCliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtSexoCliente = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDirecionCliente = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jRutaCreditoCliente = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jCredito1 = new javax.swing.JSpinner();
        jLabel61 = new javax.swing.JLabel();
        jCredito2 = new javax.swing.JSpinner();
        jLabel62 = new javax.swing.JLabel();
        jCredito3 = new javax.swing.JSpinner();
        btnAgrgarClienteCredito = new javax.swing.JButton();
        Credito = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton24 = new javax.swing.JButton();
        ListaDePago = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton25 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        RV = new javax.swing.JButton();
        C = new javax.swing.JButton();
        LP = new javax.swing.JButton();
        Ventas = new javax.swing.JPanel();
        ContentVenta = new javax.swing.JPanel();
        VentaPorRutas = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListaVenta = new javax.swing.JTable();
        VentaTotalPorDIa = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        Empleados = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jrHombre = new javax.swing.JRadioButton();
        jrMujer = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnAgregareE = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btnReporEmpleados = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jSearch = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jEmpleados = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        btnUpdateE = new javax.swing.JButton();
        btnDeleteE = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
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

        jPanel19.setLayout(new java.awt.CardLayout());

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

        jtotal3.setBackground(new java.awt.Color(141, 214, 210));
        jtotal3.setPreferredSize(new java.awt.Dimension(210, 100));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Todo List_96pxblanco.png"))); // NOI18N

        javax.swing.GroupLayout jtotal3Layout = new javax.swing.GroupLayout(jtotal3);
        jtotal3.setLayout(jtotal3Layout);
        jtotal3Layout.setHorizontalGroup(
            jtotal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtotal3Layout.createSequentialGroup()
                .addGroup(jtotal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jtotal3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22))
                    .addGroup(jtotal3Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotal3)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jtotal3Layout.setVerticalGroup(
            jtotal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtotal3Layout.createSequentialGroup()
                .addGroup(jtotal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addGroup(jtotal3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtTotal3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Total avez existentes");

        jLabel50.setBackground(new java.awt.Color(153, 153, 153));
        jLabel50.setForeground(new java.awt.Color(153, 153, 153));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N
        jLabel50.setEnabled(false);

        btnUpdateAlmacen.setBackground(new java.awt.Color(4, 109, 141));
        btnUpdateAlmacen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdateAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAlmacen.setText("Modificar");
        btnUpdateAlmacen.setBorder(null);

        btnDeleteAlmacen.setBackground(new java.awt.Color(249, 119, 83));
        btnDeleteAlmacen.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeleteAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAlmacen.setText("Eliminar");
        btnDeleteAlmacen.setBorder(null);

        jLabel63.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Alamecen:");

        jLabel65.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("pollos Vivos:");

        jLabel68.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("pollos Muertos:");

        jLabel69.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("precio:");

        btnAgregarPollos.setBackground(new java.awt.Color(249, 168, 25));
        btnAgregarPollos.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarPollos.setText("Agregar");
        btnAgregarPollos.setBorder(null);

        brnGuardarUpdate.setBackground(new java.awt.Color(0, 102, 102));
        brnGuardarUpdate.setForeground(new java.awt.Color(255, 255, 255));
        brnGuardarUpdate.setText("Guargar");
        brnGuardarUpdate.setBorder(null);

        javax.swing.GroupLayout Nuevo_pollosLayout = new javax.swing.GroupLayout(Nuevo_pollos);
        Nuevo_pollos.setLayout(Nuevo_pollosLayout);
        Nuevo_pollosLayout.setHorizontalGroup(
            Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnAgregarPollos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jLabel63)
                            .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPollosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAlmacenNew, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jPollosMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPrecioPollos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel69)))))
                .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jtotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(brnGuardarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnUpdateAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnDeleteAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Nuevo_pollosLayout.setVerticalGroup(
            Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel52)
                .addGap(18, 18, 18)
                .addComponent(jtotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_pollosLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SearchAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(46, 46, 46)
                .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_pollosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(Nuevo_pollosLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlmacenNew, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPollosVivos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel68)
                        .addGap(18, 18, 18)
                        .addComponent(jPollosMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel69)
                        .addGap(12, 12, 12)
                        .addComponent(jPrecioPollos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAgregarPollos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Nuevo_pollosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeleteAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(brnGuardarUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        jPanel19.add(Nuevo_pollos, "card2");

        jListaTransporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jListaTransporte);

        jLabel55.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel55.setText("Nombre:");

        jLabel56.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel56.setText("Descripcion:");

        jDescripcionTransporte.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jNombreTransporte.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnAgregarTransporte.setBackground(new java.awt.Color(249, 168, 25));
        btnAgregarTransporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarTransporte.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarTransporte.setText("Agegar");
        btnAgregarTransporte.setBorder(null);

        btnModificarTransporte.setBackground(new java.awt.Color(0, 113, 138));
        btnModificarTransporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificarTransporte.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarTransporte.setText("Modificar");
        btnModificarTransporte.setBorder(null);

        btnDeleteTransporte.setBackground(new java.awt.Color(248, 121, 81));
        btnDeleteTransporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDeleteTransporte.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteTransporte.setText("Eliminar");
        btnDeleteTransporte.setBorder(null);

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setText("Agregar Nuevo Transporte");

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));
        jPanel20.setPreferredSize(new java.awt.Dimension(328, 1));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        btnGuardarActualizacionTransporte.setText("Guardar");

        javax.swing.GroupLayout Nuevo_TransporteLayout = new javax.swing.GroupLayout(Nuevo_Transporte);
        Nuevo_Transporte.setLayout(Nuevo_TransporteLayout);
        Nuevo_TransporteLayout.setHorizontalGroup(
            Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_TransporteLayout.createSequentialGroup()
                .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nuevo_TransporteLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDescripcionTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jNombreTransporte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_TransporteLayout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_TransporteLayout.createSequentialGroup()
                                .addComponent(btnAgregarTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_TransporteLayout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nuevo_TransporteLayout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Nuevo_TransporteLayout.createSequentialGroup()
                        .addComponent(btnGuardarActualizacionTransporte)
                        .addGap(25, 25, 25)
                        .addComponent(btnModificarTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnDeleteTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        Nuevo_TransporteLayout.setVerticalGroup(
            Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nuevo_TransporteLayout.createSequentialGroup()
                .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Nuevo_TransporteLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Nuevo_TransporteLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNombreTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addGap(40, 40, 40)
                        .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(jDescripcionTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(btnAgregarTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(Nuevo_TransporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarActualizacionTransporte))
                .addGap(54, 54, 54))
        );

        jPanel19.add(Nuevo_Transporte, "card3");

        Almacen.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 920, 470));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Almacen");
        Almacen.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jButton10.setBackground(new java.awt.Color(33, 177, 168));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Nuevos Pollos");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Almacen.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        btnNuevoTransporte.setText("Nuevo Transporte");
        btnNuevoTransporte.setBorder(null);
        btnNuevoTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTransporteActionPerformed(evt);
            }
        });
        Almacen.add(btnNuevoTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 170, 40));

        Conten.add(Almacen, "card4");

        Rutas.setBackground(new java.awt.Color(255, 255, 255));
        Rutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.CardLayout());

        AsignacionPollo.setBackground(new java.awt.Color(255, 255, 255));

        jarc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fecha", "Etc.." }));

        listapolloreja.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        listapolloreja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(listapolloreja);

        btnAsignarRuta.setBackground(new java.awt.Color(0, 113, 138));
        btnAsignarRuta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAsignarRuta.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarRuta.setText("Guardar");
        btnAsignarRuta.setBorder(null);

        jButton18.setBackground(new java.awt.Color(0, 170, 207));
        jButton18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Imprimir");
        jButton18.setBorder(null);

        jLabel38.setText("N. Reja");

        jLabel39.setText("N. Pollo");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("Asignacion de Pollos");

        jLabel47.setText("Kg");

        jLabel48.setText("Presio Kg");

        jLabel49.setText("Asignacion Ruta");

        jAsignarRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel66.setText("Trabajador");

        jTrabajador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel67.setText("Precio Total");

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));
        jPanel28.setPreferredSize(new java.awt.Dimension(164, 2));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jLabel70.setText("Transporte");

        jTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout AsignacionPolloLayout = new javax.swing.GroupLayout(AsignacionPollo);
        AsignacionPollo.setLayout(AsignacionPolloLayout);
        AsignacionPolloLayout.setHorizontalGroup(
            AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionPolloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsignacionPolloLayout.createSequentialGroup()
                        .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AsignacionPolloLayout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jSearchPR, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jarc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 214, Short.MAX_VALUE))
                    .addGroup(AsignacionPolloLayout.createSequentialGroup()
                        .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPrecioTotal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAsignarRuta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTrabajador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTransporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AsignacionPolloLayout.createSequentialGroup()
                                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AsignacionPolloLayout.createSequentialGroup()
                                        .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel47)
                                            .addComponent(jNReja, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(jKg))
                                        .addGap(38, 38, 38)
                                        .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPrecioKg)
                                            .addComponent(jNPollo)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AsignacionPolloLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(btnAsignarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        AsignacionPolloLayout.setVerticalGroup(
            AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsignacionPolloLayout.createSequentialGroup()
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsignacionPolloLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jarc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSearchPR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AsignacionPolloLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AsignacionPolloLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNReja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AsignacionPolloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrecioKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAsignarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addGap(7, 7, 7)
                .addComponent(jTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addComponent(jPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnAsignarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AsignacionPolloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel2.add(AsignacionPollo, "card3");

        Rutas.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 920, 530));

        jButton1.setBackground(new java.awt.Color(32, 178, 170));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Asignacion de Pollo-rejas");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Rutas.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 40));

        Conten.add(Rutas, "card3");

        Clientes.setBackground(new java.awt.Color(255, 255, 255));
        Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Content.setLayout(new java.awt.CardLayout());

        jClienteCredito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jClienteCredito);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReporteCliente.setBackground(new java.awt.Color(0, 170, 207));
        btnReporteCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteCliente.setText("Imprimir");
        jPanel14.add(btnReporteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 100, 40));
        jPanel14.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 180, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarCliente.setBackground(new java.awt.Color(248, 121, 81));
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        jPanel4.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 110, 40));

        btnCargarDatosCliente.setBackground(new java.awt.Color(0, 170, 207));
        btnCargarDatosCliente.setText("Modificar");
        jPanel4.add(btnCargarDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 110, 40));

        btnGuargarActualizacionCliente.setBackground(new java.awt.Color(60, 94, 177));
        btnGuargarActualizacionCliente.setText("Guardar");
        jPanel4.add(btnGuargarActualizacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 40));

        jLabel16.setText("Nombre:");

        jLabel18.setText("Nuevo Cliente");

        jLabel26.setText("Apellido:");

        jLabel28.setText("Sexo:");

        jLabel29.setText("Direcion:");

        jLabel30.setText("Telefono:");

        jLabel59.setText("Ruta:");

        jRutaCreditoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel60.setText("Credito1:");

        jLabel61.setText("Credito2:");

        jLabel62.setText("Credito3:");

        btnAgrgarClienteCredito.setBackground(new java.awt.Color(204, 204, 0));
        btnAgrgarClienteCredito.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel30))
                                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCredito3)
                                .addComponent(jCredito2)
                                .addComponent(jCredito1)
                                .addComponent(jRutaCreditoCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefonoCliente)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDirecionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSexoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(txtApellidoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnAgrgarClienteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtSexoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtDirecionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRutaCreditoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(jCredito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCredito2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jCredito3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgrgarClienteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout RegistroVentaLayout = new javax.swing.GroupLayout(RegistroVenta);
        RegistroVenta.setLayout(RegistroVentaLayout);
        RegistroVentaLayout.setHorizontalGroup(
            RegistroVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistroVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroVentaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(RegistroVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroVentaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegistroVentaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(6222, Short.MAX_VALUE))
        );
        RegistroVentaLayout.setVerticalGroup(
            RegistroVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistroVentaLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        Content.add(RegistroVenta, "card2");

        jLabel25.setText("Registrar Credito");

        jLabel31.setText("Direcion/Ruta:");

        jLabel32.setText("Nombre Cliente:");

        jLabel33.setText("Cretito 1:");

        jLabel34.setText("Cretito 2:");

        jLabel35.setText("Cretito 3:");

        jButton22.setText("Agregar y Actualizar Cretito");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6))
                        .addContainerGap())
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton22)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel25)
                .addGap(46, 46, 46)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jButton22)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jButton23.setText("Imprimir");

        jLabel64.setBackground(new java.awt.Color(153, 153, 153));
        jLabel64.setForeground(new java.awt.Color(153, 153, 153));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N
        jLabel64.setEnabled(false);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable4);

        jButton24.setText("Pagar Credito");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jButton23)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jButton24)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel64)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton23)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton24)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout CreditoLayout = new javax.swing.GroupLayout(Credito);
        Credito.setLayout(CreditoLayout);
        CreditoLayout.setHorizontalGroup(
            CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditoLayout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6232, Short.MAX_VALUE))
        );
        CreditoLayout.setVerticalGroup(
            CreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CreditoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Content.add(Credito, "card3");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable5);

        jButton25.setBackground(new java.awt.Color(0, 170, 207));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Imprimir");
        jButton25.setBorder(null);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N

        jLabel21.setText("Total Pago de Credito");

        jPanel21.setBackground(new java.awt.Color(144, 217, 213));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("jLabel23");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel23)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel23)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel21)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable6);

        jButton26.setText("Imprimir");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jButton26)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton26)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ListaDePagoLayout = new javax.swing.GroupLayout(ListaDePago);
        ListaDePago.setLayout(ListaDePagoLayout);
        ListaDePagoLayout.setHorizontalGroup(
            ListaDePagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaDePagoLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5215, Short.MAX_VALUE))
        );
        ListaDePagoLayout.setVerticalGroup(
            ListaDePagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaDePagoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Content.add(ListaDePago, "card4");

        Clientes.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 570));

        RV.setText("Registrar Venta");
        RV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RVActionPerformed(evt);
            }
        });
        Clientes.add(RV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        C.setText("Credito");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        Clientes.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        LP.setText("Lista De Pago");
        LP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LPActionPerformed(evt);
            }
        });
        Clientes.add(LP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        Conten.add(Clientes, "card5");

        Ventas.setBackground(new java.awt.Color(255, 255, 255));

        ContentVenta.setLayout(new java.awt.CardLayout());

        VentaPorRutas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(1, 169, 207));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Imprimir Pdf");
        VentaPorRutas.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N
        VentaPorRutas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));
        VentaPorRutas.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 260, 30));

        jListaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jListaVenta);

        VentaPorRutas.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 660, 410));

        ContentVenta.add(VentaPorRutas, "card2");

        jButton27.setBackground(new java.awt.Color(1, 169, 206));
        jButton27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Imprimir");
        jButton27.setBorder(null);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentaTotalPorDIaLayout = new javax.swing.GroupLayout(VentaTotalPorDIa);
        VentaTotalPorDIa.setLayout(VentaTotalPorDIaLayout);
        VentaTotalPorDIaLayout.setHorizontalGroup(
            VentaTotalPorDIaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaTotalPorDIaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(VentaTotalPorDIaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        VentaTotalPorDIaLayout.setVerticalGroup(
            VentaTotalPorDIaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentaTotalPorDIaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContentVenta.add(VentaTotalPorDIa, "card3");

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContentVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(ContentVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Conten.add(Ventas, "card6");

        Empleados.setBackground(new java.awt.Color(255, 255, 255));
        Empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setText("Nombre:");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel16.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 120, 20));
        jPanel16.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 20));

        jLabel43.setText("Apellido:");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel44.setText("Sexo:");
        jPanel16.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jrHombre.setText("H");
        jPanel16.add(jrHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 138, -1, 40));

        jrMujer.setText("M");
        jPanel16.add(jrMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 138, -1, 40));

        jLabel45.setText("Direccion:");
        jPanel16.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel16.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 120, 20));

        jLabel46.setText("Telefono:");
        jPanel16.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jPanel16.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 120, 20));

        btnAgregareE.setBackground(new java.awt.Color(1, 169, 207));
        btnAgregareE.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregareE.setText("Agregar");
        btnAgregareE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregareEActionPerformed(evt);
            }
        });
        jPanel16.add(btnAgregareE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 110, 40));

        Empleados.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 600));

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReporEmpleados.setBackground(new java.awt.Color(1, 169, 207));
        btnReporEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnReporEmpleados.setText("Imprimir Pdf");
        jPanel17.add(btnReporEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 50));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_104px.png"))); // NOI18N
        jPanel17.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));
        jPanel17.add(jSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 190, 30));

        Empleados.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 690, 90));

        jEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jEmpleados);

        Empleados.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 640, 350));

        btnUpdateE.setBackground(new java.awt.Color(1, 112, 139));
        btnUpdateE.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateE.setText("Guardar");

        btnDeleteE.setBackground(new java.awt.Color(249, 119, 83));
        btnDeleteE.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteE.setText("Eliminar");

        btnEditar.setBackground(new java.awt.Color(0, 153, 102));
        btnEditar.setText("Editar");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnUpdateE, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnDeleteE, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Empleados.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 640, 90));

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
            listener.llenarTablaAlmacen(jAlmacen);
            listener.totalpollos(txtTotal3);
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
        AsignarRutaController rutas = new AsignarRutaController();
        AsignarRutaListener listru = new AsignarRutaListener(rutas,this);
        try {
            rutas.ListaRejas();
            listru.llebarTabla(listapolloreja);
            getTransporte();
            getRuta();
            getEmpleado();
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
        //Animacion.Animacion.bajar(-50, 230, 30, 10, jLabel16);
        Almacen.setVisible(false);
        btnAlmacen.setBackground(new java.awt.Color(255,255,255));
        Rutas.setVisible(true);
        Animacion.Animacion.mover_izquierda(1100, 0, 4, 30, Rutas);
        Animacion.Animacion.mover_derecha(1100, 0, 4, 30, Rutas);
        btnRutas.setBackground(new java.awt.Color(249,133,112));
        Clientes.setVisible(false);
        btnClientes.setBackground(new java.awt.Color(255,255,255));
        Ventas.setVisible(false);
        btnVentas.setBackground(new java.awt.Color(255,255,255));
        Empleados.setVisible(false);
        btnEmpleados.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnRutasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        ClienteController controller = new ClienteController();
        ClienteListener listru = new ClienteListener(this, controller);
        try {
            controller.listarCliente();
            listru.llebarTabla();
            getRuta();
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
        VentaController controller = new VentaController();
        VentaListener listru = new VentaListener(controller,this);
        try {
            controller.listaVentas();
            listru.llebarTabla();
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
        EmpleadoController empleadocl = new EmpleadoController();
        Empleado empleado = new Empleado();
        ListenerEmpleados listener = new ListenerEmpleados(this,empleadocl);
        try {
            listener.llebarTabla(jEmpleados);
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
        //Animacion.Animacion.bajar(-50, 230, 30, 10, jLabel16);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregareEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregareEActionPerformed
        EmpleadoController empleado = new EmpleadoController();
        ListenerEmpleados listedmpleado = new ListenerEmpleados(this, empleado);
        try {
            listedmpleado.setDatosEpleados();
            if (empleado.getStatusAddClient() == true){
                JOptionPane.showMessageDialog(null,"Empleado registrado con exito");
                listedmpleado.llebarTabla(jEmpleados);
                VaciarDatos();
            }else {
                JOptionPane.showMessageDialog(null,"Datos errones o campos vacios");
            }  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAgregareEActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Nuevo_pollos.setVisible(true);
        Nuevo_Transporte.setVisible(false);
        btnNuevoTransporte.setBackground(new java.awt.Color(187,187,187));
        jButton10.setBackground(new java.awt.Color(33,177,168));
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnNuevoTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTransporteActionPerformed
        Nuevo_pollos.setVisible(false);
        Nuevo_Transporte.setVisible(true); 
        jButton10.setBackground(new java.awt.Color(187,187,187));
        btnNuevoTransporte.setBackground(new java.awt.Color(33,177,168));
    }//GEN-LAST:event_btnNuevoTransporteActionPerformed

    private void RVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RVActionPerformed
        RegistroVenta.setVisible(true);
        Credito.setVisible(false);
        ListaDePago.setVisible(false);
    }//GEN-LAST:event_RVActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
       RegistroVenta.setVisible(false);
       Credito.setVisible(true);
       ListaDePago.setVisible(false);
    }//GEN-LAST:event_CActionPerformed

    private void LPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LPActionPerformed
        RegistroVenta.setVisible(false);
        Credito.setVisible(false);
        ListaDePago.setVisible(true);
    }//GEN-LAST:event_LPActionPerformed

    public void VaciarDatos(){
        txtNombre.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }
    
    
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
    private javax.swing.JButton C;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel Conten;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel ContentVenta;
    private javax.swing.JPanel Credito;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel Empleados;
    private javax.swing.JPanel Home;
    private javax.swing.JButton LP;
    private javax.swing.JPanel ListaDePago;
    private javax.swing.JPanel Nuevo_Transporte;
    private javax.swing.JPanel Nuevo_pollos;
    private javax.swing.JButton RV;
    private javax.swing.JPanel RegistroVenta;
    private javax.swing.JPanel Rutas;
    public javax.swing.JTextField SearchAlmacen;
    private javax.swing.JPanel VentaPorRutas;
    private javax.swing.JPanel VentaTotalPorDIa;
    private javax.swing.JPanel Ventas;
    public javax.swing.JButton brnGuardarUpdate;
    public javax.swing.JButton btnAgregarPollos;
    public javax.swing.JButton btnAgregarTransporte;
    public javax.swing.JButton btnAgregareE;
    public javax.swing.JButton btnAgrgarClienteCredito;
    public javax.swing.JButton btnAlmacen;
    public javax.swing.JButton btnAsignarRuta;
    public javax.swing.JButton btnCargarDatosCliente;
    private javax.swing.JButton btnClientes;
    public javax.swing.JButton btnDeleteAlmacen;
    public javax.swing.JButton btnDeleteE;
    public javax.swing.JButton btnDeleteTransporte;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnGuardarActualizacionTransporte;
    public javax.swing.JButton btnGuargarActualizacionCliente;
    private javax.swing.JButton btnInicio;
    public javax.swing.JButton btnModificarTransporte;
    public javax.swing.JButton btnNuevoTransporte;
    public javax.swing.JButton btnReporEmpleados;
    public javax.swing.JButton btnReporteCliente;
    public javax.swing.JButton btnRutas;
    public javax.swing.JButton btnUpdateAlmacen;
    public javax.swing.JButton btnUpdateE;
    public javax.swing.JButton btnVentas;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel iconoAlmacen;
    private javax.swing.JLabel iconoClientes;
    private javax.swing.JLabel iconoEmpleados;
    private javax.swing.JLabel iconoInicio;
    private javax.swing.JLabel iconoRutas;
    private javax.swing.JLabel iconoSalir;
    private javax.swing.JLabel iconoVentas;
    public javax.swing.JTable jAlmacen;
    public javax.swing.JComboBox<String> jAsignarRuta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton9;
    public javax.swing.JTable jClienteCredito;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    public javax.swing.JSpinner jCredito1;
    public javax.swing.JSpinner jCredito2;
    public javax.swing.JSpinner jCredito3;
    public javax.swing.JTextField jDescripcionTransporte;
    public javax.swing.JTable jEmpleados;
    public javax.swing.JSpinner jKg;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTable jListaTransporte;
    public javax.swing.JTable jListaVenta;
    public javax.swing.JSpinner jNPollo;
    public javax.swing.JSpinner jNReja;
    public javax.swing.JTextField jNombreTransporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JSpinner jPollosMuertos;
    public javax.swing.JSpinner jPollosVivos;
    public javax.swing.JSpinner jPrecioKg;
    public javax.swing.JSpinner jPrecioPollos;
    public javax.swing.JSpinner jPrecioTotal;
    public javax.swing.JComboBox<String> jRutaCreditoCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTextField jSearch;
    public javax.swing.JTextField jSearchPR;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JComboBox<String> jTrabajador;
    public javax.swing.JComboBox<String> jTransporte;
    public javax.swing.JComboBox<String> jarc;
    public javax.swing.JRadioButton jrHombre;
    public javax.swing.JRadioButton jrMujer;
    private javax.swing.JPanel jtotal3;
    public javax.swing.JTable listapolloreja;
    public javax.swing.JTextField txtAlmacenNew;
    public javax.swing.JTextField txtApellidoCliente;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtDirecionCliente;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNombreCliente;
    private javax.swing.JLabel txtSalir;
    public javax.swing.JTextField txtSexoCliente;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTelefonoCliente;
    public javax.swing.JLabel txtTotal3;
    // End of variables declaration//GEN-END:variables
}
