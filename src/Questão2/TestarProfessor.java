/*Numa Universidade existem 2 categorias de professores. Professores de regime
integral e professores horistas. Crie as classes necessárias para essa universidade
de acordo com as informações seguintes:
a) Professores de regime integral possuem um salário fixo para 40 horas de
atividades semanais
b) Professores horistas recebebem um valor estipulado por hora
c) Todos os professores tem informações de nome, idade e numero de matrícula.*/

package Questão2;

public class TestarProfessor {
    
    public static void main(String[] args) {
        Professor_Integral p1 = new Professor_Integral("Emerson", 37, 200, 10000.00);
        Professor_Horista p2 = new Professor_Horista("Flávia", 30, 400, 10, 4.50);
        
        p2.Mostrar();
        p1.Mostrar();
        
    }
    
}
