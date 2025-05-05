package com.br.project.market.domain;

public class shippingMethod {
   int shippingMethodId;
   String description;
   double priceWeight;

   public shippingMethod() {
   }

   public int getShippingMethodId() {
      return this.shippingMethodId;
   }

   public void setShippingMethodId(int shippingMethodId) {
      this.shippingMethodId = shippingMethodId;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public double getPriceWeight() {
      return this.priceWeight;
   }

   public void setPriceWeight(double priceWeight) {
      this.priceWeight = priceWeight;
   }

   public void calculateShipping(double priceWeight) {
   }
}
