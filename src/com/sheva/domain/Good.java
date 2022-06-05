package com.sheva.domain;

import java.util.Objects;

public class Good {

    public static int DEFAULT_PRODUCTION_YEAR = 2021;

    public static int DEFAULT_ITEM_PRICE = 2000;

    private String itemCategory;

    private String itemName;

    private String producerName;

    private String itemModel;

    private int productionYear;

    private int itemPrice;

    public Good(){
        this.itemCategory = "Gadgets";
        this.itemName = "Mobile phone";
        this.producerName = "Samsung";
        this.itemModel = "S21";
        this.productionYear = DEFAULT_PRODUCTION_YEAR;
        this.itemPrice = DEFAULT_ITEM_PRICE;
    }

    public Good(String itemCategory, String itemName, String producerName, String itemModel, int productionYear, int itemPrice) {
        this.itemCategory = itemCategory;
        this.itemName = itemName;
        this.producerName = producerName;
        this.itemModel = itemModel;
        this.productionYear = productionYear;
        this.itemPrice = itemPrice;
    }

    public static int getDefaultProductionYear() {
        return DEFAULT_PRODUCTION_YEAR;
    }

    public static void setDefaultProductionYear(int defaultProductionYear) {
        DEFAULT_PRODUCTION_YEAR = defaultProductionYear;
    }

    public static int getDefaultItemPrice() {
        return DEFAULT_ITEM_PRICE;
    }

    public static void setDefaultItemPrice(int defaultItemPrice) {
        DEFAULT_ITEM_PRICE = defaultItemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return productionYear == good.productionYear && itemPrice == good.itemPrice && itemCategory.equals(good.itemCategory)
                && itemName.equals(good.itemName) && producerName.equals(good.producerName) && itemModel.equals(good.itemModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemCategory, itemName, producerName, itemModel, productionYear, itemPrice);
    }

    @Override
    public String toString() {
        return "Good{" +
                "itemCategory='" + itemCategory + '\'' +
                ", itemName='" + itemName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", itemModel='" + itemModel + '\'' +
                ", productionYear=" + productionYear +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
