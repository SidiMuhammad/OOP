package bangundimensi;

public class Kubus extends Persegi{
    
    public Kubus(int sisi){
        super(sisi);
    }
    
    public void volume(){
        System.out.println("Volume : "+(Math.pow(sisi,3)));
    }
    
    public void luasp(){
        System.out.println("Luas permukaan : "+(6*sisi*sisi));
    } 
}
