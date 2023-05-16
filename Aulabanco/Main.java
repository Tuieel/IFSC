import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		ContaCorrente op1 = new ContaCorrente();
		op1.setAgencia(32423);
		op1.setCc(9089);
		op1.setSaldo(1500);

		int continuar = 1;

		Scanner teclado = new Scanner(System.in);

		while (continuar == 1) {
			System.out.println("Saldo atual: " + op1.getSaldo());
			System.out.println("Menu:");
			System.out.println("1 - Saque");
			System.out.println("2 - Depósito");
			System.out.println("3 - Sair");

			int op = teclado.nextInt();

			if (op == 1) {
				System.out.println("Digite a quantia que você deseja sacar: ");
				op1.setSacar(teclado.nextInt());

			} else if (op == 2) {
				System.out.println("Digite a quantia que você deseja depositar: ");
				op1.setDepositar(teclado.nextInt());

			} else if (op == 3) {
				continuar = 0;
				System.out.println("Você saiu");
			} else {
				System.out.println("Opção inválida");

			}
		}
	}
}