/*
 * XML Type:  standardPoangType
 * Namespace: DataImport
 * Java type: dataImport.StandardPoangType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML standardPoangType(@DataImport).
 *
 * This is a complex type.
 */
public class StandardPoangTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.StandardPoangType
{
    private static final long serialVersionUID = 1L;
    
    public StandardPoangTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDREGRANS$0 = 
        new javax.xml.namespace.QName("DataImport", "undreGrans");
    private static final javax.xml.namespace.QName OVREGRANS$2 = 
        new javax.xml.namespace.QName("DataImport", "ovreGrans");
    private static final javax.xml.namespace.QName VARDEYTA$4 = 
        new javax.xml.namespace.QName("DataImport", "vardeYta");
    
    
    /**
     * Gets the "undreGrans" element
     */
    public int getUndreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "undreGrans" element
     */
    public dataImport.StandardPoangType.UndreGrans xgetUndreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType.UndreGrans target = null;
            target = (dataImport.StandardPoangType.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "undreGrans" element
     */
    public void setUndreGrans(int undreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNDREGRANS$0);
            }
            target.setIntValue(undreGrans);
        }
    }
    
    /**
     * Sets (as xml) the "undreGrans" element
     */
    public void xsetUndreGrans(dataImport.StandardPoangType.UndreGrans undreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType.UndreGrans target = null;
            target = (dataImport.StandardPoangType.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                target = (dataImport.StandardPoangType.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
            }
            target.set(undreGrans);
        }
    }
    
    /**
     * Gets the "ovreGrans" element
     */
    public int getOvreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ovreGrans" element
     */
    public dataImport.StandardPoangType.OvreGrans xgetOvreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType.OvreGrans target = null;
            target = (dataImport.StandardPoangType.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ovreGrans" element
     */
    public void setOvreGrans(int ovreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVREGRANS$2);
            }
            target.setIntValue(ovreGrans);
        }
    }
    
    /**
     * Sets (as xml) the "ovreGrans" element
     */
    public void xsetOvreGrans(dataImport.StandardPoangType.OvreGrans ovreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType.OvreGrans target = null;
            target = (dataImport.StandardPoangType.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                target = (dataImport.StandardPoangType.OvreGrans)get_store().add_element_user(OVREGRANS$2);
            }
            target.set(ovreGrans);
        }
    }
    
    /**
     * Gets array of all "vardeYta" elements
     */
    public dataImport.VardeYtaType[] getVardeYtaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARDEYTA$4, targetList);
            dataImport.VardeYtaType[] result = new dataImport.VardeYtaType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "vardeYta" element
     */
    public dataImport.VardeYtaType getVardeYtaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType target = null;
            target = (dataImport.VardeYtaType)get_store().find_element_user(VARDEYTA$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "vardeYta" element
     */
    public int sizeOfVardeYtaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARDEYTA$4);
        }
    }
    
    /**
     * Sets array of all "vardeYta" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setVardeYtaArray(dataImport.VardeYtaType[] vardeYtaArray)
    {
        check_orphaned();
        arraySetterHelper(vardeYtaArray, VARDEYTA$4);
    }
    
    /**
     * Sets ith "vardeYta" element
     */
    public void setVardeYtaArray(int i, dataImport.VardeYtaType vardeYta)
    {
        generatedSetterHelperImpl(vardeYta, VARDEYTA$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vardeYta" element
     */
    public dataImport.VardeYtaType insertNewVardeYta(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType target = null;
            target = (dataImport.VardeYtaType)get_store().insert_element_user(VARDEYTA$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vardeYta" element
     */
    public dataImport.VardeYtaType addNewVardeYta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType target = null;
            target = (dataImport.VardeYtaType)get_store().add_element_user(VARDEYTA$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "vardeYta" element
     */
    public void removeVardeYta(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARDEYTA$4, i);
        }
    }
    /**
     * An XML undreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.StandardPoangType$UndreGrans.
     */
    public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.StandardPoangType.UndreGrans
    {
        private static final long serialVersionUID = 1L;
        
        public UndreGransImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected UndreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ovreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.StandardPoangType$OvreGrans.
     */
    public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.StandardPoangType.OvreGrans
    {
        private static final long serialVersionUID = 1L;
        
        public OvreGransImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OvreGransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
