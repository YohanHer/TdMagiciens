public class Main {
    public static void main(String[] args){
        Victime[] table = new Victime[10];

        table[0] = new Magicien("Gandalf", (int)(Math.random()*100));
        table[1] = new Sorcier("Dumbledore", (int)(Math.random()*100));
        table[2] = new Sorcier("Saroumane", (int)(Math.random()*100));
        table[3] = new Sorcier("Radagast", (int)(Math.random()*100));
        table[4] = new Sorcier("Samantha", (int)(Math.random()*100));
        table[5] = new Monstre("Dracula", (int)(Math.random()*100));
        table[6] = new Monstre("Frankestein", (int)(Math.random()*100));
        table[7] = new Monstre("Morgoth", (int)(Math.random()*100));
        table[8] = new Monstre("Glaurund", (int)(Math.random()*100));
        table[9] = new NainJardin("Corentin",(int)(Math.random()*100));

        int morts=0;
        while (morts<9 && !(queSorciers(table))){
            for (int i = 0; i<10;i++){
                System.out.println(table[i]);
            }
            int i = (int)(Math.random()*10);
            while (table[i].mort() || !(table[i] instanceof Personnage)){
                i = (int)(Math.random()*10);
            }
            int j = i;
            while (table[j].mort()||j==i){
                j = (int)(Math.random()*10);
            }
            System.out.println(table[i].getNom()+" attaque "+table[j].getNom()+".");
            ((Personnage) table[i]).attaque(table[j]);
            morts = compteMorts(table);
        }
        if (morts==9){
            int i = 0;
            while (table[i].mort()){
                i++;
            }
            System.out.println(table[i].getNom()+" a gagné !");
        }
        else{
            System.out.println("Les sorciers ont gagné !");
        }
    }
    public static int compteMorts(Victime[] table){
        int n = table.length;
        int compteur=0;
        for (int i=0 ; i<n ; i++){
            if (table[i].mort()){
                compteur++;
            }
        }
        return compteur;
    }
    public static int nbrMonstres(Victime[] table){
        int compteur=0;
        for (int i=0;i<10;i++){
            if (!(table[i].mort()) && table[i] instanceof Monstre){
                compteur++;
            }
        }
        return compteur;
    }

    public static boolean queSorciers(Victime[] table){
        int n = table.length;
        int i = 0;
        while (i<n && table[i] instanceof Sorcier && !(table[i] instanceof Magicien) && !(table[i].mort())){
            i++;
        }
        return i==n;
    }
}