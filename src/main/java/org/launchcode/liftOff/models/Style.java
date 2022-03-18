package org.launchcode.liftOff.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Style extends AbstractEntity {

    @OneToMany (mappedBy = "style")
    private List<Inventory> Inventories = new ArrayList<>();

    @NotBlank (message = "Description is Needed")
    @Size(min = 3, max = 400, message = "Between 3 and 400 characters")
    private String description;

    public List<Inventory> getInventories() {
        return Inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        Inventories = inventories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Style(){};
}



