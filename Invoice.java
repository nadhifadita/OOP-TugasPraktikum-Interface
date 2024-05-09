package PraktikumOOPInterface.TugasPraktikum;

public class Invoice implements Payable{
    private String productName;
    private int pricePerItem;
    private int quantity;

    public int getTotalPrice() {
        return quantity*pricePerItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public Invoice(String productName, int pricePerItem, int quantity){
        setProductName(productName);
        setPricePerItem(pricePerItem);
        setQuantity(quantity);
    }
    @Override
    public int getPayableMethod() {
        return 0;
    }

    @Override
    public String toString() {
        return "Nama Produk: '" + getProductName() +"'" +
                ", harga per item: $" + getPricePerItem() +
                ", jumlah: " + getQuantity() +
                ", harga total: $" + getTotalPrice();
    }
}
