package classes;
import java.util.Date;
import contas.Conta;

public class Movimento {
	
	private Date data;
	private Conta conta;
	private String historico;
	private double valor;
	private double saldoanterior;
	private int operacao;
	
	public Movimento() {
		;
	}

	public Movimento(Date data, Conta conta, String historico, double valor) {
		this();
		this.data = data;
		this.conta = conta;
		this.historico = historico;
		this.valor = valor;
		this.operacao = operacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSaldoanterior() {
		return saldoanterior;
	}

	public void setSaldoanterior(double saldoanterior) {
		this.saldoanterior = saldoanterior;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	
	public void movimentar(double valor, int operacao) {
		this.saldoanterior = conta.getSaldo();
		conta.movimentar(valor,operacao);
		
	}

	@Override
	public String toString() {
		return "Movimento [data=" + data + ", conta=" + conta + ", historico=" + historico + ", valor=" + valor
				+ ", Saldo Anterior=" + saldoanterior + ", operacao=" + operacao + "]";
	}
	
	
	
}

