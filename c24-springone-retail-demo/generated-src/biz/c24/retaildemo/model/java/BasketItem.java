package biz.c24.retaildemo.model.java;

import java.util.Arrays;

/**
 * BasketItem. <p/>
 * This object is composed of the following <i>attributes</i>:
 * <ul>
 * <li><b>ProductId</b> of type <code>int</code> (optional)</li>
 * <li><b>Quantity</b> of type <code>int</code> (optional)</li>
 * <li><b>Price</b> of type {@link java.math.BigDecimal} (optional)</li>
 * </ul>
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 * @see biz.c24.retaildemo.model.java.BasketItemClass
 **/
public class BasketItem extends biz.c24.io.api.data.ComplexDataObject 
{
    private static final java.lang.String[] NATIVE_ATTRIBUTES = new String[] {"Price", "ProductId", "Quantity"};
    private int productId;
    private boolean isproductIdSet;
    private int quantity;
    private boolean isquantitySet;
    private java.math.BigDecimal price;

    /**
     * Constructs a new instance defined by the default element.
     **/
    public BasketItem()
    {
        this(biz.c24.retaildemo.model.java.BasketItemClass.getInstance().getNullDefiningElementDecl());
    }

    /**
     * Constructs a new instance defined by the specified element.
     * @param definingElementDecl The element which defines the object.
     **/
    public BasketItem(biz.c24.io.api.data.Element definingElementDecl)
    {
        super(definingElementDecl);
    }

    /**
     * Constructs a new instance defined by the specified element and type.
     * @param definingElementDecl The element which defines the object.
     * @param type The type which defines the object.
     **/
    public BasketItem(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type)
    {
        super(definingElementDecl, type);
    }

    /**
     * Constructs a new instance cloned from the specified object.
     * @param clone The object to be cloned.
     **/
    public BasketItem(biz.c24.retaildemo.model.java.BasketItem clone)
    {
        super(clone);
    }

    /**
     * Creates and returns a shallow clone of this object.
     * @see #cloneDeep()
     **/
    public java.lang.Object clone()
    {
        return new biz.c24.retaildemo.model.java.BasketItem(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * @return The new object.
     * @see #clone()
     **/
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException
    {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.retaildemo.model.java.BasketItem(this);
        cloneDeep(obj);
        return obj;
    }

    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException
    {
        biz.c24.retaildemo.model.java.BasketItem obj = (biz.c24.retaildemo.model.java.BasketItem) clone;
        obj.isproductIdSet = this.isproductIdSet;
        obj.productId = this.productId;
        obj.isquantitySet = this.isquantitySet;
        obj.quantity = this.quantity;
        obj.price = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.price, obj, "Price");
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof biz.c24.io.api.data.ComplexDataObject)
            return equalContents((biz.c24.io.api.data.ComplexDataObject) obj, true, true, true, true);
        else
            return obj.equals(this);
    }

    /**
     * Gets the attribute called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>productId, quantity, price</b>.
     **/
    public java.lang.Object getAttr(java.lang.String name)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 1:
                return new java.lang.Integer((int) this.productId);
            case 2:
                return new java.lang.Integer((int) this.quantity);
            case 0:
                return this.price;
            default:
                return super.getAttr(name);
        }
    }

    /**
     * Gets the value of Price (optional).
     **/
    public java.math.BigDecimal getPrice()
    {
        return this.price;
    }

    /**
     * Gets the value of ProductId (optional).
     **/
    public int getProductId()
    {
        return this.productId;
    }

    /**
     * Gets the value of Quantity (optional).
     **/
    public int getQuantity()
    {
        return this.quantity;
    }

    public int getTotalAttrCount()
    {
        int count = 0;
        count += this.isproductIdSet ? 1 : 0;
        count += this.isquantitySet ? 1 : 0;
        count += this.price == null ? 0 : 1;
        return count;
    }

    public int hashCode()
    {
        return this.toString().length();
    }

    /**
     * Returns whether the attribute called <code>name</code> is present.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getAttr}.
     **/
    public boolean isAttrPresent(java.lang.String name)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 1:
                return this.isproductIdSet ? true : false;
            case 2:
                return this.isquantitySet ? true : false;
            case 0:
                return this.price == null ? false : true;
            default:
                return super.isAttrPresent(name);
        }
    }

    /**
     * Tests whether ProductId has been set.
     **/
    public boolean isProductIdSet()
    {
        return isproductIdSet;
    }

    /**
     * Tests whether Quantity has been set.
     **/
    public boolean isQuantitySet()
    {
        return isquantitySet;
    }

    /**
     * Removes the attribute called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getAttr}.
     **/
    public void removeAttr(java.lang.String name)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 1:
                this.productId = 0;
                this.isproductIdSet = false;
                return;
            case 2:
                this.quantity = 0;
                this.isquantitySet = false;
                return;
            case 0:
                this.price = null;
                return;
            default:
                super.removeAttr(name);
        }
    }

    /**
     * Sets the attribute called <code>name</code> to <code>value<code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getAttr}.
     **/
    public void setAttr(java.lang.String name, java.lang.Object value)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 1:
                setProductId(biz.c24.io.api.Utils.intValue(value));
                return;
            case 2:
                setQuantity(biz.c24.io.api.Utils.intValue(value));
                return;
            case 0:
                setPrice(biz.c24.io.api.Utils.decimalValue(value));
                return;
            default:
                super.setAttr(name, value);
        }
    }

    /**
     * Sets the value of Price (optional).
     * @param value The value to use.
     **/
    public void setPrice(java.math.BigDecimal value)
    {
        this.price = value;
    }

    /**
     * Sets the value of ProductId (optional).
     * @param value The value to use.
     **/
    public void setProductId(int value)
    {
        this.productId = value;
        this.isproductIdSet = true;
    }

    /**
     * Sets the value of Quantity (optional).
     * @param value The value to use.
     **/
    public void setQuantity(int value)
    {
        this.quantity = value;
        this.isquantitySet = true;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
    {
        out.writeBoolean(this.isproductIdSet);
        if (this.isproductIdSet)
            out.writeInt(this.productId);
        out.writeBoolean(this.isquantitySet);
        if (this.isquantitySet)
            out.writeInt(this.quantity);
        out.writeObject(this.price);
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException
    {
        this.isproductIdSet = in.readBoolean();
        if (this.isproductIdSet)
            this.productId = in.readInt();
        this.isquantitySet = in.readBoolean();
        if (this.isquantitySet)
            this.quantity = in.readInt();
        this.price = (java.math.BigDecimal) in.readObject();
    }

}
