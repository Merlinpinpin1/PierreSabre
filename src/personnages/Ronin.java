package personnages;

public class Ronin extends Humain

{
	private int honneur;

	public Ronin(int argent, String nom, String boisson) {
		super(argent, nom, boisson);
		this.honneur = 1;

	}

	public void donner(commer�ants beneficiaire) {
		int don = (getArgent() / 100) * 10;
		parler(beneficiaire.getNom() + "prend ces " + don + "sous");
		beneficiaire.recevoir(don);
	}

	public static void main(String[] args) {
		Ronin Roro;
		Roro = new Ronin(60, "Roro", "shochu");

	}

	public void provoquer (Yakuza adversaire)
	{
		int R�putation1 = adversaire.getR�putation() ;
		int force = this.honneur + this.honneur ;
		parler("Je t'ai retrouv� vermine, tu vas payer pour ce que tu as fait � ce pauvre marchand!" );
		if (R�putation1 < force | R�putation1 == force )
		{
			int Yargent = adversaire.getArgent() ;
			GagnerArgent(Yargent);
			this.honneur=this.honneur+1;
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
		}
		else
		{

			this.honneur=this.honneur-1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			PerdreArgent(getArgent());
		}
	}
	
}