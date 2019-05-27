/*Numa Universidade existem 2 categorias de professores. Professores de regime
integral e professores horistas. Crie as classes necessárias para essa universidade
de acordo com as informações seguintes:
a) Professores de regime integral possuem um salário fixo para 40 horas de
atividades semanais
b) Professores horistas recebebem um valor estipulado por hora
c) Todos os professores tem informações de nome, idade e numero de matrícula.*/

package Questão2;

public class Professor {
    
    private String Nome_Professor;
    private int Idade_Professor;
    private int Matricula_Professor;
    
    public String getNome_Professor(){
        return this.Nome_Professor;
    }
    
    public int getIdade_Professor(){
        return this.Idade_Professor;
    }
    
    public int getMatricula_Professor(){
        return this.Matricula_Professor;
    }
    
    public void setNome_Professor(String n){
        this.Nome_Professor = n;
    }
    
    public void setIdade_Professor(int i){
        this.Idade_Professor = i;
    }
    
    public void setMatricula_Professor(int m){
        this.Matricula_Professor = m;
    }
    
    public Professor(String n, int i, int m){
        this.setNome_Professor(n);
        this.setIdade_Professor(i);
        this.setMatricula_Professor(m);
    }
}
