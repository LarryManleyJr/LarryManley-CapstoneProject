package org.launchcode.liftOff.models.data;


import org.launchcode.liftOff.models.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository extends CrudRepository<Title,Integer> {
}
