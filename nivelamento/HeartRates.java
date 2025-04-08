package nivelamento;

import java.util.Scanner;
import java.time.LocalDate;

public class HeartRates {
    // atributos da pessoa
    private String nome ;
    private String sobrenome;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    //construtor
    public HeartRates (String nome,String sobrenome,int diaNasc , int mesNasc , int anoNasc){
        this.nome = nome;
        this.sobrenome = sobrenome;//atributo da classe vai receber parametro
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc= anoNasc;

    }
    // Ele é chamado automaticamente quando você cria um novo objeto.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Dia de nascimento: ");
        int diaNasc = input.nextInt();

        System.out.print("Mês de nascimento: ");
        int mesNasc = input.nextInt();

        System.out.print("Ano de nascimento: ");
        int anoNasc = input.nextInt();

        HeartRates pessoa = new HeartRates(nome,sobrenome,diaNasc,mesNasc,anoNasc);
        //Enviando os dados que o usuário digitou

    }

}
