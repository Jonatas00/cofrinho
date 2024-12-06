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
    System.out.println("==========");
    System.out.println("Moeda adicionada!");
    System.out.println("==========");
    Thread.sleep(2000);
  }

  public void remover(Moeda moeda) throws InterruptedException {
    System.out.println("==========");
    System.out.println("Você removeu: \n");
    moeda.info();
    listaMoedas.remove(moeda);
    System.out.println("==========");
    Thread.sleep(2000);
  }

  public void listagemMoedas() throws InterruptedException {
    System.out.println("==========");
    if (listaMoedas.isEmpty()) {
      System.out.println("O cofrinho está vazio!");
    } else {
      for (Moeda m : listaMoedas) {
        m.info();
      }
    }
    System.out.println("==========");
    Thread.sleep(1000);
  }

  public void totalConvertido() throws InterruptedException {
    double sum = 0;
    System.out.println("==========");
    for (Moeda m : listaMoedas) {
      sum += m.converter();
    }
    System.out.printf("Total convertido: R$%.2f \n", sum);
    System.out.println("==========");
    Thread.sleep(2000);
  }
}
