/*Numa Universidade existem 2 categorias de professores. Professores de regime
integral e professores horistas. Crie as classes necessárias para essa universidade
de acordo com as informações seguintes:
a) Professores de regime integral possuem um salário fixo para 40 horas de
atividades semanais
b) Professores horistas recebebem um valor estipulado por hora
c) Todos os professores tem informações de nome, idade e numero de matrícula.*/

package Questão2;

public class Professor_Horista extends Professor{
    
    private double SalarioBase_Professor_Horista;
    private int HorasAula;
    
    public double getSalarioBase_Professor_Integral(){
        return this.SalarioBase_Professor_Horista;
    }
    
    public int getHorasAula(){
        return this.HorasAula;
    }
    
    public void setSalarioBase_Professor_Integral(double b){
        this.SalarioBase_Professor_Horista = b;
    }
    
    public void setHorasAula(int h){
        this.HorasAula = h;
    }
    
    public double SalarioProfessor_Horista(double s){
        s = this.getHorasAula() * this.getSalarioBase_Professor_Integral();
        return s;
    }
    
    public Professor_Horista(String n, int i, int m, int h,double b){
        super(n, i, m);
        this.setHorasAula(h);
        this.setSalarioBase_Professor_Integral(b);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNome_Professor());
        System.out.println("Idade: " + this.getIdade_Professor());
        System.out.println("Matricula: " + this.getMatricula_Professor());
        System.out.println("Salário: " + this.getSalarioBase_Professor_Integral());
        System.out.println("Horas/Aula: " + this.getHorasAula());
        System.out.println("Salário: " + this.SalarioProfessor_Horista(SalarioBase_Professor_Horista));
    }
}
