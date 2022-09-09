import java.util.Scanner;

 public class Main
    {
        public static void main (String[] args) {

            Scanner teclado = new Scanner(System.in);
            
            int pequena,media,grande;
            float litros,totalPequena,totalMedia,totalgrande;
            
            System.out.print("Digite a QTDE de latas de garrafas de 350ml: ");
            pequena = teclado.nextInt();
            
            totalPequena = pequena *(float) 0.35;
            
            
            System.out.print("Digite a QTDE de latas de garrafas de 600ml: ");
            media = teclado.nextInt();
            
            totalMedia = media *(float)0.6;
            
             
            System.out.print("Digite a QTDE de latas de garrafas de 2l: ");
            grande = teclado.nextInt();
            
            totalgrande = grande *1;
            
            litros = totalPequena + totalMedia + totalgrande;
             
            System.out.printf("A quantidade total de litros e %.2f", +litros);
          
            }
    
    }
