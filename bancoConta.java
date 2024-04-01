import java.util.Scanner;


    class bancoConta {

        int valor;
        int confirmarTransacao;

        String nome;
        String numerodeId;

        bancoConta(String cnome, String cid) {
            nome = cnome;
            numerodeId = cid;
        }

        void depositar(int quantia) {
            if (quantia != 0) {
                valor = valor + quantia;
                confirmarTransacao = quantia;

            }

        }
        void saque(int quantia) {
            if (quantia != 0) {
                valor = valor - quantia;
                confirmarTransacao = -quantia;
            }
        }

        void transferir() {
            if (confirmarTransacao > 0) {
                System.out.println("Transferido com sucesso: " + confirmarTransacao);

            } else if (confirmarTransacao < 0) {
                System.out.println("Saque; " + Math.abs(confirmarTransacao));

            } else {
                System.out.println("Não ocorreu nenhuma tranferencia");
            }
        }
        void verMenu () {
            char opcao = '\0';
            Scanner sc = new Scanner(System.in);
            System.out.println("Bem vindo " + nome);
            System.out.println("Seu Numero de identificacao e: " + numerodeId);
            System.out.println("-----------------------------------------------");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Transferir");
            System.out.println("4 - Voltar ao menu");
            System.out.println("5 - sair");

            do {
                System.out.println("=================================================");
                System.out.println("Escolha a opcao");
                System.out.println("=================================================");
                opcao = sc.next().charAt(0);
                Character.toUpperCase(opcao);

                switch (opcao) {
                    case '1':
                        System.out.println("=================================================");
                        System.out.println("O valor e: " + valor);
                        System.out.println("=================================================");
                        System.out.println();
                        break;

                    case '2':
                        System.out.println("=================================================");
                        System.out.println("Digite valor para depositar: ");
                        System.out.println("=================================================");
                        int quantia = sc.nextInt();
                        depositar(quantia);
                        System.out.println();
                        break;

                    case '3':
                        System.out.println("=================================================");
                        System.out.println("Coloque o valor para transferir: ");
                        System.out.println("=================================================");
                        quantia = sc.nextInt();
                        System.out.println();
                        break;

                    case '4':
                        System.out.println("=================================================");
                        System.out.println();
                        System.out.println("=================================================");
                        System.out.println();
                        break;
                    case '5':
                        System.out.println("=================================================");
                        break;

                    default:
                        System.out.println("Opcao invalida, por favor escolha uma opcao valida e tente novamente");
                        break;

                }
            } while (opcao != '5');

        }
    }


