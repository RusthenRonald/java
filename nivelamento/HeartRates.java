package nivelamento;

import java.util.Scanner;

public class HeartRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu nome:");
        String nome = input.nextLine();
        System.out.println("Qual seu sobrenome:");
        String sobrenome = input.nextLine();
        System.out.println("Qual sua data de nascimento");
        int nasc = input.nextInt();
        System.out.printf("O nome completo da pessoa é %s e sua data de nascimento é %d",nome,nasc);
    }

}
