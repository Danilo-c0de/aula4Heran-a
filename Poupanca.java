package herança;

public class Poupanca extends Conta {

	public Poupanca(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
	}
	
	public String toString() {
		return "Poupanca " + mostrar(); 
	}

	private String mostrar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
