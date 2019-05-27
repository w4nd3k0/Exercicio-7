/*Crie uma classe Empregado, que herde da classe Pessoa. Atributos:
codigoSetor, salarioBase (vencimento base) e imposto (porcentagem retida dos
impostos). Métodos: calcularSalario (leve em consideração o salario base e o
imposto). Crie um construtor para setar todos os atributos da classe
Empregado. Crie os gets e sets. */

package Questão1;

public class Empregado extends Pessoa{
    private String CodigoSetor_Empregado;
    private double SalarioBase_Empregado;
    private double Imposto_Empregado;
    
    public String getCodigoSetor_Empregado(){
        return this.CodigoSetor_Empregado;
    }
    
    public double getSalarioBase_Empregado(){
        return this.SalarioBase_Empregado;
    }
    
    public double getImposto_Empregado(){
        return this.Imposto_Empregado;
    }
    
    public void setCodigoSetor_Empregado(String c){
        this.CodigoSetor_Empregado = c;
    }
    
    public void setSalarioBase_Empregado(double b){
        this.SalarioBase_Empregado = b;
    }
    
    public void setImposto_Empregado(double i){
        this.Imposto_Empregado = i;
    }
    
    public double CalcularSalario(double s){
        s = this.getSalarioBase_Empregado() - (this.getSalarioBase_Empregado() / 100 * this.getImposto_Empregado());
        return s;
    }
    
    public Empregado(String n, String e, String t, String c, double b, double i){
        super(n, e, t);
        this.setCodigoSetor_Empregado(c);
        this.setSalarioBase_Empregado(b);
        this.setImposto_Empregado(i);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome_Pessoa());
        System.out.println("Endereço: " + this.getEndereço_Pessoa());
        System.out.println("Telefone: " + this.getTelefone_Pessoa());
        System.out.println("Código Setor: " + this.getCodigoSetor_Empregado());
        System.out.println("Salário Base: " + this.getSalarioBase_Empregado());
        System.out.println("Imposto: " + this.getImposto_Empregado());
        System.out.println("Salário: " + this.CalcularSalario(Imposto_Empregado));
    }
    
}
