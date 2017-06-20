import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bouteille {
	String nom;
	String region;
	String pays;
	String millesime;
	String cuvee;
	String robe;
	String temperature;
	String fournisseur;
	String degre;
	String volume;
	String effervescent;
	String note;
	String quantite;
	String disponible;
	String emplacement;
	String commentaire;

	@Override
	public String toString() {
		return "Bouteille [nom=" + nom + ", region=" + region + ", pays=" + pays + ", millesime=" + millesime
				+ ", cuvee=" + cuvee + ", robe=" + robe + ", temperature=" + temperature + ", fournisseur="
				+ fournisseur + ", degre=" + degre + ", volume=" + volume + ", effervescent=" + effervescent + ", note="
				+ note + ", quantite=" + quantite + ", disponible=" + disponible + ", Emplacement=" + emplacement
				+ ", commentaire=" + commentaire + "]";
	}

	public Bouteille(String nom, String region, String pays, String millesime, String cuvee, String robe,
			String temperature, String fournisseur, String degre, String volume, String effervescent, String note,
			String quantite, String disponible, String emplacement, String commentaire) {
		this.nom = nom;
		this.region = region;
		this.pays = pays;
		this.millesime = millesime;
		this.cuvee = cuvee;
		this.robe = robe;
		this.temperature = temperature;
		this.fournisseur = fournisseur;
		this.degre = degre;
		this.volume = volume;
		this.effervescent = effervescent;
		this.note = note;
		this.quantite = quantite;
		this.disponible = disponible;
		this.emplacement = emplacement;
		this.commentaire = commentaire;
	}
	public void insertBttl(Connection con, Bouteille B) throws SQLException {
		try (Statement stmt = con.createStatement()) {
			stmt.executeUpdate("INSERT INTO bouteille VALUES (" + nom + ",'" + region + "'," + pays
					+ "'," + millesime + "'," + cuvee + "'," + robe + "'," + temperature + "',"
					+ fournisseur + "'," + degre + "'," + volume + "'," + effervescent + "',"
					+ note + "'," + quantite + "'," + emplacement + "'," + commentaire + ")");
		}
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getMillesime() {
		return millesime;
	}

	public void setMillesime(String millesime) {
		this.millesime = millesime;
	}

	public String getCuvee() {
		return cuvee;
	}

	public void setCuvee(String cuvee) {
		this.cuvee = cuvee;
	}

	public String getRobe() {
		return robe;
	}

	public void setRobe(String robe) {
		this.robe = robe;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getDegre() {
		return degre;
	}

	public void setDegre(String degre) {
		this.degre = degre;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getEffervescent() {
		return effervescent;
	}

	public void setEffervescent(String effervescent) {
		this.effervescent = effervescent;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String Emplacement) {
		emplacement = Emplacement;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
