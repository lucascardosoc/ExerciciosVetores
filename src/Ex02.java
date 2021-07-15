import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		double notas[] = new double [50];
		String nomes[] = new String [50];
		double media=0;
		
		Scanner leitor = new Scanner(System.in);
		for(int i=0; i<nomes.length; i++) {
			System.out.println("Por favor, digite o nome do " + (i+1) + " º aluno");
			nomes[i] = leitor.next();
			System.out.println("Por favor, informe a nota deste aluno");
			notas[i] = leitor.nextDouble();
			
			media = media + notas[i];
			
		}
		
		media = media / notas.length;
		
		for(int i=0;i<notas.length;i++) {
			if (notas[i]<media) {
				System.out.println("O aluno " + nomes[i] + " tirou a nota " + notas[i] + ". É importante chamar para conversar");
			}
		}
		leitor.close();
	}

}
