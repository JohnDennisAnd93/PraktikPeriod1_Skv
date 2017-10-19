/*
 * An XML document type.
 * Localname: aldersInverkan
 * Namespace: DataImport
 * Java type: dataImport.AldersInverkanDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one aldersInverkan(@DataImport) element.
 *
 * This is a complex type.
 */
public class AldersInverkanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanDocument
{
    private static final long serialVersionUID = 1L;
    
    public AldersInverkanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALDERSINVERKAN$0 = 
        new javax.xml.namespace.QName("DataImport", "aldersInverkan");
    
    
    /**
     * Gets the "aldersInverkan" element
     */
    public dataImport.AldersInverkanType getAldersInverkan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType target = null;
            target = (dataImport.AldersInverkanType)get_store().find_element_user(ALDERSINVERKAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "aldersInverkan" element
     */
    public void setAldersInverkan(dataImport.AldersInverkanType aldersInverkan)
    {
        generatedSetterHelperImpl(aldersInverkan, ALDERSINVERKAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "aldersInverkan" element
     */
    public dataImport.AldersInverkanType addNewAldersInverkan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType target = null;
            target = (dataImport.AldersInverkanType)get_store().add_element_user(ALDERSINVERKAN$0);
            return target;
        }
    }
}
