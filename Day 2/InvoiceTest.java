class Invoice
{
    String partNumber, partDescription;
    int quantity;
    double pricePerItem;
    public Invoice()
    {
        partNumber = " ";
        partDescription = " ";
        quantity = 0;
        pricePerItem = 0.0;
    }

    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public void setPricePerItem(double pricePerItem)
    {
        this.pricePerItem = pricePerItem;
    }
    public String getPartNumber()
    {
        return partNumber;
    }
    public String getPartDescription()
    {
        return partDescription;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    public double getInvoiceAmount()
    {
        if(quantity<0)
        {
            quantity = 0;
        }
        if(pricePerItem<0.0)
        {
            pricePerItem = 0.0;
        }
        return quantity*pricePerItem;
    }
}

public class InvoiceTest /*exercise2*/ {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice();
        invoice1.setPartNumber("1234");
        invoice1.setPartDescription("Hammer");
        invoice1.setQuantity(10);
        invoice1.setPricePerItem(100.0);

        System.out.println("Part Number: "+invoice1.getPartNumber());
        System.out.println("Part Description: "+invoice1.getPartDescription());
        System.out.println("Quantity: "+invoice1.getQuantity());
        System.out.println("Price Per Item: "+invoice1.getPricePerItem());
        System.out.println("Invoice Amount: "+invoice1.getInvoiceAmount());
    }
}
