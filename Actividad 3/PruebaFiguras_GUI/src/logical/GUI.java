/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logical;

/**
 *
 * @author julil
 */

import java.text.DecimalFormat;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textRCirculo = new javax.swing.JTextField();
        buttonBCirculo = new javax.swing.JButton();
        buttonCCircuilo = new javax.swing.JButton();
        textPCirculo = new javax.swing.JTextField();
        textACirculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textLCuadrado = new javax.swing.JTextField();
        buttonCCuadrado = new javax.swing.JButton();
        textPCuadrado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textACuadrado = new javax.swing.JTextField();
        buttonBCuadrado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textBRectangulo = new javax.swing.JTextField();
        buttonCReactangulo = new javax.swing.JButton();
        textPRectangulo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textARectangulo = new javax.swing.JTextField();
        buttonBoRectangulo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        textAltRectangulo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textBTriangulo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        textAltTriangulo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        buttonCTriangulo = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        textPTriangulo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        textATriangulo = new javax.swing.JTextField();
        buttonBoTriangulo = new javax.swing.JButton();
        textTipoTriangulo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Circulo");

        jLabel2.setText("Radio:");

        textRCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRCirculoActionPerformed(evt);
            }
        });

        buttonBCirculo.setText("Borrar");
        buttonBCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBCirculoActionPerformed(evt);
            }
        });

        buttonCCircuilo.setText("Calcular");
        buttonCCircuilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCCircuiloActionPerformed(evt);
            }
        });

        jLabel3.setText("Perimetro:");

        jLabel4.setText("Area:");

        jLabel5.setText("Cuadrado");

        jLabel6.setText("Lado:");

        textLCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLCuadradoActionPerformed(evt);
            }
        });

        buttonCCuadrado.setText("Calcular");
        buttonCCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCCuadradoActionPerformed(evt);
            }
        });

        jLabel7.setText("Perimetro:");

        jLabel8.setText("Area:");

        buttonBCuadrado.setText("Borrar");
        buttonBCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBCuadradoActionPerformed(evt);
            }
        });

        jLabel9.setText("Rectangulo");

        jLabel10.setText("Base:");

        textBRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBRectanguloActionPerformed(evt);
            }
        });

        buttonCReactangulo.setText("Calcular");
        buttonCReactangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCReactanguloActionPerformed(evt);
            }
        });

        jLabel11.setText("Perimetro:");

        jLabel12.setText("Area:");

        buttonBoRectangulo.setText("Borrar");
        buttonBoRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBoRectanguloActionPerformed(evt);
            }
        });

        jLabel13.setText("Altura:");

        textAltRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAltRectanguloActionPerformed(evt);
            }
        });

        jLabel14.setText("Base:");

        textBTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBTrianguloActionPerformed(evt);
            }
        });

        jLabel15.setText("Altura:");

        textAltTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAltTrianguloActionPerformed(evt);
            }
        });

        jLabel16.setText("Triangulo");

        buttonCTriangulo.setText("Calcular");
        buttonCTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCTrianguloActionPerformed(evt);
            }
        });

        jLabel17.setText("Perimetro:");

        jLabel18.setText("Area:");

        buttonBoTriangulo.setText("Borrar");
        buttonBoTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBoTrianguloActionPerformed(evt);
            }
        });

        jLabel19.setText("Tipo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(82, 82, 82))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonCCircuilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonBCirculo)
                                    .addComponent(jLabel1)
                                    .addComponent(textRCirculo)
                                    .addComponent(textPCirculo)
                                    .addComponent(textACirculo))))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonCCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(buttonBCuadrado)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16))
                            .addComponent(textLCuadrado)
                            .addComponent(textPCuadrado)
                            .addComponent(textACuadrado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonBoRectangulo)
                                    .addComponent(buttonCReactangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textPRectangulo)
                                    .addComponent(textARectangulo)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textBRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAltRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel9)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textAltTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(buttonBoTriangulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textPTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonCTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textATriangulo))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textRCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCCircuilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textACirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonBCirculo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textLCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCCuadrado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(textBRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(textAltRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCReactangulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(textPRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textACuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(textARectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBCuadrado)
                            .addComponent(buttonBoRectangulo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(textBTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(textAltTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(buttonCTriangulo)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textATriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(textPTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(textTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(buttonBoTriangulo)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textRCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRCirculoActionPerformed

    private void textLCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLCuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLCuadradoActionPerformed

    private void textBRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBRectanguloActionPerformed

    private void textAltRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAltRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAltRectanguloActionPerformed

    private void textBTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBTrianguloActionPerformed

    private void textAltTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAltTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAltTrianguloActionPerformed

    private void buttonCCircuiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCCircuiloActionPerformed
        //Creacion de clase para mostrar dos cifras decimas
        DecimalFormat df = new DecimalFormat("#.##");        
        //Leemos los valores por las bandejas de textos
        int radio = Integer.parseInt(textRCirculo.getText());
        //Creamos el objeto
        Circulo circulo_1 = new Circulo(radio);
        //Mostramos el resultado por la bandeja respectiva de texto
        textACirculo.setText(df.format(circulo_1.calcularArea()));
        textPCirculo.setText(df.format(circulo_1.calcularPerimetro()));
    }//GEN-LAST:event_buttonCCircuiloActionPerformed

    private void buttonBCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBCirculoActionPerformed
        textACirculo.setText("");
        textPCirculo.setText("");
    }//GEN-LAST:event_buttonBCirculoActionPerformed

    private void buttonCCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCCuadradoActionPerformed
        //Creacion de clase para mostrar dos cifras decimas
        DecimalFormat df = new DecimalFormat("#.##");        
        //Leemos los valores por las bandejas de textos
        int lado = Integer.parseInt(textLCuadrado.getText());
        //Creamos el objeto
        Cuadrado cuadrado_1 = new Cuadrado(lado);
        //Mostramos el resultado por la bandeja respectiva de texto
        textACuadrado.setText(df.format(cuadrado_1.calcularArea()));
        textPCuadrado.setText(df.format(cuadrado_1.calcularPerimetro()));
    }//GEN-LAST:event_buttonCCuadradoActionPerformed

    private void buttonBCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBCuadradoActionPerformed
        textACuadrado.setText("");
        textPCuadrado.setText("");
    }//GEN-LAST:event_buttonBCuadradoActionPerformed

    private void buttonCReactanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCReactanguloActionPerformed
         //Creacion de clase para mostrar dos cifras decimas
        DecimalFormat df = new DecimalFormat("#.##");        
        //Leemos los valores por las bandejas de textos
        int base = Integer.parseInt(textBRectangulo.getText());
        int altura = Integer.parseInt(textAltRectangulo.getText());
        //Creamos el objeto
        Rectangulo Rectangulo_1 = new Rectangulo(base, altura);
        //Mostramos el resultado por la bandeja respectiva de texto
        textARectangulo.setText(df.format(Rectangulo_1.calcularArea()));
        textPRectangulo.setText(df.format(Rectangulo_1.calcularPerimetro()));
    }//GEN-LAST:event_buttonCReactanguloActionPerformed

    private void buttonBoRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBoRectanguloActionPerformed
        textARectangulo.setText("");
        textPRectangulo.setText("");
    }//GEN-LAST:event_buttonBoRectanguloActionPerformed

    private void buttonCTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCTrianguloActionPerformed
         //Creacion de clase para mostrar dos cifras decimas
        DecimalFormat df = new DecimalFormat("#.##");        
        //Leemos los valores por las bandejas de textos
        int base = Integer.parseInt(textBTriangulo.getText());
        int altura = Integer.parseInt(textAltTriangulo.getText());
        //Creamos el objeto
        TrianguloRectangulo Triangulo_1 = new TrianguloRectangulo(base, altura);
        //Mostramos el resultado por la bandeja respectiva de texto
        textATriangulo.setText(df.format(Triangulo_1.calcularArea()));
        textPTriangulo.setText(df.format(Triangulo_1.calcularPerimetro()));
        String mensaje;
        switch(Triangulo_1.determinarTipoTriangulo()){
            case 0:
            {   mensaje = "Es un triángulo equilátero";   
                break;
            }
            case 1:
            {
                mensaje = "Es un triángulo escaleno";
                break;
            }
            case 2:
            {
                mensaje = "Es un triángulo isósceles";
                break;
            }
            default: { throw new AssertionError(); }
        }
        textTipoTriangulo.setText(mensaje);
    }//GEN-LAST:event_buttonCTrianguloActionPerformed

    private void buttonBoTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBoTrianguloActionPerformed
        textATriangulo.setText("");
        textPTriangulo.setText("");
        textTipoTriangulo.setText("");
    }//GEN-LAST:event_buttonBoTrianguloActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBCirculo;
    private javax.swing.JButton buttonBCuadrado;
    private javax.swing.JButton buttonBoRectangulo;
    private javax.swing.JButton buttonBoTriangulo;
    private javax.swing.JButton buttonCCircuilo;
    private javax.swing.JButton buttonCCuadrado;
    private javax.swing.JButton buttonCReactangulo;
    private javax.swing.JButton buttonCTriangulo;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textACirculo;
    private javax.swing.JTextField textACuadrado;
    private javax.swing.JTextField textARectangulo;
    private javax.swing.JTextField textATriangulo;
    private javax.swing.JTextField textAltRectangulo;
    private javax.swing.JTextField textAltTriangulo;
    private javax.swing.JTextField textBRectangulo;
    private javax.swing.JTextField textBTriangulo;
    private javax.swing.JTextField textLCuadrado;
    private javax.swing.JTextField textPCirculo;
    private javax.swing.JTextField textPCuadrado;
    private javax.swing.JTextField textPRectangulo;
    private javax.swing.JTextField textPTriangulo;
    private javax.swing.JTextField textRCirculo;
    private javax.swing.JTextField textTipoTriangulo;
    // End of variables declaration//GEN-END:variables
}