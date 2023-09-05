package adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //gera um numero randomico que será comparado no decorrer da aplicacao
        int numAleatorio = new Random().nextInt(100);
        int contador = 0;
        
        while (contador < 5) {
            System.out.print("Insira um número entre 0 e 100: ");
            int numero = leitor.nextInt();
            contador++;
            
            if (numero == numAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + contador + " tentativas!");
                break;
            } else if (numero < numAleatorio) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (contador == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numAleatorio);
        }
        leitor.close();
    }
}
