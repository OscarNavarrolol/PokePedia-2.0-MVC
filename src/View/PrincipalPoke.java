/*This class represents the main graphical interface for the Pokédex application. */

package View;
import Controller.*;
import Model.ApiConnector;
import Model.Pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.IntelliJTheme.*;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.Color;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PrincipalPoke extends javax.swing.JFrame {
    
    // Declare necessary class variables
    private PokemonController controller;
    private ApiConnector api; 
    public int currentPokemonIndex ;
    
    // Constructor initializing the UI components and default Pokemon details
    public PrincipalPoke() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        currentPokemonIndex = 1;
        api = new ApiConnector();
        String nameLabelText = nameLabel.getText();
        String typeLabelText = typeLabel.getText();
        String imgLabelText = imgLabel.getText();
        controller = new PokemonController(api, this, nameLabelText, typeLabelText, imgLabelText);

        // Load the information of the first Pokémon upon initializing the interface

        try {
            Pokemon firstPokemon = controller.showPokemonInfo(currentPokemonIndex); 
            displayPokemonInfo(firstPokemon); 
        } catch (MalformedURLException ex) {
            Logger.getLogger(PrincipalPoke.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }

    public void setController(PokemonController controller) {
        this.controller = controller;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btSearchName = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodePoke = new javax.swing.JTextField();
        btSearchByNumber = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btExit = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        btNext = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        panelRound1 = new View.PanelRound();
        abiliti1 = new javax.swing.JLabel();
        abiliti4 = new javax.swing.JLabel();
        abiliti2 = new javax.swing.JLabel();
        abiliti3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(63, 193, 224));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pokepedia Barata");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokeball 32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(299, 299, 299)
                .addComponent(jLabel4)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(63, 193, 224));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Search by name");

        btSearchName.setText("Search");
        btSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Search by number");

        btSearchByNumber.setText("Search");
        btSearchByNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchByNumberActionPerformed(evt);
            }
        });

        jLabel3.setText("© Copyright 2023");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodePoke)
                            .addComponent(txtName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSearchByNumber)
                                    .addComponent(jLabel3))
                                .addGap(63, 63, 63))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btSearchName)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSearchName)
                .addGap(98, 98, 98)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodePoke, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSearchByNumber)
                .addGap(88, 88, 88)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        typeLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        typeLabel.setText("jLabel6");

        nameLabel.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        nameLabel.setText("jLabel7");

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));
        jPanel5.add(imgLabel);

        btNext.setText("Next");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(63, 193, 224));
        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        abiliti1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        abiliti1.setText("jLabel6");

        abiliti4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        abiliti4.setText("jLabel9");

        abiliti2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        abiliti2.setText("jLabel7");

        abiliti3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        abiliti3.setText("jLabel8");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abiliti1)
                    .addComponent(abiliti3))
                .addGap(127, 127, 127)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abiliti4)
                    .addComponent(abiliti2))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abiliti1)
                    .addComponent(abiliti2))
                .addGap(26, 26, 26)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abiliti3)
                    .addComponent(abiliti4))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325)
                        .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(406, 406, 406)
                                .addComponent(nameLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(typeLabel)
                                .addGap(245, 245, 245)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(typeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Method handling the "Exit" button click event
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        JOptionPane.showMessageDialog(null, "Thank you for using my program :)");
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed
    
    // Retrieve the entered name and search for a Pokémon by that name
    private void btSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchNameActionPerformed
        String name = txtName.getText();
        try {
            controller.searchPokemonByName(name);
            
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Invalid URL", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PrincipalPoke.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btSearchNameActionPerformed
    
    // Retrieve the entered code and search for a Pokémon by that code
    private void btSearchByNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchByNumberActionPerformed
   
        try {
        int code = Integer.parseInt(txtCodePoke.getText());
        if (code >= 1 && code <= 898) {
//        controller.searchCodePoke(code);
        currentPokemonIndex = code;
        Pokemon pokemonMoment = controller.showPokemonInfo(code);
        displayPokemonInfo(pokemonMoment); 
           }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PrincipalPoke.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Invalid URL", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PrincipalPoke.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btSearchByNumberActionPerformed
    
    // Display the details of the next Pokémon
    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        try {
            currentPokemonIndex += 1;
            Pokemon pokemonMoment = controller.showPokemonInfo(currentPokemonIndex);
            displayPokemonInfo(pokemonMoment);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Invalid URL", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PrincipalPoke.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btNextActionPerformed

    // Display the details of the previous Pokémon
    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
         try {
            currentPokemonIndex -= 1;
            Pokemon pokemonMoment = controller.showPokemonInfo(currentPokemonIndex);
            displayPokemonInfo(pokemonMoment);
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Invalid URL", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PrincipalPoke.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBackActionPerformed
    
    // Method to display information of the provided Pokémon on the UI
    public void displayPokemonInfo(Pokemon pokemon) {
        nameLabel.setText("Name: " + pokemon.getName());

    List<String> types = pokemon.getTypes();
    List<String> abilities = pokemon.getAbilities();

    // Display abilities
    for (int i = 0; i < 4; i++) {
        String abilityText = (i < abilities.size()) ? abilities.get(i) : "-";
        String label = "Ability " + (i + 1) + ": " + abilityText;
        switch (i) {
            case 0:
                abiliti1.setText(label);
                break;
            case 1:
                abiliti2.setText(label);
                break;
            case 2:
                abiliti3.setText(label);
                break;
            case 3:
                abiliti4.setText(label);
                break;
        }
        if (i < abilities.size()) {
            System.out.println(label);
        } else {
            System.out.println("no " + (i + 1));
        }
    }

    // Display types
    if (!types.isEmpty()) {
        StringBuilder typeText = new StringBuilder("Type" + (types.size() > 1 ? "s" : "") + ": ");
        for (int i = 0; i < types.size(); i++) {
            typeText.append(types.get(i));
            if (i < types.size() - 1) {
                typeText.append(", ");
            }
        }
        typeLabel.setText(typeText.toString());

        if (types.size() == 1) {
            typeLabel.setForeground(controller.getColorForType(types.get(0)));
        } else if (types.size() == 2) {
            Color color1 = controller.getColorForType(types.get(0));
            Color color2 = controller.getColorForType(types.get(1));
            int red = (color1.getRed() + color2.getRed()) / 2;
            int green = (color1.getGreen() + color2.getGreen()) / 2;
            int blue = (color1.getBlue() + color2.getBlue()) / 2;
            typeLabel.setForeground(new Color(red, green, blue));
        }
    }

    // Display Pokémon image
    Image pokemonImage = pokemon.getPokemonImage();
    imgLabel.setIcon(new ImageIcon(pokemonImage));
    }

    public static void main(String args[]) {
        
        FlatLightFlatIJTheme.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalPoke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abiliti1;
    private javax.swing.JLabel abiliti2;
    private javax.swing.JLabel abiliti3;
    private javax.swing.JLabel abiliti4;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btSearchByNumber;
    private javax.swing.JButton btSearchName;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nameLabel;
    private View.PanelRound panelRound1;
    private javax.swing.JTextField txtCodePoke;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
