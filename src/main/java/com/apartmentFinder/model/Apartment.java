package com.apartmentFinder.model;


import javax.persistence.*;

@Entity
@Table(name = "Apartment")
public class Apartment {

    @Id
    @Column(name = "apartmentid")
    @GeneratedValue
    private int apartmentid;

    @Column(name = "name")
    private String name;

    @Column(name = "rent")
    private String rent;

    @Column(name = "bedroom")
    private String bedroom;

    @Column(name = "bathroom")
    private String bathroom;

    @Column(name = "address")
    private String address;
    
    @Column(name = "rating")
    private String rating;
    
    @Column(name = "noofreviews")
    private String noofreviews;

    public String getNoofreviews() {
		return noofreviews;
	}

	public void setNoofreviews(String noofreviews) {
		this.noofreviews = noofreviews;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getApartmentid() {
        return apartmentid;
    }

    public void setApartmentid(int apartmentid) {
        this.apartmentid = apartmentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Column(name = "area")
    private String area;

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Column(name = "images")
    private String images;




}
