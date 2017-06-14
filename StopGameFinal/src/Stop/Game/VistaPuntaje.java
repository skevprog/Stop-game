/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stop.Game;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */

public class VistaPuntaje extends javax.swing.JFrame {

    /**
     * Creates new form VistaPuntaje
     */
    
    
    DefaultTableModel modelo=new DefaultTableModel();
    DefaultTableModel modelo2=new DefaultTableModel();          //creamos la tabla por defecto para colocar puntaje
    public VistaPuntaje() {
        initComponents();
        TablaDatos.setModel(modelo);
        modelo.addColumn("Ronda");
        modelo.addColumn("Letra");
        modelo.addColumn("Nombre");
        modelo.addColumn("Animal");
        modelo.addColumn("Color");
        TablaPuntos.setModel(modelo2);
        modelo2.addColumn("Puntaje");
   
    }
    
    /*METODO PARA VERIFICAR*/
    public void verificar(){
        
    }
/*METODO PARA SUMAR LOS PUNTAJES OBTENIDOS EN TODAS LAS RONDAS*/
    public Integer Total(Integer a[]){
        Integer puntaje=0;
        for(int i=0;i<a.length;i++){
            puntaje=+i;
        }
        return puntaje;
    }
/*METODO PARA FINALIZAR PARTIDA*/
    public void finalizar(int a){
        if(a==0){
            System.exit(0);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSumar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        btnFinalizar = new javax.swing.JButton();
        btnSigRonda = new javax.swing.JButton();
        txtPuntajeNombre = new javax.swing.JTextField();
        txtPuntajeAnimal = new javax.swing.JTextField();
        txtPuntajeColor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPuntos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabla Puntaje");

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        TablaDatos=new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int columnIndex){
                return false;
            }
        };
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ronda", "Letra", "Nombre", "Animal", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        btnFinalizar.setText("Finalizar Partida");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnSigRonda.setText("Siguiente Ronda");
        btnSigRonda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigRondaActionPerformed(evt);
            }
        });

        txtPuntajeNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntajeNombreActionPerformed(evt);
            }
        });
        txtPuntajeNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuntajeNombreKeyTyped(evt);
            }
        });

        TablaPuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(TablaPuntos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSumar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSigRonda)
                                .addGap(18, 18, 18)
                                .addComponent(btnFinalizar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(txtPuntajeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntajeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPuntajeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuntajeColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntajeNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuntajeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar)
                    .addComponent(btnSigRonda)
                    .addComponent(btnFinalizar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
       int s=JOptionPane.showConfirmDialog(null,"¿Desea terminar la partida?");
       finalizar(s);
       
       
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        /*SE OBTIENE EL PUNTAJE DEL CAMPO DE TEXTO PARA LUEGO SUMARLO*/
        Integer suma=0;
        
        boolean comp;
       
        do{         
           comp=true;
        try{
        
        Integer a=Integer.parseInt(txtPuntajeNombre.getText());
        Integer b=Integer.parseInt(txtPuntajeAnimal.getText());
        Integer c=Integer.parseInt(txtPuntajeColor.getText());
        suma=a+b+c;
        /*SE PASA EL PUNTAJE TOTAL DE LA RONDA A LA TABLA DE PUNTAJES*/
        Integer [] Dat=new Integer[1];
        Dat[0]=suma;
        modelo2.addRow(Dat);
        JOptionPane.showMessageDialog(null, "el total es de: "+suma);
        /*SI SE APRIETA EL BOTON SUMAR SIN QUE ESTEN COMPLETOS TODOS LOS CAMPOS, SE LANZARA UNA EXCEPCION*/
        }catch(Exception e){                                                
            JOptionPane.showMessageDialog(null,"Debe completar todos los campos de puntaje con numeros enteros");
            comp=false;
        }
       }while(comp=false);
        
        /*SE REINICIAN A 0 LOS CAMPOS DE PUNTAJE*/
        txtPuntajeNombre.setText("");
        txtPuntajeAnimal.setText("");
        txtPuntajeColor.setText("");
        
        
        
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnSigRondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigRondaActionPerformed
        this.dispose();                     //Metodo para cerrar ventana actual sin perder datos
        Vista.txtLetraGen.setText("");      
        
        
    }//GEN-LAST:event_btnSigRondaActionPerformed

    private void txtPuntajeNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntajeNombreActionPerformed
       
    }//GEN-LAST:event_txtPuntajeNombreActionPerformed

    private void txtPuntajeNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntajeNombreKeyTyped
       
        /*SOLO SE PUEDE INGRESAR NUMEROS*/
        char validar=evt.getKeyChar();
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane," Ingresar solo numeros");
        }
    }//GEN-LAST:event_txtPuntajeNombreKeyTyped

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
            java.util.logging.Logger.getLogger(VistaPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPuntaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable TablaPuntos;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSigRonda;
    private javax.swing.JButton btnSumar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPuntajeAnimal;
    private javax.swing.JTextField txtPuntajeColor;
    private javax.swing.JTextField txtPuntajeNombre;
    // End of variables declaration//GEN-END:variables
}
