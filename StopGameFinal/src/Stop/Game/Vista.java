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
    
    
public static String letra;
public static String palabra;
public static Integer p=0;
public static int cont;



DefaultTableModel datos=new DefaultTableModel();
DefaultTableModel puntaje=new DefaultTableModel();

   




    /*METODO CONSTRUCTOR*/
    public Vista() {
        initComponents();
    TablaDatos.setModel(datos);
        datos.addColumn("Letra");
        datos.addColumn("Palabra");
        datos.addColumn("Ingreso");
        TablaPuntaje.setModel(puntaje);
        puntaje.addColumn("Puntaje");
 cont=1;
 btnStop.setEnabled(false);
        this.setLocationRelativeTo(null);
        
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        btnGenLet = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtResp = new javax.swing.JTextField();
        txtLetraGen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPuntaje = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Parar");

        btnStop.setText("Parar");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnGenLet.setText("Generar Letra");
        btnGenLet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenLetActionPerformed(evt);
            }
        });

        jLabel6.setText("Animal");

        txtResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespActionPerformed(evt);
            }
        });

        txtLetraGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetraGenActionPerformed(evt);
            }
        });

        jLabel2.setText("Letra");

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        TablaPuntaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puntos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaPuntaje);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenLet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnStop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenLet)
                    .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
       
        /*CONDICIÓNES PARA QUE SI LA PRIMERA LETRA INGRESADA NO COINCIDE CON LA LETRA GENERADA SE OBTENGA 0 PUNTOS*/
        /*
        char nom=txtNombre.getText().toUpperCase().trim().charAt(0);
        char ani=txtAnimal.getText().toUpperCase().trim().charAt(0);
        char col=txtColor.getText().toUpperCase().trim().charAt(0);
        char p=randomLet;
        
        if(nom!=p && ani!=p && col!=p){
        VistaPuntaje.txtPuntajeNombre.setText("0");
        VistaPuntaje.txtPuntajeNombre.setEditable(false);
        VistaPuntaje.txtPuntajeAnimal.setText("0");
        VistaPuntaje.txtPuntajeAnimal.setEditable(false);
        VistaPuntaje.txtPuntajeColor.setText("0");
        VistaPuntaje.txtPuntajeColor.setEditable(false);
        
        }else {
        VistaPuntaje.txtPuntajeNombre.setEditable(true);
        VistaPuntaje.txtPuntajeAnimal.setEditable(true);
        VistaPuntaje.txtPuntajeColor.setEditable(true);
           }
            if(nom==p && ani!=p && col!=p ){
        VistaPuntaje.txtPuntajeNombre.setText("");
        VistaPuntaje.txtPuntajeAnimal.setText("0");
        VistaPuntaje.txtPuntajeAnimal.setEditable(false);
        VistaPuntaje.txtPuntajeColor.setText("0");
        VistaPuntaje.txtPuntajeColor.setEditable(false);
        
    }else if(nom!=p && ani==p && col!=p){
        VistaPuntaje.txtPuntajeNombre.setText("0");
        VistaPuntaje.txtPuntajeNombre.setEditable(false);
         VistaPuntaje.txtPuntajeAnimal.setText("0");
         VistaPuntaje.txtPuntajeAnimal.setEditable(false);
         VistaPuntaje.txtPuntajeColor.setText("");
    
    }else if(nom!=p && ani!=p && col==p){
        VistaPuntaje.txtPuntajeNombre.setText("0");
        VistaPuntaje.txtPuntajeNombre.setEditable(false);
         VistaPuntaje.txtPuntajeAnimal.setText("");
         VistaPuntaje.txtPuntajeColor.setText("0");
         VistaPuntaje.txtPuntajeColor.setEditable(false);
    }
      */  

        
     btnGenLet.setEnabled(true);
        btnStop.setEnabled(false);
        Object[] Datos=new Object[5];
        Datos[0]=letra;
        Datos[1]=palabra;
        Datos[2]=txtResp.getText().trim();
        
        datos.addRow(Datos);
        
        String Ingreso=txtResp.getText();
        
        /*Se coloca puntaje si la palabra es correcta o no*/
        if(Ingreso.equals(palabra)){
            p=5;
        }else{
            p=0;
        }
        
        /*Vector para la tabla de puntajes*/
        Integer []punt=new Integer[5];
        punt[0]=p;
        puntaje.addRow(punt);    
        
              
        
        
                  //Se añade la fila con datos a la tabla en la vista de puntaje
       

        /*Se reinicia el campo de texto y queda en blanco*/
        txtResp.setText("");     
          
         

        /*Se Hace visible la ventaba puntaje*/
        
        /*Se cierra ventana principal para pasar a la ventana puntaje*/
      //this.setVisible(false);
       
    }//GEN-LAST:event_btnStopActionPerformed

    private void txtRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespActionPerformed
        
    }//GEN-LAST:event_txtRespActionPerformed

    private void btnGenLetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenLetActionPerformed
       btnStop.setEnabled(true);
       btnGenLet.setEnabled(false);
        
           
           
    switch (cont) {
        case 1:
            letra="i";
            
            break;
        case 2:
            letra=  "e";
            
            break;
        case 3:
            letra="a";
            
            break;
        case 4:
            letra="u";
            
            break;
        case 5:
            letra="o";
           
            break;
        case 6:
            System.out.println("termino la partida");
            System.exit(0);
            break;
        default:
            break;
    }
        

        JOptionPane.showMessageDialog(null,"La letra generada para esta ronda es: "+letra);     //Mostrar la letra en una ventana                                                   //Pasaje de char a String
        txtLetraGen.setText(letra);                                                                 //Colocar la letra generada en un cuadro para recordar
        txtLetraGen.setEditable(false);        
        
    /*Generar palabra dependiendo de la letra que se cree*/
    if(letra.equals("a")){
        JOptionPane.showMessageDialog(null, "La palabra posee 5 letras");
    palabra="abeja";
    
    
    }
    
    if(letra.equals("e")){
    
    JOptionPane.showMessageDialog(null, "La palabra posee 8 letras");
    palabra="elefante";
    
    }
    if(letra.equals("i")){
    JOptionPane.showMessageDialog(null, "La palabra posee 6 letras");
        palabra="iguana";
        
    }
    if(letra.equals("o")){
         JOptionPane.showMessageDialog(null, "La palabra posee 3 letras");
    palabra="oso";
   
    }
    if(letra.equals("u")){
         JOptionPane.showMessageDialog(null, "La palabra posee 4 letras");
    palabra="uron";
   
    }
        cont++;
        System.out.println(cont);
       
    }//GEN-LAST:event_btnGenLetActionPerformed

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
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable TablaPuntaje;
    private javax.swing.JButton btnGenLet;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField txtLetraGen;
    public static javax.swing.JTextField txtResp;
    // End of variables declaration//GEN-END:variables
}
