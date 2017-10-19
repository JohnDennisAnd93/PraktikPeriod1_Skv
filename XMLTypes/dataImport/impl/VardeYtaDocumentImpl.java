/*
 * An XML document type.
 * Localname: vardeYta
 * Namespace: DataImport
 * Java type: dataImport.VardeYtaDocument
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * A document containing one vardeYta(@DataImport) element.
 *
 * This is a complex type.
 */
public class VardeYtaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.VardeYtaDocument
{
    private static final long serialVersionUID = 1L;
    
    public VardeYtaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARDEYTA$0 = 
        new javax.xml.namespace.QName("DataImport", "vardeYta");
    
    
    /**
     * Gets the "vardeYta" element
     */
    public dataImport.VardeYtaType getVardeYta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType target = null;
            target = (dataImport.VardeYtaType)get_store().find_element_user(VARDEYTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "vardeYta" element
     */
    public void setVardeYta(dataImport.VardeYtaType vardeYta)
    {
        generatedSetterHelperImpl(vardeYta, VARDEYTA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "vardeYta" element
     */
    public dataImport.VardeYtaType addNewVardeYta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.VardeYtaType target = null;
            target = (dataImport.VardeYtaType)get_store().add_element_user(VARDEYTA$0);
            return target;
        }
    }
}
