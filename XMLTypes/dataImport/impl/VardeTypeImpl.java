/*
 * XML Type:  vardeType
 * Namespace: DataImport
 * Java type: dataImport.VardeType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML vardeType(@DataImport).
 *
 * This is a complex type.
 */
public class VardeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.VardeType
{
    private static final long serialVersionUID = 1L;
    
    public VardeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRUNDVARDE$0 = 
        new javax.xml.namespace.QName("DataImport", "grundVarde");
    private static final javax.xml.namespace.QName MARGINALVARDE$2 = 
        new javax.xml.namespace.QName("DataImport", "marginalVarde");
    
    
    /**
     * Gets the "grundVarde" element
     */
    public int getGrundVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUNDVARDE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "grundVarde" element
     */
    public dataImport.VardeType.GrundVarde xgetGrundVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeType.GrundVarde target = null;
            target = (dataImport.VardeType.GrundVarde)get_store().find_element_user(GRUNDVARDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "grundVarde" element
     */
    public void setGrundVarde(int grundVarde)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GRUNDVARDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GRUNDVARDE$0);
            }
            target.setIntValue(grundVarde);
        }
    }
    
    /**
     * Sets (as xml) the "grundVarde" element
     */
    public void xsetGrundVarde(dataImport.VardeType.GrundVarde grundVarde)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeType.GrundVarde target = null;
            target = (dataImport.VardeType.GrundVarde)get_store().find_element_user(GRUNDVARDE$0, 0);
            if (target == null)
            {
                target = (dataImport.VardeType.GrundVarde)get_store().add_element_user(GRUNDVARDE$0);
            }
            target.set(grundVarde);
        }
    }
    
    /**
     * Gets the "marginalVarde" element
     */
    public int getMarginalVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARGINALVARDE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "marginalVarde" element
     */
    public dataImport.VardeType.MarginalVarde xgetMarginalVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeType.MarginalVarde target = null;
            target = (dataImport.VardeType.MarginalVarde)get_store().find_element_user(MARGINALVARDE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "marginalVarde" element
     */
    public void setMarginalVarde(int marginalVarde)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARGINALVARDE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARGINALVARDE$2);
            }
            target.setIntValue(marginalVarde);
        }
    }
    
    /**
     * Sets (as xml) the "marginalVarde" element
     */
    public void xsetMarginalVarde(dataImport.VardeType.MarginalVarde marginalVarde)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeType.MarginalVarde target = null;
            target = (dataImport.VardeType.MarginalVarde)get_store().find_element_user(MARGINALVARDE$2, 0);
            if (target == null)
            {
                target = (dataImport.VardeType.MarginalVarde)get_store().add_element_user(MARGINALVARDE$2);
            }
            target.set(marginalVarde);
        }
    }
    /**
     * An XML grundVarde(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.VardeType$GrundVarde.
     */
    public static class GrundVardeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.VardeType.GrundVarde
    {
        private static final long serialVersionUID = 1L;
        
        public GrundVardeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GrundVardeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML marginalVarde(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.VardeType$MarginalVarde.
     */
    public static class MarginalVardeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.VardeType.MarginalVarde
    {
        private static final long serialVersionUID = 1L;
        
        public MarginalVardeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MarginalVardeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
