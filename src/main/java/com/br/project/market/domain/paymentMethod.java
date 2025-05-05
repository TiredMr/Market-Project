package com.br.project.market.domain;

public class paymentMethod {
   int paymentMethodId;
   String description;

   public paymentMethod() {
   }

   public int getPaymentMethodId() {
      return this.paymentMethodId;
   }

   public void setPaymentMethodId(int paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void paymentProcess() {
   }
}
