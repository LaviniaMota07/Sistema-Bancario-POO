import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Banco em Java =====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Abrir Conta");
            System.out.println("3. Cadastrar Agência");
            System.out.println("4. Cadastrar Gerente");
            System.out.println("5. Realizar Transação");
            System.out.println("6. Emitir Cartão");
            System.out.println("7. Solicitar Empréstimo");
            System.out.println("8. Cadastrar Chave Pix");
            System.out.println("9. Ir para submenus");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");

            if (!entrada.hasNextInt()) {
                System.out.println("Resposta inválida.");
                entrada.nextLine();
                continue;
            }

            int opcao = entrada.nextInt();

            if (opcao < 1 || opcao > 10) {
                System.out.println("Resposta inválida.");
                continue;
            }

            if (opcao == 10) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao == 9) {
                System.out.println("\n=== Submenu ====");
                System.out.println("1. Submenu A - Operações de Conta");
                System.out.println("2. Submenu B - Gestão de Clientes");
                System.out.println("0. Voltar");
                System.out.print("Escolha: ");

                if (!entrada.hasNextInt()) {
                    System.out.println("Resposta inválida.");
                    entrada.nextLine();
                    continue;
                }

                int sub = entrada.nextInt();

                if (sub == 1) {
                    submenuA(entrada);
                } else if (sub == 2) {
                    submenuB(entrada);
                } else if (sub == 0) {
                    System.out.println("Voltando ao menu principal...");
                } else {
                    System.out.println("Opção inválida.");
                }
                continue;
            }

            System.out.println("Você escolheu a opção: " + opcao);
        }

        entrada.close();
    }

    public static void submenuA(Scanner entrada) {
        while (true) {
            System.out.println("\n=== Submenu A ===");
            System.out.println("1. Depositar dinheiro");
            System.out.println("2. Sacar dinheiro");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Voltar");
            System.out.print("Escolha: ");

            int opcao1 = entrada.nextInt();

            if (!entrada.hasNextInt()) {
                System.out.println("Resposta inválida.");
                entrada.nextLine();  // limpa o buffer
                continue;  // volta pro início do while
            }

            switch (opcao1) {
                case 1:
                    System.out.println("Depositando...");
                    break;
                case 2:
                    System.out.println("Sacando...");
                    break;
                case 3:
                    System.out.println("Consultando saldo...");
                    break;
                case 4:
                    System.out.println("Voltando...");
                    return;  // volta pro menu principal
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }



    public static void submenuB(Scanner entrada) {
        while (true) {
            System.out.println("\n=== Submenu B ===");
            System.out.println("1. Listar clientes");
            System.out.println("2. Listar contas");
            System.out.println("3. Excluir cliente");
            System.out.println("4. Voltar");
            System.out.print("Escolha: ");

            int opcao2 = entrada.nextInt();

            if (!entrada.hasNextInt()) {
                System.out.println("Resposta inválida.");
                entrada.nextLine();  // limpa o buffer
                continue;
            }
            switch (opcao2) {
                case 1:
                    System.out.println("Listando clientes...");
                    break;
                case 2:
                    System.out.println("Listando contas...");
                    break;
                case 3:
                    System.out.println("Excluindo cliente...");
                    break;
                case 4:
                    System.out.println("Voltando...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
