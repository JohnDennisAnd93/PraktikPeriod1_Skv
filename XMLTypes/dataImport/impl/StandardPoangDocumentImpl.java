/*
 * An XML document type.
 * Localname: standardPoang
 * Namespace: DataImport
 * Java type: dataImport.StandardPoangDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one standardPoang(@DataImport) element.
 *
 * This is a complex type.
 */
public class StandardPoangDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.StandardPoangDocument
{
    private static final long serialVersionUID = 1L;
    
    public StandardPoangDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDPOANG$0 = 
        new javax.xml.namespace.QName("DataImport", "standardPoang");
    
    
    /**
     * Gets the "standardPoang" element
     */
    public dataImport.StandardPoangType getStandardPoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType target = null;
            target = (dataImport.StandardPoangType)get_store().find_element_user(STANDARDPOANG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "standardPoang" element
     */
    public void setStandardPoang(dataImport.StandardPoangType standardPoang)
    {
        generatedSetterHelperImpl(standardPoang, STANDARDPOANG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "standardPoang" element
     */
    public dataImport.StandardPoangType addNewStandardPoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType target = null;
            target = (dataImport.StandardPoangType)get_store().add_element_user(STANDARDPOANG$0);
            return target;
        }
    }
}
