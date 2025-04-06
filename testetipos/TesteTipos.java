package testetipos;

public class TesteTipos {
    public static void main(String[] args) {
        int idade =30;
        //String valor = (String) idade;  não funciona typecast
        String valor = Integer.toString(idade);
        System.out.println(idade);
    }
}
