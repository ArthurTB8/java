import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float novoquin, novovint, finalum,  finaldois, peso;
        System.out.println("Informe o peso em Kg:");
        peso = teclado.nextFloat();

         novoquin = peso * (float)0.15;
         novovint = peso * (float)0.20;
         finalum = novoquin + peso;
         finaldois = novovint + peso;

        System.out.println("Caso a pessoa engorde 15% ficara com:" +finalum);
        System.out.println("Caso a pessoa engorde 20% ficara com:" +finaldois);

    }
}
