package com.lab.rmtbanking.creditservice.dto;

import lombok.Value;

@Value
public class ErrorExtension {

    String message;
    String errorCode;
}
