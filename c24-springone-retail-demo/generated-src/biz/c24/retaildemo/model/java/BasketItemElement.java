package biz.c24.retaildemo.model.java;


/**
 * The BasketItem element.
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 **/
public class BasketItemElement extends biz.c24.io.api.data.Element 
{
    private static BasketItemElement instance;
    private static boolean initialized;

    public BasketItemElement()
    {
        this(true);
    }

    private BasketItemElement(boolean init)
    {
        super("BasketItem", 1, 1, biz.c24.retaildemo.model.java.BasketItemClass.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance());
        
        if (init)
            init();
    }

    public static biz.c24.io.api.data.Element getInstance()
    {
        if (!initialized)
        {
            synchronized (biz.c24.retaildemo.model.java.BasketItemElement.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.java.BasketItemElement(false);
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

}
