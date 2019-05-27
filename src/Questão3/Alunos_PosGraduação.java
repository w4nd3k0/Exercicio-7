
package Questão3;

public class Alunos_PosGraduação extends Alunos{
    
    private String disciplina_PosGraduacao;
    
    public String getDisciplina_PosGraduacao() {
        return this.disciplina_PosGraduacao;
    }

    public void setDisciplina_PosGraduacao(String p) {
        this.disciplina_PosGraduacao = p;
    }
    
    private Alunos_PosGraduação(int m, String n, int i, String p){
        super(m, n, i);
        this.setDisciplina_PosGraduacao(p);
    }
    
}
