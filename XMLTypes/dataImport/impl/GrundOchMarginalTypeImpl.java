/*
 * XML Type:  GrundOchMarginalType
 * Namespace: DataImport
 * Java type: dataImport.GrundOchMarginalType
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML GrundOchMarginalType(@DataImport).
 *
 * This is a complex type.
 */
public class GrundOchMarginalTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.GrundOchMarginalType
{
    private static final long serialVersionUID = 1L;
    
    public GrundOchMarginalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FASTIGHETSTAXERINGSAR$0 = 
        new javax.xml.namespace.QName("DataImport", "fastighetsTaxeringsAr");
    private static final javax.xml.namespace.QName NIVAFAKTOR$2 = 
        new javax.xml.namespace.QName("DataImport", "nivaFaktor");
    
    
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
    
    /**
     * Gets array of all "nivaFaktor" elements
     */
    public dataImport.NivaFaktorType[] getNivaFaktorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NIVAFAKTOR$2, targetList);
            dataImport.NivaFaktorType[] result = new dataImport.NivaFaktorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nivaFaktor" element
     */
    public dataImport.NivaFaktorType getNivaFaktorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType target = null;
            target = (dataImport.NivaFaktorType)get_store().find_element_user(NIVAFAKTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nivaFaktor" element
     */
    public int sizeOfNivaFaktorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NIVAFAKTOR$2);
        }
    }
    
    /**
     * Sets array of all "nivaFaktor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNivaFaktorArray(dataImport.NivaFaktorType[] nivaFaktorArray)
    {
        check_orphaned();
        arraySetterHelper(nivaFaktorArray, NIVAFAKTOR$2);
    }
    
    /**
     * Sets ith "nivaFaktor" element
     */
    public void setNivaFaktorArray(int i, dataImport.NivaFaktorType nivaFaktor)
    {
        generatedSetterHelperImpl(nivaFaktor, NIVAFAKTOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nivaFaktor" element
     */
    public dataImport.NivaFaktorType insertNewNivaFaktor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType target = null;
            target = (dataImport.NivaFaktorType)get_store().insert_element_user(NIVAFAKTOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nivaFaktor" element
     */
    public dataImport.NivaFaktorType addNewNivaFaktor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.NivaFaktorType target = null;
            target = (dataImport.NivaFaktorType)get_store().add_element_user(NIVAFAKTOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "nivaFaktor" element
     */
    public void removeNivaFaktor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NIVAFAKTOR$2, i);
        }
    }
}
