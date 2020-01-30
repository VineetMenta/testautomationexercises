package com.cnu.mentoring.vineet.cdp.apitesting.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pet {

    private int id;
    private Category category;
    private String name;
    private String[] photoUrls;
    private String status;

    public Pet(){

    }

    public Pet(int id, Category category, String name, String[] photoUrls, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(String[] photoUrls) {
        this.photoUrls = photoUrls;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", photoUrls=" + Arrays.toString(photoUrls) +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return getId() == pet.getId() &&
                Objects.equals(getCategory(), pet.getCategory()) &&
                Objects.equals(getName(), pet.getName()) &&
                Arrays.equals(getPhotoUrls(), pet.getPhotoUrls()) &&
                Objects.equals(getStatus(), pet.getStatus());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), getCategory(), getName(), getStatus());
        result = 31 * result + Arrays.hashCode(getPhotoUrls());
        return result;
    }
}
