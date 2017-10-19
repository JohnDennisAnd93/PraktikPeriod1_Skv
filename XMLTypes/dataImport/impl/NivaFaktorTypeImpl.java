/*
 * XML Type:  nivaFaktorType
 * Namespace: DataImport
 * Java type: dataImport.NivaFaktorType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML nivaFaktorType(@DataImport).
 *
 * This is a complex type.
 */
public class NivaFaktorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.NivaFaktorType
{
    private static final long serialVersionUID = 1L;
    
    public NivaFaktorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDREGRANS$0 = 
        new javax.xml.namespace.QName("DataImport", "undreGrans");
    private static final javax.xml.namespace.QName OVREGRANS$2 = 
        new javax.xml.namespace.QName("DataImport", "ovreGrans");
    private static final javax.xml.namespace.QName STANDARDPOANG$4 = 
        new javax.xml.namespace.QName("DataImport", "standardPoang");
    
    
    /**
     * Gets the "undreGrans" element
     */
    public java.math.BigDecimal getUndreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "undreGrans" element
     */
    public dataImport.NivaFaktorType.UndreGrans xgetUndreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType.UndreGrans target = null;
            target = (dataImport.NivaFaktorType.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "undreGrans" element
     */
    public void setUndreGrans(java.math.BigDecimal undreGrans)
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
            target.setBigDecimalValue(undreGrans);
        }
    }
    
    /**
     * Sets (as xml) the "undreGrans" element
     */
    public void xsetUndreGrans(dataImport.NivaFaktorType.UndreGrans undreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType.UndreGrans target = null;
            target = (dataImport.NivaFaktorType.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                target = (dataImport.NivaFaktorType.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
            }
            target.set(undreGrans);
        }
    }
    
    /**
     * Gets the "ovreGrans" element
     */
    public java.math.BigDecimal getOvreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ovreGrans" element
     */
    public dataImport.NivaFaktorType.OvreGrans xgetOvreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType.OvreGrans target = null;
            target = (dataImport.NivaFaktorType.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ovreGrans" element
     */
    public void setOvreGrans(java.math.BigDecimal ovreGrans)
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
            target.setBigDecimalValue(ovreGrans);
        }
    }
    
    /**
     * Sets (as xml) the "ovreGrans" element
     */
    public void xsetOvreGrans(dataImport.NivaFaktorType.OvreGrans ovreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType.OvreGrans target = null;
            target = (dataImport.NivaFaktorType.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                target = (dataImport.NivaFaktorType.OvreGrans)get_store().add_element_user(OVREGRANS$2);
            }
            target.set(ovreGrans);
        }
    }
    
    /**
     * Gets array of all "standardPoang" elements
     */
    public dataImport.StandardPoangType[] getStandardPoangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STANDARDPOANG$4, targetList);
            dataImport.StandardPoangType[] result = new dataImport.StandardPoangType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "standardPoang" element
     */
    public dataImport.StandardPoangType getStandardPoangArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType target = null;
            target = (dataImport.StandardPoangType)get_store().find_element_user(STANDARDPOANG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "standardPoang" element
     */
    public int sizeOfStandardPoangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDPOANG$4);
        }
    }
    
    /**
     * Sets array of all "standardPoang" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStandardPoangArray(dataImport.StandardPoangType[] standardPoangArray)
    {
        check_orphaned();
        arraySetterHelper(standardPoangArray, STANDARDPOANG$4);
    }
    
    /**
     * Sets ith "standardPoang" element
     */
    public void setStandardPoangArray(int i, dataImport.StandardPoangType standardPoang)
    {
        generatedSetterHelperImpl(standardPoang, STANDARDPOANG$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "standardPoang" element
     */
    public dataImport.StandardPoangType insertNewStandardPoang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType target = null;
            target = (dataImport.StandardPoangType)get_store().insert_element_user(STANDARDPOANG$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "standardPoang" element
     */
    public dataImport.StandardPoangType addNewStandardPoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType target = null;
            target = (dataImport.StandardPoangType)get_store().add_element_user(STANDARDPOANG$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "standardPoang" element
     */
    public void removeStandardPoang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDPOANG$4, i);
        }
    }
    /**
     * An XML undreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.NivaFaktorType$UndreGrans.
     */
    public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements dataImport.NivaFaktorType.UndreGrans
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
     * This is an atomic type that is a restriction of dataImport.NivaFaktorType$OvreGrans.
     */
    public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements dataImport.NivaFaktorType.OvreGrans
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
