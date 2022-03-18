package org.launchcode.liftOff.models.data;

import org.launchcode.liftOff.models.Style;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends CrudRepository<Style, Integer> {
}
