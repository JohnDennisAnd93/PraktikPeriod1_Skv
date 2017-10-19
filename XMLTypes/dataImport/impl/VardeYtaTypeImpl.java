/*
 * XML Type:  vardeYtaType
 * Namespace: DataImport
 * Java type: dataImport.VardeYtaType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML vardeYtaType(@DataImport).
 *
 * This is a complex type.
 */
public class VardeYtaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.VardeYtaType
{
    private static final long serialVersionUID = 1L;
    
    public VardeYtaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNDREGRANS$0 = 
        new javax.xml.namespace.QName("DataImport", "undreGrans");
    private static final javax.xml.namespace.QName OVREGRANS$2 = 
        new javax.xml.namespace.QName("DataImport", "ovreGrans");
    private static final javax.xml.namespace.QName VARDE$4 = 
        new javax.xml.namespace.QName("DataImport", "varde");
    
    
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
    public dataImport.VardeYtaType.UndreGrans xgetUndreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType.UndreGrans target = null;
            target = (dataImport.VardeYtaType.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
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
    public void xsetUndreGrans(dataImport.VardeYtaType.UndreGrans undreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType.UndreGrans target = null;
            target = (dataImport.VardeYtaType.UndreGrans)get_store().find_element_user(UNDREGRANS$0, 0);
            if (target == null)
            {
                target = (dataImport.VardeYtaType.UndreGrans)get_store().add_element_user(UNDREGRANS$0);
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
    public dataImport.VardeYtaType.OvreGrans xgetOvreGrans()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType.OvreGrans target = null;
            target = (dataImport.VardeYtaType.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
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
    public void xsetOvreGrans(dataImport.VardeYtaType.OvreGrans ovreGrans)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType.OvreGrans target = null;
            target = (dataImport.VardeYtaType.OvreGrans)get_store().find_element_user(OVREGRANS$2, 0);
            if (target == null)
            {
                target = (dataImport.VardeYtaType.OvreGrans)get_store().add_element_user(OVREGRANS$2);
            }
            target.set(ovreGrans);
        }
    }
    
    /**
     * Gets the "varde" element
     */
    public dataImport.VardeType getVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeType target = null;
            target = (dataImport.VardeType)get_store().find_element_user(VARDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "varde" element
     */
    public void setVarde(dataImport.VardeType varde)
    {
        generatedSetterHelperImpl(varde, VARDE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "varde" element
     */
    public dataImport.VardeType addNewVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeType target = null;
            target = (dataImport.VardeType)get_store().add_element_user(VARDE$4);
            return target;
        }
    }
    /**
     * An XML undreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.VardeYtaType$UndreGrans.
     */
    public static class UndreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.VardeYtaType.UndreGrans
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
     * This is an atomic type that is a restriction of dataImport.VardeYtaType$OvreGrans.
     */
    public static class OvreGransImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements dataImport.VardeYtaType.OvreGrans
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
