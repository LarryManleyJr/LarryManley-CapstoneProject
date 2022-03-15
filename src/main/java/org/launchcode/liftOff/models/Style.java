package org.launchcode.liftOff.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Style extends AbstractEntity {

    @ManyToMany
    private List<Inventory>inventories =new ArrayList<>();

    public List<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        this.inventories = inventories;
    }

    public void setInventory(List<Inventory> inventory){
        this.inventories = inventory;
    }

    public Style(){};
}



