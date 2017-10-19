/*
 * XML Type:  aldersInverkanType
 * Namespace: DataImport
 * Java type: dataImport.AldersInverkanType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML aldersInverkanType(@DataImport).
 *
 * This is a complex type.
 */
public class AldersInverkanTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanType
{
    private static final long serialVersionUID = 1L;
    
    public AldersInverkanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCENT$0 = 
        new javax.xml.namespace.QName("DataImport", "Procent");
    private static final javax.xml.namespace.QName VARDEAR$2 = 
        new javax.xml.namespace.QName("DataImport", "vardeAr");
    
    
    /**
     * Gets the "Procent" element
     */
    public int getProcent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCENT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Procent" element
     */
    public dataImport.AldersInverkanType.Procent xgetProcent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Procent target = null;
            target = (dataImport.AldersInverkanType.Procent)get_store().find_element_user(PROCENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Procent" element
     */
    public void setProcent(int procent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCENT$0);
            }
            target.setIntValue(procent);
        }
    }
    
    /**
     * Sets (as xml) the "Procent" element
     */
    public void xsetProcent(dataImport.AldersInverkanType.Procent procent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType.Procent target = null;
            target = (dataImport.AldersInverkanType.Procent)get_store().find_element_user(PROCENT$0, 0);
            if (target == null)
            {
                target = (dataImport.AldersInverkanType.Procent)get_store().add_element_user(PROCENT$0);
            }
            target.set(procent);
        }
    }
    
    /**
     * Gets array of all "vardeAr" elements
     */
    public dataImport.VardeArType[] getVardeArArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARDEAR$2, targetList);
            dataImport.VardeArType[] result = new dataImport.VardeArType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "vardeAr" element
     */
    public dataImport.VardeArType getVardeArArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType target = null;
            target = (dataImport.VardeArType)get_store().find_element_user(VARDEAR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "vardeAr" element
     */
    public int sizeOfVardeArArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARDEAR$2);
        }
    }
    
    /**
     * Sets array of all "vardeAr" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVardeArArray(dataImport.VardeArType[] vardeArArray)
    {
        check_orphaned();
        arraySetterHelper(vardeArArray, VARDEAR$2);
    }
    
    /**
     * Sets ith "vardeAr" element
     */
    public void setVardeArArray(int i, dataImport.VardeArType vardeAr)
    {
        generatedSetterHelperImpl(vardeAr, VARDEAR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vardeAr" element
     */
    public dataImport.VardeArType insertNewVardeAr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType target = null;
            target = (dataImport.VardeArType)get_store().insert_element_user(VARDEAR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vardeAr" element
     */
    public dataImport.VardeArType addNewVardeAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType target = null;
            target = (dataImport.VardeArType)get_store().add_element_user(VARDEAR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "vardeAr" element
     */
    public void removeVardeAr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARDEAR$2, i);
        }
    }
    /**
     * An XML Procent(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.AldersInverkanType$Procent.
     */
    public static class ProcentImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.AldersInverkanType.Procent
    {
        private static final long serialVersionUID = 1L;
        
        public ProcentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ProcentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
