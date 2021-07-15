import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		int elementos[] = new int[50];
		
		
		Random gerador = new Random();
		for (int i=0;i<elementos.length;i++)
		
		//cada vez que for gerar o aleatório, utiliza o nextInt(LIMITE SUPERIOR)
		System.out.println(gerador.nextInt(10));//Gera entre 0 e 9
		

	}

}
