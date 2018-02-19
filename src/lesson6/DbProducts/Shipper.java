package lesson6.DbProducts;

public class Shipper {
    private long id;
    private String companyName;
    private String phone;

    public Shipper(long id, String companyName) {
        this.id = id;
        this.companyName = companyName;
    }

    public Shipper(long id, String companyName, String phone) {
        this.id = id;
        this.companyName = companyName;
        this.phone = phone;
    }
}
