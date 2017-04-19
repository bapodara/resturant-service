package com.logicalobject.api;

import com.logicalobject.model.Error;
import com.logicalobject.exception.ApiException;
import com.logicalobject.model.Business;

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

@Api(value = "business", description = "the business API")
public interface BusinessApi {

    @ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products offered at a given location. The response includes the display name and other details about each product, and lists the products in the proper display order. ", response = Business.class, tags={ "Items", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item Detail", response = Business.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Business.class) })
    @RequestMapping(value = "/business/{businessid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Business> businessBusinessidGet(
@ApiParam(value = "id of the business",required=true ) @PathVariable("businessid") String businessid


) throws ApiException;


    @ApiOperation(value = "Product Types", notes = "The items endpoint is provided to update information of existing items. ", response = Business.class, tags={ "Items", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item Detail", response = Business.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Business.class) })
    @RequestMapping(value = "/business/{businessid}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Business> businessBusinessidPut(
@ApiParam(value = "id of the item",required=true ) @PathVariable("businessid") String businessid


,

@ApiParam(value = "body of menuitem" ,required=true ) @RequestBody Business body

);


    @ApiOperation(value = "Product Types", notes = "The item endpoint is provided tp inser information of new items", response = Business.class, tags={ "Is", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Item Detail", response = Business.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Business.class) })
    @RequestMapping(value = "/business",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Business> businessPost(

@ApiParam(value = "id of the item" ,required=true ) @RequestBody Business body

);

}
