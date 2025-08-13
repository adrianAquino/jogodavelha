/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodavelha.model;

/**
 *
 * @author Adrian Kauan
 */
public class Tabuleiro {
    private char[][] tabuleiro;
    private char jogadorAtual;
    
    public Tabuleiro(){
        tabuleiro = new char[3][3];
        jogadorAtual = 'X';
        limpar();
    }
    
    public void limpar(){
     for(int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++){
          tabuleiro[i][j] = '-';   
         }
         
     }   
    }
    
    public boolean marcar(int linha, int coluna){
        if(tabuleiro[linha][coluna] == '-'){
            tabuleiro[linha][coluna]= jogadorAtual;
            return true;
        }
        return false;
    }
    
        public boolean venceu() {
        // Linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) ||
                (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)) {
                return true;
            }
        }

        // Diagonais
        return (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) ||
               (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual);
    }

    public boolean empate() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tabuleiro[i][j] == '-')
                    return false;
        return true;
    }

    public void alternarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    public char getJogadorAtual() {
        return jogadorAtual;
    }

    public char getPosicao(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }

    public void reiniciar() {
        limpar();
        jogadorAtual = 'X';
    }
    
}
