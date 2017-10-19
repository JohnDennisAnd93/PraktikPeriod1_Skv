/*
 * An XML document type.
 * Localname: reduktionsFaktor
 * Namespace: DataImport
 * Java type: dataImport.ReduktionsFaktorDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one reduktionsFaktor(@DataImport) element.
 *
 * This is a complex type.
 */
public class ReduktionsFaktorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.ReduktionsFaktorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReduktionsFaktorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REDUKTIONSFAKTOR$0 = 
        new javax.xml.namespace.QName("DataImport", "reduktionsFaktor");
    
    
    /**
     * Gets the "reduktionsFaktor" element
     */
    public dataImport.ReduktionsFaktorType getReduktionsFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.ReduktionsFaktorType target = null;
            target = (dataImport.ReduktionsFaktorType)get_store().find_element_user(REDUKTIONSFAKTOR$0, 0);
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
        generatedSetterHelperImpl(reduktionsFaktor, REDUKTIONSFAKTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (dataImport.ReduktionsFaktorType)get_store().add_element_user(REDUKTIONSFAKTOR$0);
            return target;
        }
    }
}
