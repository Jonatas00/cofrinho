package Model;

public abstract class Moeda {

	protected Double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}

	public abstract void info();

	public abstract double converter();
}
