/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha.view;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Adrian Kauan
 */
public class JogoDaVelhaView extends JFrame{
    private JButton[][] botoes = new JButton[3][3];
    private JLabel labelStatus = new JLabel("Vez do Jogador X");

    public JogoDaVelhaView() {
        setTitle("Jogo da Velha - MVC");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelTabuleiro = new JPanel(new GridLayout(3, 3));
        Font fonte = new Font("Arial", Font.BOLD, 60);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botoes[i][j] = new JButton("");
                botoes[i][j].setFont(fonte);
                painelTabuleiro.add(botoes[i][j]);
            }
        }

        add(painelTabuleiro, BorderLayout.CENTER);
        labelStatus.setHorizontalAlignment(SwingConstants.CENTER);
        labelStatus.setFont(new Font("Arial", Font.BOLD, 18));
        add(labelStatus, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void adicionarListener(int linha, int coluna, ActionListener listener) {
        botoes[linha][coluna].addActionListener(listener);
    }

    public void atualizarBotao(int linha, int coluna, char simbolo) {
        botoes[linha][coluna].setText(String.valueOf(simbolo));
        botoes[linha][coluna].setEnabled(false);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

    public void atualizarStatus(String texto) {
        labelStatus.setText(texto);
    }

    public void resetarTabuleiro() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                botoes[i][j].setText("");
                botoes[i][j].setEnabled(true);
            }
        atualizarStatus("Vez do Jogador X");
    }
}
