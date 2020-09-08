public class Magicien extends Sorcier implements SuperPouvoir{
    
    public Magicien(String nom, int hp){
        super(nom, hp);
        this.pouvoir = this.pouvoir*SuperPouvoir.extra;
    }

    public double sort(){
        return Math.random()*this.pouvoir;
    }
    @Override
    public int subitCharme(int coup){
        return -(int)(coup*this.sort());
    }
}