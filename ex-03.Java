import java.util.Scanner;

public class Main
{
    	public static void main(String[] args) {
	    
	    float media,prim,seg,terc,segPri,mediaPri,tercPri;
	    
		Scanner teclado = new Scanner(System.in);
	
      	System.out.printf("Informe a nota 1: ");
        prim = teclado.nextFloat();

        System.out.printf("Informe a nota 3: ");
        seg = teclado.nextFloat();

        System.out.printf("Informe a nota 4: ");
        terc = teclado.nextFloat();
        
        segPri = seg * 2;
        tercPri = terc * 3;
        media = prim + segPri + tercPri;
        mediaPri = media/6;
        System.out.printf("A sua media ponderada das notas " +prim+ " ,"+seg+" ," +terc+ " é %.2f", +mediaPri);
	}
}
