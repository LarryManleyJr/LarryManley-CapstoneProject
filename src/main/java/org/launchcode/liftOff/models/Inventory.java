package org.launchcode.liftOff.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Inventory")
public class Inventory extends AbstractEntity {


    @Column(name = "category_name")
    private String categoryName;

    @NotBlank(message = "Needs description for artwork")
    private String description;

    @NotBlank(message = "Image must be uploaded")
    @Column(name = "image_url")
    private String imageUrl;


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
