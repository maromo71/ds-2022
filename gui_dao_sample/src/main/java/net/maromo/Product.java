package net.maromo;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Product {
    private Long id;
    @NotBlank(message = "Product name is required.")
    @Size(max = 60, message = "the name must contain a maximum of 60 characters.")
    @Column(name = "name", nullable = false, length = 60)
    private String name;
    @NotBlank(message = "Brand is required.")
    @Size(min = 2, message = "the name must contain a minimum of 2 characters.")
    @Column(name = "brand", nullable = false, length = 45)
    private String brand;

    @NotBlank(message = "Made in is required.")
    @Size(min = 2, message = "the name must contain a minimum of 2 characters.")
    @Column(name = "madein", nullable = false, length = 45)
    private String madein;
    @NumberFormat(style = NumberFormat.Style.CURRENCY, pattern = "#,##0.00")
    @Column(name="price", nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private float price;

    protected Product() {
    }

    protected Product(Long id, String name, String brand, String madein, float price) {
        super();
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.madein = madein;
        this.price = price;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}

