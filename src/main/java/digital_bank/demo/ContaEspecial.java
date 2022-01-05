package digital_bank.demo;

public class ContaEspecial extends Conta {

	public ContaEspecial(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Especial ===");
		super.imprimirInfosComuns();
	}
	
}
