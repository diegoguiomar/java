package biblioteca;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Transporte {
	
	/* Declaração dos atributos */
	protected int capacidadeTanque;
	protected int numeroPassageiros;
	protected double preco;
	
	/* Definição dos métodos */
	
	public int getCapacidadeTanque() {
		return this.capacidadeTanque;
	}
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public int getNumeroPassageiros() {
		return this.numeroPassageiros;
	}
	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/* Construtor vazio */
	public Transporte( ) { }
	
	/* Construtor com parâmetros */
	public Transporte(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public Transporte(int numeroPassageiros, int capacidadeTanque) {
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeTanque = capacidadeTanque;
	}
	public Transporte(int capacidadeTanque, double preco) {
		this.capacidadeTanque = capacidadeTanque;
		this.preco = preco;
	}
	public Transporte(double preco, int numeroPassageiros) {
		this.preco = preco;
		this.numeroPassageiros = numeroPassageiros;
	}
	public Transporte(int capacidadeTanque, int numeroPassageiros, double preco) {
		this.capacidadeTanque = capacidadeTanque;
		this.numeroPassageiros = numeroPassageiros;
		this.preco = preco;
	}

	/* Cadastrar dados */
	public void cadastrar(int capacidadeTanque, int numeroPassageiros, double preco) {
		this.capacidadeTanque = capacidadeTanque;
		this.numeroPassageiros = numeroPassageiros;
		this.preco = preco;
	}
	
	/* Exibição dos dados cadastrados */
	private static NumberFormat FORMATADOR_PRECO = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	public void imprimir() {
		System.out.println("Capacidade do tanque: " + getCapacidadeTanque());
		System.out.println("Numero de passageiros: " + getNumeroPassageiros());
		System.out.println("Preço: " + FORMATADOR_PRECO.format(getPreco()));
	}

	/* Entrada de dados via teclado */
	public void entradaDados() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite a capadidade do tanque: ");
		setCapacidadeTanque(Integer.parseInt(ent.nextLine()));
		System.out.println("Digite o número de passageiros: ");
		setNumeroPassageiros(Integer.parseInt(ent.nextLine()));
		System.out.println("Digite o preço: ");
		setPreco(Double.parseDouble(ent.nextLine()));
	}
}
