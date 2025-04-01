package academy.devdojo.maratonajava.introducao;

public class BTiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10L;
        long numeroGrande = 100000L;
        double salaryDouble = 2000D;
        double salaryFloat = (float) 2500.0D;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Zlatan Ibrahimovic";

        System.out.println("The age is " + age + " years");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(salaryFloat);
        System.out.println("Meu jogador favorito é o "+nome);
        }
    }
