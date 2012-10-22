package biz.c24.retaildemo.model.xml;


/**
 * The Document Root element.
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 **/
public class ReceiptXMLDocumentRootElement extends biz.c24.io.api.data.Element 
{
    private static ReceiptXMLDocumentRootElement instance;
    private static boolean initialized;

    public ReceiptXMLDocumentRootElement()
    {
        this(true);
    }

    private ReceiptXMLDocumentRootElement(boolean init)
    {
        super("DocumentRoot", 1, 1, biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement.ReceiptXMLDocumentRootClass.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance());
        
        if (init)
            init();
    }

    public static biz.c24.io.api.data.Element getInstance()
    {
        if (!initialized)
        {
            synchronized (biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    private void init()
    {
        setDatabaseColumnName("Document Root");
    }

    /**
     * The Document Root complex data type.
     * 
     * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
     * @author C24 Integration Objects;
     * @see biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRoot
     **/
    public static class ReceiptXMLDocumentRootClass extends biz.c24.io.api.data.ComplexDataType 
    {
        protected static biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement.ReceiptXMLDocumentRootClass instance;
        private static boolean initialized;

        /**
         * Singleton constructor - use {@link #getInstance()} instead.
         **/
        protected ReceiptXMLDocumentRootClass()
        {
        }

        /**
         * Gets the singleton instance of this type.
         * @return The type, or its supertype if present.
         **/
        public static biz.c24.io.api.data.DataType getInstance()
        {
            if (!initialized)
            {
                synchronized (biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement.ReceiptXMLDocumentRootClass.class)
                {
                    if (instance == null)
                    {
                        instance = new biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement.ReceiptXMLDocumentRootClass();
                        instance.init();
                        initialized = true;
                    }
                }
            }
            return instance;
        }

        /**
         * Called internally to initialize this type.
         **/
        protected void init()
        {
            setName("DocumentRoot");
            setModel(biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance());
            setDatabaseColumnName("Document Root");
            setLocal(true);
            setValidObjectClass(biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRoot.class);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.CHOICE);
            biz.c24.io.api.data.Element element = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("receipt", 1, 1, biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
        }

        private java.lang.Object readResolve()
        {
            return getInstance();
        }

    }

}
