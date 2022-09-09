import java.util.Scanner;

 public class Main
    {
        public static void main (String[] args) {

            Scanner teclado = new Scanner(System.in);
            
            int anoIni,anoFin,idade,meses,dias;
            float semanas;
            
            System.out.print("Digite o ano inicial: ");
            anoIni = teclado.nextInt();
            
            System.out.print("Digite o ano final: ");
            anoFin = teclado.nextInt();
            
            idade = anoFin - anoIni;
            meses = idade * 12;
            dias = meses * 30;
            semanas = dias / 7; 
            
            System.out.print("A idade desta pessoa em");
            System.out.print("\n");
            System.out.printf("Anos e: "+idade);
            System.out.print("\n");
            System.out.printf("Meses e: "+meses);
            System.out.print("\n");
            System.out.printf("Semanas e: "+semanas);
            System.out.print("\n");
            System.out.printf("Dias e: "+dias);
            

            }
    
    }
