package biz.c24.retaildemo.transform;


/**
 * 
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 **/
public class ReceiptXmlToJavaTransform extends biz.c24.io.api.transform.Transform 
{
    public final biz.c24.retaildemo.transform.ReceiptXmlToJavaTransform.ItemToItemsTransform ITEMTOITEMS = new biz.c24.retaildemo.transform.ReceiptXmlToJavaTransform.ItemToItemsTransform();

    {
        register(ITEMTOITEMS);
    }

    public ReceiptXmlToJavaTransform()
    {
        super(new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.java.ReceiptClass.getInstance()});
    }

    public ReceiptXmlToJavaTransform(biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements)
    {
        super(new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.java.ReceiptClass.getInstance()}, inputElements, outputElements);
    }

    protected ReceiptXmlToJavaTransform(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes)
    {
        super(inputTypes, outputTypes);
    }

    protected ReceiptXmlToJavaTransform(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes, biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements)
    {
        super(inputTypes, outputTypes, inputElements, outputElements);
    }

    public java.lang.String getName()
    {
        return "ReceiptXmlToJava.tfd";
    }

    public java.lang.Object[][] transform(final java.lang.Object[][] inArr) throws biz.c24.io.api.data.ValidationException
    {
        checkRequiredInputs(inArr);
        java.lang.Object[][] outArr = transform(inArr, init(inArr));
        checkRequiredOutputs(outArr);
        return outArr;
    }

    protected java.lang.Object[][] transform(java.lang.Object[][] inArr, java.lang.Object[][] outArr) throws biz.c24.io.api.data.ValidationException
    {
        initElement(outArr[0], null, "Items", transform(ITEMTOITEMS, new java.lang.Object[] {resolve(inArr[0], "item", false, true)}, 0, null), false, true);
        initAttribute(outArr[0], null, "@Id", resolve(inArr[0], "@receiptId", false), false);
        initAttribute(outArr[0], null, "@CustomerId", resolve(inArr[0], "@customerId", false), false);
        initAttribute(outArr[0], null, "@CheckoutTime", CONVERTDATE.f(resolve(inArr[0], "@timestamp", false), biz.c24.io.api.data.GenericDateDataType.getInstance()), false);
        return outArr;
    }

    public biz.c24.retaildemo.model.java.Receipt transform(final biz.c24.retaildemo.model.xml.ReceiptLocal input1) throws biz.c24.io.api.data.ValidationException
    {
        java.lang.Object[][] outArr = transform(new java.lang.Object[][]{{input1}});
        return (biz.c24.retaildemo.model.java.Receipt) (outArr.length > 0 && outArr[0].length > 0 ? outArr[0][0] : null);
    }

    /**
     * 
     * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
     * @author C24 Integration Objects;
     **/
    public class ItemToItemsTransform extends biz.c24.io.api.transform.Transform 
    {

        public ItemToItemsTransform()
        {
            super(new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.java.BasketItemClass.getInstance()});
        }

        public ItemToItemsTransform(biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements)
        {
            super(new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass.getInstance()}, new biz.c24.io.api.data.DataType[] {biz.c24.retaildemo.model.java.BasketItemClass.getInstance()}, inputElements, outputElements);
        }

        protected ItemToItemsTransform(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes)
        {
            super(inputTypes, outputTypes);
        }

        protected ItemToItemsTransform(biz.c24.io.api.data.DataType[] inputTypes, biz.c24.io.api.data.DataType[] outputTypes, biz.c24.io.api.data.Element[] inputElements, biz.c24.io.api.data.Element[] outputElements)
        {
            super(inputTypes, outputTypes, inputElements, outputElements);
        }

        public java.lang.String getName()
        {
            return "Item to Items";
        }

        public java.lang.Object[][] transform(final java.lang.Object[][] inArr) throws biz.c24.io.api.data.ValidationException
        {
            checkRequiredInputs(inArr);
            java.lang.Object[][] outArr = transform(inArr, init(inArr));
            checkRequiredOutputs(outArr);
            return outArr;
        }

        protected java.lang.Object[][] transform(java.lang.Object[][] inArr, java.lang.Object[][] outArr) throws biz.c24.io.api.data.ValidationException
        {
            initAttribute(outArr[0], null, "@ProductId", resolve(inArr[0], "@productId", false), false);
            initAttribute(outArr[0], null, "@Quantity", resolve(inArr[0], "@quantity", false), false);
            initAttribute(outArr[0], null, "@Price", resolve(inArr[0], "@price", false), false);
            return outArr;
        }

    }

}
