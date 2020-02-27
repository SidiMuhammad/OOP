package bangundimensi;

public class Lingkaran {
    final double phi = 3.14;
    int jari;
    
    public Lingkaran(int jari){
        this.jari=jari;
    }
    
    public int getJari(){
        return jari;
    }
    
    public void luas(){
        System.out.println("Luas Lingkaran: "+(phi*Math.pow(jari,2)));
    }
    
    public void keliling(){
        System.out.println("Keliling Lingkaran : "+(2*phi*jari));
    }
}