package biz.c24.retaildemo.model.java;


/**
 * The Receipt complex data type.
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 * @see biz.c24.retaildemo.model.java.Receipt
 **/
public class ReceiptClass extends biz.c24.io.api.data.ComplexDataType 
{
    protected static ReceiptClass instance;
    private static boolean initialized;

    /**
     * Singleton constructor - use {@link #getInstance()} instead.
     **/
    protected ReceiptClass()
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
            synchronized (biz.c24.retaildemo.model.java.ReceiptClass.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.java.ReceiptClass();
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
        setName("Receipt");
        setModel(biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance());
        setValidObjectClass(biz.c24.retaildemo.model.java.Receipt.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Element element = null;
        biz.c24.io.api.data.Attribute attribute = null;
        addElementDecl(element = new biz.c24.io.api.data.Element("Items", 0, biz.c24.io.api.data.DataComponent.CARDINALITY_UNBOUNDED, biz.c24.retaildemo.model.java.BasketItemClass.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance()));
        addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("Id", 0, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance()));
        addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("CustomerId", 0, 1, biz.c24.io.api.data.GenericStringDataType.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance()));
        addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("CheckoutTime", 0, 1, biz.c24.io.api.data.GenericDateDataType.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance()));
    }

    private java.lang.Object readResolve()
    {
        return getInstance();
    }

}
