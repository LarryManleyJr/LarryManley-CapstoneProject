package org.launchcode.liftOff.models.data;

import org.launchcode.liftOff.models.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface InventoryRepository extends CrudRepository <Inventory, Integer> {
}
