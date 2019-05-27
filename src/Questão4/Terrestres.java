
package Questão4;

public class Terrestres extends Transportes{
    
    private int Rodas;
    
    public int getRodas(){
        return this.Rodas;
    }
    
    public void setRodas(int r){
        this.Rodas = r;
    }
    
    public Terrestres(double c, int r){
        super(c);
        this.setRodas(r);
    }
}
