
// Classe com 10 atributos para criação de objetos de computador OK
// Ter 10 métodos construtores OK

// Métodos de acesso (getters e setters) OK
// Métodos de entrada de dados OK
// Métodos de exibição OK
// Métodos de cadastramento OK

// Criar uma aplicação para gerar ao menos 6 objetos do computador, utilizando
// métodos construtores diferentes

import java.text.DecimalFormat;
import java.util.Scanner;

public class Computador {

	// Atributos
	String placaMae, processador, gabinete, placaDeVideo, mouse, teclado, headset;
	int memoria, monitor;
	double preco;
	DecimalFormat formatador = new DecimalFormat("0.00");

	// Métodos de acesso
	public String getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(String mob) {
		if (!mob.isEmpty()) {
			placaMae = mob;
		} else if (mob.length() < 4) {
			System.out.println("Fabricante incorreto");
		} else {
			System.out.println("Valor inválido!");
		}
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String cpu) {
		if (!cpu.isEmpty()) {
			processador = cpu;
		} else if (cpu.length() < 3) {
			System.out.println("Fabricante incorreto");
		} else {
			System.out.println("Valor inválido");
		}
	}

	public String getGabinete() {
		return gabinete;
	}

	public void setGabinete(String gab) {
		if (!gab.isEmpty()) {
			gabinete = gab;
		} else if (gab.length() < 3) {
			System.out.println("Fabricante incorreto");
		} else {
			System.out.println("Valor inválido");
		}
	}

	public String getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(String vga) {
		if (!vga.isEmpty()) {
			placaDeVideo = vga;
		} else if (vga.length() < 3) {
			System.out.println("Fabricante incorreto");
		} else {
			System.out.println("Valor inválido");
		}
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mou) {
		if (!mou.isEmpty()) {
			mouse = mou;
		} else if (mou.length() < 3) {
			System.out.println("Fabricante incorreto");
		} else {
			System.out.println("Valor inválido");
		}
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String tec) {
		if (!tec.isEmpty()) {
			teclado = tec;
		} else if (tec.length() < 3) {
			System.out.println("Fabricante incorreto");
		} else {
			System.out.println("Valor inválido");
		}
	}

	public String getHeadset() {
		return headset;
	}

	public void setHeadset(String hst) {
		if (!hst.isEmpty()) {
			headset = hst;
		} else if (hst.length() < 3) {
			System.out.println("Fabricante incorreto");
		} else {
			System.out.println("Valor inválido");
		}
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int ram) {
		if (ram >= 1) {
			memoria = ram;
		} else {
			System.out.println("Valor inválido, informe um valor acima de 1 GB!");
		}
	}

	public int getMonitor() {
		return monitor;
	}

	public void setMonitor(int scr) {
		monitor = scr;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double prc) {
		preco = prc;
	}

	public Computador() {
	}
	 // Separar esses valores em 10 construtores
	public Computador(String mob, String cpu, String gab, String vga, String mou, String tec, String hst, int ram, int scr, double prc) {
		setPlacaMae(mob);
		setProcessador(cpu);
		setGabinete(gab);
		setPlacaDeVideo(vga);
		setMouse(mou);
		setTeclado(tec);
		setHeadset(hst);
		setMemoria(ram);
		setMonitor(scr);
		setPreco(prc);
	/*}
	public Computador(String cpu) {
		setProcessador(cpu);
	}
	public Computador(String gab) {
		setGabinete(gab);
	}
	public Computador(String vga) {
		setPlacaDeVideo(vga);
	}
	public Computador(String mou) {
		setMouse(mou);
	}
	public Computador(String tec) {
		setTeclado(tec);
	}
	public Computador(String hst) {
		setHeadset(hst);
	}
	public Computador(int ram) {
		setMemoria(ram);
	}
	public Computador(int scr) {
		setMonitor(scr);
	}
	public Computador(double prc) {
		setPreco(prc);*/
	}

	public void entradaDados() {
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

		System.out.println("Preco do computador: ");
		setPreco(Double.parseDouble(sc.nextLine()));

		sc.close();
	}

	public void imprimir() {
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
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Computador config1 = new Computador("Asus", "Ryzen 5 3500H", "DT3 Andromeda", "GTX 1650TI", "Redragon Cobra",
				"Redragon USAS", "Fallen Morcego", 16, 20, 4500.00);*/
		Computador obj2 = new Computador();
		//Computador obj3 = new Computador();
		//Computador obj4 = new Computador();
		//Computador obj5 = new Computador();
		//Computador obj6 = new Computador();
	
		//obj1.entradaDados();
		obj2.entradaDados();
		//obj3.entradaDados();
		//obj4.entradaDados();
		//obj5.entradaDados();
		//obj6.entradaDados();
		
		//obj1.imprimir();
		obj2.imprimir();
		//obj3.imprimir();
		//obj4.imprimir();
		//obj5.imprimir();
		//obj6.imprimir();
	}

}
