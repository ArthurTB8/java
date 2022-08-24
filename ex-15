import java.util.Scanner;

 public class Main
    {
        public static void main (String[] args) {

            Scanner teclado = new Scanner(System.in);
            
            float depen,horaNorm,precNormal,precExtra,horaExtra,depenMenor,salarioLi,salarioLiquid, salarioFinal;
            
            System.out.print("Digite a quantidade de horas normais: ");
            horaNorm = teclado.nextFloat();
            
            precNormal = horaNorm * 10;
            
            
            System.out.print("Digite a quantidade de horas extras: ");
            horaExtra = teclado.nextFloat();
            
            precExtra = horaExtra * 15;
            
            System.out.print("Digite a quantidade de dependentes menores que 6 anos: ");
            depenMenor = teclado.nextFloat();
            
            depen = depenMenor * 90;
            
            System.out.printf("\n ");
            
            System.out.printf("Horas normais: R$"+precNormal);
            
            System.out.printf("\n ");
            
            System.out.printf("Adicional hora extra: R$"+precExtra);
            
            System.out.printf("\n ");
            
            System.out.printf("Adicional dependentes: R$"+depen);
            
            salarioLi = precNormal * (float)0.11;
            salarioLiquid = precNormal - salarioLi;
            salarioFinal = salarioLiquid + depen + precExtra;
            
            System.out.printf("\n ");
            
            System.out.printf("Salario liquido: R$"+salarioLiquid);
            
            System.out.printf("\n ");
            System.out.printf("Salario final: R$"+salarioFinal);
            
            
         
            }
    
    }
