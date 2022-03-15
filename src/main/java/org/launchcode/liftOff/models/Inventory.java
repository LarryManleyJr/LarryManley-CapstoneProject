package org.launchcode.liftOff.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Inventory")
public class Inventory extends AbstractEntity {



    @NotBlank(message = "Needs description for artwork")
    private String description;

    @NotBlank(message = "Image must be uploaded")
    @Column(name = "image_url")
    private String imageUrl;

    @ManyToMany
    private List<Genre> genres = new ArrayList<>();

    private List<Style> styles = new ArrayList<>();

    public Inventory() {
    }

    public Inventory (List<Style> someStyle, List<Genre> someGenre){
        super();
        this.genres = someGenre;
        this.styles = someStyle;
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
