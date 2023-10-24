/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.ComidaData;
import AccesoADatos.IngredientesData;
import AccesoADatos.PrepararComidaData;
import Entidades.Comida;
import Entidades.Ingredientes;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author charl
 */
public class ArmarComida extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();
    private boolean N, L, M, E = false;
    private int calorias = 0;
    private int id=0;
    

    public ArmarComida() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        limpiarCombo(ComboBox);
        limpiarCombo(ComboDetalle);
        armarCabeceraTabla1();
        armarCabeceraTabla2();
        Editar.setVisible(false);
        Eliminar.setVisible(false);
        TextoCalorias.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNuevo = new javax.swing.JPanel();
        Nuevo = new javax.swing.JLabel();
        PanelListar = new javax.swing.JPanel();
        Listar = new javax.swing.JLabel();
        PanelEditar = new javax.swing.JPanel();
        Editar = new javax.swing.JLabel();
        PanelEliminar = new javax.swing.JPanel();
        Eliminar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Detalle = new javax.swing.JLabel();
        ComboDetalle = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextoCalorias = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        ComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BotonAceptar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        OpcionCombo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(750, 565));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelNuevo.setBackground(new java.awt.Color(153, 153, 153));
        PanelNuevo.setPreferredSize(new java.awt.Dimension(80, 100));
        PanelNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nuevo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nuevo.setText("NUEVO");
        Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoMouseClicked(evt);
            }
        });
        PanelNuevo.add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        getContentPane().add(PanelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        PanelListar.setBackground(new java.awt.Color(153, 153, 153));
        PanelListar.setPreferredSize(new java.awt.Dimension(80, 30));
        PanelListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Listar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Listar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Listar.setText("LISTAR");
        Listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListarMouseClicked(evt);
            }
        });
        PanelListar.add(Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        getContentPane().add(PanelListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        PanelEditar.setBackground(new java.awt.Color(255, 255, 255));
        PanelEditar.setPreferredSize(new java.awt.Dimension(80, 30));
        PanelEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Editar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Editar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Editar.setText("EDITAR");
        Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });
        PanelEditar.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        getContentPane().add(PanelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 90, -1));

        PanelEliminar.setBackground(new java.awt.Color(255, 255, 255));
        PanelEliminar.setPreferredSize(new java.awt.Dimension(100, 30));
        PanelEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar.setText("ELIMINAR");
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        PanelEliminar.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        getContentPane().add(PanelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre.setText("Nombre");
        jPanel2.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));
        jPanel2.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 240, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, -1));

        jPanel3.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Detalle.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Detalle.setText("Detalle");
        jPanel3.add(Detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        ComboDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDetalleActionPerformed(evt);
            }
        });
        jPanel3.add(ComboDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 240, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 340, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setText("Calorias");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        TextoCalorias.setEditable(false);
        jPanel4.add(TextoCalorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 240, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, -1));

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 340, 480));

        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 110, -1));

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 400, 270));

        jPanel1.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAceptar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        BotonAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonAceptar.setText("ACEPTAR");
        BotonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAceptarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANCELAR");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        jPanel6.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OpcionCombo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        OpcionCombo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(OpcionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 120, -1));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FAC3.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseClicked
        limpiarPantalla();
        N = true;
        OpcionCombo.setText("Ingredientes");
        limpiarCombo(ComboBox);
        cargarCombo1();
        cargarComboDetalle();
        TextoCalorias.setText("0");
        Editar.setVisible(false);
        Eliminar.setVisible(false);

    }//GEN-LAST:event_NuevoMouseClicked

    private void ListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarMouseClicked
        limpiarPantalla();
        L = true;
        OpcionCombo.setText("Comidas");
        limpiarCombo(ComboBox);
        cargarCombo2();

    }//GEN-LAST:event_ListarMouseClicked

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        limpiarTabla(modelo);
        if (N == true || M == true) {
            cargarTablaIngredientes();
        } else if (L == true) {
            cargarTablaComida();
        }
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void ComboDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboDetalleActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        if (N == true || M == true) {
            int id = Integer.parseInt(modelo.getValueAt(Tabla1.getSelectedRow(), 0).toString());
            IngredientesData ingre = new IngredientesData();
            Ingredientes ingrediente = new Ingredientes();
            ingrediente = ingre.buscarId(id);
            cargarTabla2Ingredientes(ingrediente);
            calorias = Integer.parseInt(TextoCalorias.getText()) + ingrediente.getCantCalorias();
            String calo = String.valueOf(calorias);
            TextoCalorias.setText(calo);
        } else if (L == true) {
            Eliminar.setVisible(true);
            Editar.setVisible(true);
            limpiarTabla(modelo2);
            Comida comida = new Comida();
            id=Integer.parseInt(modelo.getValueAt(Tabla1.getSelectedRow(), 0).toString());
            comida.setIdComida(id);
            cargarTabla2Array(comida);
            TextoNombre.setText(modelo.getValueAt(Tabla1.getSelectedRow(), 1).toString());
            TextoCalorias.setText(modelo.getValueAt(Tabla1.getSelectedRow(), 2).toString());
            cargarComboDetalle();
            ComboDetalle.setSelectedItem(ComboBox.getSelectedItem());
        }

    }//GEN-LAST:event_Tabla1MouseClicked

    private void Tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla2MouseClicked
        if (N == true) {
            int calo = Integer.parseInt(modelo2.getValueAt(Tabla2.getSelectedRow(), 3).toString());
            calorias = calorias - calo;
            modelo2.removeRow(Tabla2.getSelectedRow());
            TextoCalorias.setText(calorias + "");
        } else if (M = true) {
            int calo = Integer.parseInt(TextoCalorias.getText());
            int calo2 = Integer.parseInt(modelo2.getValueAt(Tabla2.getSelectedRow(), 3).toString());
            int resultado = calo - calo2;
            TextoCalorias.setText(resultado + "");
            modelo2.removeRow(Tabla2.getSelectedRow());
        }
    }//GEN-LAST:event_Tabla2MouseClicked

    private void BotonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAceptarMouseClicked
        if (N == true) {
            String nombre = TextoNombre.getText();
            if (nombre.isEmpty() || ComboDetalle.getSelectedIndex() == 0 || calorias == 0) {
                JOptionPane.showMessageDialog(null, "Debe completar los datos antes de continuar");
            } else {
                Comida comida = new Comida();
                ComidaData comiData = new ComidaData();
                comida.setNombre(nombre);
                comida.setDetalle(ComboDetalle.getSelectedItem().toString());
                comida.setCantCalorias(calorias);
                comiData.agregarComida(comida);
                ArrayList<Ingredientes> ingre = new ArrayList<>();
                int filas = modelo2.getRowCount();
                for (int i = filas - 1; i > -1; i--) {
                    Ingredientes ingrediente = new Ingredientes();
                    ingrediente.setIdIngredientes(Integer.parseInt(modelo2.getValueAt(i, 0).toString()));
                    ingre.add(ingrediente);
                }
                PrepararComidaData prepaData = new PrepararComidaData();
                prepaData.crearComida(comida, ingre);
                limpiarPantalla();
                id=0;
            }
        } else if (L == true) {
            String nombre = TextoNombre.getText();
            String TexCalo=TextoCalorias.getText();
            if(E==false||M==false){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para continuar");
            }else if (nombre.isEmpty() || ComboDetalle.getSelectedIndex() == 0 || TexCalo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar los datos antes de continuar");
            } else if (E == true) {
                Comida comida = new Comida();
                ComidaData comiData = new ComidaData();
                comida.setIdComida(id);
                comiData.eliminarComida(comida);
                limpiarPantalla();
                id=0;
            } else if (M == true) {
                Comida comida = new Comida();
                ComidaData comiData = new ComidaData();
                PrepararComidaData prepaComid=new PrepararComidaData();
                comida.setIdComida(id);
                comida.setNombre(TextoNombre.getText());
                comida.setDetalle(ComboDetalle.getSelectedItem().toString());
                comida.setCantCalorias(calorias);
                prepaComid.modificarComida(comida);
                comiData.editarComida(comida);
                ArrayList<Ingredientes> ingre = new ArrayList<>();
                int filas = modelo2.getRowCount();
                for (int i = filas - 1; i > -1; i--) {
                    Ingredientes ingrediente = new Ingredientes();
                    ingrediente.setIdIngredientes(Integer.parseInt(modelo2.getValueAt(i, 0).toString()));
                    ingre.add(ingrediente);
                }
                prepaComid.crearComida(comida, ingre);
                System.out.println("Hecho");
                limpiarPantalla();
                id=0;
            }
        }else if(N==false||M==false||E==false){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una opcion para continuar");
        }
    }//GEN-LAST:event_BotonAceptarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        E = true;
        N=false;
        M=false;
        JOptionPane.showMessageDialog(null, "Eligio eliminar una comida");
    }//GEN-LAST:event_EliminarMouseClicked

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        JOptionPane.showMessageDialog(null, "Eligio editar una comida");
        M = true;
        E=false;
        N=false;
        OpcionCombo.setText("Ingredientes");
        limpiarCombo(ComboBox);
        cargarCombo1();
        limpiarTabla(modelo);
    }//GEN-LAST:event_EditarMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        limpiarPantalla();
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAceptar;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JComboBox<String> ComboDetalle;
    private javax.swing.JLabel Detalle;
    private javax.swing.JLabel Editar;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Listar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nuevo;
    private javax.swing.JLabel OpcionCombo;
    private javax.swing.JPanel PanelEditar;
    private javax.swing.JPanel PanelEliminar;
    private javax.swing.JPanel PanelListar;
    private javax.swing.JPanel PanelNuevo;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextField TextoCalorias;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void cargarCombo1() {
        ComboBox.addItem("Categoria");
        ComboBox.addItem("Vegetales");
        ComboBox.addItem("Tuberculos");
        ComboBox.addItem("Legumbres");
        ComboBox.addItem("Frutas");
        ComboBox.addItem("Cereales");
        ComboBox.addItem("Lacteos");
        ComboBox.addItem("Panificados");
        ComboBox.addItem("Carnes");
        ComboBox.addItem("Bebidas");

    }

    private void cargarComboDetalle() {
        ComboDetalle.addItem("Detalle");
        ComboDetalle.addItem("Desayuno");
        ComboDetalle.addItem("Media mañana");
        ComboDetalle.addItem("Almuerzo");
        ComboDetalle.addItem("Merienda");
        ComboDetalle.addItem("Cena");
    }

    private void cargarCombo2() {
        ComboBox.addItem("Detalle");
        ComboBox.addItem("Desayuno");
        ComboBox.addItem("Media mañana");
        ComboBox.addItem("Almuerzo");
        ComboBox.addItem("Merienda");
        ComboBox.addItem("Cena");
    }

    private void limpiarCombo(JComboBox x) {
        int cant = x.getItemCount();
        for (int i = cant - 1; i > -1; i--) {
            x.removeItemAt(i);
        }
    }

    private void cargarTablaComida() {
        try {
            ComidaData comData = new ComidaData();
            ArrayList<Comida> comida = new ArrayList<>();
            comida = comData.listarComidas(ComboBox.getSelectedItem().toString());
            int cant = comida.size();
            if (cant > -1) {
                for (Comida comida1 : comida) {
                    modelo.addRow(new Object[]{comida1.getIdComida(), comida1.getNombre(), comida1.getCantCalorias()});
                }
            }
        } catch (NullPointerException x) {

        }
    }

    private void armarCabeceraTabla1() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Calorias");
        Tabla1.setModel(modelo);
    }

    private void cargarTablaIngredientes() {
        try {
            IngredientesData ingreData = new IngredientesData();
            ArrayList<Ingredientes> ingredientes = new ArrayList<>();
            ingredientes = ingreData.listarIngredientesPorCateg(ComboBox.getSelectedItem().toString());
            int cant = ingredientes.size();
            if (cant > -1) {
                for (Ingredientes ingre : ingredientes) {
                    modelo.addRow(new Object[]{ingre.getIdIngredientes(), ingre.getNombre(), ingre.getCantCalorias()});
                }
            }
        } catch (NullPointerException x) {

        }
    }

    private void limpiarTabla(DefaultTableModel x) {
        int filas = x.getRowCount();
        for (int i = filas - 1; i > -1; i--) {
            x.removeRow(i);
        }
    }

    private void armarCabeceraTabla2() {
        modelo2.addColumn("Id");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Categoria");
        modelo2.addColumn("Calorias");
        Tabla2.setModel(modelo2);
    }

    private void cargarTabla2Array(Comida comida) {
        try {
            ArrayList<Ingredientes> ingrediente = new ArrayList<>();
            PrepararComidaData consulta = new PrepararComidaData();
            ingrediente = consulta.consultaComida(comida);
            int calo = 0;
            for (Ingredientes ingre : ingrediente) {

                modelo2.addRow(new Object[]{ingre.getIdIngredientes(), ingre.getNombre(), ingre.getCategoria(), ingre.getCantCalorias()});
            }

        } catch (NullPointerException x) {

        }
    }

    private void cargarTabla2Ingredientes(Ingredientes ingrediente) {
        int filas = modelo2.getRowCount();
        modelo2.insertRow(filas, new Object[]{ingrediente.getIdIngredientes(), ingrediente.getNombre(), ingrediente.getCategoria(), ingrediente.getCantCalorias()});
    }

    private void limpiarPantalla() {
        calorias = 0;
        TextoNombre.setText("");
        limpiarCombo(ComboDetalle);
        TextoCalorias.setText("0");
        limpiarCombo(ComboBox);
        limpiarTabla(modelo);
        limpiarTabla(modelo2);
        N = false;
        M = false;
        L = false;
        E = false;
    }
}
