package com.example.support.domain;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HttpResponse {
    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String reason; // reasonPhrase
    private String message;
}
