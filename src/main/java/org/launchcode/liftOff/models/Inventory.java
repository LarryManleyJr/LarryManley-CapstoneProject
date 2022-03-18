package org.launchcode.liftOff.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Inventory")
public class Inventory extends AbstractEntity {



    @NotBlank(message = "Needs description for artwork")
    private String description;

//    @NotBlank(message = "Image must be uploaded")
    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    private Genre genre;

    @ManyToOne
    private Style style;

    public Inventory() {
    }

    public Inventory (String aDescription, String anImageUrl, Style someStyle, Genre someGenre){
        super();
        this.description = aDescription;
        this.imageUrl = anImageUrl;
        this.genre = someGenre;
        this.style = someStyle;
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

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
