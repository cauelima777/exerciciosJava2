public class MainPessoa {

    private static class Pessoa {
        public String nome;
        public Pessoa prox;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa inicio = null;
        Pessoa fim = null;
        int op;

        do {
            System.out.println("------Menu de opções-----");
            System.out.println("1-Adicionar pessoa na fila");
            System.out.println("2-Remover pessoa da fila");
            System.out.println("3-Mostrar fila");
            System.out.println("4-Sair");
            System.out.println("Digite a sua opção:");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome da pessoa a ser adicionada na fila:");
                    String nome = entrada.next();
                    Pessoa novaPessoa = new Pessoa();
                    novaPessoa.nome = nome;
                    novaPessoa.prox = null;
                    if (inicio == null) {
                        inicio = novaPessoa;
                        fim = novaPessoa;
                    } else {
                        fim.prox = novaPessoa;
                        fim = novaPessoa;
                    }
                    System.out.println("Pessoa adicionada na fila: " + nome);
                    break;

                case 2:
                    if (inicio == null) {
                        System.out.println("Fila vazia");
                    } else {
                        String pessoaRemovida = inicio.nome;
                        System.out.println("Pessoa removida da fila: " + pessoaRemovida);
                        inicio = inicio.prox;
                    }
                    break;

                case 3:
                    if (inicio == null) {
                        System.out.println("Fila vazia");
                    } else {
                        System.out.println("\nConsultando toda a fila\n");
                        Pessoa aux = inicio;
                        while (aux != null) {
                            System.out.println(aux.nome + "    ");
                            aux = aux.prox;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        } while (op != 4);

        entrada.close();
    }
}