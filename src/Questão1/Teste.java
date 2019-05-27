/*Crie um classe de teste que contenha um main e crie uma pessoa, um
fornecedor e um empregado. Chame os métodos de cada classe (que não
sejam os gets e sets). */

package Questão1;

public class Teste {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carla", "Rua A,132 - Centro Pirapora - MG", "38 3740-0000");
        Fornecedor f1 = new Fornecedor("Sicoob", "Rua Antonio Nascimento, n 179, Centro - Pirapora-MG", "3742-6250", 200.00, 120.00);
        Empregado e1 = new Empregado("Samuel de Thais", "Rua A, 132, centro - Buritizeiro - MG", "38 3742-1661", "c1", 1200, 10);
        

        e1.Mostrar();

    }
}
