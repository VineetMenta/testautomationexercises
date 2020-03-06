package com.cnu.mentoring.vineet.cdp.java8.pojos;

public class Product {

    private int price;
    private String name;
    private String category;
    private String grade;

    private Product(){}

    public Product(int price, String name, String category, String grade) {
        this.price = price;
        this.name = name;
        this.category = category;
        this.grade = grade;
    }

    public Product(int price, String name){
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
