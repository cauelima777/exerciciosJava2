import java.util.Scanner;

public class Mainfila {

    private static class Fila {
        public int num;
        public Fila prox;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Fila inicio = null;
        Fila fim = null;

        int op;

        do {

            System.out.println("------Menu de opções-----");
            System.out.println("1-Inserir na fila");
            System.out.println("2-Excluir da fila");
            System.out.println("3-Mostrar fila");
            System.out.println("4-Esvaziar toda a fila");
            System.out.println("5-Sair");
            System.out.println("Digite a sua opção:");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o número a ser inserido na fila: ");
                    Fila novo = new Fila();
                    novo.num = entrada.nextInt();
                    novo.prox = null;
                    if (inicio == null) {
                        inicio = novo;
                        fim = novo;
                    } else {
                        fim.prox = novo;
                        fim = novo;
                    }
                    System.out.println("Número inserido na fila!!");
                    break;

                case 2:
                    if (inicio == null) {
                        System.out.println("Fila vazia");
                    } else {
                        System.out.println("Número " + inicio.num + " removido!!");
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
                            System.out.println(aux.num + "    ");
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
