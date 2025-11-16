import java.util.Scanner;

public class MeuCaixaEletronico {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== MEU CAIXA ELETRÔNICO =====");

        System.out.println("\nMenu");
        System.out.println("1. Ver Saldo");
        System.out.println("2. Depositar Valor");
        System.out.println("3. Sacar valor");
        System.out.println("4. Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Seu Saldo é de R$ 0,00");
            case 2 -> System.out.println("Operação de depósito selecionada.");
            case 3 -> System.out.println("Operação de saque selecionada.");
            case 4 -> System.out.println("Obrigado por usar nosso banco. Saindo do sistema...");
            default -> System.out.println("opção inválida.Por favor, tente novamente.");
        }

        scanner.close();
    }
}
