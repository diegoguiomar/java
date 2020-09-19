package aplicacao;
import java.util.Scanner;
import biblioteca.*;

public class AplicacaoTransporte {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao aviao[] = new Aviao[10];
		Navio navio[] = new Navio[10];
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual transporte você deseja cadastrar?");
		System.out.println("Digite 1 para avião ou 2 para navio");
		opcao = Integer.parseInt(sc.nextLine());
		sc.close();
		
		if(opcao == 1) {
			System.out.println("Cadastro do avião!");
			for(int i = 0; i < aviao.length; i++) {
				aviao[i] = new Aviao();
				aviao[i].entradaDados();
			}
		} 
		if(opcao == 2) {
			for(int j = 0; j < navio.length; j++) {
				navio[j] = new Navio();
				navio[j].entradaDados();
			}
		}
	}
}
