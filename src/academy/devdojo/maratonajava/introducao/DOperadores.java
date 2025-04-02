package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class DOperadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        System.out.println(resultado);


        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != (sempre vão retornar valores booleanos)
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);


        // && (AND ADIÇÃO)         || (or)         ! (not)
        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupança > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        float bonus = 1800F; //1800
        bonus = bonus + 1000; //2800
        bonus *= 2; //5600
        bonus /= 2; //2800
        bonus %= 2; // resto
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);
        System.out.println(++contador2);

    }
}
