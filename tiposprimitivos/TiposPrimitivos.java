package tiposprimitivos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float num = teclado.nextFloat();
        //System.out.printf("O número que %s digitou foi %.2f",nome,num);
        System.out.format("A nota de %s é %.2f ",nome,num);
    }
}
