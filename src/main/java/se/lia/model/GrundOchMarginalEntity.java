package se.lia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GrundOchMarginalEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int fastighetsTaxeringsAr;
	private double nivaFaktorUndreGrans;
	private double nivaFaktorOvreGrans;
	private int standardPoangUndreGrans;
	private int standardPoangOvreGrans;
	private int vardeYtaUndreGrans;
	private int vardeYtaOvreGrans;
	private int grundVarde;
	private int marginalVarde;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getFastighetsTaxeringsAr() {
		return fastighetsTaxeringsAr;
	}
	public void setFastighetsTaxeringsAr(int fastighetsTaxeringsAr) {
		this.fastighetsTaxeringsAr = fastighetsTaxeringsAr;
	}
	public double getNivaFaktorUndreGrans() {
		return nivaFaktorUndreGrans;
	}
	public void setNivaFaktorUndreGrans(double nivaFaktorUndreGrans) {
		this.nivaFaktorUndreGrans = nivaFaktorUndreGrans;
	}
	public double getNivaFaktorOvreGrans() {
		return nivaFaktorOvreGrans;
	}
	public void setNivaFaktorOvreGrans(double nivaFaktorOvreGrans) {
		this.nivaFaktorOvreGrans = nivaFaktorOvreGrans;
	}
	public int getStandardPoangUndreGrans() {
		return standardPoangUndreGrans;
	}
	public void setStandardPoangUndreGrans(int standardPoangUndreGrans) {
		this.standardPoangUndreGrans = standardPoangUndreGrans;
	}
	public int getStandardPoangOvreGrans() {
		return standardPoangOvreGrans;
	}
	public void setStandardPoangOvreGrans(int standardPoangOvreGrans) {
		this.standardPoangOvreGrans = standardPoangOvreGrans;
	}
	public int getVardeYtaUndreGrans() {
		return vardeYtaUndreGrans;
	}
	public void setVardeYtaUndreGrans(int vardeYtaUndreGrans) {
		this.vardeYtaUndreGrans = vardeYtaUndreGrans;
	}
	public int getVardeYtaOvreGrans() {
		return vardeYtaOvreGrans;
	}
	public void setVardeYtaOvreGrans(int vardeYtaOvreGrans) {
		this.vardeYtaOvreGrans = vardeYtaOvreGrans;
	}
	public int getGrundVarde() {
		return grundVarde;
	}
	public void setGrundVarde(int grundVarde) {
		this.grundVarde = grundVarde;
	}
	public int getMarginalVarde() {
		return marginalVarde;
	}
	public void setMarginalVarde(int marginalVarde) {
		this.marginalVarde = marginalVarde;
	}
	@Override
	public String toString() {
		return "GrundOchMarginalEntity [id=" + id + ", fastighetsTaxeringsAr=" + fastighetsTaxeringsAr
				+ ", nivaFaktorUndreGrans=" + nivaFaktorUndreGrans + ", nivaFaktorOvreGrans=" + nivaFaktorOvreGrans
				+ ", standardPoangUndreGrans=" + standardPoangUndreGrans + ", standardPoangOvreGrans="
				+ standardPoangOvreGrans + ", vardeYtaUndreGrans=" + vardeYtaUndreGrans + ", vardeYtaOvreGrans="
				+ vardeYtaOvreGrans + ", grundVarde=" + grundVarde + ", marginalVarde=" + marginalVarde + "]";
	}
	

	
	
}
