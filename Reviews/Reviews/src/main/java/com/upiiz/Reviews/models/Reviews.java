package com.upiiz.Reviews.models;

public class Reviews {
    private Long id;
    private Long product_id;
    private String review;
    private int rate;
    private String date;

    public Reviews(Long id, Long product_id, String review, int rate, String date) {
        this.id = id;
        this.product_id =product_id;
        this.review = review;
        this.rate = rate;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public String getReview() {
        return review;
    }

    public int getRate() {
        return rate;
    }

    public String getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
