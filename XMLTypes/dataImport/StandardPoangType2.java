/*
 * XML Type:  StandardPoangType
 * Namespace: DataImport
 * Java type: dataImport.StandardPoangType2
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML StandardPoangType(@DataImport).
 *
 * This is a complex type.
 */
public interface StandardPoangType2 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardPoangType2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("standardpoangtype2140type");
    
    /**
     * Gets the "Undregrans" element
     */
    int getUndregrans();
    
    /**
     * Gets (as xml) the "Undregrans" element
     */
    dataImport.StandardPoangType2.Undregrans xgetUndregrans();
    
    /**
     * Sets the "Undregrans" element
     */
    void setUndregrans(int undregrans);
    
    /**
     * Sets (as xml) the "Undregrans" element
     */
    void xsetUndregrans(dataImport.StandardPoangType2.Undregrans undregrans);
    
    /**
     * Gets the "Ovregrans" element
     */
    int getOvregrans();
    
    /**
     * Gets (as xml) the "Ovregrans" element
     */
    dataImport.StandardPoangType2.Ovregrans xgetOvregrans();
    
    /**
     * Sets the "Ovregrans" element
     */
    void setOvregrans(int ovregrans);
    
    /**
     * Sets (as xml) the "Ovregrans" element
     */
    void xsetOvregrans(dataImport.StandardPoangType2.Ovregrans ovregrans);
    
    /**
     * Gets the "reduktionsFaktor" element
     */
    dataImport.ReduktionsFaktorType getReduktionsFaktor();
    
    /**
     * Sets the "reduktionsFaktor" element
     */
    void setReduktionsFaktor(dataImport.ReduktionsFaktorType reduktionsFaktor);
    
    /**
     * Appends and returns a new empty "reduktionsFaktor" element
     */
    dataImport.ReduktionsFaktorType addNewReduktionsFaktor();
    
    /**
     * An XML Undregrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.StandardPoangType2$Undregrans.
     */
    public interface Undregrans extends org.apache.xmlbeans.XmlInt
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Undregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("undregrans0be7elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.StandardPoangType2.Undregrans newValue(java.lang.Object obj) {
              return (dataImport.StandardPoangType2.Undregrans) type.newValue( obj ); }
            
            public static dataImport.StandardPoangType2.Undregrans newInstance() {
              return (dataImport.StandardPoangType2.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.StandardPoangType2.Undregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.StandardPoangType2.Undregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Ovregrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.StandardPoangType2$Ovregrans.
     */
    public interface Ovregrans extends org.apache.xmlbeans.XmlInt
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ovregrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("ovregrans0a53elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.StandardPoangType2.Ovregrans newValue(java.lang.Object obj) {
              return (dataImport.StandardPoangType2.Ovregrans) type.newValue( obj ); }
            
            public static dataImport.StandardPoangType2.Ovregrans newInstance() {
              return (dataImport.StandardPoangType2.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.StandardPoangType2.Ovregrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.StandardPoangType2.Ovregrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.StandardPoangType2 newInstance() {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.StandardPoangType2 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.StandardPoangType2 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.StandardPoangType2 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.StandardPoangType2 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.StandardPoangType2 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.StandardPoangType2 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.StandardPoangType2 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.StandardPoangType2 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.StandardPoangType2 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.StandardPoangType2 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.StandardPoangType2 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.StandardPoangType2 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.StandardPoangType2 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.StandardPoangType2 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.StandardPoangType2 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.StandardPoangType2 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.StandardPoangType2 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.StandardPoangType2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
