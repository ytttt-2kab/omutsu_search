package com.example.omutsu_search.model;

/**
 * Table: type
 */
public class Type {
    /**
     * Column: id
     * Type: int4
     */
    private Integer id;

    /**
     * Column: name
     * Type: varchar(2147483647)
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}