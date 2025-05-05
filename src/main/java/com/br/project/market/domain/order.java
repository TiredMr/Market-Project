package com.br.project.market.domain;

public class order {
   int orderId;
   client client;
   shoppingCart shoppingCart;
   shippingMethod shippingMethod;
   paymentMethod paymentMethod;
   String status;

   public order() {
   }

   public int getOrderId() {
      return this.orderId;
   }

   public void setOrderId(int orderId) {
      this.orderId = orderId;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public void finalizeOrder() {
   }

   public void calculateShipping() {
   }

   public void calculateOrderTotal() {
   }

   public void cancelOrder() {
   }

   public void updateStatus() {
   }
}
