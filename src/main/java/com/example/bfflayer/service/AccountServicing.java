package com.example.bfflayer.service;

import com.example.bfflayer.client.Deposit;
import com.example.bfflayer.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountServicing {
    @Autowired
    Deposit depositClient;
    public ResponseEntity<String> saveData(Product product){
        return depositClient.postCall(product);
    }
}
