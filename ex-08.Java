import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float sal,reajuste,descontos,porcInss,porcFgts,salafioFinal;
        System.out.print("Informe o salario: ");
        sal = teclado.nextFloat();
        
        reajuste = sal * (float)1.15;
        porcInss = reajuste * (float)0.11;
        porcFgts = reajuste * (float)0.08;
        descontos = porcInss + porcFgts;
        salafioFinal = reajuste - descontos;
        
       

       
        System.out.println("       ");
        System.out.printf("Salario inicial: " +sal);
        System.out.printf("\n Salario reajustado: " +reajuste);
        System.out.printf("\n Desconto 11 INSS: "+porcInss);
        System.out.printf("\n Desconto 8 FGTS: %.2f",+porcFgts);
        System.out.printf("\n Total decontos INSS + FGTS: "+descontos);
        System.out.printf("\n Salario Final: "+salafioFinal);
    }
}

