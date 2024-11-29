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
    System.out.println("Moeda adicionada.");
  }

  public void remover(Moeda moeda) {
    if (listaMoedas.remove(moeda)) {
      System.out.println("Moeda removida.");
    } else {
      System.out.println("Moeda não encontrada.");
    }
  }

  public void listagemMoedas() {
    if (listaMoedas.isEmpty()) {
      System.out.println("Cofrinho vazio.");
      return;
    }
    System.out.println("Moedas no cofrinho:");
    for (Moeda moeda : listaMoedas) {
      moeda.info();
    }
  }

  public double totalConvertido() {
    double total = 0;
    for (Moeda moeda : listaMoedas) {
      total += moeda.converter();
    }
    return total;
  }
}
