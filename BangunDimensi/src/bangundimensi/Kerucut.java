package bangundimensi;

public class Kerucut extends Lingkaran{
    int tinggi;
    
    public Kerucut(int jari,int tinggi){
        super(jari);
        this.tinggi = tinggi;
    }
    
    public void volume(){
        System.out.println("Volume : "+(phi*Math.pow(jari,2)*tinggi/3));
    }
    
    public void luasp(){
        System.out.println("Luas permukaan : "+(phi*jari*(jari+Math.sqrt(Math.pow(tinggi,2)+Math.pow(jari,2)))));
    } 
}