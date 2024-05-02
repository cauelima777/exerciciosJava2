package ex;
import java.util.Scanner;

public class cartas {

    private static class Fila {
        public String carta;
        public Fila prox;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Fila inicio = null;
        Fila fim = null;

        int op;

        do {

            System.out.println("------Menu de opções-----");
            System.out.println("1-Inserir carta na fila");
            System.out.println("2-Excluir carta da fila");
            System.out.println("3-Mostrar fila");
            System.out.println("4-Esvaziar toda a fila");
            System.out.println("5-Sair");
            System.out.println("Digite a sua opção:");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite a carta a ser inserida na fila: ");
                    String carta = entrada.next();
                    Fila novo = new Fila();
                    novo.carta = carta;
                    novo.prox = null;
                    if (inicio == null) {
                        inicio = novo;
                        fim = novo;
                    } else {
                        fim.prox = novo;
                        fim = novo;
                    }
                    System.out.println("Carta inserida na fila: " + carta);
                    break;

                case 2:
                    if (inicio == null) {
                        System.out.println("Fila vazia");
                    } else {
                        String cartaRemovida = inicio.carta;
                        System.out.println("Carta removida da fila: " + cartaRemovida);
                        inicio = inicio.prox;
                    }
                    break;

                case 3:
                    if (inicio == null) {
                        System.out.println("Fila vazia!!!!");
                    } else {
                        System.out.println("\nConsultando toda a fila\n");
                        Fila aux = inicio;
                        while (aux != null) {
                            System.out.println(aux.carta + "    ");
                            aux = aux.prox;
                        }
                    }
                    break;

                case 4:
                    if (inicio == null) {
                        System.out.println("Fila vazia!!!");
                    } else {
                        inicio = null;
                        System.out.println("Fila esvaziada!!");
                    }
                    break;
            }

        } while (op != 5);

        entrada.close();

    }
}
