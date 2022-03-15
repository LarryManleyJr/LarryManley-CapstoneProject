package org.launchcode.liftOff.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Genre extends AbstractEntity{

    @ManyToMany
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
