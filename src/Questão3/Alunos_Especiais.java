
package Questão3;

public class Alunos_Especiais extends Alunos{
    
    private String disciplina_Graduacao;
    private String disciplina_PosGraduacao;
    
    public String getDisciplina_Graduacao() {
        return this.disciplina_Graduacao;
    }
    
    public String getDisciplina_PosGraduacao() {
        return this.disciplina_PosGraduacao;
    }
    
    public void setDisciplina_Graduacao(String g) {
        this.disciplina_Graduacao = g;
    }

    public void setDisciplina_PosGraduacao(String p) {
        this.disciplina_PosGraduacao = p;
    }
    
    public Alunos_Especiais(int m, String n, int i,String g, String p){
        super(m, n, i);
        this.setDisciplina_Graduacao(g);
        this.setDisciplina_PosGraduacao(p);
    }
}
