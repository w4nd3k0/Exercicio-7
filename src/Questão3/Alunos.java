/*Numa Universidade temos o seguinte ambiente
i. Alunos de Pós-Graduação só podem se increver em disciplinas de
pósgraduação.
ii. Alunos Especiais podem se inscrever em disciplinas de graduação e de pósgraduação.
iii. Alunos de Graduação só podem se inscrever em disciplinas de graduação.
a) Crie uma hierarquia de classes para esse problema que use herançaNão se
preocupe com detalhes de implementação das inscrições, pois o objetivo é
identificar as classes principais nesse ambiente.
b) Crie construtores para as classes
c) Crie pelo menos 1 atributo para cada classe (não vale contar atributo herdado).
d) Crie os gets e sets */

package Questão3;

public class Alunos {
    
    private int Matricula_Aluno;
    private String Nome_Aluno;
    private int Idade_Aluno;
    
    public int getMatricula_Aluno(){
        return this.Matricula_Aluno;
    }
    
    public String getNome_Aluno(){
        return this.Nome_Aluno;
    }
    
    public int getIdade_Aluno(){
        return this.Idade_Aluno;
    }
    
    public void setMatricula_Aluno(int m){
        this.Matricula_Aluno = m;
    }
    
    public void setNome_Aluno(String n){
        this.Nome_Aluno = n;
    }
    
    public void setIdade_Aluno(int i){
        this.Idade_Aluno = i;
    }
    
    public Alunos(int m, String n, int i){
        this.setMatricula_Aluno(m);
        this.setNome_Aluno(n);
        this.setIdade_Aluno(i);
    }
    
}
