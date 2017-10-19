/*
 * An XML document type.
 * Localname: vardeAr
 * Namespace: DataImport
 * Java type: dataImport.VardeArDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one vardeAr(@DataImport) element.
 *
 * This is a complex type.
 */
public class VardeArDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.VardeArDocument
{
    private static final long serialVersionUID = 1L;
    
    public VardeArDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARDEAR$0 = 
        new javax.xml.namespace.QName("DataImport", "vardeAr");
    
    
    /**
     * Gets the "vardeAr" element
     */
    public dataImport.VardeArType getVardeAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType target = null;
            target = (dataImport.VardeArType)get_store().find_element_user(VARDEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vardeAr" element
     */
    public void setVardeAr(dataImport.VardeArType vardeAr)
    {
        generatedSetterHelperImpl(vardeAr, VARDEAR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vardeAr" element
     */
    public dataImport.VardeArType addNewVardeAr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeArType target = null;
            target = (dataImport.VardeArType)get_store().add_element_user(VARDEAR$0);
            return target;
        }
    }
}
