package biz.c24.retaildemo.model.java;


/**
 * The Receipt data model.
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 **/
public class ReceiptDataModel extends biz.c24.io.api.data.DataModel 
{
    private static ReceiptDataModel instance;
    private static boolean initialized;

    protected ReceiptDataModel(boolean init)
    {
        if (init)
            init();
    }

    /**
     * Gets the singleton instance.
     * @return The instance.
     **/
    public static biz.c24.retaildemo.model.java.ReceiptDataModel getInstance()
    {
        if (!initialized)
        {
            synchronized (biz.c24.retaildemo.model.java.ReceiptDataModel.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.java.ReceiptDataModel(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    private void init()
    {
        setName("Receipt");
        setTargetNamespace("http://www.c24.biz/retaildemo/model/java");
        setElementFormDefault(biz.c24.io.api.data.FormEnum.QUALIFIED);
        setAttributeFormDefault(biz.c24.io.api.data.FormEnum.UNQUALIFIED);
        setIdGeneratorMethodDefault(biz.c24.io.api.data.IDGeneratorMethodEnum.NATIVE);
        setSource(new biz.c24.io.api.presentation.JavaClassSource());
        setSink(new biz.c24.io.api.presentation.JavaClassSink());
    }

}
