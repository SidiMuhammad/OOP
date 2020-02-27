package bangundimensi;

public class Persegi {
    int sisi;
    
    public Persegi(int sisi){
        this.sisi=sisi;
    }
    
    public int getSisi(){
        return sisi;
    }
    
    public void luas(){
        System.out.println("Luas Persegi: "+(Math.pow(sisi,2)));
    }
    
    public void keliling(){
        System.out.println("Keliling Persegi : "+(4*sisi));
    }
}
