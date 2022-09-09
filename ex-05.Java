import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	   Scanner teclado = new Scanner(System.in);
	   
	   int first, sec;
	   float div;
	    
	   System.out.print("Informe o valor 1:");
	    first  = teclado.nextInt();
	    
	   System.out.print("Informe o valor 2:");
	    sec = teclado.nextInt();
	    
	 System.out.println("                              ");
	    
	    div = first/(float)sec;
	    
	   System.out.printf("A divisão de ", +first);
	   System.out.print(" por " +sec);
	   System.out.printf(" é %.2f", +div);
	}
}
