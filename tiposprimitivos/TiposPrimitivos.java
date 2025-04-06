package tiposprimitivos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner teclado = Scanner();
        String nome = "Gustavo";
        float num = 1825.54f;
        //System.out.printf("O número que %s digitou foi %.2f",nome,num);
        System.out.format("A nota de %s é %.2f ",nome,num);
    }
}
