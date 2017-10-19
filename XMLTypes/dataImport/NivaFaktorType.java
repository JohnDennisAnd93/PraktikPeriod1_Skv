/*
 * XML Type:  nivaFaktorType
 * Namespace: DataImport
 * Java type: dataImport.NivaFaktorType
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML nivaFaktorType(@DataImport).
 *
 * This is a complex type.
 */
public interface NivaFaktorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NivaFaktorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("nivafaktortype493ftype");
    
    /**
     * Gets the "undreGrans" element
     */
    java.math.BigDecimal getUndreGrans();
    
    /**
     * Gets (as xml) the "undreGrans" element
     */
    dataImport.NivaFaktorType.UndreGrans xgetUndreGrans();
    
    /**
     * Sets the "undreGrans" element
     */
    void setUndreGrans(java.math.BigDecimal undreGrans);
    
    /**
     * Sets (as xml) the "undreGrans" element
     */
    void xsetUndreGrans(dataImport.NivaFaktorType.UndreGrans undreGrans);
    
    /**
     * Gets the "ovreGrans" element
     */
    java.math.BigDecimal getOvreGrans();
    
    /**
     * Gets (as xml) the "ovreGrans" element
     */
    dataImport.NivaFaktorType.OvreGrans xgetOvreGrans();
    
    /**
     * Sets the "ovreGrans" element
     */
    void setOvreGrans(java.math.BigDecimal ovreGrans);
    
    /**
     * Sets (as xml) the "ovreGrans" element
     */
    void xsetOvreGrans(dataImport.NivaFaktorType.OvreGrans ovreGrans);
    
    /**
     * Gets array of all "standardPoang" elements
     */
    dataImport.StandardPoangType[] getStandardPoangArray();
    
    /**
     * Gets ith "standardPoang" element
     */
    dataImport.StandardPoangType getStandardPoangArray(int i);
    
    /**
     * Returns number of "standardPoang" element
     */
    int sizeOfStandardPoangArray();
    
    /**
     * Sets array of all "standardPoang" element
     */
    void setStandardPoangArray(dataImport.StandardPoangType[] standardPoangArray);
    
    /**
     * Sets ith "standardPoang" element
     */
    void setStandardPoangArray(int i, dataImport.StandardPoangType standardPoang);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "standardPoang" element
     */
    dataImport.StandardPoangType insertNewStandardPoang(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "standardPoang" element
     */
    dataImport.StandardPoangType addNewStandardPoang();
    
    /**
     * Removes the ith "standardPoang" element
     */
    void removeStandardPoang(int i);
    
    /**
     * An XML undreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.NivaFaktorType$UndreGrans.
     */
    public interface UndreGrans extends org.apache.xmlbeans.XmlDecimal
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("undregranscbb8elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.NivaFaktorType.UndreGrans newValue(java.lang.Object obj) {
              return (dataImport.NivaFaktorType.UndreGrans) type.newValue( obj ); }
            
            public static dataImport.NivaFaktorType.UndreGrans newInstance() {
              return (dataImport.NivaFaktorType.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.NivaFaktorType.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.NivaFaktorType.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ovreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.NivaFaktorType$OvreGrans.
     */
    public interface OvreGrans extends org.apache.xmlbeans.XmlDecimal
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("ovregrans210celemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.NivaFaktorType.OvreGrans newValue(java.lang.Object obj) {
              return (dataImport.NivaFaktorType.OvreGrans) type.newValue( obj ); }
            
            public static dataImport.NivaFaktorType.OvreGrans newInstance() {
              return (dataImport.NivaFaktorType.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.NivaFaktorType.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.NivaFaktorType.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.NivaFaktorType newInstance() {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.NivaFaktorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.NivaFaktorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.NivaFaktorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.NivaFaktorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.NivaFaktorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.NivaFaktorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.NivaFaktorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.NivaFaktorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.NivaFaktorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.NivaFaktorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.NivaFaktorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.NivaFaktorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.NivaFaktorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.NivaFaktorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.NivaFaktorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.NivaFaktorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.NivaFaktorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.NivaFaktorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
