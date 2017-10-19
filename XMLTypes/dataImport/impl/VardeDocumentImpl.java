/*
 * An XML document type.
 * Localname: varde
 * Namespace: DataImport
 * Java type: dataImport.VardeDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one varde(@DataImport) element.
 *
 * This is a complex type.
 */
public class VardeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.VardeDocument
{
    private static final long serialVersionUID = 1L;
    
    public VardeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARDE$0 = 
        new javax.xml.namespace.QName("DataImport", "varde");
    
    
    /**
     * Gets the "varde" element
     */
    public dataImport.VardeType getVarde()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeType target = null;
            target = (dataImport.VardeType)get_store().find_element_user(VARDE$0, 0);
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
        generatedSetterHelperImpl(varde, VARDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (dataImport.VardeType)get_store().add_element_user(VARDE$0);
            return target;
        }
    }
}
