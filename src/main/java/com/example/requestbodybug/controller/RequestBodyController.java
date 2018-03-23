package com.example.requestbodybug.controller;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyController {

    @ApiOperation(value = "example", notes = "An example PUT with a String for a RequestBody.")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "itemId", value = "ID of item", required = true, dataType = "String", paramType = "body"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 500, message = "Failure")})
    @PutMapping("/example")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void example(@RequestBody String itemId) {
        System.out.println("Got itemId of " + itemId);
    }

}
