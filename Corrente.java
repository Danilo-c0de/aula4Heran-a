package herança;

public class Corrente extends conta {

	
	private double limite;

	public Corrente(String nome, int numero, double saldo, double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Corrente" + mostrar() + "limite=" + limite + " ";
	}
	
	
	
}
