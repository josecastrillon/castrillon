package beans;

public class BeanFactorial {
	private int fact;
	private int numero;

	public int getFact() {
		return fact;
	}

	public void setFact(int fact) {
		this.fact = fact;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getGenerarFactorial() {
		for (int i = 1; i <= getNumero(); i++) {
			setFact(i * getFact());
		}
		return getFact();
	}

}
