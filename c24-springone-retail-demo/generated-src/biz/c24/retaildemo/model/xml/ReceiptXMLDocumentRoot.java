package biz.c24.retaildemo.model.xml;

import java.util.Arrays;

/**
 * Document Root. <p/>
 * This object is composed of the following <i>element</i>:
 * <ul>
 * <li><b>receipt</b> of type {@link biz.c24.retaildemo.model.xml.ReceiptLocal} (1)</li>
 * </ul>
 * <br><strong>Produced by C24 Integration Objects (http://www.c24.biz)</br>
 * @author C24 Integration Objects;
 * @see biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement.ReceiptXMLDocumentRootClass
 **/
public class ReceiptXMLDocumentRoot extends biz.c24.io.api.data.DocumentRoot 
{
    private static final java.lang.String[] NATIVE_ELEMENTS = new String[] {"receipt"};
    private biz.c24.retaildemo.model.xml.ReceiptLocal receipt;

    /**
     * Constructs a new instance defined by the default element.
     **/
    public ReceiptXMLDocumentRoot()
    {
        this(biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRootElement.ReceiptXMLDocumentRootClass.getInstance().getNullDefiningElementDecl());
    }

    /**
     * Constructs a new instance defined by the specified element.
     * @param definingElementDecl The element which defines the object.
     **/
    public ReceiptXMLDocumentRoot(biz.c24.io.api.data.Element definingElementDecl)
    {
        super(definingElementDecl);
    }

    /**
     * Constructs a new instance cloned from the specified object.
     * @param clone The object to be cloned.
     **/
    public ReceiptXMLDocumentRoot(biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRoot clone)
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
                setReceipt((biz.c24.retaildemo.model.xml.ReceiptLocal) value);
                return;
            default:
                super.addElement(name, value);
        }
    }

    /**
     * Creates and returns a shallow clone of this object.
     * @see #cloneDeep()
     **/
    public java.lang.Object clone()
    {
        return new biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRoot(this);
    }

    /**
     * Creates and returns a deep clone of this object.
     * @return The new object.
     * @see #clone()
     **/
    public biz.c24.io.api.data.ComplexDataObject cloneDeep() throws java.lang.CloneNotSupportedException
    {
        biz.c24.io.api.data.ComplexDataObject obj = new biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRoot(this);
        cloneDeep(obj);
        return obj;
    }

    protected void cloneDeep(biz.c24.io.api.data.ComplexDataObject clone) throws java.lang.CloneNotSupportedException
    {
        biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRoot obj = (biz.c24.retaildemo.model.xml.ReceiptXMLDocumentRoot) clone;
        obj.receipt = (biz.c24.retaildemo.model.xml.ReceiptLocal) biz.c24.io.api.Utils.cloneDeep(this.receipt, obj, "receipt");
    }

    /**
     * Creates, adds and returns a new receipt (1).
     * @return The new value.
     **/
    public biz.c24.retaildemo.model.xml.ReceiptLocal createReceipt()
    {
        biz.c24.retaildemo.model.xml.ReceiptLocal obj = (biz.c24.retaildemo.model.xml.ReceiptLocal) getElementDecl("receipt").createObject();
        setReceipt(obj);
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
     * Returns the element called <code>name</code> at <code>index</code>.<p>
     * The legal value(s) for <code>name</code> are: <b>receipt</b>.
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
                return this.receipt;
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
                return this.receipt == null ? 0 : 1;
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
                return this.receipt != null && this.receipt.equals(element) ? 0 : -1;
            default:
                return super.getElementIndex(name, element);
        }
    }

    /**
     * Gets the value of receipt (1).
     * @return The value.
     **/
    public biz.c24.retaildemo.model.xml.ReceiptLocal getReceipt()
    {
        return this.receipt;
    }

    public int getTotalElementCount()
    {
        int count = 0;
        count += this.receipt == null ? 0 : 1;
        return count;
    }

    public int hashCode()
    {
        return this.toString().length();
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
                setReceipt(null);
                return;
            default:
            super.removeElement(name, index);
        }
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
                setReceipt((biz.c24.retaildemo.model.xml.ReceiptLocal) value);
                return;
            default:
                super.setElement(name, index, value);
        }
    }

    /**
     * Sets the value of receipt (1).
     * @param value The new value.
     **/
    public void setReceipt(biz.c24.retaildemo.model.xml.ReceiptLocal value)
    {
        this.receipt = value;
        if (this.receipt != null)
            ((biz.c24.io.api.data.ComplexDataObject) this.receipt).setParent(this, "receipt");
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException
    {
        out.writeObject(this.receipt);
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException
    {
        this.receipt = (biz.c24.retaildemo.model.xml.ReceiptLocal) in.readObject();
    }

}
