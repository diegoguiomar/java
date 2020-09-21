package biblioteca;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Aviao extends Transporte{

	/* Declaração dos atributos */
	private String prefixo;
	private String dataRevisao;
	
	/* Definição dos métodos */
	public String getPrefixo() {
		return this.prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	
	public String getDataRevisao() {
		return this.dataRevisao;
	}
	public void setDataRevisao(String dataRevisao) {
		this.dataRevisao = dataRevisao;
	}

	/* Construtor vazio chamando a superclasse */
	public Aviao() {
		super();
	}
	
	/* Construtor com parâmetros chamando a superclasse */
	public Aviao(int capacidadeTanque, int numeroPassageiros) {
		super(capacidadeTanque, numeroPassageiros);
	}
	public Aviao(int capacidadeTanque, double preco) {
		super(capacidadeTanque, preco);
	}
	public Aviao(int capacidadeTanque, int numeroPassageiros, double preco) {
		super(capacidadeTanque, numeroPassageiros, preco);
	}
	public Aviao(int capacidadeTanque, int numeroPassageiros, double preco, String prefixo) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.prefixo = prefixo;
	}
	public Aviao(int capacidadeTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
		super(capacidadeTanque, numeroPassageiros, preco);
		this.prefixo = prefixo;
		this.dataRevisao = dataRevisao;
	}

	/* Cadastrar dados reaproveitando a superclasse */
	public void cadastrar(int capacidadeTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
		super.cadastrar(capacidadeTanque, numeroPassageiros, preco);
		this.prefixo = prefixo;
		this.dataRevisao = dataRevisao;
	}
	
	/* Exibição dos dados cadastrados reaproveitando a superclasse */
	public void imprimir() {
		super.imprimir();
		System.out.println("Prefixo: " + getPrefixo());
		System.out.println("Data de revisão: " + getDataRevisao());
	}
	
	/* Entrada de dados via teclado reaproveitando a superclasse */
	public void entradaDados() {
		super.entradaDados();
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite o prefixo: ");
		setPrefixo(ent.nextLine());
		System.out.println("Digite a data de revisão: ");
		setDataRevisao(ent.nextLine());
	}
	
	private static NumberFormat FORMATADOR_PRECO = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	/* Reajuste de preço */
	public void reajustarPreco() {
		Scanner sc = new Scanner(System.in);
        boolean auxVerificadora = false;
        String auxreajustarPreco;
        float percentual;
        while (!auxVerificadora){
            System.out.println("Digite + para acrescimo e - para desconto: ");
            auxreajustarPreco = sc.nextLine();
            if(auxreajustarPreco.equals("+")){
                System.out.println("Digite o % de acrescimo:");
                percentual = sc.nextFloat()/100;
                this.setPreco(this.getPreco() + (this.getPreco() * percentual));
                auxVerificadora = true;
                System.out.println("Preço final: " + FORMATADOR_PRECO.format(this.getPreco()));
            }else if (auxreajustarPreco.equals("-")){
                System.out.println("Digite o % de desconto:");
                percentual = sc.nextFloat() / 100;
                this.setPreco(this.getPreco() - (percentual * this.getPreco()));
                auxVerificadora = true;
                System.out.println("Preço final: " + FORMATADOR_PRECO.format(this.getPreco()));
            }else{
                System.out.println("===Opção inválida digitada: ");
            }
        }
    }
}
