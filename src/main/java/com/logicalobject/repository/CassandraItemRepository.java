package com.logicalobject.repository;

import java.util.List;
import java.util.UUID;
import com.logicalobject.model.Menuitem;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

@Repository
public class CassandraItemRepository implements ItemRepository {
	 private final CassandraOperations cassandraTemplate;
	
	 
	public CassandraItemRepository(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
		}

	@Override
	public Menuitem save(Menuitem item) {
		return this.cassandraTemplate.insert(item);
	}

	@Override
	public Menuitem update(Menuitem item) {
		return this.cassandraTemplate.update(item);
	}

	@Override
	public Menuitem findOne(String id) {
		return this.cassandraTemplate.selectOneById(Menuitem.class, id);
	}

	@Override
	public void delete(UUID itemId) {
		 this.cassandraTemplate.deleteById(Menuitem.class, itemId);
	}

	

}
