/*
 * An XML document type.
 * Localname: StandardPoang
 * Namespace: DataImport
 * Java type: dataImport.StandardPoangDocument2
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one StandardPoang(@DataImport) element.
 *
 * This is a complex type.
 */
public class StandardPoangDocument2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.StandardPoangDocument2
{
    private static final long serialVersionUID = 1L;
    
    public StandardPoangDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDPOANG$0 = 
        new javax.xml.namespace.QName("DataImport", "StandardPoang");
    
    
    /**
     * Gets the "StandardPoang" element
     */
    public dataImport.StandardPoangType2 getStandardPoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2 target = null;
            target = (dataImport.StandardPoangType2)get_store().find_element_user(STANDARDPOANG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StandardPoang" element
     */
    public void setStandardPoang(dataImport.StandardPoangType2 standardPoang)
    {
        generatedSetterHelperImpl(standardPoang, STANDARDPOANG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StandardPoang" element
     */
    public dataImport.StandardPoangType2 addNewStandardPoang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.StandardPoangType2 target = null;
            target = (dataImport.StandardPoangType2)get_store().add_element_user(STANDARDPOANG$0);
            return target;
        }
    }
}
