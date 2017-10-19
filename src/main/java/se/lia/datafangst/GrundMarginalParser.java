package se.lia.datafangst;

import org.apache.xmlbeans.XmlObject;

import dataImport.FormularDocument;
import dataImport.GrundOchMarginalType;
import dataImport.NivaFaktorType;
import dataImport.StandardPoangType;
import dataImport.VardeYtaType;
import se.lia.model.GrundOchMarginalEntity;
import se.lia.persistence.GrundOchMarginalEntityDAO;



public class GrundMarginalParser extends Parser
{
	GrundOchMarginalEntityDAO dao;
	XmlObject x;
	
	public GrundMarginalParser(XmlObject x)
	{
		dao = GrundOchMarginalEntityDAO.getInstance();
		this.x = x;
	}
	
	/**
	 * Skapar och sparar entiteter
	 * @param xml Fil med GrundOchMarginal objekt
	 */
	public void saveEntity(GrundOchMarginalEntity e)
	{
		dao.save(e);
	}
	
	
	public void makeEntity()
	{
		GrundOchMarginalEntity e = null;
		GrundOchMarginalType gm = null;
		FormularDocument f = (FormularDocument) x;
		gm = f.getFormular().getGrundOchMarginal();
		if(gm != null)
		{
			e = new GrundOchMarginalEntity();
			
			int fta = gm.xgetFastighetsTaxeringsAr().getIntValue();
			
			for(NivaFaktorType n: gm.getNivaFaktorArray())
			{
				double nfug = n.getUndreGrans().doubleValue();
				double nfog = n.getOvreGrans().doubleValue();
				
				for(StandardPoangType s: n.getStandardPoangArray())
				{
					int spug = s.getUndreGrans();
					int spog = s.getOvreGrans();
					
					for(VardeYtaType v: s.getVardeYtaArray())
					{
						int vyug = v.getUndreGrans();
						int vyog = v.getOvreGrans();
						int grundVarde = v.getVarde().getGrundVarde();
						int margVarde = v.getVarde().getMarginalVarde();
						
						e.setFastighetsTaxeringsAr(fta);
						e.setNivaFaktorUndreGrans(nfug);
						e.setNivaFaktorOvreGrans(nfog);
						e.setStandardPoangUndreGrans(spug);
						e.setStandardPoangOvreGrans(spog);
						e.setVardeYtaUndreGrans(vyug);
						e.setVardeYtaOvreGrans(vyog);
						e.setGrundVarde(grundVarde);
						e.setMarginalVarde(margVarde);
						
						this.saveEntity(e);
					}
				}
			}
		}
	}
	

}
