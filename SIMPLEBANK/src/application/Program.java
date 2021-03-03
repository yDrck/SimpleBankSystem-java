package application;

import classes.Movimento;
import contas.Conta;
import contas.ContaComum;
import contas.ContaEspecial;
import usuario.Correntista;

public class Program {

	public static void main(String[] args) {
		
		Correntista correntista = new Correntista("Fulano Silva","fulanosilva@gmail.com","18374576837");
		Correntista correntista1 = new Correntista("Ciclano Silva","ciclanosilva@gmail.com","14526576837");
		Correntista correntista2 = new Correntista("Beltrano Silva","beltranosilva@gmail.com","22226576837");
		
		ContaEspecial conta =  new ContaEspecial(312312, correntista, 5000, -100);
		
		System.out.println(conta);
		System.out.println("----------------------------");
		
		System.out.println("Este é seu saldo atual: "+ conta.getSaldo());
	}
}
