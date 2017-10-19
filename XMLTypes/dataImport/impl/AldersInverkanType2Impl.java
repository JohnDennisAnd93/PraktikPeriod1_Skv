/*
 * XML Type:  AldersInverkanType
 * Namespace: DataImport
 * Java type: dataImport.AldersInverkanType2
 *
 * Automatically generated - do not modify.
 */
package dataImport.impl;
/**
 * An XML AldersInverkanType(@DataImport).
 *
 * This is a complex type.
 */
public class AldersInverkanType2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements dataImport.AldersInverkanType2
{
    private static final long serialVersionUID = 1L;
    
    public AldersInverkanType2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FASTIGHETSTAXERINGSAR$0 = 
        new javax.xml.namespace.QName("DataImport", "fastighetsTaxeringsAr");
    private static final javax.xml.namespace.QName ALDERSINVERKAN$2 = 
        new javax.xml.namespace.QName("DataImport", "aldersInverkan");
    
    
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
     * Gets array of all "aldersInverkan" elements
     */
    public dataImport.AldersInverkanType[] getAldersInverkanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALDERSINVERKAN$2, targetList);
            dataImport.AldersInverkanType[] result = new dataImport.AldersInverkanType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "aldersInverkan" element
     */
    public dataImport.AldersInverkanType getAldersInverkanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType target = null;
            target = (dataImport.AldersInverkanType)get_store().find_element_user(ALDERSINVERKAN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "aldersInverkan" element
     */
    public int sizeOfAldersInverkanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALDERSINVERKAN$2);
        }
    }
    
    /**
     * Sets array of all "aldersInverkan" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAldersInverkanArray(dataImport.AldersInverkanType[] aldersInverkanArray)
    {
        check_orphaned();
        arraySetterHelper(aldersInverkanArray, ALDERSINVERKAN$2);
    }
    
    /**
     * Sets ith "aldersInverkan" element
     */
    public void setAldersInverkanArray(int i, dataImport.AldersInverkanType aldersInverkan)
    {
        generatedSetterHelperImpl(aldersInverkan, ALDERSINVERKAN$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "aldersInverkan" element
     */
    public dataImport.AldersInverkanType insertNewAldersInverkan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType target = null;
            target = (dataImport.AldersInverkanType)get_store().insert_element_user(ALDERSINVERKAN$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "aldersInverkan" element
     */
    public dataImport.AldersInverkanType addNewAldersInverkan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            dataImport.AldersInverkanType target = null;
            target = (dataImport.AldersInverkanType)get_store().add_element_user(ALDERSINVERKAN$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "aldersInverkan" element
     */
    public void removeAldersInverkan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALDERSINVERKAN$2, i);
        }
    }
}
