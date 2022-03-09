package org.launchcode.liftOff.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Genre {

    @ManyToMany(mappedBy = "genres")
    private List<Inventory> Inventories = new ArrayList<>();

    public List<Inventory> getInventorys() {
        return Inventories;
    }

    public void setInventorys(List<Inventory> inventorys) {
        Inventories = inventorys;
    }
}
