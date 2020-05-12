package com.example.feing.controller;

import com.example.feing.repo.UserClient;
import com.example.feing.dto.UserResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    //https://jsonplaceholder.typicode.com/users
    //http://www.jsonschema2pojo.org/
    @Autowired
    private UserClient client;
    @ApiOperation(
            value = "Get Amar Offers",
            nickname = "getAmarOffers",
            notes =
                    "Get  Amar Offers. It will return List of Amar Offers. MSISDN field is required. eg. msisdn = 8801902796143",
            tags = {
                    "product-offer",
            })

    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "msisdn",
                    value = "msisdn",
                    required = true,
                    dataType = "Long",
                    paramType = "query",
                    defaultValue = "8801902796143")
    })
    @GetMapping("/findAllUser")
    public List<UserResponse> getAllUser(){
        return client.getUsers();
    }
}
