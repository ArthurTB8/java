import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	    float PrecFer,QuantCav,Val, ferra;
	    
		System.out.print("Informe a quantidade de cavalos:");
		QuantCav  = teclado.nextFloat();
		
		System.out.print("Informe o valor de cada ferradura:");
		PrecFer = teclado.nextFloat();
		
	    ferra = QuantCav * 4;
	    Val = ferra * PrecFer;
		
		System.out.printf("A quantidade de ferraduras necessarias:%.0f ", +ferra);
		System.out.print("\n Valor total para a compra das ferraduras:R$ " +Val);
	}
}
