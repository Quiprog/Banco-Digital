package digital_bank.demo;

public interface IConta {
	
	void sacar(double valor);
	
	void sacarEspecial(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
