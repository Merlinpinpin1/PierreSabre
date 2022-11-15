package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int Réputation;

	public Yakuza(int argent, String nom, String boisson, int Réputation, String clan) {
		super(argent, nom, boisson);
		this.clan = clan;
		this.Réputation = 0;
	}

	void extorquer(commerçants victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la  ? ");
		parler(victime.getNom() + ", si tu tiens à  la vie donne moi ta bourse !");
		int Voleargent = victime.seFaireExtorquer();
		GagnerArgent(Voleargent);
		parler("J'ai piquÃ© les" + Voleargent + "sous de" + victime.getNom() + "ce qui me fait " + getArgent()
				+ " sous dans ma poche Hi ! Hi !");
		this.Réputation = this.Réputation + 1;
	}

	public static void main(String[] args) {
		Yakuza YakuLeNoir;
		YakuLeNoir = new Yakuza(30 , "YakuLeNoir", "whisky" , 1,"uchiha");

	}

	public void gagner(int gain )
		{
		
			GagnerArgent(gain);
			this.Réputation = this.Réputation + 1 ;
			parler ("Ce ronin pensait vraiment battre" + getNom() + "du clan de" + this.clan +   "? Je l'ai dépouillé de ses" + gain + "sous") ;
		}

	public int perdre() {
		int Yargent = getArgent();
		this.Réputation = this.Réputation - 1;
		parler("j'ai perdu mon duel et mes " + Yargent + "sous, snif... J'ai déhonorer le clan de " + this.clan);
		PerdreArgent(Yargent);

		return Yargent;
	}

	public int getRéputation() {
		return this.Réputation;
	}

	public int getArgent() {
		return getArgent();
	}
}
