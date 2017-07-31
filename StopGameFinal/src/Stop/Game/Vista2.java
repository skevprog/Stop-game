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
        this.setResizable(false);
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
        s=Vista.s;
        
        JOptionPane.showMessageDialog(null, "<html><font face='Arial' size= 11> Nivel 2 \n Objetos " + "\n(nombre de objetos)");
        jTime.setEditable(false);
        txtLetraGen.setEditable(false);
        jTextBox.setEditable(false);
        jtxtvida.setEditable(false);
        jtxtvida.setText(String.valueOf(s));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPuntaje = new javax.swing.JTable();
        jTime = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextBox = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jtxtvida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();
        btnGenLet = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtResp = new javax.swing.JTextField();
        txtLetraGen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

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

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextBox.setColumns(20);
        jTextBox.setRows(5);
        jScrollPane3.setViewportView(jTextBox);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jLabel3.setText("Tiempo");

        jLabel4.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jLabel4.setText("Vidas");

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

        jLabel6.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jLabel6.setText("Objeto");

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

        jLabel2.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jLabel5.setText("Pista");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Stop");

        jLabel7.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NIVEL 2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtvida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(141, 141, 141))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenLet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 11, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtvida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStop)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGenLet)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtLetraGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            jtxtvida.setText(String.valueOf(s));    //Para mostrar los intentos en la pantalla
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
                    jtxtvida.setText("");

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
                letra = "r";

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
            //JOptionPane.showMessageDialog(null, "De celda en celda voy \n pero presa no estoy.");           //Abeja
            jTextBox.setText("");
            palabra = "abeja";

        }

        if (letra.equals("r")) {

            //JOptionPane.showMessageDialog(null, "La palabra posee 8 letras");       //reloj
            jTextBox.setText("Tiene agujas y no cose, "
                           + "\nnose mueve, pero anda, "
                           + "\nsi le das cuerda funciona y "
                            +"\nel paso del tiempo señala.");
            palabra = "reloj";

        }
        if (letra.equals("c")) {
            //JOptionPane.showMessageDialog(null, "¿Que animal tiene cara de verdura?");  //Cara-col
            jTextBox.setText("¿Que animal tiene cara de verdura?");
            palabra = "caracol";

        }
        if (letra.equals("g")) {
            //JOptionPane.showMessageDialog(null, "¿Cuál es el animal que es dos veces animal?");         //gato por es gato y araña
            jTextBox.setText("¿Cuál es el animal que es dos veces \n animal?");
            palabra = "gato";

        }
        if (letra.equals("s")) {
            //JOptionPane.showMessageDialog(null, "La cantidad de letras de la palabra es igual a la siguiente cuenta: \n ((3x6)+(8/2))-13");         //serpiente
            jTextBox.setText("La cantidad de letras de la palabra es \n igual a la siguiente cuenta: \n ((3x6)+(8/2))-13");
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
                new Vista2().setVisible(true);

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
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextBox;
    private javax.swing.JTextField jTime;
    private javax.swing.JTextField jtxtvida;
    public static javax.swing.JTextField txtLetraGen;
    public static javax.swing.JTextField txtResp;
    // End of variables declaration//GEN-END:variables
}
