import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int jogadas = 0;

			JogadaUsuario usuario = new JogadaUsuario();
			int entradaUsuario;
			
			String jogar = "S";
			
			while (jogar.equalsIgnoreCase("S")) {
				
				int repeticao = 0;
				int resultado = 0;
				int total = 0;
				int venceu = 0;
				int perdeu = 0;
				
				while (repeticao == 0) {
					System.out.println("\n----------------------------");
					System.out.println("       J O K E N P O        ");
					System.out.println("----------------------------");
					System.out.print(" Quantas partidas: ");
					jogadas = entrada.nextInt();

					if (jogadas >= 3 && jogadas % 2 == 1) {
						repeticao = 1;
					} else {
						System.out.println("\nNúmeros de partidas inválidas! tente o número 3 ou algum ímpar maior");
					}
				}

				System.out.println("\n= 1 - Pedra                 =");
				System.out.println("= 2 - Papel                 =");
				System.out.println("= 3 - Tesoura               =");
				System.out.println("=============================");

				for (repeticao = 0; repeticao < jogadas; repeticao++) {

					System.out.println("\nPartida " + (repeticao + 1));
					System.out.print("= Qual sua opção de jogada? =");
					entradaUsuario = entrada.nextInt();
					resultado = usuario.Jogada(entradaUsuario);
					total += resultado;
					if (resultado == 1) {
						venceu++;
					} else if (resultado == -1) {
						perdeu++;
					}
					if (perdeu > (jogadas / 2)) {
						break;
					}
					if (venceu > (jogadas / 2)) {
						break;
					}
					if (repeticao == (jogadas - 1) && venceu == perdeu && total == 0) {
						jogadas++;
					}

				}

				if (venceu > perdeu) {
					System.out.println("Você venceu o desafio por " + venceu + " X " + perdeu);
				} else {
					System.out.println("Você perdeu o desafio por " + perdeu + " X " + venceu);
				}

				System.out.print("\n\nDeseja jogar novamente? (S/N)  ");
				String jogarNovamente = "";
				jogarNovamente = entrada.next();
				if (jogarNovamente.equalsIgnoreCase("S")) {
					jogar = "S";
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				} else {
					jogar = "N";
				}

			}
			entrada.close();
			System.out.println("F I M !");
		}

	}

}
