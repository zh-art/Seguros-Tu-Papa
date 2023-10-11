package com.segurostupapa.app.Content;

import jakarta.persistence.*;

@Entity
@Table

public class Content {

    @Id
    private String article_type;
    private int price;

    public Content() {
    }

    public Content(String article_type, int price) {
        this.article_type = article_type;
        this.price = price;
    }

    public String getArticle_type() {
        return article_type;
    }

    public void setArticle_type(String article_type) {
        this.article_type = article_type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
