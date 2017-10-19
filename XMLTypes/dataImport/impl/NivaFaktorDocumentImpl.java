/*
 * An XML document type.
 * Localname: nivaFaktor
 * Namespace: DataImport
 * Java type: dataImport.NivaFaktorDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one nivaFaktor(@DataImport) element.
 *
 * This is a complex type.
 */
public class NivaFaktorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.NivaFaktorDocument
{
    private static final long serialVersionUID = 1L;
    
    public NivaFaktorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NIVAFAKTOR$0 = 
        new javax.xml.namespace.QName("DataImport", "nivaFaktor");
    
    
    /**
     * Gets the "nivaFaktor" element
     */
    public dataImport.NivaFaktorType getNivaFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType target = null;
            target = (dataImport.NivaFaktorType)get_store().find_element_user(NIVAFAKTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nivaFaktor" element
     */
    public void setNivaFaktor(dataImport.NivaFaktorType nivaFaktor)
    {
        generatedSetterHelperImpl(nivaFaktor, NIVAFAKTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nivaFaktor" element
     */
    public dataImport.NivaFaktorType addNewNivaFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType target = null;
            target = (dataImport.NivaFaktorType)get_store().add_element_user(NIVAFAKTOR$0);
            return target;
        }
    }
}
