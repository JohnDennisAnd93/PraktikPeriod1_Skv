/*
 * XML Type:  vardeArType
 * Namespace: DataImport
 * Java type: dataImport.VardeArType
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML vardeArType(@DataImport).
 *
 * This is a complex type.
 */
public interface VardeArType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VardeArType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("vardeartypead05type");
    
    /**
     * Gets the "Undregrans" element
     */
    java.util.Calendar getUndregrans();
    
    /**
     * Gets (as xml) the "Undregrans" element
     */
    dataImport.VardeArType.Undregrans xgetUndregrans();
    
    /**
     * Sets the "Undregrans" element
     */
    void setUndregrans(java.util.Calendar undregrans);
    
    /**
     * Sets (as xml) the "Undregrans" element
     */
    void xsetUndregrans(dataImport.VardeArType.Undregrans undregrans);
    
    /**
     * Gets the "Ovregrans" element
     */
    java.util.Calendar getOvregrans();
    
    /**
     * Gets (as xml) the "Ovregrans" element
     */
    dataImport.VardeArType.Ovregrans xgetOvregrans();
    
    /**
     * Sets the "Ovregrans" element
     */
    void setOvregrans(java.util.Calendar ovregrans);
    
    /**
     * Sets (as xml) the "Ovregrans" element
     */
    void xsetOvregrans(dataImport.VardeArType.Ovregrans ovregrans);
    
    /**
     * Gets array of all "StandardPoang" elements
     */
    dataImport.StandardPoangType2[] getStandardPoangArray();
    
    /**
     * Gets ith "StandardPoang" element
     */
    dataImport.StandardPoangType2 getStandardPoangArray(int i);
    
    /**
     * Returns number of "StandardPoang" element
     */
    int sizeOfStandardPoangArray();
    
    /**
     * Sets array of all "StandardPoang" element
     */
    void setStandardPoangArray(dataImport.StandardPoangType2[] standardPoangArray);
    
    /**
     * Sets ith "StandardPoang" element
     */
    void setStandardPoangArray(int i, dataImport.StandardPoangType2 standardPoang);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StandardPoang" element
     */
    dataImport.StandardPoangType2 insertNewStandardPoang(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StandardPoang" element
     */
    dataImport.StandardPoangType2 addNewStandardPoang();
    
    /**
     * Removes the ith "StandardPoang" element
     */
    void removeStandardPoang(int i);
    
    /**
     * An XML Undregrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.VardeArType$Undregrans.
     */
    public interface Undregrans extends org.apache.xmlbeans.XmlGYear
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Undregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("undregrans60ecelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.VardeArType.Undregrans newValue(java.lang.Object obj) {
              return (dataImport.VardeArType.Undregrans) type.newValue( obj ); }
            
            public static dataImport.VardeArType.Undregrans newInstance() {
              return (dataImport.VardeArType.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.VardeArType.Undregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.VardeArType.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Ovregrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.VardeArType$Ovregrans.
     */
    public interface Ovregrans extends org.apache.xmlbeans.XmlGYear
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ovregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("ovregransa058elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.VardeArType.Ovregrans newValue(java.lang.Object obj) {
              return (dataImport.VardeArType.Ovregrans) type.newValue( obj ); }
            
            public static dataImport.VardeArType.Ovregrans newInstance() {
              return (dataImport.VardeArType.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.VardeArType.Ovregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.VardeArType.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.VardeArType newInstance() {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.VardeArType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.VardeArType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.VardeArType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.VardeArType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.VardeArType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.VardeArType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.VardeArType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.VardeArType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.VardeArType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.VardeArType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.VardeArType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.VardeArType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.VardeArType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.VardeArType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.VardeArType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.VardeArType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.VardeArType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.VardeArType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
