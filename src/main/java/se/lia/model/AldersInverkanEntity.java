package se.lia.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AldersInverkanEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int fastighetsTaxeringsAr;
	private int aldersInverkanProcent;
	private int vardeArUndreGrans;
	private int vardeArOvreGrans;
	private int standardPoangUndreGrans;
	private int standardPoangOvreGrans;
	private double reduktionsFaktor;
	
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
	public int getAldersInverkanProcent() {
		return aldersInverkanProcent;
	}
	public void setAldersInverkanProcent(int aldersInverkanProcent) {
		this.aldersInverkanProcent = aldersInverkanProcent;
	}
	public int getVardeArUndreGrans() {
		return vardeArUndreGrans;
	}
	public void setVardeArUndreGrans(int vardeArUndreGrans) {
		this.vardeArUndreGrans = vardeArUndreGrans;
	}
	public int getVardeArOvreGrans() {
		return vardeArOvreGrans;
	}
	public void setVardeArOvreGrans(int vardeArOvreGrans) {
		this.vardeArOvreGrans = vardeArOvreGrans;
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
	public double getReduktionsFaktor() {
		return reduktionsFaktor;
	}
	public void setReduktionsFaktor(double reduktionsFaktor) {
		this.reduktionsFaktor = reduktionsFaktor;
	}
	@Override
	public String toString() {
		return "AldersInverkanEntity [id=" + id + ", fastighetsTaxeringsAr=" + fastighetsTaxeringsAr
				+ ", aldersInverkanProcent=" + aldersInverkanProcent + ", vardeArUndreGrans=" + vardeArUndreGrans
				+ ", vardeArOvreGrans=" + vardeArOvreGrans + ", standardPoangUndreGrans=" + standardPoangUndreGrans
				+ ", standardPoangOvreGrans=" + standardPoangOvreGrans + ", reduktionsFaktor=" + reduktionsFaktor + "]";
	}
	

	

}
