package JogoDaVelha;

/**
 * Classe Jogada contém métodos estáticos para realizar jogadas e verificar vitória.
 *
 * @author Lorenzo e Arthur
 */
public class Jogada {
    /**
     * Realiza uma jogada no tabuleiro.
     *
     * @param velha o tabuleiro do jogo.
     * @param vetorPonto as coordenadas da jogada.
     * @param simboloJogador o símbolo do jogador.
     * @return true se a jogada foi válida, false caso contrário.
     */
    public static boolean jogada(Tabuleiro[][] velha, int[] vetorPonto, char simboloJogador) {
        int x = vetorPonto[0];
        int y = vetorPonto[1];
        if (x >= 0 && x < 3 && y >= 0 && y < 3 && velha[x][y].getSimbolo() == ' ') {
            velha[x][y].setSimbolo(simboloJogador);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verifica se há um vencedor no tabuleiro.
     *
     * @param velha o tabuleiro do jogo.
     * @return o símbolo do vencedor, ou string vazia se não houver vencedor.
     */
    public static String vitoria(Tabuleiro[][] velha) {
        for (int i = 0; i < 3; i++) {
            if (velha[i][0].getSimbolo() == velha[i][1].getSimbolo() && velha[i][1].getSimbolo() == velha[i][2].getSimbolo() && velha[i][0].getSimbolo() != ' ') {
                return String.valueOf(velha[i][0].getSimbolo());
            }
            if (velha[0][i].getSimbolo() == velha[1][i].getSimbolo() && velha[1][i].getSimbolo() == velha[2][i].getSimbolo() && velha[0][i].getSimbolo() != ' ') {
                return String.valueOf(velha[0][i].getSimbolo());
            }
        }
        if (velha[0][0].getSimbolo() == velha[1][1].getSimbolo() && velha[1][1].getSimbolo() == velha[2][2].getSimbolo() && velha[0][0].getSimbolo() != ' ') {
            return String.valueOf(velha[0][0].getSimbolo());
        }
        if (velha[0][2].getSimbolo() == velha[1][1].getSimbolo() && velha[1][1].getSimbolo() == velha[2][0].getSimbolo() && velha[0][2].getSimbolo() != ' ') {
            return String.valueOf(velha[0][2].getSimbolo());
        }
        return "";
    }
}