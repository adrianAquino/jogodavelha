/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha.controller;

/**
 *
 * @author Adrian Kauan
 */

import jogodavelha.model.Tabuleiro;
import jogodavelha.view.JogoDaVelhaView;

public class JogoDaVelhaController {
    
    private Tabuleiro model;
    private JogoDaVelhaView view;

    public JogoDaVelhaController(Tabuleiro model, JogoDaVelhaView view) {
        this.model = model;
        this.view = view;

        configurarEventos();
    }

    private void configurarEventos() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int linha = i;
                final int coluna = j;
                view.adicionarListener(linha, coluna, e -> realizarJogada(linha, coluna));
            }
        }
    }

    private void realizarJogada(int linha, int coluna) {
        if (model.marcar(linha, coluna)) {
            char jogador = model.getJogadorAtual();
            view.atualizarBotao(linha, coluna, jogador);

            if (model.venceu()) {
                view.mostrarMensagem("Jogador " + jogador + " venceu!");
                model.reiniciar();
                view.resetarTabuleiro();
            } else if (model.empate()) {
                view.mostrarMensagem("Empate!");
                model.reiniciar();
                view.resetarTabuleiro();
            } else {
                model.alternarJogador();
                view.atualizarStatus("Vez do Jogador " + model.getJogadorAtual());
            }
        }
    }
}
