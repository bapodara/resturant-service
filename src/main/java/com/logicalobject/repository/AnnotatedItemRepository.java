package com.logicalobject.repository;


import java.util.List;
import java.util.UUID;


import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.logicalobject.model.Menuitem;



public interface AnnotatedItemRepository extends CrudRepository<Menuitem, String> {
	@Query("select * from sample.items where itemid =?0 ")
	List<Menuitem> findByState(String state);
}