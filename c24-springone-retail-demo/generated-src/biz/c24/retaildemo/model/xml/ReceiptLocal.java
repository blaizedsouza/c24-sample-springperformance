package biz.c24.retaildemo.model.xml;

import java.util.Arrays;

/**
 * receipt. <p/>
 * This object is composed of the following <i>attributes</i>:
 * <ul>
 * <li><b>receiptId</b> of type {@link java.lang.String} (required)</li>
 * <li><b>timestamp</b> of type {@link biz.c24.io.api.data.ISO8601DateTime} (required)</li>
 * <li><b>customerId</b> of type {@link java.lang.String} (optional)</li>
 * </ul>
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>item</b> of type {@link biz.c24.retaildemo.model.xml.ReceiptLocal.Item} (1..*)</li>
 * </ul>
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 * @see biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass
 **/
public class ReceiptLocal extends biz.c24.io.api.data.ComplexDataObject 
{
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"item"};
    private biz.c24.retaildemo.model.xml.ReceiptLocal.Item[] item;
    private static final java.lang.String[] NATIVE_ATTRIBUTES = new String[] {"customerId", "receiptId", "timestamp"};
    private java.lang.String receiptId;
    private biz.c24.io.api.data.ISO8601DateTime timestamp;
    private java.lang.String customerId;

    /**
     * Constructs a new instance defined by the default element.
     **/
    public ReceiptLocal()
    {
        this(biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.getInstance().getNullDefiningElementDecl());
    }

    /**
     * Constructs a new instance defined by the specified element.
     * @param definingElementDecl The element which defines the object.
     **/
    public ReceiptLocal(biz.c24.io.api.data.Element definingElementDecl)
    {
        super(definingElementDecl);
    }

    /**
     * Constructs a new instance defined by the specified element and type.
     * @param definingElementDecl The element which defines the object.
     * @param type The type which defines the object.
     **/
    public ReceiptLocal(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type)
    {
        super(definingElementDecl, type);
    }

    /**
     * Constructs a new instance cloned from the specified object.
     * @param clone The object to be cloned.
     **/
    public ReceiptLocal(biz.c24.retaildemo.model.xml.ReceiptLocal clone)
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
                addItem((biz.c24.retaildemo.model.xml.ReceiptLocal.Item) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Adds a item (1..*).
     * @param value The new item.
     **/
    public void addItem(biz.c24.retaildemo.model.xml.ReceiptLocal.Item value)
    {
        biz.c24.retaildemo.model.xml.ReceiptLocal.Item[] temp = this.item;
        this.item = new biz.c24.retaildemo.model.xml.ReceiptLocal.Item[temp == null ? 1 : (temp.length+1)];
        if (temp != null)
            java.lang.System.arraycopy(temp, 0, this.item, 0, temp.length);
        this.item[this.item.length-1] = value;
        ((biz.c24.io.api.data.ComplexDataObject) value).setParent(this, "item");
    }

    /**
     * Creates and returns a shallow clone of this object.
     * @see #cloneDeep()
     **/
    public java.lang.Object clone()
    {
        return new biz.c24.retaildemo.model.xml.ReceiptLocal(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * @return The new object.
     * @see #clone()
     **/
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException
    {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.retaildemo.model.xml.ReceiptLocal(this);
        cloneDeep(obj);
        return obj;
    }

    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException
    {
        biz.c24.retaildemo.model.xml.ReceiptLocal obj = (biz.c24.retaildemo.model.xml.ReceiptLocal) clone;
        obj.item = (biz.c24.retaildemo.model.xml.ReceiptLocal.Item[]) biz.c24.io.api.Utils.cloneDeep(this.item, obj, "item");
        obj.receiptId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.receiptId, obj, "receiptId");
        obj.timestamp = (biz.c24.io.api.data.ISO8601DateTime) biz.c24.io.api.Utils.cloneDeep(this.timestamp, obj, "timestamp");
        obj.customerId = (java.lang.String) biz.c24.io.api.Utils.cloneDeep(this.customerId, obj, "customerId");
    }

    /**
     * Creates, adds and returns a new item (1..*).
     * @return The new value.
     **/
    public biz.c24.retaildemo.model.xml.ReceiptLocal.Item createItem()
    {
        biz.c24.retaildemo.model.xml.ReceiptLocal.Item obj = (biz.c24.retaildemo.model.xml.ReceiptLocal.Item) getElementDecl("item").createObject();
        addItem(obj);
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
     * The legal value(s) for <code>name</code> are: <b>receiptId, timestamp, customerId</b>.
     **/
    public java.lang.Object getAttr(java.lang.String name)
    {
        switch (Arrays.binarySearch(NATIVE_ATTRIBUTES, name))
        {
            case 1:
                return this.receiptId;
            case 2:
                return this.timestamp;
            case 0:
                return this.customerId;
            default:
                return super.getAttr(name);
        }
    }

    /**
     * Customer loyalty id if scanned.
     * <p>Gets the value of customerId (optional).
     **/
    public java.lang.String getCustomerId()
    {
        return this.customerId;
    }

    /**
     * Returns the element called <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>item</b>.
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
            if (this.item == null)
                throw new java.lang.ArrayIndexOutOfBoundsException();
            else
                return this.item[index];
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
                return this.item == null ? 0 : this.item.length;
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
                return getItemIndex((biz.c24.retaildemo.model.xml.ReceiptLocal.Item) element);
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of item (1..*).
     * @return The value.
     **/
    public biz.c24.retaildemo.model.xml.ReceiptLocal.Item[] getItem()
    {
        if (this.item == null)
            return new biz.c24.retaildemo.model.xml.ReceiptLocal.Item[]{};
        else
            return this.item;
    }

    /**
     * Gets the index of <code>value</code> (1..*).
     * @param value The item to get the index of.
     * @return The index.
     **/
    public int getItemIndex(biz.c24.retaildemo.model.xml.ReceiptLocal.Item value)
    {
        if (this.item == null)
            return -1;
        for (int i=0; i<this.item.length; i++)
            if (this.item[i] == value)
                return i;
        return -1;
    }

    /**
     * UUID for this receipt.
     * <p>Gets the value of receiptId (required).
     **/
    public java.lang.String getReceiptId()
    {
        return this.receiptId;
    }

    /**
     * Checkout time.
     * <p>Gets the value of timestamp (required).
     **/
    public biz.c24.io.api.data.ISO8601DateTime getTimestamp()
    {
        return this.timestamp;
    }

    public int getTotalAttrCount()
    {
        int count = 0;
        count += this.receiptId == null ? 0 : 1;
        count += this.timestamp == null ? 0 : 1;
        count += this.customerId == null ? 0 : 1;
        return count;
    }

    public int getTotalElementCount()
    {
        int count = 0;
        count += this.item == null ? 0 : this.item.length;
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
                return this.receiptId == null ? false : true;
            case 2:
                return this.timestamp == null ? false : true;
            case 0:
                return this.customerId == null ? false : true;
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
            case 1:
                this.receiptId = null;
                return;
            case 2:
                this.timestamp = null;
                return;
            case 0:
                this.customerId = null;
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
                removeItem(index);
                return;
            default:
            super.removeElement(name, index);
        }
    }

    /**
     * Removes a item (1..*).
     * @param index The index of the item to get.
     **/
    public void removeItem(int index)
    {
        if (this.item == null)
            throw new java.lang.ArrayIndexOutOfBoundsException();
        biz.c24.retaildemo.model.xml.ReceiptLocal.Item[] temp = this.item;
        this.item = new biz.c24.retaildemo.model.xml.ReceiptLocal.Item[temp.length-1];
        java.lang.System.arraycopy(temp, 0, this.item, 0, index);
        java.lang.System.arraycopy(temp, index+1, this.item, index, temp.length-index-1);
        if (this.item.length == 0)
            this.item = null;
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
                setReceiptId((java.lang.String) value);
                return;
            case 2:
                setTimestamp((biz.c24.io.api.data.ISO8601DateTime) value);
                return;
            case 0:
                setCustomerId((java.lang.String) value);
                return;
            default:
                super.setAttr(name, value);
        }
    }

    /**
     * Customer loyalty id if scanned.
     * <p>Sets the value of customerId (optional).
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
                if (this.item == null)
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                else if (value == null)
                    removeElement(name, index);
                else
                {
                    this.item[index] = (biz.c24.retaildemo.model.xml.ReceiptLocal.Item) value;
                    ((biz.c24.io.api.data.ComplexDataObject) this.item[index]).setParent(this, "item");
                }
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * Sets the value of item (1..*).
     * @param value The new value.
     **/
    public void setItem(biz.c24.retaildemo.model.xml.ReceiptLocal.Item[] value)
    {
        this.item = (biz.c24.retaildemo.model.xml.ReceiptLocal.Item[]) biz.c24.io.api.Utils.clearNulls(value);
        for (int i=0; this.item != null && i<this.item.length; i++)
            ((biz.c24.io.api.data.ComplexDataObject) this.item[i]).setParent(this, "item");
    }

    /**
     * UUID for this receipt.
     * <p>Sets the value of receiptId (required).
     * @param value The value to use.
     **/
    public void setReceiptId(java.lang.String value)
    {
        this.receiptId = value;
    }

    /**
     * Checkout time.
     * <p>Sets the value of timestamp (required).
     * @param value The value to use.
     **/
    public void setTimestamp(biz.c24.io.api.data.ISO8601DateTime value)
    {
        this.timestamp = value;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
    {
        out.writeObject(this.item);
        out.writeObject(this.receiptId);
        out.writeObject(this.timestamp);
        out.writeObject(this.customerId);
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException
    {
        this.item = (biz.c24.retaildemo.model.xml.ReceiptLocal.Item[]) in.readObject();
        this.receiptId = (java.lang.String) in.readObject();
        this.timestamp = (biz.c24.io.api.data.ISO8601DateTime) in.readObject();
        this.customerId = (java.lang.String) in.readObject();
    }

    /**
     * item. <p/>
     * This object is composed of the following <i>attributes</i>:
     * <ul>
     * <li><b>productId</b> of type <code>int</code> (required)</li>
     * <li><b>quantity</b> of type <code>int</code> (required)</li>
     * <li><b>price</b> of type {@link java.math.BigDecimal} (required)</li>
     * </ul>
     * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
     * @author C24 Integration Objects;
     * @see biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass
     **/
    public static class Item extends biz.c24.io.api.data.ComplexDataObject 
    {
        private static final java.lang.String[] NATIVE_ATTRIBUTES = new String[] {"price", "productId", "quantity"};
        private int productId;
        private boolean isproductIdSet;
        private int quantity;
        private boolean isquantitySet;
        private java.math.BigDecimal price;

        /**
         * Constructs a new instance defined by the default element.
         **/
        public Item()
        {
            this(biz.c24.retaildemo.model.xml.ReceiptElement.ReceiptLocalClass.ItemClass.getInstance().getNullDefiningElementDecl());
        }

        /**
         * Constructs a new instance defined by the specified element.
         * @param definingElementDecl The element which defines the object.
         **/
        public Item(biz.c24.io.api.data.Element definingElementDecl)
        {
            super(definingElementDecl);
        }

        /**
         * Constructs a new instance defined by the specified element and type.
         * @param definingElementDecl The element which defines the object.
         * @param type The type which defines the object.
         **/
        public Item(biz.c24.io.api.data.Element definingElementDecl, biz.c24.io.api.data.ComplexDataType type)
        {
            super(definingElementDecl, type);
        }

        /**
         * Constructs a new instance cloned from the specified object.
         * @param clone The object to be cloned.
         **/
        public Item(Item clone)
        {
            super(clone);
        }

        /**
         * Creates and returns a shallow clone of this object.
         * @see #cloneDeep()
         **/
        public java.lang.Object clone()
        {
            return new biz.c24.retaildemo.model.xml.ReceiptLocal.Item(this);
        }

        /**
         * Creates and returns a deep clone of this object.
         * @return The new object.
         * @see #clone()
         **/
        public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException
        {
            biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.retaildemo.model.xml.ReceiptLocal.Item(this);
            cloneDeep(obj);
            return obj;
        }

        protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException
        {
            biz.c24.retaildemo.model.xml.ReceiptLocal.Item obj = (biz.c24.retaildemo.model.xml.ReceiptLocal.Item) clone;
            obj.isproductIdSet = this.isproductIdSet;
            obj.productId = this.productId;
            obj.isquantitySet = this.isquantitySet;
            obj.quantity = this.quantity;
            obj.price = (java.math.BigDecimal) biz.c24.io.api.Utils.cloneDeep(this.price, obj, "price");
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
         * Price paid.
         * <p>Gets the value of price (required).
         **/
        public java.math.BigDecimal getPrice()
        {
            return this.price;
        }

        /**
         * Customer loyalty id if scanned.
         * <p>Gets the value of productId (required).
         **/
        public int getProductId()
        {
            return this.productId;
        }

        /**
         * Quantity of this item purchased.
         * <p>Gets the value of quantity (required).
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
         * Customer loyalty id if scanned.
         * <p>Tests whether productId has been set.
         **/
        public boolean isProductIdSet()
        {
            return isproductIdSet;
        }

        /**
         * Quantity of this item purchased.
         * <p>Tests whether quantity has been set.
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
         * Price paid.
         * <p>Sets the value of price (required).
         * @param value The value to use.
         **/
        public void setPrice(java.math.BigDecimal value)
        {
            this.price = value;
        }

        /**
         * Customer loyalty id if scanned.
         * <p>Sets the value of productId (required).
         * @param value The value to use.
         **/
        public void setProductId(int value)
        {
            this.productId = value;
            this.isproductIdSet = true;
        }

        /**
         * Quantity of this item purchased.
         * <p>Sets the value of quantity (required).
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

}
