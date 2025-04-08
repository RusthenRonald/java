package nivelamento;

import java.util.Scanner;
import java.time.LocalDate;

public class HeartRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu nome:");
        String nome = input.nextLine();
        System.out.println("Qual seu sobrenome:");
        String sobrenome = input.nextLine();
        System.out.println("Qual sua data de nascimento");
        int nasc = input.nextInt();
        int anoAtual =LocalDate.now().getYear();
        int idade = anoAtual- nasc;
        System.out.printf("O nome completo da pessoa é %s %s, sua data de nascimento é %d\n",nome,sobrenome,nasc);
        System.out.printf("Sua idade é de %d",idade);
    }

}
