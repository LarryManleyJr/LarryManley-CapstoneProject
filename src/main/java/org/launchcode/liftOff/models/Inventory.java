package org.launchcode.liftOff.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Inventory")
public class Inventory {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @NotBlank(message = "Needs description for artwork")
    private String description;

    @NotBlank(message = "Image must be uploaded")
    @Column(name = "image_url")
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
