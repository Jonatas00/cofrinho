package Model.Moedas;

import Model.Moeda;

public class Real extends Moeda {
  public Real(double valor) {
    super(valor);
  }

  public void info() {
    System.out.println("Real: " + valor);
  }

  public double converter() {
    return valor; // O Real já está em reais, não precisa de conversão
  }
}
