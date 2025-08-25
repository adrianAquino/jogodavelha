Trabalho de Linguagem de Programação II do curso de Análise e Desenvolvimento de Sistemas do IFPR Campus Umuarama. 
Objetivo era criar um jogo da velha orientado a objeto com Java. 
Para este projeto foi implementada o padrão de arquitetura MVC (Model-View-Controller), que é um padrão de arquitetura de software que divide uma aplicação em três componentes interligados para organizar 
o código, melhorar a manutenção, a reutilização e o trabalho em equipa. O Model gere a lógica de negócio e os dados; a View apresenta esses dados ao utilizador; e o Controller atua como um intermediário, 
recebendo as entradas do utilizador e direcionando-as para o Model e a View.

Neste caso, o MODEL  é responsável pela LÓGICA DO JOGO
o Arquivo: Tabuleiro.java
Responsabilidades:
- Controlar o tabuleiro
- Verificar vitória e empate
- Alternar jogadores

Lógica usada:
Um array char[][] tabuleiro de 3x3 representa as casas.
As casas são preenchidas com 'X', 'O' ou '-' (vazio).
Métodos como marcar(), venceu(), empate() e alternarJogador() definem as regras do jogo.

O VIEW, é reponsável pela INTERFACE COM O USUÁRIO (GUI)
Arquivo: JogoDaVelhaView.java

Responsabilidades:
- Mostrar os botões (casas do tabuleiro)
- Exibir o status (quem joga)
- Mostrar mensagens (vitória/empate)

Lógica usada:
Uma matriz de JButton[][] representa as casas clicáveis.
JLabel mostra o jogador atual.
Usa JOptionPane para exibir o resultado final.
Tem métodos como atualizarBotao() e resetarTabuleiro().

E por último o CONTROLLER, responsável pela CONEXÃO ENTRE VIEW E MODEL
Arquivo: JogoDaVelhaController.java

Responsabilidades:
- Responder ao clique do jogador
- Atualizar o modelo (marcar casa, verificar vitória)
- Atualizar a tela com o novo estado

Lógica usada:
Usa addActionListener() para capturar cliques nos botões.
Quando um botão é clicado:
Marca a casa no modelo
Atualiza a interface
Verifica vitória ou empate
Alterna o jogador

