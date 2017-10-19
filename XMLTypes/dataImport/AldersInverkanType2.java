/*
 * XML Type:  AldersInverkanType
 * Namespace: DataImport
 * Java type: dataImport.AldersInverkanType2
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML AldersInverkanType(@DataImport).
 *
 * This is a complex type.
 */
public interface AldersInverkanType2 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AldersInverkanType2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("aldersinverkantypedee5type");
    
    /**
     * Gets the "fastighetsTaxeringsAr" element
     */
    java.util.Calendar getFastighetsTaxeringsAr();
    
    /**
     * Gets (as xml) the "fastighetsTaxeringsAr" element
     */
    dataImport.FastighetsTaxeringsArType xgetFastighetsTaxeringsAr();
    
    /**
     * Sets the "fastighetsTaxeringsAr" element
     */
    void setFastighetsTaxeringsAr(java.util.Calendar fastighetsTaxeringsAr);
    
    /**
     * Sets (as xml) the "fastighetsTaxeringsAr" element
     */
    void xsetFastighetsTaxeringsAr(dataImport.FastighetsTaxeringsArType fastighetsTaxeringsAr);
    
    /**
     * Gets array of all "aldersInverkan" elements
     */
    dataImport.AldersInverkanType[] getAldersInverkanArray();
    
    /**
     * Gets ith "aldersInverkan" element
     */
    dataImport.AldersInverkanType getAldersInverkanArray(int i);
    
    /**
     * Returns number of "aldersInverkan" element
     */
    int sizeOfAldersInverkanArray();
    
    /**
     * Sets array of all "aldersInverkan" element
     */
    void setAldersInverkanArray(dataImport.AldersInverkanType[] aldersInverkanArray);
    
    /**
     * Sets ith "aldersInverkan" element
     */
    void setAldersInverkanArray(int i, dataImport.AldersInverkanType aldersInverkan);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "aldersInverkan" element
     */
    dataImport.AldersInverkanType insertNewAldersInverkan(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "aldersInverkan" element
     */
    dataImport.AldersInverkanType addNewAldersInverkan();
    
    /**
     * Removes the ith "aldersInverkan" element
     */
    void removeAldersInverkan(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.AldersInverkanType2 newInstance() {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.AldersInverkanType2 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.AldersInverkanType2 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.AldersInverkanType2 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.AldersInverkanType2 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.AldersInverkanType2 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.AldersInverkanType2 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.AldersInverkanType2 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.AldersInverkanType2 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.AldersInverkanType2 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.AldersInverkanType2 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.AldersInverkanType2 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.AldersInverkanType2 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.AldersInverkanType2 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.AldersInverkanType2 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.AldersInverkanType2 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.AldersInverkanType2 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.AldersInverkanType2 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.AldersInverkanType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
