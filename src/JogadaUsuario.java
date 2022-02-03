import java.util.Random;

public class JogadaUsuario {

	int Jogada(int jogadaUsuario) {

		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(1, 4);

		int resultado = 0;

		if (jogadaUsuario == 1) {
			System.out.println("\n\nVoc� escolheu Pedra!");
			if (numeroAleatorio == 1) {
				System.out.println("O computador escolheu Pedra!");
				System.out.println("\nVoc� EMPATOU o jogo\n");
				resultado = 0;
			} else if (numeroAleatorio == 2) {
				System.out.println("O computador escolheu Papel!");
				System.out.println("\nVoc� PERDEU o jogo\n");
				resultado = -1;
			} else {
				System.out.println("O computador escolheu Tesoura!");
				System.out.println("\nVoc� VENCEU o jogo\n");
				resultado = 1;
			}
		}

		if (jogadaUsuario == 2) {
			System.out.println("\n\nVoc� escolheu Papel!");
			if (numeroAleatorio == 1) {
				System.out.println("O computador escolheu Pedra!");
				System.out.println("\nVoc� VENCEU o jogo\n");
				resultado = 1;
			} else if (numeroAleatorio == 2) {
				System.out.println("O computador escolheu Papel!");
				System.out.println("\nVoc� EMPATOU o jogo\n");
				resultado = 0;
			} else {
				System.out.println("O computador escolheu Tesoura!");
				System.out.println("\nVoc� PERDEU o jogo\n");
				resultado = -1;
			}
		}

		if (jogadaUsuario == 3) {
			System.out.println("\n\nVoc� escolheu Tesoura!");
			if (numeroAleatorio == 1) {
				System.out.println("O computador escolheu Pedra!");
				System.out.println("\nVoc� PERDEU o jogo\n");
				resultado = -1;
			} else if (numeroAleatorio == 2) {
				System.out.println("O computador escolheu Papel!");
				System.out.println("\nVoc� VENCEU o jogo\n");
				resultado = 1;
			} else {
				System.out.println("O computador escolheu Tesoura!");
				System.out.println("\nVoc� EMPATOU o jogo\n");
				resultado = 0;
			}

		}
		return resultado;
	}
}
