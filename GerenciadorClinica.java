import java.util.Scanner;


// Classe principal que gerencia o menu e a interação com o usuário
public class GerenciadorClinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento fila = new FilaDeAtendimento(); // Gerencia a fila de pacientes
        PilhaHistoricoAtendimentos historico = new PilhaHistoricoAtendimentos(); // Gerencia o histórico
        boolean executando = true;

        // Loop principal do menu
        while (executando) {
            System.out.println("===================================================");
            System.out.println("1. Adicionar novo paciente à fila");
            System.out.println("2. Atender próximo paciente");
            System.out.println("3. Exibir fila de atendimento");
            System.out.println("4. Exibir histórico de atendimentos");
            System.out.println("5. Sair");
            System.out.println("===================================================");
            System.out.print("Escolha uma opção: ");

            int opcao = lerOpcao(scanner);

            // Estrutura de decisão usando if-else (sem switch-case)
            if (opcao == 1) {
                Paciente novo = criarPaciente(scanner);
                fila.adicionarPaciente(novo);
                System.out.println("Paciente adicionado à fila!");
            } else if (opcao == 2) {
                if (!fila.estaVazia()) {
                    Paciente atendido = fila.atenderPaciente();
                    historico.adicionarAoHistorico(atendido);
                    System.out.println("Paciente atendido:");
                    System.out.println(atendido.exibirInfo());
                } else {
                    System.out.println("Nenhum paciente na fila.");
                }
            } else if (opcao == 3) {
                fila.mostrarFila();
            } else if (opcao == 4) {
                historico.mostrarHistorico();
            } else if (opcao == 5) {
                executando = false;
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    // Lê a opção do menu, validando se é um número inteiro
    private static int lerOpcao(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
                return valor;
            } else {
                System.out.print("Entrada inválida. Digite um número: ");
                scanner.nextLine();
            }
        }
    }

    // Cria um novo paciente a partir dos dados digitados pelo usuário
    private static Paciente criarPaciente(Scanner scanner) {
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        int idade = lerIdade(scanner);
        System.out.print("Sintoma: ");
        String sintoma = scanner.nextLine();
        return new Paciente(nome, idade, sintoma);
    }

    // Lê e valida a idade do paciente
    private static int lerIdade(Scanner scanner) {
        System.out.print("Idade: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int idade = scanner.nextInt();
                scanner.nextLine();
                if (idade > 0) {
                    return idade;
                } else {
                    System.out.print("Idade deve ser positiva. Digite novamente: ");
                }
            } else {
                System.out.print("Entrada inválida. Digite um número inteiro para a idade: ");
                scanner.nextLine();
            }
        }
    }
}
