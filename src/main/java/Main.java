import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Jogo j = new Jogo();

        int op;

        System.out.println("Digite o numero 1 para iniciar o jogo: ");
        System.out.println("Digite o numero  2 para ver o placar: ");
        System.out.println("Digite o numero 3 para mudar o nome do jogador: ");
        System.out.println("Digite o numero 4 para sair: ");
        System.out.println("Digite seu número: ");


        Scanner scan = new Scanner(System.in);
        op = scan.nextInt();

        while (op != 4) {
            switch (op) {
                case 1:
                    System.out.print("Iniciar Partida:");
                    System.out.print("\nQual o nome do jogador?");
                    j.nomeJogador = scan.nextLine();

                    j.executaJogo();
                    System.out.println("Digite um numero entre 1 e 3, 4 para sair: ");
                    op = scan.nextInt();
                    break;
                case 2:
                    System.out.print("Placar: ");
                    j.mostrarPlacar();
                    j.mostrarTentativasTotal();
                    System.out.println("Digite um numero entre 1 e 3, 4 para sair: ");
                    op = scan.nextInt();
                    break;
                case 3:
                    Scanner ler = new Scanner(System.in);

                    System.out.println("Digite o nome do jogador: ");
                    j.nomeJogador = ler.nextLine();
                    System.out.println(j.nomeJogador);
                    System.out.println("Digite um numero entre 1 e 3, 4 para sair: ");
                    op = scan.nextInt();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
            }

        }


    }
}
