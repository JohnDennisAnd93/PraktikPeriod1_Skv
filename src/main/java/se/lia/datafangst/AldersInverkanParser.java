package se.lia.datafangst;

import org.apache.xmlbeans.XmlObject;

import dataImport.AldersInverkanType;
import dataImport.AldersInverkanType2;
import dataImport.FormularDocument;
import dataImport.StandardPoangType2;
import dataImport.VardeArType;
import se.lia.model.AldersInverkanEntity;
import se.lia.persistence.AldersInverkanEntityDAO;

public class AldersInverkanParser extends Parser
{
	AldersInverkanEntityDAO dao;
	XmlObject x;
	
	public AldersInverkanParser(XmlObject x)
	{
		dao = AldersInverkanEntityDAO.getInstance();
		this.x = x;
	}
	
	public void saveEntity(AldersInverkanEntity e)
	{
		dao.save(e);
	}
	
	public void makeEntity()
	{
		AldersInverkanEntity e = null;
		AldersInverkanType2 ai = null;
		FormularDocument f = (FormularDocument) x;
		ai = (AldersInverkanType2)f.getFormular().getAldersInverkan();
		if(ai != null)
		{
			int fta = ai.xgetFastighetsTaxeringsAr().getIntValue();
			
			for(AldersInverkanType a: ai.getAldersInverkanArray())
			{
				int proc = a.getProcent();
				for(VardeArType v: a.getVardeArArray())
				{
					int vaug = v.xgetUndregrans().getIntValue();
					int vaog = v.xgetOvregrans().getIntValue();
					
					for(StandardPoangType2 s: v.getStandardPoangArray())
					{
						int spug = s.getUndregrans();
						int spog = s.getOvregrans();
						double faktor = s.getReduktionsFaktor().getFaktor().doubleValue();
						
						e = new AldersInverkanEntity();
						e.setFastighetsTaxeringsAr(fta);
						e.setAldersInverkanProcent(proc);
						e.setVardeArUndreGrans(vaug);
						e.setVardeArOvreGrans(vaog);
						e.setStandardPoangUndreGrans(spug);
						e.setStandardPoangOvreGrans(spog);
						e.setReduktionsFaktor(faktor);
						
						this.saveEntity(e);
					}
				}
			}
		}
		
		
		

	}

}
