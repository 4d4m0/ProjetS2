import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Bouteille implements TableModel {
	String nom;
	String region;
	String pays;
	String millesime;
	int cuvee;
	String robe;
	int temperature;
	String fournisseur;
	int degre;
	int volume;
	String effervescent;
	int note;
	int quantite;
	String disponible;
	int Emplacement;
	String commentaire;

	@Override
	public String toString() {
		return "Bouteille [nom=" + nom + ", region=" + region + ", pays=" + pays + ", millesime=" + millesime
				+ ", cuvee=" + cuvee + ", robe=" + robe + ", temperature=" + temperature + ", fournisseur="
				+ fournisseur + ", degre=" + degre + ", volume=" + volume + ", effervescent=" + effervescent + ", note="
				+ note + ", quantite=" + quantite + ", disponible=" + disponible + ", Emplacement=" + Emplacement
				+ ", commentaire=" + commentaire + "]";
	}

	public Bouteille(String nom, String region, String pays, String millesime, int cuvee, String robe, int temperature,
			String fournisseur, int degre, int volume, String effervescent, int note, int quantite, String disponible,
			int emplacement, String commentaire) {
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
		Emplacement = emplacement;
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

	public String getMillesime() {
		return millesime;
	}

	public void setMillesime(String millesime) {
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

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public int getDegre() {
		return degre;
	}

	public void setDegre(int degre) {
		this.degre = degre;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getEffervescent() {
		return effervescent;
	}

	public void setEffervescent(String effervescent) {
		this.effervescent = effervescent;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public int getEmplacement() {
		return Emplacement;
	}

	public void setEmplacement(int emplacement) {
		Emplacement = emplacement;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public void addTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeTableModelListener(TableModelListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValueAt(Object arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
