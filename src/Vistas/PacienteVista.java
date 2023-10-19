package Vistas;

import AccesoADatos.PacienteData;
import Entidades.Paciente;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author charl
 */
public class PacienteVista extends javax.swing.JInternalFrame {
    
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;
    private boolean N, M, E, B = false;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public PacienteVista() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        PanelAdvertencia.setVisible(false);
        Tabla.setVisible(false);
        cargarCabecera();
        limpiarTabla();
        PanelNuevo.setVisible(false);
        PanelModificar.setVisible(false);
        PanelEliminar.setVisible(false);
        PanelListar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAdvertencia = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OpcionDeAviso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AvisoSI = new javax.swing.JLabel();
        AvisoVolver = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanelAceptar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelCancelar = new javax.swing.JPanel();
        BotonCancelar = new javax.swing.JLabel();
        PanelBuscar = new javax.swing.JPanel();
        BotonBuscar = new javax.swing.JLabel();
        LabelNuevo = new javax.swing.JLabel();
        TextoTelefono = new javax.swing.JTextField();
        LabelDNI = new javax.swing.JLabel();
        TextoDni = new javax.swing.JTextField();
        LabelDireccion = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        TextoDireccion = new javax.swing.JTextField();
        Tabla = new javax.swing.JScrollPane();
        TablaListar = new javax.swing.JTable();
        PanelNuevo = new javax.swing.JPanel();
        BotonAgregar = new javax.swing.JLabel();
        PanelModificar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelListar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JLabel();
        BotonNuevo = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JLabel();
        BotonListar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setAlignmentX(50.0F);
        setAlignmentY(50.0F);
        setMaximumSize(new java.awt.Dimension(40, 600));
        setPreferredSize(new java.awt.Dimension(750, 565));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAdvertencia.setBackground(new java.awt.Color(255, 255, 255));
        PanelAdvertencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelAdvertencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AVISO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        PanelAdvertencia.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Esta por");
        PanelAdvertencia.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 70, -1));

        OpcionDeAviso.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        OpcionDeAviso.setBorder(null);
        PanelAdvertencia.add(OpcionDeAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("un paciente");
        PanelAdvertencia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 20));

        AvisoSI.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        AvisoSI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvisoSI.setText("SI");
        AvisoSI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AvisoSI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvisoSIMouseClicked(evt);
            }
        });
        PanelAdvertencia.add(AvisoSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 50, 20));

        AvisoVolver.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        AvisoVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvisoVolver.setText("VOLVER");
        AvisoVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AvisoVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvisoVolverMouseClicked(evt);
            }
        });
        PanelAdvertencia.add(AvisoVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Desea continuar?");
        PanelAdvertencia.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 20));

        getContentPane().add(PanelAdvertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 330, 210));

        PanelAceptar.setBackground(new java.awt.Color(204, 204, 204));
        PanelAceptar.setMinimumSize(new java.awt.Dimension(120, 30));
        PanelAceptar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ACEPTAR");
        PanelAceptar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        getContentPane().add(PanelAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        PanelCancelar.setBackground(new java.awt.Color(204, 204, 204));
        PanelCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonCancelar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonCancelar.setText("CANCELAR");
        BotonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCancelar.setMinimumSize(new java.awt.Dimension(120, 30));
        BotonCancelar.setPreferredSize(new java.awt.Dimension(120, 30));
        BotonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarMouseClicked(evt);
            }
        });
        PanelCancelar.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        getContentPane().add(PanelCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        PanelBuscar.setBackground(new java.awt.Color(255, 255, 255));
        PanelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonBuscar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        BotonBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar2.png"))); // NOI18N
        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseClicked(evt);
            }
        });
        PanelBuscar.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        getContentPane().add(PanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 50, 30));

        LabelNuevo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        LabelNuevo.setText("NOMBRE:");
        getContentPane().add(LabelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        TextoTelefono.setEditable(false);
        TextoTelefono.setForeground(new java.awt.Color(102, 102, 102));
        TextoTelefono.setText(" Telefono de contacto (solo numeros)");
        TextoTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoTelefonoMouseClicked(evt);
            }
        });
        getContentPane().add(TextoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 430, 30));

        LabelDNI.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        LabelDNI.setText("DNI:");
        getContentPane().add(LabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        TextoDni.setEditable(false);
        TextoDni.setForeground(new java.awt.Color(102, 102, 102));
        TextoDni.setText(" (solo numeros)");
        TextoDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoDniMouseClicked(evt);
            }
        });
        getContentPane().add(TextoDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 132, 230, 30));

        LabelDireccion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        LabelDireccion.setText("DIRECCION:");
        getContentPane().add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        LabelTelefono.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        LabelTelefono.setText("TELEFONO:");
        getContentPane().add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        TextoNombre.setEditable(false);
        TextoNombre.setForeground(new java.awt.Color(102, 102, 102));
        TextoNombre.setText(" Nombre completo del paciente");
        TextoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoNombreMouseClicked(evt);
            }
        });
        getContentPane().add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 92, 430, 30));

        TextoDireccion.setEditable(false);
        TextoDireccion.setForeground(new java.awt.Color(102, 102, 102));
        TextoDireccion.setText("Agregar calle y numero");
        TextoDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoDireccionMouseClicked(evt);
            }
        });
        getContentPane().add(TextoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 430, 30));

        TablaListar.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla.setViewportView(TablaListar);

        getContentPane().add(Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 327, 710, 230));

        PanelNuevo.setBackground(new java.awt.Color(204, 204, 204));
        PanelNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelNuevo.setForeground(new java.awt.Color(153, 153, 153));
        PanelNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAgregar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        BotonAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonAgregar.setText("NUEVO");
        PanelNuevo.add(BotonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(PanelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 70, 30));

        PanelModificar.setBackground(new java.awt.Color(204, 204, 204));
        PanelModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelModificar.setForeground(new java.awt.Color(153, 153, 153));
        PanelModificar.setMinimumSize(new java.awt.Dimension(70, 30));
        PanelModificar.setPreferredSize(new java.awt.Dimension(70, 30));
        PanelModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EDITAR");
        PanelModificar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(PanelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, -1));

        PanelEliminar.setBackground(new java.awt.Color(204, 204, 204));
        PanelEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelEliminar.setForeground(new java.awt.Color(153, 153, 153));
        PanelEliminar.setPreferredSize(new java.awt.Dimension(80, 30));
        PanelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ELIMINAR");
        PanelEliminar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        getContentPane().add(PanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, -1));

        PanelListar.setBackground(new java.awt.Color(204, 204, 204));
        PanelListar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        PanelListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LISTAR");
        PanelListar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(PanelListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 70, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" MENU PACIENTE");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 240, 40));

        BotonModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar1.png"))); // NOI18N
        BotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonModificarMouseExited(evt);
            }
        });
        getContentPane().add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 40, -1));

        BotonNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar1.png"))); // NOI18N
        BotonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonNuevoMouseExited(evt);
            }
        });
        getContentPane().add(BotonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        BotonEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar1.png"))); // NOI18N
        BotonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseExited(evt);
            }
        });
        getContentPane().add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 40));

        BotonListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listar1_1.png"))); // NOI18N
        BotonListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonListarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonListarMouseExited(evt);
            }
        });
        getContentPane().add(BotonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 50, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondopaciente.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 565));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseClicked
        check(1);

    }//GEN-LAST:event_BotonNuevoMouseClicked

    private void TextoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoNombreMouseClicked
        if (N == true) {
            TextoNombre.setForeground(Color.black);
            TextoNombre.setText("");
        }
    }//GEN-LAST:event_TextoNombreMouseClicked

    private void TextoDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoDniMouseClicked
        if (N == true || M == true || E == true) {
            TextoDni.setForeground(Color.black);
            TextoDni.setText("");
        }
    }//GEN-LAST:event_TextoDniMouseClicked

    private void TextoDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoDireccionMouseClicked
        if (N == true) {
            TextoDireccion.setForeground(Color.black);
            TextoDireccion.setText("");
        } else if (M == true && B == true) {
            TextoDireccion.setForeground(Color.black);
            TextoDireccion.setEditable(true);
        }
    }//GEN-LAST:event_TextoDireccionMouseClicked

    private void TextoTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoTelefonoMouseClicked
        if (N == true) {
            TextoTelefono.setForeground(Color.black);
            TextoTelefono.setText("");
        } else if (M == true && B == true) {
            TextoTelefono.setForeground(Color.black);
            TextoTelefono.setEditable(true);
        }
    }//GEN-LAST:event_TextoTelefonoMouseClicked

    private void BotonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseClicked
        check(2);
        if (M == true) {
            TextoDni.setText("Coloque el dni del paciente a buscar");
        }
    }//GEN-LAST:event_BotonModificarMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked
        check(3);
        if (E == true) {
            TextoDni.setText("Coloque el dni del paciente a buscar");
        }
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void BotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseClicked
        B = true;
        Paciente pa = new Paciente();
        PacienteData paData = new PacienteData();
        String dniS = TextoDni.getText();
        try {
            int dni = Integer.parseInt(dniS);
            pa = buscarXDNI(dni);
            if (pa.getDni() != 0) {
                pa = (paData.buscarXdni(dni));
                TextoNombre.setText(pa.getNombre());
                TextoTelefono.setText(pa.getTelefono());
                TextoDireccion.setText(pa.getDomicilio());
            } else {
                JOptionPane.showMessageDialog(null, "DNI de paciente no encontrado");
                TextoDni.setText("Coloque el dni del paciente a buscar");
                TextoDni.setForeground(Color.gray);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "DNI incorrecto, intente nuevamente");
            TextoDni.setText("Coloque el dni del paciente a buscar");
            TextoDni.setForeground(Color.gray);
        }

    }//GEN-LAST:event_BotonBuscarMouseClicked

    private void AvisoSIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvisoSIMouseClicked
        int dni = Integer.parseInt(TextoDni.getText());
        Paciente pa = new Paciente();
        PacienteData paData = new PacienteData();
        if (M == true && B == true) {
            pa = (paData.buscarXdni(dni));
            pa.setDomicilio(TextoDireccion.getText());
            pa.setTelefono(TextoTelefono.getText());
            paData.modificiarPaciente(pa);
        } else if (E == true && B == true) {
            paData.eliminarPaciente(pa.getIdPaciente());
        } else if (N == true) {
            pa.setNombre(TextoNombre.getText());
            pa.setDni(dni);
            pa.setDomicilio(TextoDireccion.getText());
            pa.setTelefono(TextoTelefono.getText());
            paData.agregarPaciente(pa);
        }
        PanelAdvertencia.setVisible(false);
    }//GEN-LAST:event_AvisoSIMouseClicked

    private void AvisoVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvisoVolverMouseClicked
        PanelAdvertencia.setVisible(false);
    }//GEN-LAST:event_AvisoVolverMouseClicked

    private void BotonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarMouseClicked
        TextoNombre.setEditable(false);
        TextoDni.setEditable(false);
        TextoTelefono.setEditable(false);
        TextoDireccion.setEditable(false);
        TextoNombre.setForeground(Color.gray);
        TextoDni.setForeground(Color.gray);
        TextoTelefono.setForeground(Color.gray);
        TextoDireccion.setForeground(Color.gray);
        TextoNombre.setText("Nombre completo del paciente");
        TextoDni.setText("(solo numeros)");
        TextoDireccion.setText("Agregar calle y numero");
        TextoTelefono.setText("Telefono de contacto (solo numeros)");
    }//GEN-LAST:event_BotonCancelarMouseClicked

    private void BotonListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonListarMouseClicked
        limpiarTabla();
        PacienteData padata = new PacienteData();
        ArrayList<Paciente> paciente = new ArrayList<>(padata.listarPaciente());
        cargarTabla(paciente);
        Tabla.setVisible(true);
    }//GEN-LAST:event_BotonListarMouseClicked

    private void BotonListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonListarMouseEntered
        PanelListar.setVisible(true);
    }//GEN-LAST:event_BotonListarMouseEntered

    private void BotonNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseEntered
        PanelNuevo.setVisible(true);
    }//GEN-LAST:event_BotonNuevoMouseEntered

    private void BotonNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevoMouseExited
        PanelNuevo.setVisible(false);
    }//GEN-LAST:event_BotonNuevoMouseExited

    private void BotonModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseEntered
        PanelModificar.setVisible(true);
    }//GEN-LAST:event_BotonModificarMouseEntered

    private void BotonModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseExited
        PanelModificar.setVisible(false);
    }//GEN-LAST:event_BotonModificarMouseExited

    private void BotonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseEntered
        PanelEliminar.setVisible(true);
    }//GEN-LAST:event_BotonEliminarMouseEntered

    private void BotonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseExited
        PanelEliminar.setVisible(false);
    }//GEN-LAST:event_BotonEliminarMouseExited

    private void BotonListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonListarMouseExited
        PanelListar.setVisible(false);
    }//GEN-LAST:event_BotonListarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvisoSI;
    private javax.swing.JLabel AvisoVolver;
    private javax.swing.JLabel BotonAgregar;
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JLabel BotonCancelar;
    private javax.swing.JLabel BotonEliminar;
    private javax.swing.JLabel BotonListar;
    private javax.swing.JLabel BotonModificar;
    private javax.swing.JLabel BotonNuevo;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelDNI;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelNuevo;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JTextField OpcionDeAviso;
    private javax.swing.JPanel PanelAceptar;
    private javax.swing.JPanel PanelAdvertencia;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelCancelar;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelListar;
    private javax.swing.JPanel PanelModificar;
    private javax.swing.JPanel PanelNuevo;
    private javax.swing.JScrollPane Tabla;
    private javax.swing.JTable TablaListar;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoDni;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void check(int x) {
        B = false;
        TextoNombre.setEditable(false);
        TextoDni.setEditable(false);
        TextoTelefono.setEditable(false);
        TextoDireccion.setEditable(false);
        TextoNombre.setForeground(Color.gray);
        TextoDni.setForeground(Color.gray);
        TextoTelefono.setForeground(Color.gray);
        TextoDireccion.setForeground(Color.gray);
        TextoNombre.setText("Nombre completo del paciente");
        TextoDni.setText("(solo numeros)");
        TextoDireccion.setText("Agregar calle y numero");
        TextoTelefono.setText("Telefono de contacto (solo numeros)");
        if (x == 1) {
            N = true;
            M = false;
            E = false;
            TextoNombre.setEditable(true);
            TextoDni.setEditable(true);
            TextoTelefono.setEditable(true);
            TextoDireccion.setEditable(true);
        } else if (x == 2) {
            M = true;
            N = false;
            E = false;
            TextoDni.setEditable(true);
            
        } else if (x == 3) {
            E = true;
            N = false;
            M = false;
            TextoDni.setEditable(true);
        }
    }
    
    private Paciente buscarXDNI(int x) {
        PacienteData paData = new PacienteData();
        Paciente pa = new Paciente();
        pa = (paData.buscarXdni(x));
        return pa;
    }
    
    private void cargarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        TablaListar.setModel(modelo);
    }
    
    private void cargarTabla(ArrayList<Paciente> x) {
        for (Paciente paciente : x) {
            modelo.addRow(new Object[]{paciente.getNombre(), paciente.getDni(), paciente.getDomicilio(), paciente.getTelefono()});
        }
    }
    
    private void limpiarTabla() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i > -1; i--) {
            modelo.removeRow(i);
        }
    }
}
