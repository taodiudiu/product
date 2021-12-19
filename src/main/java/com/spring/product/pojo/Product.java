package com.spring.product.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias(value = "Product")
public class Product implements Serializable {
    private static final long serialVersionUID = -4868942058356758171L;

    private int id;
    private String productName; // 产品名称
    private int stock;  // 库存
    private float price;    // 单价
    private int version;    // 版本号
    private String note;    // 备注

    public Product(String productName, int stock, float price, int version, String note) {
        this.productName = productName;
        this.stock = stock;
        this.price = price;
        this.version = version;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", version=" + version +
                ", note='" + note + '\'' +
                '}';
    }
}
