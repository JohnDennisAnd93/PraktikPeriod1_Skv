/*
 * XML Type:  vardeArType
 * Namespace: DataImport
 * Java type: dataImport.VardeArType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML vardeArType(@DataImport).
 *
 * This is a complex type.
 */
public class VardeArTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.VardeArType
{
    private static final long serialVersionUID = 1L;
    
    public VardeArTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDREGRANS$0 = 
        new javax.xml.namespace.QName("DataImport", "Undregrans");
    private static final javax.xml.namespace.QName OVREGRANS$2 = 
        new javax.xml.namespace.QName("DataImport", "Ovregrans");
    private static final javax.xml.namespace.QName STANDARDPOANG$4 = 
        new javax.xml.namespace.QName("DataImport", "StandardPoang");
    
    
    /**
     * Gets the "Undregrans" element
     */
    public java.util.Calendar getUndregrans()
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
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Undregrans" element
     */
    public dataImport.VardeArType.Undregrans xgetUndregrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType.Undregrans target = null;
            target = (dataImport.VardeArType.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Undregrans" element
     */
    public void setUndregrans(java.util.Calendar undregrans)
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
            target.setCalendarValue(undregrans);
        }
    }
    
    /**
     * Sets (as xml) the "Undregrans" element
     */
    public void xsetUndregrans(dataImport.VardeArType.Undregrans undregrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType.Undregrans target = null;
            target = (dataImport.VardeArType.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                target = (dataImport.VardeArType.Undregrans)get_store().add_element_user(UNDREGRANS$0);
            }
            target.set(undregrans);
        }
    }
    
    /**
     * Gets the "Ovregrans" element
     */
    public java.util.Calendar getOvregrans()
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
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ovregrans" element
     */
    public dataImport.VardeArType.Ovregrans xgetOvregrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType.Ovregrans target = null;
            target = (dataImport.VardeArType.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Ovregrans" element
     */
    public void setOvregrans(java.util.Calendar ovregrans)
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
            target.setCalendarValue(ovregrans);
        }
    }
    
    /**
     * Sets (as xml) the "Ovregrans" element
     */
    public void xsetOvregrans(dataImport.VardeArType.Ovregrans ovregrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType.Ovregrans target = null;
            target = (dataImport.VardeArType.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                target = (dataImport.VardeArType.Ovregrans)get_store().add_element_user(OVREGRANS$2);
            }
            target.set(ovregrans);
        }
    }
    
    /**
     * Gets array of all "StandardPoang" elements
     */
    public dataImport.StandardPoangType2[] getStandardPoangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STANDARDPOANG$4, targetList);
            dataImport.StandardPoangType2[] result = new dataImport.StandardPoangType2[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StandardPoang" element
     */
    public dataImport.StandardPoangType2 getStandardPoangArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2 target = null;
            target = (dataImport.StandardPoangType2)get_store().find_element_user(STANDARDPOANG$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StandardPoang" element
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
     * Sets array of all "StandardPoang" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStandardPoangArray(dataImport.StandardPoangType2[] standardPoangArray)
    {
        check_orphaned();
        arraySetterHelper(standardPoangArray, STANDARDPOANG$4);
    }
    
    /**
     * Sets ith "StandardPoang" element
     */
    public void setStandardPoangArray(int i, dataImport.StandardPoangType2 standardPoang)
    {
        generatedSetterHelperImpl(standardPoang, STANDARDPOANG$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StandardPoang" element
     */
    public dataImport.StandardPoangType2 insertNewStandardPoang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2 target = null;
            target = (dataImport.StandardPoangType2)get_store().insert_element_user(STANDARDPOANG$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StandardPoang" element
     */
    public dataImport.StandardPoangType2 addNewStandardPoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2 target = null;
            target = (dataImport.StandardPoangType2)get_store().add_element_user(STANDARDPOANG$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "StandardPoang" element
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
     * An XML Undregrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.VardeArType$Undregrans.
     */
    public static class UndregransImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements dataImport.VardeArType.Undregrans
    {
        private static final long serialVersionUID = 1L;
        
        public UndregransImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected UndregransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Ovregrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.VardeArType$Ovregrans.
     */
    public static class OvregransImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements dataImport.VardeArType.Ovregrans
    {
        private static final long serialVersionUID = 1L;
        
        public OvregransImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OvregransImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
