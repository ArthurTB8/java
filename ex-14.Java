import java.util.Scanner;

 public class Main
    {
        public static void main (String[] args) {

            Scanner teclado = new Scanner(System.in);
            
            int quantSand;
            float fatiaPresun,fatiaMussa,pesoHam;
            
            System.out.print("Digite a quantidade de sanduiches: ");
            quantSand = teclado.nextInt();
            
            System.out.println("    ");
            
            fatiaMussa = quantSand * (float)0.05;
            fatiaPresun = quantSand * (float)0.10;
            pesoHam = quantSand * (float)0.12;
            
            System.out.printf("Para produzir " +quantSand+ "sanduiches serao necessarios: " );
            System.out.print( +fatiaMussa+ " kgs de mussarela");
            System.out.println("    ");
            System.out.print( +fatiaPresun+ " kgs de presunto");
            System.out.println("    ");
            System.out.print( +pesoHam+ " kgs de hamburguer");
            }
    
    }
