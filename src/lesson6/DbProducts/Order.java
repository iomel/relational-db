package lesson6.DbProducts;

import java.sql.Date;

public class Order {
    private long id;
    private Customer customer;
    private Employee employee;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private Shipper shipVia;
    private String freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    public Order(long id, Customer customer, Employee employee, Date orderDate, Date requiredDate, Date shippedDate,
                 Shipper shipVia, String freight, String shipName, String shipAddress, String shipCity,
                 String shipRegion, String shipPostalCode, String shipCountry) {
        this.id = id;
        this.customer = customer;
        this.employee = employee;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipVia = shipVia;
        this.freight = freight;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
    }

}

