package Model;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
  private final List<Moeda> listaMoedas;

  public Cofrinho() {
    listaMoedas = new ArrayList<>();
  }

  public void adicionar(Moeda moeda) throws InterruptedException {
    listaMoedas.add(moeda);
    System.out.println("Moeda adicionada!");
    Thread.sleep(2000);
  }

  public void remover(Moeda moeda) throws InterruptedException {
    listaMoedas.remove(moeda);
    Thread.sleep(2000);
  }

  public void listagemMoedas() throws InterruptedException {
    System.out.println("==========");
    for (Moeda m : listaMoedas) {
      m.info();
    }
    System.out.println("==========");
    Thread.sleep(1000);
  }

  public void totalConvertido() throws InterruptedException {
    double sum = 0;
    for (Moeda m : listaMoedas) {
      sum += m.converter();
    }
    System.out.printf("Total convertido: R$%.2f", sum);
    Thread.sleep(2000);
  }
}
