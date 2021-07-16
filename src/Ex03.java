import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		int elementos[] = new int[10];
		int entre3e7=0, pares=0, impares=0, menores3=0;
		
		
		Random gerador = new Random();
		for (int i=0;i<elementos.length;i++) {
		
		//cada vez que for gerar o aleatório, utiliza o nextInt(LIMITE SUPERIOR)
		elementos[i] = gerador.nextInt(10);//Gera entre 0 e 9
		}
		// O loop abaixo serve para verificarmos os intervalos em que os valores se enquadrem
		for(int i=0;i<elementos.length;i++) {
			if (elementos[i] > 3 && elementos[i] <7 ) {
				entre3e7++; //é o mesmo entre3e7 = entre3e7 +1;
			}else if (elementos[i] < 3) {
				menores3++;
			}
			if (elementos[i] % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println("Foram sorteados " + entre3e7 + " valores entre 3 e 7");
		System.out.println("Foram sorteados " + menores3 + " valores menores que 3");
		System.out.println("Foram sorteados " + pares + " valores pares");
		System.out.println("Foram sorteados " + impares + " ímpares");
		
		System.out.println("\n\n\n O vetor sorteado foi");
		for(int i=0;i<elementos.length;i++) {
			System.out.println(elementos[i]);
		}
		
	}
	

}
