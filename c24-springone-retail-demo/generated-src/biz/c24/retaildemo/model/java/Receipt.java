package biz.c24.retaildemo.model.java;

import java.util.Arrays;

/**
 * Receipt. <p/>
 * This object is composed of the following <i>attributes</i>:
 * <ul>
 * <li><b>Id</b> of type {@link java.lang.String} (optional)</li>
 * <li><b>CustomerId</b> of type {@link java.lang.String} (optional)</li>
 * <li><b>CheckoutTime</b> of type {@link java.util.Date} (optional)</li>
 * </ul>
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>Items</b> of type {@link biz.c24.retaildemo.model.java.BasketItem} (0..*)</li>
 * </ul>
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 * @see biz.c24.retaildemo.model.java.ReceiptClass
 **/
public class Receipt extends biz.c24.io.api.data.ComplexDataObject 
{
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"Items"};
    private biz.c24.retaildemo.model.java.BasketItem[] items;
    private static final java.lang.String[] NATIVE_ATTRIBUTES = new String[] {"CheckoutTime", "CustomerId", "Id"};
    private java.lang.String id;
    private java.lang.String customerId;
    private java.util.Date checkoutTime;

    /**
     * Constructs a new instance defined by the default element.
     **/
    public Receipt()
    {
        this(biz.c24.retaildemo.model.java.ReceiptClass.getInstance().getNullDefiningElementDecl());
    }

    /**
     * Constructs a new instance defined by the specified element.
     * @param definingElementDecl The element which defines the object.
     **/
    public Receipt(biz.c24.io.api.data.Element definingElementDecl)
    {
        super(definingElementDecl);
    }

    /**
     * Constructs a new instance defined by the specified element and type.
     * @param definingElementDecl The element which defines the object.
     * @param type The type which defines the object.
     **/
    public Receipt(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type)
    {
        super(definingElementDecl, type);
    }

    /**
     * Constructs a new instance cloned from the specified object.
     * @param clone The object to be cloned.
     **/
    public Receipt(biz.c24.retaildemo.model.java.Receipt clone)
    {
        super(clone);
    }

    /**
     * Adds <code>value</code> as an element called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getElement}.
     **/
    public void addElement(java.lang.String name, java.lang.Object value)
    {
        name = makeSubstitution(name, -1);
        switch (Arrays.binarySearch(NATIVE_ELEMENTS, name))
        {
            case 0:
                addItems((biz.c24.retaildemo.model.java.BasketItem) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a Items (0..*).
     * @param value The new Items.
     **/
    public void addItems(biz.c24.retaildemo.model.java.BasketItem value)
    {
        biz.c24.retaildemo.model.java.BasketItem[] temp = this.items;
        this.items = new biz.c24.retaildemo.model.java.BasketItem[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.items, 0, temp.length);
        this.items[this.items.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "Items");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * @see #cloneDeep()
     **/
    public java.lang.Object clone()
    {
        return new biz.c24.retaildemo.model.java.Receipt(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * @return The new object.
     * @see #clone()
     **/
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException
    {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.retaildemo.model.java.Receipt(this);
        cloneDeep(obj);
        return obj;
    }

    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException
    {
        biz.c24.retaildemo.model.java.Receipt obj = (biz.c24.retaildemo.model.java.Receipt) clone;
        obj.items = (biz.c24.retaildemo.model.java.BasketItem[]) biz.c24.io.api.Utils.cloneDeep(this.items, obj, "Items");
        obj.id = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.id, obj, "Id");
        obj.customerId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.customerId, obj, "CustomerId");
        obj.checkoutTime = (java.util.Date) biz.c24.io.api.Utils.cloneDeep(this.checkoutTime, obj, "CheckoutTime");
    }

    /**
     * Creates, adds and returns a new Items (0..*).
     * @return The new value.
     **/
    public biz.c24.retaildemo.model.java.BasketItem createItems()
    {
        biz.c24.retaildemo.model.java.BasketItem obj = (biz.c24.retaildemo.model.java.BasketItem) getElementDecl("Items").createObject();
        addItems(obj);
        return obj;
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
     * The legal value(s) for <code>name</code> are: <b>id, customerId, checkoutTime</b>.
     **/
    public java.lang.Object getAttr(java.lang.String name)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 2:
                return this.id;
            case 1:
                return this.customerId;
            case 0:
                return this.checkoutTime;
            default:
                return super.getAttr(name);
        }
    }

    /**
     * Gets the value of CheckoutTime (optional).
     **/
    public java.util.Date getCheckoutTime()
    {
        return this.checkoutTime;
    }

    /**
     * Gets the value of CustomerId (optional).
     **/
    public java.lang.String getCustomerId()
    {
        return this.customerId;
    }

    /**
     * Returns the element called <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>items</b>.
     **/
    public java.lang.Object getElement(java.lang.String name, int index)
    {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 0:
            if (this.items == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.items[index];
            default:
                return super.getElement(name, index);
        }
    }

    /**
     * Returns the count of elements called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getElement}.
     **/
    public int getElementCount(java.lang.String name)
    {
        if (null == name) throw new NullPointerException(toString() + " was asked to calculate elements without name");
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 0:
                return this.items == null ? 0 : this.items.length;
            default:
                return super.getElementCount(name);
        }
    }

    /**
     * Returns the element called <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getElement}.
     **/
    public int getElementIndex(java.lang.String name, java.lang.Object element)
    {
        int i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        if (i < 0)
        {
            name = getSubstitute(name);
            i = Arrays.binarySearch(NATIVE_ELEMENTS, name);
        }
        switch (i)
        {
            case 0:
                return getItemsIndex((biz.c24.retaildemo.model.java.BasketItem) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of Id (optional).
     **/
    public java.lang.String getId()
    {
        return this.id;
    }

    /**
     * Gets the value of Items (0..*).
     * @return The value.
     **/
    public biz.c24.retaildemo.model.java.BasketItem[] getItems()
    {
        if (this.items == null)
            return new biz.c24.retaildemo.model.java.BasketItem[]{};
        else
            return this.items;
    }

    /**
     * Gets the index of <code>value</code> (0..*).
     * @param value The Items to get the index of.
     * @return The index.
     **/
    public int getItemsIndex(biz.c24.retaildemo.model.java.BasketItem value)
    {
        if (this.items == null)
            return -1;
        for (int i=0; i<this.items.length; i++)
            if (this.items[i] == value)
                return i;
        return -1;
    }

    public int getTotalAttrCount()
    {
        int count = 0;
        count += this.id == null ? 0 : 1;
        count += this.customerId == null ? 0 : 1;
        count += this.checkoutTime == null ? 0 : 1;
        return count;
    }

    public int getTotalElementCount()
    {
        int count = 0;
        count += this.items == null ? 0 : this.items.length;
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
            case 2:
                return this.id == null ? false : true;
            case 1:
                return this.customerId == null ? false : true;
            case 0:
                return this.checkoutTime == null ? false : true;
            default:
                return super.isAttrPresent(name);
        }
    }

    /**
     * Removes the attribute called <code>name</code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getAttr}.
     **/
    public void removeAttr(java.lang.String name)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 2:
                this.id = null;
                return;
            case 1:
                this.customerId = null;
                return;
            case 0:
                this.checkoutTime = null;
                return;
            default:
                super.removeAttr(name);
        }
    }

    /**
     * Removes the element called <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getElement}.
     **/
    public void removeElement(java.lang.String name, int index)
    {
        name = unmakeSubstitution(name, index);
        switch (Arrays.binarySearch(NATIVE_ELEMENTS, name))
        {
            case 0:
                removeItems(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a Items (0..*).
     * @param index The index of the Items to get.
     **/
    public void removeItems(int index)
    {
        if (this.items == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        biz.c24.retaildemo.model.java.BasketItem[] temp = this.items;
        this.items = new biz.c24.retaildemo.model.java.BasketItem[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.items, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.items, index, temp.length-index-1);
        if (this.items.length == 0)
            this.items = null;
    }

    /**
     * Sets the attribute called <code>name</code> to <code>value<code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getAttr}.
     **/
    public void setAttr(java.lang.String name, java.lang.Object value)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 2:
                setId((java.lang.String) value);
                return;
            case 1:
                setCustomerId((java.lang.String) value);
                return;
            case 0:
                setCheckoutTime((java.util.Date) value);
                return;
            default:
                super.setAttr(name, value);
        }
    }

    /**
     * Sets the value of CheckoutTime (optional).
     * @param value The value to use.
     **/
    public void setCheckoutTime(java.util.Date value)
    {
        this.checkoutTime = value;
    }

    /**
     * Sets the value of CustomerId (optional).
     * @param value The value to use.
     **/
    public void setCustomerId(java.lang.String value)
    {
        this.customerId = value;
    }

    /**
     * Sets <code>value</code> as an element called <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are defined in {@link #getElement}.
     **/
    public void setElement(java.lang.String name, int index, java.lang.Object value)
    {
        name = makeSubstitution(name, index);
        switch (Arrays.binarySearch(NATIVE_ELEMENTS, name))
        {
            case 0:
                if (this.items == null)
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                else if (value == null)
                    removeElement(name, index);
                else
                {
                    this.items[index] = (biz.c24.retaildemo.model.java.BasketItem) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.items[index]).setParent(this, "Items");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * Sets the value of Id (optional).
     * @param value The value to use.
     **/
    public void setId(java.lang.String value)
    {
        this.id = value;
    }

    /**
     * Sets the value of Items (0..*).
     * @param value The new value.
     **/
    public void setItems(biz.c24.retaildemo.model.java.BasketItem[] value)
    {
        this.items = (biz.c24.retaildemo.model.java.BasketItem[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.items != null && i<this.items.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.items[i]).setParent(this, "Items");
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
    {
        out.writeObject(this.items);
        out.writeObject(this.id);
        out.writeObject(this.customerId);
        out.writeObject(this.checkoutTime);
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException
    {
        this.items = (biz.c24.retaildemo.model.java.BasketItem[]) in.readObject();
        this.id = (java.lang.String) in.readObject();
        this.customerId = (java.lang.String) in.readObject();
        this.checkoutTime = (java.util.Date) in.readObject();
    }

}
