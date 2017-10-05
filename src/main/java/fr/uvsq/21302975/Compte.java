package exo3_1.java;

public class Compte
{
    
    private double solde;

   
   public Compte(int solde)
   {
	   if (solde==0 || solde<0)
	   {
		   throw new IllegalArgumentException();
	   }
	   else
		 this.solde=solde; 
   }
    
   
   
   public double ConsulteSolde()
   {
	   return solde;
   }
   
   public void Credit(int somme)
   {
	   if(somme>0)
	   this.solde+=somme;
   }
   
   public boolean Debit(int somme)
   {
	   if (somme<solde && somme>0)
		   {solde-=somme;
	   return true;}
	   else
		return false;
   }
   
   public void Virement(Compte a,int somme)
   {
	   if(somme<solde && somme>0)
	   { 
		   a.solde+=somme;
		   solde-=somme;
	   }  
   }
   
    
}
