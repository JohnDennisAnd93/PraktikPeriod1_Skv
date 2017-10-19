/*
 * XML Type:  StandardPoangType
 * Namespace: DataImport
 * Java type: dataImport.StandardPoangType2
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML StandardPoangType(@DataImport).
 *
 * This is a complex type.
 */
public class StandardPoangType2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.StandardPoangType2
{
    private static final long serialVersionUID = 1L;
    
    public StandardPoangType2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDREGRANS$0 = 
        new javax.xml.namespace.QName("DataImport", "Undregrans");
    private static final javax.xml.namespace.QName OVREGRANS$2 = 
        new javax.xml.namespace.QName("DataImport", "Ovregrans");
    private static final javax.xml.namespace.QName REDUKTIONSFAKTOR$4 = 
        new javax.xml.namespace.QName("DataImport", "reduktionsFaktor");
    
    
    /**
     * Gets the "Undregrans" element
     */
    public int getUndregrans()
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
     * Gets (as xml) the "Undregrans" element
     */
    public dataImport.StandardPoangType2.Undregrans xgetUndregrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2.Undregrans target = null;
            target = (dataImport.StandardPoangType2.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Undregrans" element
     */
    public void setUndregrans(int undregrans)
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
            target.setIntValue(undregrans);
        }
    }
    
    /**
     * Sets (as xml) the "Undregrans" element
     */
    public void xsetUndregrans(dataImport.StandardPoangType2.Undregrans undregrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2.Undregrans target = null;
            target = (dataImport.StandardPoangType2.Undregrans)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                target = (dataImport.StandardPoangType2.Undregrans)get_store().add_element_user(UNDREGRANS$0);
            }
            target.set(undregrans);
        }
    }
    
    /**
     * Gets the "Ovregrans" element
     */
    public int getOvregrans()
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
     * Gets (as xml) the "Ovregrans" element
     */
    public dataImport.StandardPoangType2.Ovregrans xgetOvregrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2.Ovregrans target = null;
            target = (dataImport.StandardPoangType2.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Ovregrans" element
     */
    public void setOvregrans(int ovregrans)
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
            target.setIntValue(ovregrans);
        }
    }
    
    /**
     * Sets (as xml) the "Ovregrans" element
     */
    public void xsetOvregrans(dataImport.StandardPoangType2.Ovregrans ovregrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2.Ovregrans target = null;
            target = (dataImport.StandardPoangType2.Ovregrans)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                target = (dataImport.StandardPoangType2.Ovregrans)get_store().add_element_user(OVREGRANS$2);
            }
            target.set(ovregrans);
        }
    }
    
    /**
     * Gets the "reduktionsFaktor" element
     */
    public dataImport.ReduktionsFaktorType getReduktionsFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.ReduktionsFaktorType target = null;
            target = (dataImport.ReduktionsFaktorType)get_store().find_element_user(REDUKTIONSFAKTOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reduktionsFaktor" element
     */
    public void setReduktionsFaktor(dataImport.ReduktionsFaktorType reduktionsFaktor)
    {
        generatedSetterHelperImpl(reduktionsFaktor, REDUKTIONSFAKTOR$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reduktionsFaktor" element
     */
    public dataImport.ReduktionsFaktorType addNewReduktionsFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.ReduktionsFaktorType target = null;
            target = (dataImport.ReduktionsFaktorType)get_store().add_element_user(REDUKTIONSFAKTOR$4);
            return target;
        }
    }
    /**
     * An XML Undregrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.StandardPoangType2$Undregrans.
     */
    public static class UndregransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.StandardPoangType2.Undregrans
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
     * This is an atomic type that is a restriction of dataImport.StandardPoangType2$Ovregrans.
     */
    public static class OvregransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.StandardPoangType2.Ovregrans
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
