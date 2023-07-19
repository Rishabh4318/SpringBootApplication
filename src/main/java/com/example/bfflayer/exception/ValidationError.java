package com.example.bfflayer.exception;

public class ValidationError extends RuntimeException{
    int errorCode;
    String errorDesc;
}
