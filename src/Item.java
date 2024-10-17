/**
 * This class model information of an item in the books account
 * management system.
 * 
 * @author
 */
public class Item {

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemSerialNum() {
        return itemSerialNum;
    }

    public void setItemSerialNum(String itemSerialNum) {
        this.itemSerialNum = itemSerialNum;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public int getQuatity() {
        return quantity;
    }

    public void setQuatity(int quatity) {
        this.quantity = quatity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    private int itemId;
    
    private String itemName;
    private String itemSerialNum;
    private String photopath;

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }
    private float tax;
    // stalk of the item
    private int quantity;
    private float price;

   
    
}
