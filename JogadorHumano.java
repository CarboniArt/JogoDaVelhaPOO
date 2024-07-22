package JogoDaVelha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JogadorHumano implements Jogador {
    private char simbolo;
    private Scanner scan;

    /**
     * Construtor que inicializa um jogador humano com um símbolo específico.
     *
     * @param simbolo o símbolo do jogador ('X' ou 'O').
     */

    public JogadorHumano(char simbolo) {
        this.simbolo = simbolo;
        this.scan = new Scanner(System.in);
    }

    /**
     * @author Lorenzo e Arthur
     * @return posição que foi jogado
     */
    @Override
    public int[] fazerJogada() {
        int[] vetorPonto = new int[2];
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.printf("Quem joga: %c%n", simbolo);
                System.out.println("Informe a linha desejada (0, 1, ou 2): ");
                vetorPonto[0] = scan.nextInt();
                System.out.println("Informe a coluna desejada (0, 1, ou 2): ");
                vetorPonto[1] = scan.nextInt();

                if (vetorPonto[0] < 0 || vetorPonto[0] > 2 || vetorPonto[1] < 0 || vetorPonto[1] > 2) {
                    throw new IndexOutOfBoundsException("Posição fora dos limites da tabela.");
                }
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira números inteiros.");
                scan.next();
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        return vetorPonto;
    }

    /**
     * @author Lorenzo e Arthur
     * @return simbolo 'o' ou 'x' dependendo do jogador
     */

    @Override
    public char getSimbolo() {
        return simbolo;
    }
}