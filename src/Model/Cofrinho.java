package Model;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
  private List<Moeda> listaMoedas;

  public Cofrinho() {
    listaMoedas = new ArrayList<>();
  }

  public void adicionar(Moeda moeda) {
    listaMoedas.add(moeda);
  }

  public void remover(Moeda moeda) {
    listaMoedas.remove(moeda);
  }

  public void listagemMoedas() {
    for (Moeda m : listaMoedas) {
      m.info();
    }
  }

  public void totalConvertido() {
    double sum = 0;
    for (Moeda m : listaMoedas) {
      sum += m.converter();
    }
    System.out.printf("Total convertido: R$%.2f", sum);
  }
}
