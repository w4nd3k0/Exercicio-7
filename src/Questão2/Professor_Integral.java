/*Numa Universidade existem 2 categorias de professores. Professores de regime
integral e professores horistas. Crie as classes necessárias para essa universidade
de acordo com as informações seguintes:
a) Professores de regime integral possuem um salário fixo para 40 horas de
atividades semanais
b) Professores horistas recebebem um valor estipulado por hora
c) Todos os professores tem informações de nome, idade e numero de matrícula.*/

package Questão2;

public class Professor_Integral extends Professor{
    private double Salario_Professor_Integral;
    
    public double getSalario_Professor_Integral(){
        return this.Salario_Professor_Integral;
    }
    
    public void setSalario_Professor_Integral(double s){
        this.Salario_Professor_Integral = s;
    }
    
    public Professor_Integral(String n, int i, int m, double s){
        super(n, i, m);
        this.setSalario_Professor_Integral(s);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome_Professor());
        System.out.println("Idade: " + this.getIdade_Professor());
        System.out.println("Matricula: " + this.getMatricula_Professor());
        System.out.println("Salário: " + this.getSalario_Professor_Integral());
    }
}
