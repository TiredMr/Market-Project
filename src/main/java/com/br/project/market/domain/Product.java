package com.br.project.market.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
  private Long id;
  private String name;
  private double weight;

  public void updateStock() {
  }

  public void checkAvailability() {
  }
}
