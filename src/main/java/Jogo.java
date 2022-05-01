import java.util.Random;
import java.util.Scanner;

public class Jogo {

    int numeroSorteado, tentativas = 0, palpite, entrada, tentativaFinal;
    static int  partidas = 0;
    static int vitorias, derrotas;
     String nomeJogador = "Player1";

    public Jogo() {
        Random r = new Random();
        this.numeroSorteado = r.nextInt(5) + 1; //motivos de teste para video
    }

//teste commit

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public static void setNomeJogador(String nomeJogador) {
        nomeJogador = nomeJogador;
    }

    public int getTentativaFinal() {
        return tentativaFinal;
    }

    public void setTentativaFinal(int tentativaFinal) {
        this.tentativaFinal = tentativaFinal;
    }

    public void dica(int palpite, int numeroSorteado, int tentativas) {
        if (palpite > numeroSorteado) {
            System.out.println("Seu palpite é maior que o número sorteado.");
        } else {
            if (palpite < numeroSorteado) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            }

            }
        }



    public void executaJogo() {
        nomeJogador = "Player1";
        System.out.println("\nO sistema irá escolher um número entre 1 e 100 para ser sorteado!");
        System.out.println("Você tem 10 tentativas");
        Scanner scan = new Scanner(System.in);

        do {
            System.out.printf("\n\n--------////---------\n");
            System.out.println("\nVamos tentar? Digite 1 para sim - Digite 0 para desistir");
            entrada = scan.nextInt();
            if (entrada == 0) {
                System.out.println("Você desistiu do jogo");
                derrotas++;
                partidas++;
                break;
            } else if(entrada == 1)



                System.out.print("Qual seu palpite: ");
            palpite = scan.nextInt();

            tentativas++;
            System.out.println("Número de tentativas: " + tentativas);

            dica(palpite, numeroSorteado, tentativas);
            if (tentativas == 10) {
                System.out.println("Você perdeu. Derrotas +1 e voltando ao inicio.");
                tentativaFinal = tentativaFinal+tentativas;
                tentativas = 0;
                derrotas++;
            }if(palpite == numeroSorteado){
                System.out.println("Parabéns, você acertou! O número era " + numeroSorteado);
                System.out.println("Você tentou " + this.getTentativas() + " vezes antes de acertar!");
                System.out.println("Nome do jogador: " + nomeJogador);
                tentativaFinal = tentativaFinal+tentativas;
                tentativas = 0;
                vitorias++;
                partidas++;


            }

        } while (palpite != numeroSorteado);



    }

    public void mostrarPlacar(){
        System.out.println("Partidas: " + this.partidas + "\n\nDerrotas: " + this.derrotas + "\n\nVitorias: " + this.vitorias);
    }

    public void mostrarTentativasTotal(){
        System.out.println("\nNúmero total de tentativas: "+ this.getTentativaFinal());
    }
    }
