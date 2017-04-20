package com.logicalobject.repository;

import java.util.List;
import java.util.UUID;
import com.logicalobject.model.Menuitem;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;


public class CassandraItemRepository implements ItemRepository {
	 private final CassandraOperations cassandraTemplate;
	
	public CassandraItemRepository(CassandraOperations cassandraTemplate) {
		this.cassandraTemplate = cassandraTemplate;
		}

	@Override
	public Menuitem save(Menuitem item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menuitem update(Menuitem item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menuitem findOne(UUID id) {
		return this.cassandraTemplate.selectOneById(Menuitem.class, id);
	}

	@Override
	public void delete(UUID hotelId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Menuitem> findByDescription(String desc) {
		// TODO Auto-generated method stub
		return null;
	}

}
