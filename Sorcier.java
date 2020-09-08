public class Sorcier extends Personnage {

    protected double pouvoir;

    public Sorcier(String nom, int hp){
        super(nom,hp);
        this.pouvoir = Math.random();
    }

    public void attaque(Victime p){
        if (!this.mort()){
            int recu = p.subitCharme((int)(this.getVie()*this.pouvoir));
            this.addVie(recu);
        }
    }

    public int subitFrappe(int coup){
        this.addVie(-coup);
        if (!(this.mort())){
            return -(int)(this.getVie()*this.pouvoir);
        }
        else{
            return 0;
        }
    }

    public int subitCharme(int coup){
        return 0;
    }

    public double getPouvoir(){
        return this.pouvoir;
    }
}