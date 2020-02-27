package bangundimensi;

public class Segitiga {
    int sisi;
    
    public Segitiga(int sisi){
        this.sisi=sisi;
    }
    
    public int getSisi(){
        return sisi;
    }
    
    public void luas(){
        System.out.println("Luas Segitiga: "+(Math.pow(sisi,2)/4*Math.sqrt(3)));
    }
    
    public void keliling(){
        System.out.println("Keliling Segitiga : "+(3*sisi));
    }
}
