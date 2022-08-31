package com.example.omutsu_search.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Table: omutsu_price_data
 */
public class OmutsuPriceData {
    /**
     * Column: reg_date
     * Type: date
     */
    private Date regDate;

    /**
     * Column: jan_code
     * Type: varchar(2147483647)
     */
    private String janCode;

    /**
     * Column: total_price
     * Type: numeric
     */
    private BigDecimal totalPrice;

    /**
     * Column: price
     * Type: numeric
     */
    private BigDecimal price;

    /**
     * Column: shop_name
     * Type: varchar(2147483647)
     */
    private String shopName;

    /**
     * Column: shop_url
     * Type: varchar(2147483647)
     */
    private String shopUrl;

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getJanCode() {
        return janCode;
    }

    public void setJanCode(String janCode) {
        this.janCode = janCode == null ? null : janCode.trim();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl == null ? null : shopUrl.trim();
    }
}