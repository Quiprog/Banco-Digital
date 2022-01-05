package digital_bank.demo;

public class Main {

	public static void main(String[] args) {
		Cliente monet = new Cliente();
		monet.setNome("Monet");
		
		Conta cc = new ContaCorrente(monet);
		Conta poupanca = new ContaPoupanca(monet);
		Conta ce = new ContaEspecial(monet);
		
		ce.depositar(48);
		cc.depositar(1000);
		ce.sacarEspecial(200);
		cc.depositar(13);
		cc.transferir(200, poupanca);

		poupanca.imprimirExtrato();		
		cc.imprimirExtrato();		
		ce.imprimirExtrato();					
	}
}
