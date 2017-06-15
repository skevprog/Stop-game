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

public class Vista extends javax.swing.JFrame {
public static char randomLet;
Integer a=1;            //Variable que indicara el numero de ronda

   
    VistaPuntaje vistpunt=new VistaPuntaje();                               //SE INSTANCIA LA VENTANA PUNTAJE
    
    
    DefaultTableModel modelo=new DefaultTableModel(){                       //SE HACEN TODAS LAS CELDAS NO EDITABLES PARA EVITAR FRAUDE
    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    
    }
    
};
    
    // SE CREA PORQUE CADA CAMPO DEL A TABLA SERA UN OBJETO PERSONA CON LOS ATRIBUTOS(datos) QUE INGRESO("nombre","color","marcas")
    public Vista() {
        initComponents();
        
        
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnGenerarLetra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtAnimal = new javax.swing.JTextField();
        txtLetraGen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stop Game");

        btnFinalizar.setText("Parar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnGenerarLetra.setText("Generar Letra");
        btnGenerarLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarLetraActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        jLabel7.setText("Animal");

        jLabel8.setText("Color");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalActionPerformed(evt);
            }
        });

        txtLetraGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetraGenActionPerformed(evt);
            }
        });

        jLabel2.setText("Letra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnimal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerarLetra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnGenerarLetra))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFinalizar)
                        .addComponent(txtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        /*CONDICION PARA QUE SI LA PRIMERA LETRA INGRESADA NO COINCIDE CON LA LETRA GENERADA SE OBTENGA 0 PUNTOS*/
        char t=txtNombre.getText().toUpperCase().trim().charAt(0);
        char p=randomLet;
        if(t!=p){
            VistaPuntaje.txtPuntajeNombre.setText("0");
            VistaPuntaje.txtPuntajeNombre.setEditable(false);
        }
       
        
        Object [] Datos=new Object [5];               //Se crea un arreglo que contendrá los datos agregados
        String letra=String.valueOf(randomLet);         //se convierte el char de la letra generada en un String para pasarlo a la tabla
        Datos[0]=a++;                                   //Contador de rondas
        Datos[1]=letra;                                 //Obtiene la letra generada aleatoriamente(Ya en formator String)
        /*Funcion .trim() para quitar espacios colocados por el jugador*/
        Datos[2]=txtNombre.getText().trim();                   
        Datos[3]=txtColor.getText().trim();
        Datos[4]=txtAnimal.getText().trim();               
        
        vistpunt.modelo.addRow(Datos);                  //Se añade la fila con datos a la tabla en la vista de puntaje
       
      
       
        /*Se reinicia el campo de texto y queda en blanco*/
        txtNombre.setText("");     
        txtAnimal.setText("");
        txtColor.setText("");    
        
        
        
        
        /*Se Hace visible la ventaba puntaje*/
        vistpunt.setVisible(true);
       
        
        /*Se cierra ventana principal para pasar a la ventana puntaje*/
      
       
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGenerarLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarLetraActionPerformed
        randomLet=GenerarLetra();
        JOptionPane.showMessageDialog(null,"La letra generada para esta ronda es: "+randomLet);     //Mostrar la letra en una ventana
        String letra=String.valueOf(randomLet);                                                     //Pasaje de char a String
        txtLetraGen.setText(letra);                                                                 //Colocar la letra generada en un cuadro para recordar
        txtLetraGen.setEditable(false);                                                             //Hacer recudro no editable
        
    }//GEN-LAST:event_btnGenerarLetraActionPerformed

    private void txtAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalActionPerformed

    private void txtLetraGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetraGenActionPerformed
       
        
        
    }//GEN-LAST:event_txtLetraGenActionPerformed
 
   
    /*METODO PARA GENERAR LETRA ALEATORIA*/
    public char GenerarLetra(){
        char s=(char)(Math.random()*26+'a');
        s=(char) (s - 'a' + 'A');
        return s;
    }
    
    
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnGenerarLetra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField txtAnimal;
    public static javax.swing.JTextField txtColor;
    public static javax.swing.JTextField txtLetraGen;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
