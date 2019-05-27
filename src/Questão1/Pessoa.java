/*
/*Cria uma classe Pessoa. Atributos: nome, endereço, telefone. Crie um construtor
para setar todos os atributos da classe Pessoa. Crie os gets e sets.*/
package Questão1;

public class Pessoa {
    
   private String Nome_Pessoa;
   private String Endereço_Pessoa;
   private String Telefone_Pessoa;
   
   
   public String getNome_Pessoa(){
       return this.Nome_Pessoa;
   }
   
   public String getEndereço_Pessoa(){
       return this.Endereço_Pessoa;
   }
   
   public String getTelefone_Pessoa(){
       return this.Telefone_Pessoa;
   }
   
   public void setNome_Pessoa(String n){
       this.Nome_Pessoa = n;
   }
   
   public void setEndereço_Pessoa(String e){
       this.Endereço_Pessoa = e;
   }
   
   public void setTelefone_Pessoa(String t){
       this.Telefone_Pessoa = t;
   }
   
   public Pessoa(String n, String e, String t){
       this.setNome_Pessoa(n);
       this.setEndereço_Pessoa(e);
       this.setTelefone_Pessoa(t);
   }
   
   public void Mostrar(){
       System.out.println("Nome: " + this.getNome_Pessoa());
       System.out.println("Endereço: " + this.getEndereço_Pessoa());
       System.out.println("Telefone: " + this.getTelefone_Pessoa());
   }
  
}