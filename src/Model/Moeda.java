package Model;

public abstract class Moeda {
  protected double valor;

  public Moeda(double valor) {
    this.valor = valor;
  }

  public abstract void info();

  public abstract double converter();

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Moeda moeda = (Moeda) obj;
    return valor == moeda.valor;
  }
}
