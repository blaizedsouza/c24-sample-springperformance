package biz.c24.retaildemo.model.java;


/**
 * The Receipt element.
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
        super("Receipt", 1, 1, biz.c24.retaildemo.model.java.ReceiptClass.class, biz.c24.retaildemo.model.java.ReceiptDataModel.getInstance());
        
        if (init)
            init();
    }

    public static biz.c24.io.api.data.Element getInstance()
    {
        if (!initialized)
        {
            synchronized (biz.c24.retaildemo.model.java.ReceiptElement.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.java.ReceiptElement(false);
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
