package biz.c24.retaildemo.model.xml;


/**
 * The ReceiptXML data model.
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 **/
public class ReceiptXMLDataModel extends biz.c24.io.api.data.DataModel 
{
    private static ReceiptXMLDataModel instance;
    private static boolean initialized;

    protected ReceiptXMLDataModel(boolean init)
    {
        if (init)
            init();
    }

    /**
     * Gets the singleton instance.
     * @return The instance.
     **/
    public static biz.c24.retaildemo.model.xml.ReceiptXMLDataModel getInstance()
    {
        if (!initialized)
        {
            synchronized (biz.c24.retaildemo.model.xml.ReceiptXMLDataModel.class)
            {
                if (instance == null)
                {
                    instance = new biz.c24.retaildemo.model.xml.ReceiptXMLDataModel(false);
                    instance.init();
                    initialized = true;
                }
            }
        }
        return instance;
    }

    private void init()
    {
        setName("ReceiptXML");
        setTargetNamespace("http://www.incept5.com/retaildemo/Receipt");
        setElementFormDefault(biz.c24.io.api.data.FormEnum.QUALIFIED);
        setAttributeFormDefault(biz.c24.io.api.data.FormEnum.UNQUALIFIED);
        setIdGeneratorMethodDefault(biz.c24.io.api.data.IDGeneratorMethodEnum.NATIVE);
        setSource(new biz.c24.io.api.presentation.XMLSource());
        setSink(new biz.c24.io.api.presentation.XMLSink());
    }

}
