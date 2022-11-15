package personnages;

// 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

public class Humain {
	
	private nbConnaissance[] = new nbConnaissance[30]   ;
	private String nom;
	private int argent;
	private String boisson;

	public Humain(int argent, String nom, String boisson) {

		this.argent = argent;
		this.nom = nom;
		this.boisson = boisson;

	}
	
	public void faireConnaissanceAvec(Humain autreHumain)
	{
		direBonjour();
		autreHumain.direBonjour();
	}

	public static void main(String[] args) {
		Humain prof;
		prof = new Humain(54, "prof", "kombucha");

	}

	public void parler(String texte) {
		System.out.println(this.nom + "-" + texte);
	}

	public void acheter(String bien, int prix) {
		if (this.argent > prix) {
			parler("J'ai " + this.argent + "sous en poche . Je vais pouvoir m'offrir" + bien + "à " + prix + "sous");
		} else {
			parler("J'ai " + this.argent + "sous en poche . Je ne peux même pas m'offrir" + bien + "à " + prix
					+ "sous");
		}

	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + this.boisson + "! GLOUPS !");
	}

	public int getArgent() {
		return this.argent;
	}

	public String getNom() {
		return this.nom;
	}

	public void PerdreArgent(int perte) {
		this.argent = this.argent - perte;
	}

	public void GagnerArgent(int gain) {
		this.argent = this.argent + gain;
	}

}