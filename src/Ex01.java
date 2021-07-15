import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
        /*Fa�a um programa que permita ao usu�rio digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usu�rio escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa./
*/
        String atividades[] = new String[30];
        Scanner leitor = new Scanner(System.in);
        String opcao;
        //Para digitar as atividades vamos usar um loop
        for(int i=0;i<atividades.length;i++) {
            System.out.println("Qual foi a sua " + (i+1) + "� atividade do dia de hoje?");
            atividades[i] = leitor.nextLine();
        }
        System.out.println("Voc� deseja exibir suas atividades em ORDEM ou em ordem INVERSA?");
        opcao = leitor.next();
        if (opcao.equalsIgnoreCase("ORDEM")) {
            //Aqui preciso exibir em ordem
            for(int i=0;i<atividades.length;i++) {
                System.out.println(atividades[i]);
            }
        }else if(opcao.equalsIgnoreCase("INVERSA")) {
            //Aqui preciso exibir em ordem inversa
            for(int i=atividades.length-1;i>=0;i--) {
                System.out.println(atividades[i]);
            }
        }else {
            System.out.println("Voc� digitou uma op��o inv�lida.");
        }
        leitor.close();
    }
}
