import java.util.Scanner;

 public class Main
    {
        public static void main (String[] args) {

            Scanner teclado = new Scanner(System.in);

            float areaTrap,areaQua,areaCirc,areaTri;
            int  baseMaior,baseMenor,valorAltura,trapPrim,trapSec,ladoQua,largRetan;
            int  alturRetan,areaRetan,raio,baseTrian,alturaTrian,areaTrium;
            
            System.out.println("Area do trapezio:");
            
            
            System.out.print("Informe o valor da base maior: ");
            baseMaior = teclado.nextInt();
            
            System.out.print("Informe o valor da base menor: ");
            baseMenor = teclado.nextInt();
            
            System.out.print("Informe o valor da altura: ");
            valorAltura = teclado.nextInt();
            
            trapPrim = baseMaior + baseMenor;
            trapSec = trapPrim * valorAltura;
            areaTrap = trapSec / 2;
          
            System.out.printf("Informe o valor de base maior e: %.2f ", +areaTrap);
             
            System.out.println(" \n                     ");
            
            System.out.print("Area do quadrado:");
            
            System.out.println(" \n                     ");
            
            System.out.print("Informe o valor de um dos lados: ");
            ladoQua = teclado.nextInt();
           
            areaQua = ladoQua * 4;
            
            System.out.printf("A area do quadrado e: %.2f", +areaQua);
            
            System.out.println(" \n                     ");
            
            System.out.print("Area do retangulo:");
            
            System.out.println(" \n                     ");
            
            System.out.print("Informe o valor da largura: ");
            largRetan = teclado.nextInt();
            
            System.out.print("Informe o valor da altura: ");
            alturRetan = teclado.nextInt();
            
            areaRetan = largRetan * alturRetan;
            
            System.out.printf("Informe o valor do retangulo: "+areaRetan);
            
            System.out.println(" \n                     ");
            
            System.out.print("Area do circulo:");
            
            System.out.println(" \n                     ");
            
            System.out.print("Informe o valor do raio: ");
            raio = teclado.nextInt();
            
            areaCirc = raio * raio * (float)3.14;
           
            System.out.printf("A area do circulo e: %.2f", +areaCirc);
            
            System.out.println(" \n                     ");
            
            System.out.print("Area do triangulo:");
            
            System.out.println(" \n                     ");
            
            System.out.print("Informe o valor da base: ");
            baseTrian = teclado.nextInt();
            
            System.out.print("Informe o valor da altura: ");
            alturaTrian = teclado.nextInt();
            
            areaTrium = baseTrian * alturaTrian;
            areaTri = areaTrium /(float) 2;
            
            System.out.printf("A area do triangulo e: %.2f", +areaTri);
            
            
            
        }
    
    }
