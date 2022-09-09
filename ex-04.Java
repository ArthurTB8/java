import java.util.Scanner;
import static java.lang.Math.abs;

public class Exer04 {

    public static void main(String[] args)  {

        Scanner teclado = new Scanner(System.in);

        float numeroEsc;
        int i = 0;

        System.out.print("Difite o numero para o calculo da tabuada:");
        numeroEsc = teclado.nextFloat();

        while (i <= 10) {
            System.out.printf(+numeroEsc + "+" + i + " = %.0f", +(numeroEsc + i));
            System.out.printf("\t\t" + numeroEsc + " - " + i + " = %.0f", +(Math.abs(numeroEsc - i)));
            System.out.println("\t");
            i++;
        }
        System.out.println();

        System.out.println(+numeroEsc + " x 0 = 0     " + numeroEsc + " / 0 = nao existe divisao por zero");
        i = 1;
        while (i <= 10) {
            System.out.print(+numeroEsc + " x ");
            System.out.print(+(int) i + " = " + (int) (numeroEsc * i));
            System.out.printf("\t\t" + numeroEsc + " / " + i + " = %.2f", +(numeroEsc / i));
            System.out.println("\t");
            i++;
        }
    }
}


