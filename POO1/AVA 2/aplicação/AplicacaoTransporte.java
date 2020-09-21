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

		try {
			if(opcao == 1) {
				for(int i = 0; i < aviao.length; i++) {
					System.out.println("Cadastro do avião " + i + "!");
					aviao[i] = new Aviao();
					aviao[i].entradaDados();
					aviao[i].reajustarPreco();
					System.out.println(""); 
				}
				for(int i = 0; i < aviao.length; i++) {
					System.out.println("Avião " + i + ":");
					aviao[i].imprimir();
					System.out.println(""); 
				}
			} 
			if(opcao == 2) {
				for(int i = 0; i < navio.length; i++) {
					navio[i] = new Navio();
					navio[i].entradaDados();
					System.out.println(""); 
				}
				for(int i = 0; i < navio.length; i++) {
					System.out.println("Navio " + i + ":");
					navio[i].imprimir();
					navio[i].passageirosPorTripulantes();
					System.out.println(""); 
				}
			}
		}catch(Exception ex) {
			System.out.println("Erro encontrado: ");
			System.out.println(ex);
		}
	}
}
