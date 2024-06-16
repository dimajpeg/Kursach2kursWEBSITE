package com.example.kursach.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameProduct")
    private String nameProduct;

    @Column(name = "siteName")
    private String siteName;


    @Column(name = "Cost")
    private float cost;

    // Constructors
    public Product() {
    }

    public Product(String nameProduct, String siteName, int cost) {
        this.nameProduct = nameProduct;
        this.siteName = siteName;
        this.cost = cost;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // toString() method
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", siteName='" + siteName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
