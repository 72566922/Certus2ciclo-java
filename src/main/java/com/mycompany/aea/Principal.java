package com.mycompany.aea;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Jhordan
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Backup = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        GastosPagos = new javax.swing.JMenuItem();
        OpenIngresosGanancias = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        OpenRegistroDocente = new javax.swing.JMenuItem();
        openDato = new javax.swing.JMenuItem();
        openDatatable = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        OpenMatricula = new javax.swing.JMenuItem();
        OpenRegistroAlumnos = new javax.swing.JMenuItem();
        RegistroNotas = new javax.swing.JMenuItem();
        OpenPension = new javax.swing.JMenuItem();
        openAsistencia = new javax.swing.JMenuItem();
        Empleados = new javax.swing.JMenu();
        OpenRegistroEmpleados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );

        Backup.setText("Archivo");

        jMenuItem1.setText("Backup");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Backup.add(jMenuItem1);

        Salir.setText("Salir");
        Backup.add(Salir);

        jMenuBar1.add(Backup);

        jMenu3.setText("AdmEconomica");

        GastosPagos.setText("Gastos-Pagos");
        GastosPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GastosPagosActionPerformed(evt);
            }
        });
        jMenu3.add(GastosPagos);

        OpenIngresosGanancias.setText("Ingresos-Ganancias");
        OpenIngresosGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenIngresosGananciasActionPerformed(evt);
            }
        });
        jMenu3.add(OpenIngresosGanancias);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Docente");

        OpenRegistroDocente.setText("RegistroDocente");
        OpenRegistroDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenRegistroDocenteActionPerformed(evt);
            }
        });
        jMenu4.add(OpenRegistroDocente);

        openDato.setText("DATO");
        openDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDatoActionPerformed(evt);
            }
        });
        jMenu4.add(openDato);

        openDatatable.setText("Datatable");
        openDatatable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDatatableActionPerformed(evt);
            }
        });
        jMenu4.add(openDatatable);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Alumnos");

        OpenMatricula.setText("Matricula");
        OpenMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMatriculaActionPerformed(evt);
            }
        });
        jMenu2.add(OpenMatricula);

        OpenRegistroAlumnos.setText("RegistroDeAlumnos");
        OpenRegistroAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenRegistroAlumnosActionPerformed(evt);
            }
        });
        jMenu2.add(OpenRegistroAlumnos);

        RegistroNotas.setText("RegistroNotas");
        RegistroNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroNotasActionPerformed(evt);
            }
        });
        jMenu2.add(RegistroNotas);

        OpenPension.setText("Pension");
        OpenPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenPensionActionPerformed(evt);
            }
        });
        jMenu2.add(OpenPension);

        openAsistencia.setText("Asistencias");
        openAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAsistenciaActionPerformed(evt);
            }
        });
        jMenu2.add(openAsistencia);

        jMenuBar1.add(jMenu2);

        Empleados.setText("Empleados");

        OpenRegistroEmpleados.setText("RegistroEmpleados");
        OpenRegistroEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenRegistroEmpleadosActionPerformed(evt);
            }
        });
        Empleados.add(OpenRegistroEmpleados);

        jMenuBar1.add(Empleados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void OpenMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMatriculaActionPerformed
        // TODO add your handling code here:
    Matricula cargarVentanaMatricula = new Matricula();
    Escritorio.add(cargarVentanaMatricula);
    cargarVentanaMatricula.show();
    }//GEN-LAST:event_OpenMatriculaActionPerformed

    private void OpenRegistroAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenRegistroAlumnosActionPerformed
        // TODO add your handling code here:
        RegistroAlumnos cargarVentanaClientes = new RegistroAlumnos();
    Escritorio.add(cargarVentanaClientes);
    cargarVentanaClientes.show();
    }//GEN-LAST:event_OpenRegistroAlumnosActionPerformed

    private void OpenRegistroDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenRegistroDocenteActionPerformed
        // TODO add your handling code here:
        RegistroDocente cargarVentanaRegistroDocente = new RegistroDocente();
        Escritorio.add(cargarVentanaRegistroDocente);
        cargarVentanaRegistroDocente.show();
    }//GEN-LAST:event_OpenRegistroDocenteActionPerformed

    private void RegistroNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroNotasActionPerformed
        // TODO add your handling code here:
        RegistroNotas cargarVentanaRegistroNotas = new RegistroNotas();
        Escritorio.add(cargarVentanaRegistroNotas);
        cargarVentanaRegistroNotas.show();
    }//GEN-LAST:event_RegistroNotasActionPerformed

    private void GastosPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GastosPagosActionPerformed
        // TODO add your handling code here:
        GastosPagos cargarVentanaGastosPagos = new GastosPagos();
        Escritorio.add(cargarVentanaGastosPagos);
        cargarVentanaGastosPagos.show();
    }//GEN-LAST:event_GastosPagosActionPerformed

    private void OpenRegistroEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenRegistroEmpleadosActionPerformed
        // TODO add your handling code here:
        RegistroDeEmpleados cargarVentanaOpenRegistroEmpleados = new RegistroDeEmpleados();
        Escritorio.add(cargarVentanaOpenRegistroEmpleados);
        cargarVentanaOpenRegistroEmpleados.show();
    }//GEN-LAST:event_OpenRegistroEmpleadosActionPerformed

    private void OpenIngresosGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenIngresosGananciasActionPerformed
        // TODO add your handling code here:
        IngresosGanancias cargarVentanaOpenIngresosGanancias = new IngresosGanancias();
        Escritorio.add(cargarVentanaOpenIngresosGanancias);
        cargarVentanaOpenIngresosGanancias.show();
    }//GEN-LAST:event_OpenIngresosGananciasActionPerformed

    private void OpenPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenPensionActionPerformed
        // TODO add your handling code here:
        Pension cargarVentanaOpenPension = new Pension();
        Escritorio.add(cargarVentanaOpenPension);
        cargarVentanaOpenPension.show();
    }//GEN-LAST:event_OpenPensionActionPerformed

    private void openDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDatoActionPerformed
        // TODO add your handling code here:
        Dato1 cargarVentanaOpenDato = new Dato1();
        Escritorio.add(cargarVentanaOpenDato);
        cargarVentanaOpenDato.setVisible(true);
    }//GEN-LAST:event_openDatoActionPerformed

    private void openDatatableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDatatableActionPerformed
        // TODO add your handling code here:
        /**Datatable cargarVentanaOpenDatable = new Datatable();
        Escritorio.add(cargarVentanaOpenDatable);
        cargarVentanaOpenDatable.setVisible(true);**/
        
    }//GEN-LAST:event_openDatatableActionPerformed

    private void openAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAsistenciaActionPerformed
        // TODO add your handling code here:
        RegistroAsistenciasForm cargarVentanaopenAsistencia = new RegistroAsistenciasForm();
        Escritorio.add(cargarVentanaopenAsistencia);
        cargarVentanaopenAsistencia.setVisible(true);
    }//GEN-LAST:event_openAsistenciaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Backup;
    private javax.swing.JMenu Empleados;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem GastosPagos;
    private javax.swing.JMenuItem OpenIngresosGanancias;
    private javax.swing.JMenuItem OpenMatricula;
    private javax.swing.JMenuItem OpenPension;
    private javax.swing.JMenuItem OpenRegistroAlumnos;
    private javax.swing.JMenuItem OpenRegistroDocente;
    private javax.swing.JMenuItem OpenRegistroEmpleados;
    private javax.swing.JMenuItem RegistroNotas;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem openAsistencia;
    private javax.swing.JMenuItem openDatatable;
    private javax.swing.JMenuItem openDato;
    // End of variables declaration//GEN-END:variables
}