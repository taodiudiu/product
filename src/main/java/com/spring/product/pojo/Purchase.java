package com.spring.product.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

@Alias(value = "Purchase")
public class Purchase implements Serializable {
    private static final long serialVersionUID = -1544014594370026538L;

    private int id;
    private int userId; // 用户编号
    private int productId;  // 产品编号
    private float price;    // 单价
    private int quantity;   // 数量
    private float sum;  // 总价
    private Date purchaseDate;  // 购买日期
    private String note;    // 备注

    public Purchase(int userId, int productId, float price, int quantity, float sum, Date purchaseDate, String note) {
        this.userId = userId;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.sum = sum;
        this.purchaseDate = purchaseDate;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", price=" + price +
                ", quantity=" + quantity +
                ", sum=" + sum +
                ", purchaseDate=" + purchaseDate +
                ", note='" + note + '\'' +
                '}';
    }
}
