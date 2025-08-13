/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogodavelha;

/**
 *
 * @author Adrian Kauan
 */

import jogodavelha.controller.JogoDaVelhaController;
   import jogodavelha.model.Tabuleiro;
import jogodavelha.view.JogoDaVelhaView;

public class Jogodavelha {
    public static void main(String[] args) {
       javax.swing.SwingUtilities.invokeLater(() -> {
            Tabuleiro model = new Tabuleiro();
            JogoDaVelhaView view = new JogoDaVelhaView();
            new JogoDaVelhaController(model, view);
        });
    }
    
}
