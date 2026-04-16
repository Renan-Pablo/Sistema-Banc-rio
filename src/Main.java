import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeParaCadastrar = "", emailParaCadastrar = "", senhaParaCadastrar = "";
        String nomeCadastrado = "", emailCadastrado = "", senhaCadastrada = "";
        int opcaoEscolher;

        do {
            System.out.println("\nBEM-VINDO AO BANCO R7!\n");
            System.out.println("*** LISTA DE OPÇÕES ***");
            System.out.println("1. CADASTRAR");
            System.out.println("2. ENTRAR");
            System.out.println("3. SAIR");
            System.out.print("Opção: ");
            opcaoEscolher = sc.nextInt();

            sc.nextLine(); // Limpa buffer

            switch (opcaoEscolher) {

                case 1:
                    System.out.println("VOCÊ ESTÁ CADASTRANDO.");
                    System.out.print("DIGITE SEU NOME COMPLETO: ");
                    nomeParaCadastrar = sc.nextLine();

                    System.out.print("DIGITE SEU EMAIL: ");
                    emailParaCadastrar = sc.nextLine();

                    if (emailParaCadastrar.contains("@")) {
                        System.out.println("EMAIL CONFIRMADO");
                    } else {
                        System.out.print("ERRO! DIGITE O EMAIL NOVAMENTE, AGORA COM (@): ");
                        emailParaCadastrar = sc.nextLine();
                    }

                    System.out.print("DIGITE SUA SENHA: ");
                    senhaParaCadastrar = sc.nextLine();

                    System.out.println("SEU CADASTRO FOI CONFIRMADO, " + nomeParaCadastrar + "!");
                    break;

                case 2: {
                    System.out.println("ENTRANDO NO BANCO.");

                    System.out.print("DIGITE SEU NOME: ");
                    nomeCadastrado = sc.nextLine();

                    System.out.print("DIGITE SEU EMAIL, NÃO ESQUEÇA DO @: ");
                    emailCadastrado = sc.nextLine();

                    System.out.print("DIGITE SUA SENHA: ");
                    senhaCadastrada = sc.nextLine();

                    int qualOpcao = 0;
                    double saldo = 2000;

                    System.out.println("BEM VINDO, " + nomeCadastrado + ".");
                    System.out.println("*** OUTRAS OPÇÕES ***");

                    do {
                        System.out.println("1. FAZER TRANSFERÊNCIA");
                        System.out.println("2. MOSTRAR SALDO");
                        System.out.println("3. VOLTAR PARA O MENU");
                        System.out.print("ESCOLHA: ");
                        qualOpcao = sc.nextInt();

                        switch (qualOpcao) {
                            case 1:
                                System.out.print("VALOR DA TRANSFERÊNCIA: R$ ");
                                double valorTranferencia = sc.nextDouble();
                                saldo -= valorTranferencia;
                                System.out.println("VOCÊ FEZ UMA TRANSFERÊNCIA DE R$ " + valorTranferencia + " PARA FULANO DE TAL.");
                                break;

                            case 2:
                                System.out.println("OLÁ " + nomeCadastrado + "!");
                                System.out.println("SEU SALDO: R$" + saldo);
                                break;

                            case 3:
                                System.out.println("VOLTAR PARA O MENU");
                                break;
                        }

                    } while (qualOpcao != 3);

                    break;
                }

                case 3:
                    System.out.println("SAINDO DO PROGRAMA...");
                    break;
            }

        } while (opcaoEscolher != 3);
    }
}