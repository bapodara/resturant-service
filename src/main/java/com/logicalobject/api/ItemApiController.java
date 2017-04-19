package com.logicalobject.api;

import com.logicalobject.model.Menuitem;
import com.logicalobject.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

@Controller
public class ItemApiController implements ItemApi {

    public ResponseEntity<Menuitem> itemItemidGet(
@ApiParam(value = "id of the item",required=true ) @PathVariable("itemid") String itemid


) {
        // do some magic!
        return new ResponseEntity<Menuitem>(HttpStatus.OK);
    }

    public ResponseEntity<Menuitem> itemItemidPut(
@ApiParam(value = "id of the item",required=true ) @PathVariable("itemid") String itemid


,
        

@ApiParam(value = "body of menuitem" ,required=true ) @RequestBody Menuitem body

) {
        // do some magic!
        return new ResponseEntity<Menuitem>(HttpStatus.OK);
    }

    public ResponseEntity<Menuitem> itemPost(

@ApiParam(value = "id of the item" ,required=true ) @RequestBody Menuitem body

) {
        // do some magic!
        return new ResponseEntity<Menuitem>(HttpStatus.OK);
    }

}
