package com.logicalobject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.logicalobject.model.Menuitem;
import com.logicalobject.repository.AnnotatedItemRepository;
import com.logicalobject.repository.ItemRepository;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

@Controller
public class ItemApiController implements ItemApi {

	private final ItemRepository itemRepository;
	
	@Autowired 
	private AnnotatedItemRepository annotatedItemRepository; 

	public ItemApiController(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	public ResponseEntity<Menuitem> itemItemidGet(
			@ApiParam(value = "id of the item", required = true) @PathVariable("itemid") String itemid) {
		// do some magic!
		Menuitem mi = itemRepository.findOne(itemid);
		return new ResponseEntity<Menuitem>(mi, HttpStatus.OK);
	}

	public ResponseEntity<Menuitem> itemItemidPut(
			@ApiParam(value = "id of the item", required = true) @PathVariable("itemid") String itemid,
			@ApiParam(value = "body of menuitem", required = true) @RequestBody Menuitem body) {
		// do some magic!
		return new ResponseEntity<Menuitem>(HttpStatus.OK);
	}

	public ResponseEntity<Menuitem> itemPost(
			@ApiParam(value = "id of the item", required = true) @RequestBody Menuitem body) {
		Menuitem mi = itemRepository.save(body);
		return new ResponseEntity<Menuitem>(mi, HttpStatus.OK);
	}
	
	

	public ResponseEntity<List<Menuitem>> findByDescriptionGET(String desc) {
		// TODO Auto-generated method stub
		
		return new ResponseEntity<List<Menuitem>>(this.annotatedItemRepository.findByState("1"), HttpStatus.OK);
		
	}
	

}
