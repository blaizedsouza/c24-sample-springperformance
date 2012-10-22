package biz.c24.retaildemo.model.java;


/**
 * The BasketItem complex data type.
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 * @see biz.c24.retaildemo.model.java.BasketItem
 **/
public class BasketItemClass extends biz.c24.io.api.data.ComplexDataType 
{
    protected static BasketItemClass instance;
    private static boolean initialized;

    /**
     * Singleton constructor - use {@link #getInstance()} instead.
     **/
    protected BasketItemClass()
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
            synchronized (biz.c24.retaildemo.model.java.BasketItemClass.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.java.BasketItemClass();
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
        setName("BasketItem");
        setModel(biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance());
        setValidObjectClass(biz.c24.retaildemo.model.java.BasketItem.class);
        setContentModel(biz.c24.io.api.data.ContentModelEnum.SEQUENCE);
        biz.c24.io.api.data.Attribute attribute = null;
        addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("ProductId", 0, 1, biz.c24.io.api.data.IntDataType.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance()));
        addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("Quantity", 0, 1, biz.c24.io.api.data.IntDataType.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance()));
        addAttrDecl(attribute = new biz.c24.io.api.data.Attribute("Price", 0, 1, biz.c24.io.api.data.DecimalDataType.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance()));
    }

    private java.lang.Object readResolve()
    {
        return getInstance();
    }

}
