package biblioteca;
import java.util.Scanner;

public class Navio extends Transporte {

	/* Declaração dos atributos */
	private String nome;
	private String dataLancamento;
	private int numeroTripulantes;
	
	/* Definição dos métodos */
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataLancamento() {
		return this.dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public int getNumeroTripulantes() {
		return this.numeroTripulantes;
	}
	public void setNumeroTripulantes(int numeroTripulantes) {
		this.numeroTripulantes = numeroTripulantes;
	}
	
	/* Construtor vazio chamando a superclasse */
	public Navio() {
		super();
	}

	/* Construtor com parâmetros chamando a superclasse */
	public Navio(int capacidadeTanque, int numeroPassageiros) {
		super(capacidadeTanque, numeroPassageiros);
	}
	public Navio(int capacidadeTanque, double preco) {
		super(capacidadeTanque, preco);
	}
	public Navio(int capacidadeTanque, int numeroPassageiros, double preco) {
		super(capacidadeTanque, numeroPassageiros, preco);
	}
	public Navio(int capacidadeTanque, int numeroPassageiros, double preco, String nome, String dataLancamento) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.nome = nome;
		this.dataLancamento = dataLancamento;
	}
	public Navio(int capacidadeTanque, int numeroPassageiros, double preco, String nome, String dataLancamento, int numeroTripulantes) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.numeroTripulantes = numeroTripulantes;
	}
	
	/* Cadastrar dados reaproveitando a superclasse */
	public void cadastrar(int capacidadeTanque, int numeroPassageiros, double preco, String nome, String dataLancamento, int numeroTripulantes) {
		super.cadastrar(capacidadeTanque, numeroPassageiros, preco);
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.numeroTripulantes = numeroTripulantes;
	}
	
	/* Exibição dos dados cadastrados reaproveitando a superclasse */
	public void imprimir() {
	super.imprimir();
	System.out.println("Nome: " + getNome());
	System.out.println("Data de lançamento: " + getDataLancamento());
	System.out.println("Numero de tripulantes: " + getNumeroTripulantes());
	}
	
	/* Entrada de dados via teclado reaproveitando a superclasse */
	public void entradaDados() {
	Scanner ent = new Scanner(System.in);
	System.out.println("Digite o nome do navio: ");
	setNome(ent.nextLine());
	System.out.println("Digite a data de lançamento: ");
	setDataLancamento(ent.nextLine());
	System.out.println("Digite a quantidade de tripulantes: ");
	setNumeroTripulantes(Integer.parseInt(ent.nextLine()));
	ent.close();
	}

	/* Quantidade de passageiros por tripulantes */
	public void passageirosPorTripulantes() {
		int divisaoPassageiro;
		
		divisaoPassageiro = this.numeroPassageiros / this.numeroTripulantes;
		
		System.out.println("Quantidade de passageiros por tripulantes: " + divisaoPassageiro);
	}
}