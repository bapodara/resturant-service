package com.logicalobject.repository;


import com.logicalobject.model.Menuitem;

import java.util.List;
import java.util.UUID;

public interface ItemRepository  {
	Menuitem save(Menuitem item);
	Menuitem update(Menuitem item);
	Menuitem findOne(UUID hotelId);
    void delete(UUID hotelId);
    List<Menuitem> findByDescription(String desc);
}
