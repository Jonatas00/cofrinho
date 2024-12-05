package Model;

public abstract class Moeda {
  protected double valor;

  public Moeda(double valor) {
    this.valor = valor;
  }

  public abstract void info();

  public abstract double converter();

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
