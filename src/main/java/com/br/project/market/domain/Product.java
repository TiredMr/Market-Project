package com.br.project.market.domain;

public class Product {
  String name;
  double weight;

  public Product(String name, double weight) {
    this.name = name;
    this.weight = weight;
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

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

}
