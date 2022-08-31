package com.example.omutsu_search.model;

/**
 * Table: omutsu_jan
 */
public class OmutsuJan {
    /**
     * Column: jan_code
     * Type: varchar(2147483647)
     */
    private String janCode;

    /**
     * Column: brand_id
     * Type: int4
     */
    private Integer brandId;

    /**
     * Column: type_id
     * Type: int4
     */
    private Integer typeId;

    /**
     * Column: size_id
     * Type: int4
     */
    private Integer sizeId;

    /**
     * Column: count
     * Type: int4
     */
    private Integer count;

    public String getJanCode() {
        return janCode;
    }

    public void setJanCode(String janCode) {
        this.janCode = janCode == null ? null : janCode.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}