import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();


        while (true) {
            System.out.println("===== Banco em Java =====");
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
            int opcao = entrada.nextInt();

            if (!entrada.hasNextInt()) {
                System.out.println("Resposta inválida.");
                entrada.nextLine();
                continue;
            }

            if (opcao < 1 || opcao > 10) {
                System.out.println("Resposta inválida.");
                continue;
            }

            if (opcao == 10) {
                System.out.println("Saindo...");
                break;
            }

            if(opcao == 2){
                entrada.nextLine(); // Limpa o buffer

                System.out.print("Número da conta: ");
                String numeroConta = entrada.nextLine();

                System.out.print("Saldo inicial: ");
                double saldo = entrada.nextDouble();
                entrada.nextLine(); // limpa o buffer

                System.out.print("Agência: ");
                String agencia = entrada.nextLine();

                System.out.print("Status (Ativa/Inativa): ");
                String status = entrada.nextLine();

                System.out.print("Data de abertura (YYYY-MM-DD): ");
                String dataAbertura = entrada.nextLine();

                System.out.print("Nome do cliente: ");
                String cliente = entrada.nextLine();

                System.out.print("Tipo de conta (Corrente/Poupança): ");
                String tipoConta = entrada.nextLine();

                Conta novaConta = new Conta(numeroConta, saldo, agencia, status, dataAbertura, cliente, tipoConta);
                contas.add(novaConta);

                System.out.println("Conta criada com sucesso: " + novaConta);

            }

            if (opcao == 3) {
                //Criando um objeto Agência
                entrada.nextLine(); // Limpa o buffer

                System.out.print("Número da agência: ");
                String numero = entrada.nextLine();

                System.out.print("Nome da agência: ");
                String nome = entrada.nextLine();

                System.out.print("Endereço da agência: ");
                String endereco = entrada.nextLine();

                System.out.print("Telefone da agência: ");
                String telefone = entrada.nextLine();

                System.out.print("Nome do gerente: ");
                String gerente = entrada.nextLine();

                System.out.print("Cidade da agência: ");
                String cidade = entrada.nextLine();

                System.out.print("Estado da agência: ");
                String estado = entrada.nextLine();

                Agencia novaAgencia = new Agencia(numero, nome, endereco, telefone, gerente, cidade, estado);

                System.out.println("Agência cadastrada com sucesso: " + novaAgencia);
            }

            if (opcao == 9) {
                System.out.println("=== Submenu ====");
                System.out.println("1. Submenu A - Operações de Conta");
                System.out.println("2. Submenu B - Gestão de Clientes");
                System.out.println("0. Voltar");
                System.out.print("Escolha: ");
                int sub = entrada.nextInt();
                if (!entrada.hasNextInt()) {
                    System.out.println("Resposta inválida.");
                    entrada.nextLine();
                    continue;
                }

                if (sub == 1) { //Submenu A
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

                        entrada.nextLine(); // limpa buffer
                        System.out.print("Digite o número da conta: ");
                        String numeroContaBusca = entrada.nextLine(); //Para que se possa ter acesso a uma conta especifica

                        Conta contaSelecionada = null; //Identifcar uma conta e selecionar 
                        for (Conta conta : contas) {
                            if (conta.getNumeroConta().equals(numeroContaBusca)) {
                                contaSelecionada = conta;
                                break;
                            }
                        }

                        if (contaSelecionada == null) { 
                            System.out.println("Conta não encontrada.");
                            continue; // volta para o submenu
                        }

                        switch (opcao1) {
                            case 1:        
                                System.out.print("Valor para depositar: ");
                                double valorDep = entrada.nextDouble();
                                contaSelecionada.depositar(valorDep);
                                System.out.println("Depósito realizado com sucesso.");
                                break;

                            case 2:
                                System.out.print("Valor para sacar: ");
                                double valorSaque = entrada.nextDouble();
                                if (contaSelecionada.sacar(valorSaque)) {
                                    System.out.println("Saque realizado com sucesso.");
                                } else {
                                    System.out.println("Saldo insuficiente para saque.");
                                }
                                break;
                            case 3:
                                contaSelecionada.consultarSaldo();
                                break;
                            case 4:
                                return;  // volta pro menu principal
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    
                } else if (sub == 2) { //Submenu B
                    while (true) {
                        System.out.println("=== Submenu B ===");
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
}