package Model.Moedas;

import Model.Moeda;

public class Dolar extends Moeda {
  public Dolar(double valor) {
    super(valor);
  }

  @Override
  public void info() {
    System.out.println("Dólar: " + valor);
  }

  @Override
  public double converter() {
    return valor * 5.0; // Exemplo: 1 dólar = 5 reais
  }
}
