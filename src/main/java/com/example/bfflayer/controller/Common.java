package com.example.bfflayer.controller;


import com.example.bfflayer.BffLayerApplication;
import com.example.bfflayer.dto.Product;
import com.example.bfflayer.dto.ProductResponse;
import com.example.bfflayer.service.AccountServicing;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequestMapping("/common")
public class Common{
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    ProductResponse productResponse;
    @Autowired
    AccountServicing servicing;
    @PostMapping("/hello")
    public ResponseEntity<String> sayHello(@RequestBody @Valid Product product) throws JsonProcessingException {
        productResponse.setRequestId(product.getId());
        return servicing.saveData(product);
    }
    @GetMapping("/rota")
    public ResponseEntity<String> testAuth(){
        return new ResponseEntity<>("Ri",HttpStatus.OK);
    }
}

