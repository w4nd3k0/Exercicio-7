
package Questão4;

public class Transportes {
    
    private double Capacidade;
    
    public double getCapacidade(){
        return this.Capacidade;
    }
    
    public void setCapacidade(double c){
        this.Capacidade = c;
    }
    
    public Transportes(double c){
        this.setCapacidade(c);
    }
}
