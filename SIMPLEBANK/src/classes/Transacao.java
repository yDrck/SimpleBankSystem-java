package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import classes.Movimento;

import contas.Conta;

public class Transacao {
	private List<Movimento> movimentos;
	
	
	public Transacao() {
		movimentos = new ArrayList<>();
	}
	
	public void realizarTransacao(Date data, Conta conta, double valor, String historico, int operacao) {
		Movimento movimento = new Movimento(data, conta, historico, valor);
		movimento.movimentar(valor, operacao);
		this.movimentos.add(movimento);
	}
	
	public void estornaTransacao() {
		for (Movimento elem : this.movimentos) {
			elem = null;
		}
	}
	
	public List<Movimento> getMovimentos(){
		return this.movimentos;
	}
}
//Date data, Conta conta, String historico, double valor, double saldoanterior, int operacao