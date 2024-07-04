/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controlador.ReservaControlador;
import Modelo.Reserva;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import Conection.ConectionMysql;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ReservaCuarto extends javax.swing.JDialog {

    /**
     * Creates new form fm_Reservarcuarto
     */
    
    private ReservaControlador reservaControlador;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    
    
    public ReservaCuarto() {
       
        initComponents();
        setLocationRelativeTo(null);
        init(); // Inicializar el controlador aquí
        configureEvents();
    }
    private void init() {
        reservaControlador = new ReservaControlador(new Reserva());
    }

    private void configureEvents() {
        NombreCompletoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCompletoTxtActionPerformed(evt);
            }
        });

        TelefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTxtActionPerformed(evt);
            }
        });

        CorreoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoTxtActionPerformed(evt);
            }
        });

        FechaLLegadaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaLLegadaTxtActionPerformed(evt);
            }
        });

        FechaSalidaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaSalidaTxtActionPerformed(evt);
            }
        });

        NumeroPersonaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroPersonaTxtActionPerformed(evt);
            }
        });
    }
    

    public ReservaCuarto(JButton jButton1, JButton jButton2, JButton jButton3, JComboBox<String> jComboBox1, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JPanel jPanel1, JPanel jPanel2, JTextField jTextField10, JTextField jTextField11, JTextField jTextField12, JTextField jTextField7, JTextField jTextField8, JTextField jTextField9) {
        this.jButton1 = jButton1;
        this.jButton2 = jButton2;
        this.guardarReserva = jButton3;
        this.BoxHabitacion = jComboBox1;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jPanel1 = jPanel1;
        this.jPanel2 = jPanel2;
        this.FechaLLegadaTxt = jTextField10;
        this.NumeroPersonaTxt = jTextField11;
        this.FechaSalidaTxt = jTextField12;
        this.NombreCompletoTxt = jTextField7;
        this.TelefonoTxt = jTextField8;
        this.CorreoTxt = jTextField9;
       
    }
    private void guardarReserva(String nombre, String telefono, String email, Date fechaLlegada, Date fechaSalida, int numeroPersonas) {
    ConectionMysql con = new ConectionMysql();
    Connection cn = con.conectar();
    
    String sql = "INSERT INTO reservas (nombre, telefono, correo, fecha_llegada, fecha_salida, numero_personas) VALUES (?, ?, ?, ?, ?, ?)";
    
    try (PreparedStatement pst = cn.prepareStatement(sql)) {
        pst.setString(1, nombre);
        pst.setString(2, telefono);
        pst.setString(3, email);
        pst.setDate(4, new java.sql.Date(fechaLlegada.getTime()));
        pst.setDate(5, new java.sql.Date(fechaSalida.getTime()));
        pst.setInt(6, numeroPersonas);
        
        pst.executeUpdate();
        System.out.println("Reserva guardada en la base de datos");
    } catch (SQLException e) {
        System.out.println("Error al guardar la reserva: " + e.getMessage());
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NombreCompletoTxt = new javax.swing.JTextField();
        TelefonoTxt = new javax.swing.JTextField();
        CorreoTxt = new javax.swing.JTextField();
        FechaLLegadaTxt = new javax.swing.JTextField();
        NumeroPersonaTxt = new javax.swing.JTextField();
        FechaSalidaTxt = new javax.swing.JTextField();
        BoxHabitacion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        guardarReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("NUEVA RESERVA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 217, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("registra tu reserva"));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("nombre completo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("telefono de contacto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("correo electronico:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("fecha de llegada:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("numero de personas:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("fecha de salida:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("tipos de habitacion:");

        NombreCompletoTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NombreCompletoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCompletoTxtActionPerformed(evt);
            }
        });

        TelefonoTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TelefonoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTxtActionPerformed(evt);
            }
        });

        CorreoTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CorreoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoTxtActionPerformed(evt);
            }
        });

        FechaLLegadaTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FechaLLegadaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaLLegadaTxtActionPerformed(evt);
            }
        });

        NumeroPersonaTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumeroPersonaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroPersonaTxtActionPerformed(evt);
            }
        });

        FechaSalidaTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FechaSalidaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaSalidaTxtActionPerformed(evt);
            }
        });

        BoxHabitacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BoxHabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "simple", "matrimonial", "suit" }));
        BoxHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(38, 38, 38))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(FechaLLegadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CorreoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TelefonoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                        .addComponent(NombreCompletoTxt))
                                    .addComponent(NumeroPersonaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(FechaSalidaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(BoxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreCompletoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TelefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(FechaLLegadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaSalidaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NumeroPersonaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(BoxHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("DETALLES DE RESERVA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        guardarReserva.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        guardarReserva.setText("GUARDAR");
        guardarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarReserva)
                .addGap(102, 102, 102)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(guardarReserva)
                    .addComponent(jButton2))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      detallesDeReserva detalles = new detallesDeReserva(); // true para que sea modal
        detalles.setVisible(true);
        this.dispose(); // Cierra la ventana actual
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         InicioHome inicioHome = new InicioHome();
        inicioHome.setVisible(true);
        inicioHome.setLocationRelativeTo(null);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void FechaSalidaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaSalidaTxtActionPerformed
        // TODO add your handling code here:
        String fechaSalidaStr = FechaSalidaTxt.getText();
        try {
            Date fechaSalida = dateFormat.parse(fechaSalidaStr);
            reservaControlador.setFechaFin(fechaSalida);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de salida debe estar en el formato YYYY-MM-DD.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_FechaSalidaTxtActionPerformed

    private void NumeroPersonaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroPersonaTxtActionPerformed
        // TODO add your handling code here:
        String numeroPersonasStr = NumeroPersonaTxt.getText();
        if (!numeroPersonasStr.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El número de personas debe contener solo números.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
        } else {
            int numeroPersonas = Integer.parseInt(numeroPersonasStr);
            if (numeroPersonas <= 0) {
                JOptionPane.showMessageDialog(this, "El número de personas debe ser mayor a cero.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            } else {
                reservaControlador.setNumeroDeHabitacion(numeroPersonas);
            }
        }
    }//GEN-LAST:event_NumeroPersonaTxtActionPerformed

    private void CorreoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoTxtActionPerformed
        // TODO add your handling code here:
         String correo = CorreoTxt.getText();
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(this, "El correo electrónico no es válido.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
        } else {
            Cliente cliente = reservaControlador.getCliente();
            if (cliente == null) {
                cliente = new Cliente();
            }
            cliente.setEmail(correo);
            reservaControlador.setCliente(cliente);
        }
    }//GEN-LAST:event_CorreoTxtActionPerformed

    private void NombreCompletoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCompletoTxtActionPerformed
        // TODO add your handling code here:
       String nombre = NombreCompletoTxt.getText();
        if (nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre completo no puede estar vacío.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
        } else {
            Cliente cliente = reservaControlador.getCliente();
            if (cliente == null) {
                cliente = new Cliente();
            }
            cliente.setNombre(nombre);
            reservaControlador.setCliente(cliente);
        }
    }//GEN-LAST:event_NombreCompletoTxtActionPerformed

    private void BoxHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxHabitacionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BoxHabitacionActionPerformed

    private void TelefonoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTxtActionPerformed
        // TODO add your handling code here:
        String telefono = TelefonoTxt.getText();
        if (!telefono.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "El teléfono debe contener solo números.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
        } else {
            Cliente cliente = reservaControlador.getCliente();
            if (cliente == null) {
                cliente = new Cliente();
            }
            cliente.setTelefono(telefono);
            reservaControlador.setCliente(cliente);
        }
    }//GEN-LAST:event_TelefonoTxtActionPerformed

    private void FechaLLegadaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaLLegadaTxtActionPerformed
        // TODO add your handling code here:
        String fechaLlegadaStr = FechaLLegadaTxt.getText();
        try {
            Date fechaLlegada = dateFormat.parse(fechaLlegadaStr);
            reservaControlador.setFechaInicio(fechaLlegada);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "La fecha de llegada debe estar en el formato YYYY-MM-DD.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_FechaLLegadaTxtActionPerformed

    private void guardarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarReservaActionPerformed
        // TODO add your handling code here:
        String nombre = NombreCompletoTxt.getText();
        String telefono = TelefonoTxt.getText();
        String correo = CorreoTxt.getText();
        Date fechaLlegada = java.sql.Date.valueOf(FechaLLegadaTxt.getText()); // Asegúrate de que el formato de fecha sea correcto
        Date fechaSalida = java.sql.Date.valueOf(FechaSalidaTxt.getText());
        int numeroPersonas = Integer.parseInt(NumeroPersonaTxt.getText());
    
        // Crear un nuevo objeto Cliente (debes tener la clase Cliente implementada)
        Cliente cliente = new Cliente(nombre, telefono, correo);
    
    // Crear un nuevo objeto Reserva y su controlador
        Reserva reserva = new Reserva(fechaLlegada, fechaSalida, numeroPersonas, "Pendiente", cliente, null);
        ReservaControlador controlador = new ReservaControlador(reserva);
    
    // Llamar al método para crear la reserva
        controlador.crearReserva();
    
    // Guardar la reserva en la base de datos
        guardarReserva(nombre, telefono, correo, fechaLlegada, fechaSalida, numeroPersonas);
        
        
    }//GEN-LAST:event_guardarReservaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxHabitacion;
    private javax.swing.JTextField CorreoTxt;
    private javax.swing.JTextField FechaLLegadaTxt;
    private javax.swing.JTextField FechaSalidaTxt;
    private javax.swing.JTextField NombreCompletoTxt;
    private javax.swing.JTextField NumeroPersonaTxt;
    private javax.swing.JTextField TelefonoTxt;
    private javax.swing.JButton guardarReserva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
