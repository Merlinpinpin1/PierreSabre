package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int R�putation;

	public Yakuza(int argent, String nom, String boisson, int R�putation, String clan) {
		super(argent, nom, boisson);
		this.clan = clan;
		this.R�putation = 0;
	}

	void extorquer(commer�ants victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la� ? ");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int Voleargent = victime.seFaireExtorquer();
		GagnerArgent(Voleargent);
		parler("J'ai piqué les" + Voleargent + "sous de" + victime.getNom() + "ce qui me fait " + getArgent()
				+ " sous dans ma poche Hi ! Hi !");
		this.R�putation = this.R�putation + 1;
	}

	public static void main(String[] args) {
		Yakuza YakuLeNoir;
		YakuLeNoir = new Yakuza(30 , "YakuLeNoir", "whisky" , 1,"uchiha");

	}

	public void gagner(int gain )
		{
		
			GagnerArgent(gain);
			this.R�putation = this.R�putation + 1 ;
			parler ("Ce ronin pensait vraiment battre" + getNom() + "du clan de" + this.clan +   "? Je l'ai d�pouill� de ses" + gain + "sous") ;
		}

	public int perdre() {
		int Yargent = getArgent();
		this.R�putation = this.R�putation - 1;
		parler("j'ai perdu mon duel et mes " + Yargent + "sous, snif... J'ai d�honorer le clan de " + this.clan);
		PerdreArgent(Yargent);

		return Yargent;
	}

	public int getR�putation() {
		return this.R�putation;
	}

	public int getArgent() {
		return getArgent();
	}
}
