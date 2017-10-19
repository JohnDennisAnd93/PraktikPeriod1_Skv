/*
 * XML Type:  reduktionsFaktorType
 * Namespace: DataImport
 * Java type: dataImport.ReduktionsFaktorType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML reduktionsFaktorType(@DataImport).
 *
 * This is a complex type.
 */
public class ReduktionsFaktorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.ReduktionsFaktorType
{
    private static final long serialVersionUID = 1L;
    
    public ReduktionsFaktorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAKTOR$0 = 
        new javax.xml.namespace.QName("DataImport", "Faktor");
    
    
    /**
     * Gets the "Faktor" element
     */
    public java.math.BigDecimal getFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAKTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Faktor" element
     */
    public dataImport.ReduktionsFaktorType.Faktor xgetFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.ReduktionsFaktorType.Faktor target = null;
            target = (dataImport.ReduktionsFaktorType.Faktor)get_store().find_element_user(FAKTOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Faktor" element
     */
    public void setFaktor(java.math.BigDecimal faktor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAKTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAKTOR$0);
            }
            target.setBigDecimalValue(faktor);
        }
    }
    
    /**
     * Sets (as xml) the "Faktor" element
     */
    public void xsetFaktor(dataImport.ReduktionsFaktorType.Faktor faktor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.ReduktionsFaktorType.Faktor target = null;
            target = (dataImport.ReduktionsFaktorType.Faktor)get_store().find_element_user(FAKTOR$0, 0);
            if (target == null)
            {
                target = (dataImport.ReduktionsFaktorType.Faktor)get_store().add_element_user(FAKTOR$0);
            }
            target.set(faktor);
        }
    }
    /**
     * An XML Faktor(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.ReduktionsFaktorType$Faktor.
     */
    public static class FaktorImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements dataImport.ReduktionsFaktorType.Faktor
    {
        private static final long serialVersionUID = 1L;
        
        public FaktorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FaktorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
