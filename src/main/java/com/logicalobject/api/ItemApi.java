package com.logicalobject.api;

import com.logicalobject.model.Menuitem;
import com.logicalobject.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

@Api(value = "item", description = "the item API")
public interface ItemApi {
	
    @ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products offered at a given location. The response includes the display name and other details about each product, and lists the products in the proper display order. ", response = Menuitem.class, tags={ "Items", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item Detail", response = Menuitem.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Menuitem.class) })
    @RequestMapping(value = "/item/{itemid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Menuitem> itemItemidGet(
@ApiParam(value = "id of the item",required=true ) @PathVariable("itemid") String itemid


);


    @ApiOperation(value = "Product Types", notes = "The items endpoint is provided to update information of existing items. ", response = Menuitem.class, tags={ "Items", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item Detail", response = Menuitem.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Menuitem.class) })
    @RequestMapping(value = "/item/{itemid}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Menuitem> itemItemidPut(
@ApiParam(value = "id of the item",required=true ) @PathVariable("itemid") String itemid,@ApiParam(value = "body of menuitem" ,required=true ) @RequestBody Menuitem body
);


    @ApiOperation(value = "Product Types", notes = "The item endpoint is provided tp inser information of new items", response = Menuitem.class, tags={ "Is", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item Detail", response = Menuitem.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Menuitem.class) })
    @RequestMapping(value = "/item",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Menuitem> itemPost(@ApiParam(value = "id of the item" ,required=true ) @RequestBody Menuitem body);

    
    
    
    @ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products offered at a given location. The response includes the display name and other details about each product, and lists the products in the proper display order. ", response = Menuitem.class, tags={ "Items", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item Detail", response = Menuitem.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Menuitem.class) })
    @RequestMapping(value = "/itembydesc/{itemid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Menuitem>> findByDescriptionGET(@ApiParam(value = "description of the item",required=true ) @PathVariable("desc") String desc);
    
}
