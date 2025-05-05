package com.br.project.market.domain;

public class Product {
  String name;

  public Product(String name) {
    this.name = name;
  }

  public Product() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void updateStock() {
  }

  public void checkAvailability() {
  }

}
