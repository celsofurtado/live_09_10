package br.com.fiap.live_09_10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Teste {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void somar(int tamanho) throws IndexOutOfBoundsException {
		int[] x = new int[tamanho];
		
		x[0] = a;
		x[1] = b;
		
		System.out.println("Entrando no método somar...");
		int c = a + b;
		System.out.println("A soma de A e B é: " + c);
		System.out.println("Saindo do método somar...");
		
		throw new IndexOutOfBoundsException();
	}

	public void dividir(int div) {
		System.out.println("Acessando método dividir...");

		try {
			double resultado = (a + b) / div;
			
			int[] x = new int[2];
			x[0] = 9;
			
			Teste teste = new Teste();
			teste.setB(5);
			
			System.out.println("O resultado da divisão é: " + resultado);
			
			FileReader fr = new FileReader("arquivo.txt");
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException | FileNotFoundException erro) {
			System.out.println(erro.getMessage());
			//erro.printStackTrace();
			//System.out.println("Não é possível divisão por ZERO!!");
		}
//		} catch (ArrayIndexOutOfBoundsException erro) {
//			erro.printStackTrace();
////			System.out.println(erro.getMessage());
////			System.out.println("O índice indicado é inválido...");
//		} catch (NullPointerException erro) {
//			System.out.println("O objeto teste não foi criado...");
//		} catch (FileNotFoundException erro) {
//			System.out.println("Arquivo não encontrado....");
//		} 

	}

	public void efetuarLooping() {
		System.out.println("Entrando do método efetuarLooping...");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Saindo do método efetuarLooping...");
	}

}
