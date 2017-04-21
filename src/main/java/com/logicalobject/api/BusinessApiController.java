package com.logicalobject.api;

import com.logicalobject.model.Error;
import com.logicalobject.exception.ApiException;
import com.logicalobject.model.Business;

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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;


import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")



@Controller
@RefreshScope
public class BusinessApiController implements BusinessApi {
	@Value("${resturant.name:Hello default}")
    private String message;
	
    public ResponseEntity<Business> businessBusinessidGet(@ApiParam(value = "id of the business",required=true ) @PathVariable("businessid") String businessid) throws ApiException {
        // do some magic!
    	Business b = new Business();
    	b.setBusinessName("hello"+message);
    	//if (true)
    	//	throw new ApiException(HttpStatus.BAD_REQUEST, "FAILED!!!!", new Exception());    	
        return new ResponseEntity<Business>(b,HttpStatus.OK);
    }

    public ResponseEntity<Business> businessBusinessidPut(@ApiParam(value = "id of the item",required=true ) @PathVariable("businessid") String businessid,@ApiParam(value = "body of menuitem" ,required=true ) @RequestBody Business body) {
        // do some magic!
        return new ResponseEntity<Business>(HttpStatus.OK);
    }

    public ResponseEntity<Business> businessPost(@ApiParam(value = "id of the item" ,required=true ) @RequestBody Business body) {
        // do some magic!
        return new ResponseEntity<Business>(HttpStatus.OK);
    }

}
