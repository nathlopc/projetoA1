/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd_aula09_geral.view;

import java.awt.Color;

/**
 *
 * @author abdiel.cordeiro
 */
public class ControleHome extends javax.swing.JFrame {

    private static String controleSmart;
    private static String tempVol;
    private static int valor = 10;

    /**
     * Creates new form ControleHome
     */
    public ControleHome() {
        initComponents();
    }

    public void alteraCorBotao(String nome) {
        if (nome != null) {
            switch (nome) {
                case "aquecedor":
                    this.aquecedorAgua.setBackground(new java.awt.Color(0, 204, 255));
                    controleSmart = null;
                    break;
                case "Tv":
                    this.televisao.setBackground(new java.awt.Color(0, 204, 255));
                    controleSmart = null;
                    break;
                case "porta":
                    this.porta.setBackground(new java.awt.Color(0, 204, 255));
                    controleSmart = null;
                    break;
                case "luz":
                    this.luz.setBackground(new java.awt.Color(0, 204, 255));
                    controleSmart = null;
                    break;
                case "arCondicionado":
                    this.arCondicionado.setBackground(new java.awt.Color(0, 204, 255));
                    controleSmart = null;
                    break;
                case "volume":
                    this.volume.setBackground(new java.awt.Color(0, 204, 255));
                    tempVol = null;
                    break;
                case "temperatura":
                    this.temperatura.setBackground(new java.awt.Color(0, 204, 255));
                    tempVol = null;
                    break;
            }
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

        jLabel1 = new javax.swing.JLabel();
        luz = new javax.swing.JButton();
        arCondicionado = new javax.swing.JButton();
        porta = new javax.swing.JButton();
        televisao = new javax.swing.JButton();
        aquecedorAgua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        temperatura = new javax.swing.JButton();
        volume = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        bntAdd = new javax.swing.JButton();
        bntSub = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle da Smart Home");

        luz.setBackground(new java.awt.Color(0, 204, 255));
        luz.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        luz.setIcon(new javax.swing.ImageIcon("C:\\Users\\abdiel.cordeiro\\Documents\\NetBeansProjects\\projetoA1\\SD_Aula09_Control\\src\\sd_aula09_assets\\Imagem\\smart-light.png")); // NOI18N
        luz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luzActionPerformed(evt);
            }
        });

        arCondicionado.setBackground(new java.awt.Color(0, 204, 255));
        arCondicionado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        arCondicionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/air-conditioner.png"))); // NOI18N
        arCondicionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arCondicionadoActionPerformed(evt);
            }
        });

        porta.setBackground(new java.awt.Color(0, 204, 255));
        porta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        porta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/knob.png"))); // NOI18N
        porta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portaActionPerformed(evt);
            }
        });

        televisao.setBackground(new java.awt.Color(0, 204, 255));
        televisao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        televisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/smart-tv.png"))); // NOI18N
        televisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                televisaoActionPerformed(evt);
            }
        });

        aquecedorAgua.setBackground(new java.awt.Color(0, 204, 255));
        aquecedorAgua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        aquecedorAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/water-heater.png"))); // NOI18N
        aquecedorAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquecedorAguaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/stand-by.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        temperatura.setBackground(new java.awt.Color(0, 204, 255));
        temperatura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        temperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/thermometer.png"))); // NOI18N
        temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturaActionPerformed(evt);
            }
        });

        volume.setBackground(new java.awt.Color(0, 204, 255));
        volume.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/speaker.png"))); // NOI18N
        volume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumeActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("2");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("1");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("3");

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("5");

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("7");

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("4");

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("6");

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setText("0");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton12.setText("9");

        bntAdd.setBackground(new java.awt.Color(0, 204, 255));
        bntAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/add.png"))); // NOI18N
        bntAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddActionPerformed(evt);
            }
        });

        bntSub.setBackground(new java.awt.Color(0, 204, 255));
        bntSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/minus.png"))); // NOI18N
        bntSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSubActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton15.setText("8");

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sd_aula09_assets/Imagem/plane.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(aquecedorAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(volume, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(porta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(luz, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(49, 49, 49)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(televisao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(arCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bntAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(bntSub, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(luz)
                    .addComponent(arCondicionado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porta)
                    .addComponent(televisao))
                .addGap(18, 18, 18)
                .addComponent(aquecedorAgua)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(temperatura)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntSub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volume)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void luzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luzActionPerformed

        if (controleSmart != null) {
            alteraCorBotao(this.controleSmart);
        }
        if (controleSmart == null) {
            this.controleSmart = "luz";
            this.luz.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_luzActionPerformed

    private void arCondicionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arCondicionadoActionPerformed

        if (controleSmart != null) {
            alteraCorBotao(this.controleSmart);
        }
        if (controleSmart == null) {
            this.controleSmart = "arCondicionado";
            this.arCondicionado.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_arCondicionadoActionPerformed

    private void portaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portaActionPerformed

        if (controleSmart != null) {
            alteraCorBotao(this.controleSmart);
        }
        if (controleSmart == null) {
            this.controleSmart = "porta";
            this.porta.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_portaActionPerformed

    private void televisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_televisaoActionPerformed

        if (controleSmart != null) {
            alteraCorBotao(this.controleSmart);
        }
        if (controleSmart == null) {
            this.controleSmart = "Tv";
            this.televisao.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_televisaoActionPerformed

    private void aquecedorAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquecedorAguaActionPerformed

        if (controleSmart != null) {
            alteraCorBotao(this.controleSmart);
        }
        if (controleSmart == null) {
            this.controleSmart = "aquecedor";
            this.aquecedorAgua.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_aquecedorAguaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (this.controleSmart != null) {
            System.out.println("Smart ligado: " + this.controleSmart);
            alteraCorBotao(this.controleSmart);
            this.controleSmart = null;
        } else {
            System.out.println("Não foi selecionado um Smart");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddActionPerformed
        this.bntSub.setBackground(new java.awt.Color(0, 204, 255));
        this.bntAdd.setBackground(Color.yellow);
        this.valor += 1;
    }//GEN-LAST:event_bntAddActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void bntSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSubActionPerformed
        this.bntAdd.setBackground(new java.awt.Color(0, 204, 255));
        this.bntSub.setBackground(Color.yellow);
        this.valor -= 1;
    }//GEN-LAST:event_bntSubActionPerformed

    private void volumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeActionPerformed

        if (tempVol != null) {
            alteraCorBotao(this.tempVol);
        }
        if (tempVol == null) {
            this.tempVol = "volume";
            this.volume.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_volumeActionPerformed

    private void temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturaActionPerformed

        if (tempVol != null) {
            alteraCorBotao(this.tempVol);
        }
        if (tempVol == null) {
            this.tempVol = "temperatura";
            this.temperatura.setBackground(Color.yellow);
        }
    }//GEN-LAST:event_temperaturaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (this.controleSmart != null) {
            switch (controleSmart) {
                case "luz":
                    if (tempVol != null && tempVol == "temperatura") {
                        System.out.println("");
                        System.out.println("Enviado com sucesso luz e intensidade");
                        System.out.println("Intensidade: " + valor);
                        System.out.println("");
                    } else {
                        System.out.println("Não foi selecionado uma intensidade!!!");
                    }
                    break;
                case "Tv":
                    if (tempVol != null && tempVol == "volume") {
                        System.out.println("");
                        System.out.println("Foi alterado canal com sucesso e volume aumentado");
                        System.out.println("Volume: " + valor);
                        System.out.println("");
                    } else {
                        System.out.println("Não foi selecionado um volume!!!");
                    }
                    break;
                case "arCondicionado":
                    if (tempVol != null && tempVol == "temperatura") {
                        System.out.println("");
                        System.out.println("Alterado com sucesso temperatura do ar!!!");
                        System.out.println("Temperatura: " + valor);
                        System.out.println("");
                    } else {
                        System.out.println("Não selecionado uma temperatura para o ar!!!");
                    }
                    break;
                case "aquecedor":
                    if (tempVol != null && tempVol == "temperatura") {
                        System.out.println("");
                        System.out.println("Temperatura do aquecedor alterada com sucesso!!!");
                        System.out.println("Temperatura: " + valor);
                        System.out.println("");
                    } else {
                        System.out.println("Não foi selecionado a temperatura do aquecedor!!!");
                    }
                    break;
                case "porta":
                    System.out.println("Não é possivel enviar nada da porta apenas abrir!!!");
                    break;
            }
            
            alteraCorBotao(this.tempVol);
            alteraCorBotao(this.controleSmart);
            this.valor = 10;
            this.bntAdd.setBackground(new java.awt.Color(0, 204, 255));
            this.bntSub.setBackground(new java.awt.Color(0, 204, 255));
            System.out.println("Abdiel é um lindo!!!");
            System.out.println("Rafa viado");
        } else {
            System.out.println("Não foi selecionado uma Smart!!!");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ControleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aquecedorAgua;
    private javax.swing.JButton arCondicionado;
    private javax.swing.JButton bntAdd;
    private javax.swing.JButton bntSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton luz;
    private javax.swing.JButton porta;
    private javax.swing.JButton televisao;
    private javax.swing.JButton temperatura;
    private javax.swing.JButton volume;
    // End of variables declaration//GEN-END:variables
}
