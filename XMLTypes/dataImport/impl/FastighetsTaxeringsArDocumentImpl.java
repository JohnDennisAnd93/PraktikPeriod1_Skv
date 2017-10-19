/*
 * An XML document type.
 * Localname: fastighetsTaxeringsAr
 * Namespace: DataImport
 * Java type: dataImport.FastighetsTaxeringsArDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one fastighetsTaxeringsAr(@DataImport) element.
 *
 * This is a complex type.
 */
public class FastighetsTaxeringsArDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.FastighetsTaxeringsArDocument
{
    private static final long serialVersionUID = 1L;
    
    public FastighetsTaxeringsArDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FASTIGHETSTAXERINGSAR$0 = 
        new javax.xml.namespace.QName("DataImport", "fastighetsTaxeringsAr");
    
    
    /**
     * Gets the "fastighetsTaxeringsAr" element
     */
    public java.util.Calendar getFastighetsTaxeringsAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "fastighetsTaxeringsAr" element
     */
    public dataImport.FastighetsTaxeringsArType xgetFastighetsTaxeringsAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.FastighetsTaxeringsArType target = null;
            target = (dataImport.FastighetsTaxeringsArType)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fastighetsTaxeringsAr" element
     */
    public void setFastighetsTaxeringsAr(java.util.Calendar fastighetsTaxeringsAr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FASTIGHETSTAXERINGSAR$0);
            }
            target.setCalendarValue(fastighetsTaxeringsAr);
        }
    }
    
    /**
     * Sets (as xml) the "fastighetsTaxeringsAr" element
     */
    public void xsetFastighetsTaxeringsAr(dataImport.FastighetsTaxeringsArType fastighetsTaxeringsAr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.FastighetsTaxeringsArType target = null;
            target = (dataImport.FastighetsTaxeringsArType)get_store().find_element_user(FASTIGHETSTAXERINGSAR$0, 0);
            if (target == null)
            {
                target = (dataImport.FastighetsTaxeringsArType)get_store().add_element_user(FASTIGHETSTAXERINGSAR$0);
            }
            target.set(fastighetsTaxeringsAr);
        }
    }
}
