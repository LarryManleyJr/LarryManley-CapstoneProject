package org.launchcode.liftOff.models.data;

import org.launchcode.liftOff.models.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepository extends CrudRepository <Inventory, Integer> {
}
