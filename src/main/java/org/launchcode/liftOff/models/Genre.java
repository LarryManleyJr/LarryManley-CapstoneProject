package org.launchcode.liftOff.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Genre extends AbstractEntity{

    @OneToMany
    private List<Inventory> Inventories = new ArrayList<>();

    public Genre () {
    }

    public List<Inventory> getInventories() {
        return Inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        Inventories = inventories;
    }
}
