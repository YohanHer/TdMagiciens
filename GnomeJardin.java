public class GnomeJardin extends NainJardin implements SuperPouvoir{
    
    public GnomeJardin(String nom, int val){
        super(nom,val);
    }

    public double sort(){
        return Math.random()*this.solidite;
    }

    @Override
    public int subitCharme(int coup){
        double renvoi = sort();
        if (coup<renvoi){
            return -coup;
        }
        else {
            return 0;
        }
    }
}