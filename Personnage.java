public abstract class Personnage implements Victime{
    private String nom;
    private int hp;

    public Personnage(String nom, int hp){
        this.nom = nom;
        this.hp = hp;
    }

    public String toString(){
        return this.hp<=0? this.nom + " est mort." : this.nom+" a "+this.hp+" points de vie.";
    }

    public String getNom(){
        return this.nom;
    }

    public boolean mort(){
        return this.hp<=0;
    }

    public int getVie(){
        return this.hp;
    }

    public void addVie(int num){
        this.hp += num;
    }

    public abstract void attaque(Victime p);
}