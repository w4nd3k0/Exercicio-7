
package Questão3;

public class Alunos_Graduação extends Alunos{
    
    private String disciplina_Graduação;

    public String getDisciplina_Graduacao() {
        return this.disciplina_Graduação;
    }

    public void setDisciplina_Graduacao(String g) {
        this.disciplina_Graduação = g;
    }
    
    public Alunos_Graduação(int m, String n, int i, String g){
        super(m, n, i);
        this.setDisciplina_Graduacao(g);
    }
    
}
