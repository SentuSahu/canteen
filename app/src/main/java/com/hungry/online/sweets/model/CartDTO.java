package com.hungry.online.sweets.model;

public class CartDTO {
    private int total = 0;
    private String item = "";

    public CartDTO() {
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public CartDTO(String item) {
        this.item = item;
    }

    public CartDTO(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
