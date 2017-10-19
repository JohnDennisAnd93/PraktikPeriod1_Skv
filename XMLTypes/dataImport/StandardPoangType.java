/*
 * XML Type:  standardPoangType
 * Namespace: DataImport
 * Java type: dataImport.StandardPoangType
 *
 * Automatically generated - do not modify.
 */
package dataImport;


/**
 * An XML standardPoangType(@DataImport).
 *
 * This is a complex type.
 */
public interface StandardPoangType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardPoangType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("standardpoangtype0d20type");
    
    /**
     * Gets the "undreGrans" element
     */
    int getUndreGrans();
    
    /**
     * Gets (as xml) the "undreGrans" element
     */
    dataImport.StandardPoangType.UndreGrans xgetUndreGrans();
    
    /**
     * Sets the "undreGrans" element
     */
    void setUndreGrans(int undreGrans);
    
    /**
     * Sets (as xml) the "undreGrans" element
     */
    void xsetUndreGrans(dataImport.StandardPoangType.UndreGrans undreGrans);
    
    /**
     * Gets the "ovreGrans" element
     */
    int getOvreGrans();
    
    /**
     * Gets (as xml) the "ovreGrans" element
     */
    dataImport.StandardPoangType.OvreGrans xgetOvreGrans();
    
    /**
     * Sets the "ovreGrans" element
     */
    void setOvreGrans(int ovreGrans);
    
    /**
     * Sets (as xml) the "ovreGrans" element
     */
    void xsetOvreGrans(dataImport.StandardPoangType.OvreGrans ovreGrans);
    
    /**
     * Gets array of all "vardeYta" elements
     */
    dataImport.VardeYtaType[] getVardeYtaArray();
    
    /**
     * Gets ith "vardeYta" element
     */
    dataImport.VardeYtaType getVardeYtaArray(int i);
    
    /**
     * Returns number of "vardeYta" element
     */
    int sizeOfVardeYtaArray();
    
    /**
     * Sets array of all "vardeYta" element
     */
    void setVardeYtaArray(dataImport.VardeYtaType[] vardeYtaArray);
    
    /**
     * Sets ith "vardeYta" element
     */
    void setVardeYtaArray(int i, dataImport.VardeYtaType vardeYta);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vardeYta" element
     */
    dataImport.VardeYtaType insertNewVardeYta(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vardeYta" element
     */
    dataImport.VardeYtaType addNewVardeYta();
    
    /**
     * Removes the ith "vardeYta" element
     */
    void removeVardeYta(int i);
    
    /**
     * An XML undreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.StandardPoangType$UndreGrans.
     */
    public interface UndreGrans extends org.apache.xmlbeans.XmlInt
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UndreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("undregrans4c07elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.StandardPoangType.UndreGrans newValue(java.lang.Object obj) {
              return (dataImport.StandardPoangType.UndreGrans) type.newValue( obj ); }
            
            public static dataImport.StandardPoangType.UndreGrans newInstance() {
              return (dataImport.StandardPoangType.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.StandardPoangType.UndreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.StandardPoangType.UndreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ovreGrans(@DataImport).
     *
     * This is an atomic type that is a restriction of dataImport.StandardPoangType$OvreGrans.
     */
    public interface OvreGrans extends org.apache.xmlbeans.XmlInt
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OvreGrans.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s145A061D43B1F4EFED9463EC1CA351C0").resolveHandle("ovregrans0633elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static dataImport.StandardPoangType.OvreGrans newValue(java.lang.Object obj) {
              return (dataImport.StandardPoangType.OvreGrans) type.newValue( obj ); }
            
            public static dataImport.StandardPoangType.OvreGrans newInstance() {
              return (dataImport.StandardPoangType.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static dataImport.StandardPoangType.OvreGrans newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (dataImport.StandardPoangType.OvreGrans) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static dataImport.StandardPoangType newInstance() {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static dataImport.StandardPoangType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static dataImport.StandardPoangType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static dataImport.StandardPoangType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static dataImport.StandardPoangType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static dataImport.StandardPoangType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static dataImport.StandardPoangType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static dataImport.StandardPoangType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static dataImport.StandardPoangType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static dataImport.StandardPoangType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static dataImport.StandardPoangType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static dataImport.StandardPoangType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static dataImport.StandardPoangType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static dataImport.StandardPoangType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static dataImport.StandardPoangType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static dataImport.StandardPoangType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.StandardPoangType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static dataImport.StandardPoangType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (dataImport.StandardPoangType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
