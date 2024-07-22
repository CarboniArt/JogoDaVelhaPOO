package JogoDaVelha;

/**
 * Classe que representa cada célula do tabuleiro.
 *
 * @author Lorenzo e Arthur
 */
public class Tabuleiro {
    private char simbolo;

    /**
     * Construtor que inicializa a célula com espaço em branco.
     */
    public Tabuleiro() {
        simbolo = ' ';
    }

    /**
     * Retorna o símbolo da célula.
     *
     * @return o símbolo da célula.
     */
    public char getSimbolo() {
        return simbolo;
    }

    /**
     * Define o símbolo da célula.
     *
     * @param simbolo o símbolo a ser definido.
     */
    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    /**
     * Desenha o tabuleiro no terminal.
     *
     * @param velha o tabuleiro a ser desenhado.
     */
    public static void desenhoTabuleiro(Tabuleiro[][] velha) {
        System.out.println("       0     1     2  ");
        System.out.println("    ╔═════╦═════╦═════╗");
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + i + "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print("║  " + velha[i][j].getSimbolo() + "  ");
            }
            System.out.println("║");
            if (i < 2) {
                System.out.println("    ╠═════╬═════╬═════╣");
            } else {
                System.out.println("    ╚═════╩═════╩═════╝");
            }
        }
    }
}