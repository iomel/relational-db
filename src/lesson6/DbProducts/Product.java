package lesson6.DbProducts;

public class Product {
    private long id;
    private String productName;
    private Supplier supplier;
    private Categorie categorie;
    private int quantityPerUnit;
    private double unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderedLevel;
    private int discontinued;

    public Product(long id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public Product(long id, String productName, Supplier supplier, Categorie categorie, int quantityPerUnit,
                   double unitPrice, int unitsInStock, int unitsOnOrder, int reorderedLevel, int discontinued) {
        this.id = id;
        this.productName = productName;
        this.supplier = supplier;
        this.categorie = categorie;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsOnOrder = unitsOnOrder;
        this.reorderedLevel = reorderedLevel;
        this.discontinued = discontinued;
    }
}
