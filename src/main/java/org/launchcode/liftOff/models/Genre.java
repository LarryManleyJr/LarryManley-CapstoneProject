package org.launchcode.liftOff.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Genre extends AbstractEntity{

    @OneToMany(mappedBy = "genre")
    private List<Inventory> Inventories = new ArrayList<>();

    @NotBlank(message = "Which colorway was used?")
    @Size(min = 3, max = 25, message = "Colorway must be between 3 and 25 characters")
    private String colorway;

    public Genre () {
    }

    public List<Inventory> getInventories() {
        return Inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        Inventories = inventories;
    }

    public String getColorway() {
        return colorway;
    }

    public void setColorway(String colorway) {
        this.colorway = colorway;
    }
}
