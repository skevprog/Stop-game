/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stop.Game;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;

/**
 *
 * @author Kevin
 */
public class Vista2 extends javax.swing.JFrame implements ActionListener{

    public static String letra;
    public static String palabra;
    public static Integer p = 3;
    public static int cont;
    public static int n;
    public static int s;

    /*Se instancia la clase timer que creara el cronometro*/
     Timer tm=new Timer(1000, this);       
    int time = 0;
    
    DefaultTableModel datos = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    DefaultTableModel puntaje = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    };

    /*METODO CONSTRUCTOR*/
    public Vista2() {
        initComponents();
        TablaDatos.setModel(datos);
        datos.addColumn("Letra");
        datos.addColumn("Palabra");
        datos.addColumn("Tiempo transcurrido");
        TablaPuntaje.setModel(puntaje);
        puntaje.addColumn("Puntaje");
        cont = 1;
        btnStop.setEnabled(false);
        this.setLocationRelativeTo(null);                           //Panel en el medio de la pantalla
        txtResp.setEditable(false);
        s = 5;                                                       //Vidas
       
        JOptionPane.showMessageDialog(null, "Bienvenido a Stop!"); //Mensaje bienvenida
        JOptionPane.showMessageDialog(null, "Instrucciones \n 1-Para comenzar a jugar se debe apretar el botón 'Generar Letra'"
                + " el cual generara la letra con la que tiene que comenzar la palabra que se ingrese. " + "\n 2-Al instante se "
                + " otorgará una pista al jugador para que adivine la palabra que debe ingresar." + " \n 3-Se poseen 5 oportunidades que iran disminuyendo a medida que se ingrese una palabra erronea."
                + " \n 4-Posee 20 segundos por ronda para acertar sino terminara el juego."
                + "\n 5-Una vez ingresada la palabra se debe proceder a apretar el boton " + " 'parar' " + " para que se valide el ingreso."
                + "\n \t Buena Suerte!");
        JOptionPane.showMessageDialog(null, "Nivel 1 \n Animales " + "\n(nombre de animales)");
        jTime.setEditable(false);
        txtLetraGen.setEditable(false);
        jTextBox.setEditable(false);
        
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
        jTime = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextBox = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stop");

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
                return false;
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
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaPuntaje);

        jTextBox.setColumns(20);
        jTextBox.setRows(5);
        jScrollPane3.setViewportView(jTextBox);

        jLabel3.setText("Tiempo");

        jLabel4.setText("Nivel 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(20, 20, 20))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenLet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnStop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenLet)
                            .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
         
        Object[] Datos = new Object[5];
        Datos[0] = letra;
        Datos[1] = palabra;
        Datos[2] = (time+" segundos");

        /*Vector para la tabla de puntajes*/
        Integer[] punt = new Integer[5];
        punt[0] = p;

        /*Se coloca puntaje si la palabra es correcta o no*/
        String Ingreso = txtResp.getText().toLowerCase().trim();
        
        /*Control de ingreso*/
        if (Ingreso.equals(palabra)) {
            tm.stop();          //se detiene el tiempo
            p = 3;
            JOptionPane.showMessageDialog(null, "Correcto!");
            datos.addRow(Datos);
            puntaje.addRow(punt);
            btnStop.setEnabled(false);
            btnGenLet.setEnabled(true);
            txtLetraGen.setText("");
            txtResp.setEditable(false);
            jTextBox.setText("");
            
            time=0;             //se reinicia a 0
        } else {
            s--;         //Se restan las vidas
            p--;         //se resta puntaje cada vez que vuelve a intentarlo
            JOptionPane.showMessageDialog(null, " Incorrecto \n Intente nuevamente le quedan " + s + " intento/s");
            //System.out.println("s=" + s);         //traza para evaluar el valor de s
            
            if (s == 0) {
                JOptionPane.showMessageDialog(null, "Game Over");
                System.exit(0);
            }
        }
        /*Ultima Ronda*/
        if(cont==6){
            Integer s = 0;
                System.out.println("Partida Finalizada");
                

                int limite = puntaje.getRowCount();

                
                for (int i = 0; i < limite; i++) {                          //Ciclo for suma el puntaje que se encuentra en la tabla puntaje
                    s = s + (Integer) puntaje.getValueAt(i, 0);
                }

                JOptionPane.showMessageDialog(null, "Su puntaje es de: " + s + "puntos");
                if (s >= 12) {
                    JOptionPane.showMessageDialog(null, "Felicitaciones Nivel 2 habilitado");
                    btnStop.setEnabled(false);
                    btnGenLet.setEnabled(false);
                    

                } else {
                    JOptionPane.showMessageDialog(null, "Game Over");
                    System.exit(0);
                }
        }

        /*Se reinicia el campo de texto y queda en blanco*/
        txtResp.setText("");
        //System.out.println(cont);   //traza para ver el valor de la variable cont
        jTime.setText("");

    }//GEN-LAST:event_btnStopActionPerformed

    private void txtRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespActionPerformed

    }//GEN-LAST:event_txtRespActionPerformed

    /*Metodo que sumara el tiempo del timer*/
    public void logic(){
    time++;
    jTime.setText(""+time);         //Muestra el tiempo transcurrido en el text field
    if(time==20){
        JOptionPane.showMessageDialog(null, "Game Over");
        System.exit(0);
    }
}

    
    /*Sobreescritura del metodo actionPerformed(Controlara el timer)*/
    
    @Override               
    public void actionPerformed(ActionEvent e) {
        logic();
    }
    
    
    private void btnGenLetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenLetActionPerformed
        btnStop.setEnabled(true);
        btnGenLet.setEnabled(false);
        txtResp.setEditable(true);

        /*Dependiendo la ronda se indicara una letra*/
        switch (cont) {
            case 1:
                letra = "e";

                break;
            case 2:
                letra = "a";

                break;
            case 3:
                letra = "s";

                break;
            case 4:
                letra = "g";

                break;
            case 5:
                letra = "c";

                break;
            default:
                break;
        }

        JOptionPane.showMessageDialog(null, "La letra generada para esta ronda es: " + letra);     //Mostrar la letra en una ventana                                                   //Pasaje de char a String
        txtLetraGen.setText(letra);                                                                 //Colocar la letra generada en un cuadro para recordar
        txtLetraGen.setEditable(false);

        /*Generar palabra dependiendo de la letra que se cree*/
        if (letra.equals("a")) {
            JOptionPane.showMessageDialog(null, "De celda en celda voy \n pero presa no estoy.");           //Abeja
            jTextBox.setText("De celda en celda voy \n pero presa no estoy.");
            palabra = "abeja";

        }

        if (letra.equals("e")) {

            JOptionPane.showMessageDialog(null, "La palabra posee 8 letras");       //Elefante
            jTextBox.setText("La palabra posee 8 letras");
            palabra = "elefante";

        }
        if (letra.equals("c")) {
            JOptionPane.showMessageDialog(null, "¿Que animal tiene cara de verdura?");  //Cara-col
            jTextBox.setText("¿Que animal tiene cara de verdura?");
            palabra = "caracol";

        }
        if (letra.equals("g")) {
            JOptionPane.showMessageDialog(null, "¿Cuál es el animal que es dos veces animal?");         //gato por es gato y araña
            jTextBox.setText("¿Cuál es el animal que es dos veces animal?");
            palabra = "gato";

        }
        if (letra.equals("s")) {
            JOptionPane.showMessageDialog(null, "La cantidad de letras de la palabra es igual a la siguiente cuenta: \n ((3x6)+(8/2))-13");         //serpiente
            jTextBox.setText("La cantidad de letras de la palabra es igual a la siguiente cuenta: \n ((3x6)+(8/2))-13");
            palabra = "serpiente";

        }

        cont++;
        //System.out.println(cont);         //Traza para evaluar codigo

        tm.start();         //Se inicia el cronometro
    }//GEN-LAST:event_btnGenLetActionPerformed

    private void txtLetraGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetraGenActionPerformed

    }//GEN-LAST:event_txtLetraGenActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextBox;
    private javax.swing.JTextField jTime;
    public static javax.swing.JTextField txtLetraGen;
    public static javax.swing.JTextField txtResp;
    // End of variables declaration//GEN-END:variables
}