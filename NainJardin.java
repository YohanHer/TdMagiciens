public class NainJardin implements Victime{
    
    int solidite;
    String nom;
    
    public NainJardin(String nom,int val){
        this.solidite = val;
        this.nom = nom;
    }

    public String toString(){
        return this.mort()? this.nom + " est cassé." : this.nom + " est solide de degré " + this.solidite+".";
    }

    public String getNom(){
        return this.nom;
    }

    public boolean mort(){
        return (this.solidite==0);
    }

    public int subitFrappe(int coup){
        int renvoi;
        if (coup>this.solidite){
            renvoi = -solidite;
            this.solidite = 0;
        }
        else{
            renvoi = -coup;
        }
        return renvoi;
    }

    public int subitCharme(int coup){
        return -1;
    }
}