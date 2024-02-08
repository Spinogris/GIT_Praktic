package com.lab.rmtbanking.creditservice.dto;

import lombok.Value;

import java.util.List;

@Value
public class ErrorResponse {

    String errorCode;
    List<ErrorExtension> errorExtensions;
}
