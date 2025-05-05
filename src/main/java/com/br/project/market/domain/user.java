package com.br.project.market.domain;

public class user {
   int idUser;
   String email;
   String password;

   public user() {
   }

   public int getIdUser() {
      return this.idUser;
   }

   public void setIdUser(int idUser) {
      this.idUser = idUser;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public void login() {
   }

   public void recoveryPassword() {
   }
}
