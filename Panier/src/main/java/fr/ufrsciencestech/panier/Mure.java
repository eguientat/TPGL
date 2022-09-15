package fr.ufrsciencestech.panier;

/**
 *
 * @author eguientat
 */
public class Mure {
    private double prix;
    private String origine;

    public Mure()
    {
        this.prix = 1;  //prix en euros
        this.origine="France";
    }

    public Mure(double prix, String origine)
    {


  if(prix < 0)
  	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
  else
  	    this.prix = prix;


	if(origine.equals(""))
            this.origine = "France";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Mure de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Mure or = (Mure) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Mure");

    Mure o=new Mure(0,"Italie");
    Mure p=new Mure();
    System.out.println(o.toString());
    System.out.println(o.equals(p));
   }
}
