
public class CreerFournisseur {
	private String nom;
	private String adresse;
	private String CP;
	private String ville;
	private String telephone;
	public CreerFournisseur(String nom, String adresse, String cP, String ville, String telephone) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		CP = cP;
		this.ville = ville;
		this.telephone = telephone;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCP() {
		return CP;
	}
	public void setCP(String cP) {
		CP = cP;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "CreerFournisseur [nom=" + nom + ", adresse=" + adresse + ", CP=" + CP + ", ville=" + ville
				+ ", telephone=" + telephone + "]";
	}

}
