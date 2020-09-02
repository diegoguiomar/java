import java.text.DecimalFormat;
import java.util.Scanner;

public class AVA1 {

	private String placaMae;
	private String processador;
	private String gabinete;
	private String placaDeVideo;
	private String mouse;
	private String teclado;
	private String headset;
	private int memoria;
	private int monitor;
	private double preco;
	private DecimalFormat formatador = new DecimalFormat("0.00");
	
	public void setPlacaMae(String mob) {
		if (!mob.isEmpty()) {
			this.placaMae = mob;
		} else {
			System.out.println("Fabricante incorreto");
		}
	}
	public String getPlacaMae() {
		return this.placaMae;
	}
	
	public void setProcessador(String cpu) {
		if (!cpu.isEmpty()) {
			this.processador = cpu;
		} else {
			System.out.println("Fabricante incorreto");
	}
}	
	public String getProcessador() {
		return this.processador;
	}
	
	public void setGabinete(String gab) {
		if (!gab.isEmpty()) {
			this.gabinete = gab;
		} else {
			System.out.println("Fabricante incorreto");
		}
	}
	public String getGabinete() {
		return this.gabinete;
	}
	
	public void setPlacaDeVideo(String vga) {
		if (!vga.isEmpty()) {
			this.placaDeVideo = vga;
		} else {
			System.out.println("Fabricante incorreto");
		}
	}
	public String getPlacaDeVideo() {
		return this.placaDeVideo;
	}
	
	public void setMouse(String mou) {
		if (!mou.isEmpty()) {
			this.mouse = mou;
		} else {
			System.out.println("Fabricante incorreto");
		}
	}
	public String getMouse() {
		return this.mouse;
	}
	
	public void setTeclado(String tec) {
		if (!tec.isEmpty()) {
			this.teclado = tec;
		} else {
			System.out.println("Fabricante incorreto");
		}
	}
	public String getTeclado() {
		return this.teclado;
	}
	
	public void setHeadset(String hst) {
		if (!hst.isEmpty()) {
			this.headset = hst;
		} else {
			System.out.println("Fabricante incorreto");
		}
	}
	public String getHeadset() {
		return this.headset;
	}
	
	public void setMemoria(int ram) {
		if (ram >= 1) {
			this.memoria = ram;
		} else {
			System.out.println("Valor inválido, informe um valor acima de 1 GB!");
		}
	}
	public int getMemoria() {
		return this.memoria;
	}
	
	public void setMonitor(Integer scr) {
		if (scr > 10) {
			this.monitor = scr;
	} else {
		System.out.println("Tamanho do monitor muito pequeno!");
	}
}
	public int getMonitor() {
		return this.monitor;
	}
	
	public void setPreco(double prc) {
		this.preco = prc;
	}
	public double getPreco() {
		return this.preco;
	}
	
	
	public class Dados {
		private AVA1 meuComputador;
		public void entradaDados(AVA1 novoComputador) {
			
			Scanner sc = new Scanner(System.in);

			
			System.out.println("Frabricante da placa mãe: ");
			setPlacaMae(sc.nextLine());

			System.out.println("Modelo do processador: ");
			setProcessador(sc.nextLine());

			System.out.println("Frabricante do gabinete: ");
			setGabinete(sc.nextLine());

			System.out.println("Modelo da placa de video: ");
			setPlacaDeVideo(sc.nextLine());

			System.out.println("Modelo do mouse: ");
			setMouse(sc.nextLine());

			System.out.println("Modelo do teclado: ");
			setTeclado(sc.nextLine());

			System.out.println("Modelo do headset: ");
			setHeadset(sc.nextLine());

			System.out.println("Quantidade de memória: ");
			setMemoria(Integer.parseInt(sc.nextLine()));

			System.out.println("Tamanho do monitor: ");
			setMonitor(Integer.parseInt(sc.nextLine()));

			System.out.println("Preco do meuComputador: ");
			setPreco(Double.parseDouble(sc.nextLine()));
			this.meuComputador = novoComputador;
			sc.close();
			
		}
		
		public AVA1 imprimir() {
			
			System.out.println("Placa mãe: " + getPlacaMae());
			System.out.println("Processador: " + getProcessador());
			System.out.println("Gabinete: " + getGabinete());
			System.out.println("Placa de video: " + getPlacaDeVideo());
			System.out.println("Mouse: " + getMouse());
			System.out.println("Teclado: " + getTeclado());
			System.out.println("Headset: " + getHeadset());
			System.out.println("Memória ram: " + getMemoria() + "GB");
			System.out.println("Tamanho da tela: " + getMonitor() + "'");
			System.out.println("Preço: R$ " + formatador.format(getPreco()));
			return this.meuComputador;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVA1 meuComputador = new AVA1();
		Dados config = meuComputador.new Dados();
		
		meuComputador.setPlacaMae("Placa Mãe");
		meuComputador.setProcessador("Processador");
		meuComputador.setGabinete("Gabinete");
		meuComputador.setPlacaDeVideo("Placa de Video");
		meuComputador.setMouse("Mouse");
		meuComputador.setTeclado("Teclado");
		meuComputador.setHeadset("Headset");
		meuComputador.setMemoria(1);
		meuComputador.setMonitor(11);
		meuComputador.setPreco(0.00);
		
		config.entradaDados(meuComputador);
		config.imprimir();

	}
}
