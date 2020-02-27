package bangundimensi;

public class Tabung extends Lingkaran{
    int tinggi;
    
    public Tabung(int jari,int tinggi){
        super(jari);
        this.tinggi = tinggi;
    }
    
    public void volume(){
        System.out.println("Volume : "+(phi*Math.pow(jari,2)*tinggi));
    }
    
    public void luasp(){
        System.out.println("Luas permukaan : "+(2*phi*jari*(jari+tinggi)));
    } 
}