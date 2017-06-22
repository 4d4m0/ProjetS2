import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Bouteille {
	String nom;
	String region;
	String pays;
	int millesime;
	int cuvee;
	String robe;
	double temperature;
	String fournisseur;
	double degre;
	double volume;
	boolean effervescent;
	double note;
	int quantite;
	boolean disponible;
	int emplacement;
	String commentaire;

	@Override
	public String toString() {
		return "Bouteille [nom=" + nom + ", region=" + region + ", pays=" + pays + ", millesime=" + millesime
				+ ", cuvee=" + cuvee + ", robe=" + robe + ", temperature=" + temperature + ", fournisseur="
				+ fournisseur + ", degre=" + degre + ", volume=" + volume + ", effervescent=" + effervescent + ", note="
				+ note + ", quantite=" + quantite + ", disponible=" + disponible + ", Emplacement=" + emplacement
				+ ", commentaire=" + commentaire + "]";
	}


public Bouteille(String nom, String region, String pays, int millesime, int cuvee, String robe, double temperature,
			String fournisseur, double degre, double volume, boolean effervescent, double note, int quantite,
			boolean disponible, int emplacement, String commentaire) {
		super();
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


public int getMillesime() {
	return millesime;
}


public void setMillesime(int millesime) {
	this.millesime = millesime;
}


public int getCuvee() {
	return cuvee;
}


public void setCuvee(int cuvee) {
	this.cuvee = cuvee;
}


public String getRobe() {
	return robe;
}


public void setRobe(String robe) {
	this.robe = robe;
}


public double getTemperature() {
	return temperature;
}


public void setTemperature(double temperature) {
	this.temperature = temperature;
}


public String getFournisseur() {
	return fournisseur;
}


public void setFournisseur(String fournisseur) {
	this.fournisseur = fournisseur;
}


public double getDegre() {
	return degre;
}


public void setDegre(double degre) {
	this.degre = degre;
}


public double getVolume() {
	return volume;
}


public void setVolume(double volume) {
	this.volume = volume;
}


public boolean isEffervescent() {
	return effervescent;
}


public void setEffervescent(boolean effervescent) {
	this.effervescent = effervescent;
}


public double getNote() {
	return note;
}


public void setNote(double note) {
	this.note = note;
}


public int getQuantite() {
	return quantite;
}


public void setQuantite(int quantite) {
	this.quantite = quantite;
}


public boolean isDisponible() {
	return disponible;
}


public void setDisponible(boolean disponible) {
	this.disponible = disponible;
}


public int getEmplacement() {
	return emplacement;
}


public void setEmplacement(int emplacement) {
	this.emplacement = emplacement;
}


public String getCommentaire() {
	return commentaire;
}


public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;
}


//	public void insertBttl(Connection con, Bouteille B) throws SQLException {
//		try (Statement stmt = con.createStatement()) {
//			stmt.executeUpdate("INSERT INTO bouteille VALUES (" + this.nom + ",'" + this.region + "'," + this.pays
//					+ "'," + this.millesime + "'," + this.cuvee + "'," + this.robe + "'," + this.temperature + "',"
//					+ this.fournisseur + "'," + this.degre + "'," + this.volume + "'," + this.effervescent + "',"
//					+ this.note + "'," + this.quantite + "'," + this.emplacement + "'," + this.commentaire + ")");
//		}
//	}



}
