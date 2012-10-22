package biz.c24.retaildemo.model.xml;


/**
 * The receipt element.
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 **/
public class ReceiptElement extends biz.c24.io.api.data.Element 
{
    private static ReceiptElement instance;
    private static boolean initialized;

    public ReceiptElement()
    {
        this(true);
    }

    private ReceiptElement(boolean init)
    {
        super("receipt", 1, 1, biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance());
        
        if (init)
            init();
    }

    public static biz.c24.io.api.data.Element getInstance()
    {
        if (!initialized)
        {
            synchronized (biz.c24.retaildemo.model.xml.ReceiptElement.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.xml.ReceiptElement(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    private void init()
    {
    }

    /**
     * The receipt complex data type.
     * 
     * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
     * @author C24 Integration Objects;
     * @see biz.c24.retaildemo.model.xml.ReceiptLocal
     **/
    public static class ReceiptLocalClass extends biz.c24.io.api.data.ComplexDataType 
    {
        protected static biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass instance;
        private static boolean initialized;

        /**
         * Singleton constructor - use {@link #getInstance()} instead.
         **/
        protected ReceiptLocalClass()
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
                synchronized (biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.class)
                {
                    if (instance == null)
                    {
                        instance = new biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass();
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
            setName("receipt");
            setModel(biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance());
            setLocal(true);
            setValidObjectClass(biz.c24.retaildemo.model.xml.ReceiptLocal.class);
            setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
            biz.c24.io.api.data.Element element = null;
            biz.c24.io.api.data.Attribute attribute = null;
            addElementDecl(element = new biz.c24.io.api.data.Element("item", 1, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
            addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("receiptId", 1, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
            attribute.setAnnotation(new biz.c24.io.api.data.Annotation(
                new biz.c24.io.api.data.Documentation[] {
                    new biz.c24.io.api.data.Documentation("UUID for this receipt.", null, "")}, null)
            );
            addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("timestamp", 1, 1, biz.c24.io.api.data.ISO8601DateTimeDataType.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
            attribute.setAnnotation(new biz.c24.io.api.data.Annotation(
                new biz.c24.io.api.data.Documentation[] {
                    new biz.c24.io.api.data.Documentation("Checkout time", null, "")}, null)
            );
            addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("customerId", 0, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
            attribute.setAnnotation(new biz.c24.io.api.data.Annotation(
                new biz.c24.io.api.data.Documentation[] {
                    new biz.c24.io.api.data.Documentation("Customer loyalty id if scanned", null, "")}, null)
            );
        }

        private java.lang.Object readResolve()
        {
            return getInstance();
        }

        /**
         * The item complex data type.
         * 
         * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
         * @author C24 Integration Objects;
         * @see biz.c24.retaildemo.model.xml.ReceiptLocal.Item
         **/
        public static class ItemClass extends biz.c24.io.api.data.ComplexDataType 
        {
            protected static biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass instance;
            private static boolean initialized;

            /**
             * Singleton constructor - use {@link #getInstance()} instead.
             **/
            protected ItemClass()
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
                    synchronized (biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass.class)
                    {
                        if (instance == null)
                        {
                            instance = new biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass();
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
                setName("item");
                setModel(biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance());
                setLocal(true);
                setValidObjectClass(biz.c24.retaildemo.model.xml.ReceiptLocal.Item.class);
                setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
                biz.c24.io.api.data.Attribute attribute = null;
                addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("productId", 1, 1, biz.c24.io.api.data.IntDataType.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
                attribute.setAnnotation(new biz.c24.io.api.data.Annotation(
                    new biz.c24.io.api.data.Documentation[] {
                        new biz.c24.io.api.data.Documentation("Customer loyalty id if scanned", null, "")}, null)
                );
                addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("quantity", 1, 1, biz.c24.io.api.data.IntDataType.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
                attribute.setAnnotation(new biz.c24.io.api.data.Annotation(
                    new biz.c24.io.api.data.Documentation[] {
                        new biz.c24.io.api.data.Documentation("Quantity of this item purchased", null, "")}, null)
                );
                addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("price", 1, 1, biz.c24.io.api.data.DecimalDataType.class, biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.getInstance()));
                attribute.setAnnotation(new biz.c24.io.api.data.Annotation(
                    new biz.c24.io.api.data.Documentation[] {
                        new biz.c24.io.api.data.Documentation("Price paid", null, "")}, null)
                );
            }

            private java.lang.Object readResolve()
            {
                return getInstance();
            }

        }

    }

}
