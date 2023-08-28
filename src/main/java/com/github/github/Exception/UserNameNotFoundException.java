package com.github.github.Exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Username not found")
public class UserNameNotFoundException extends RuntimeException {

    @JsonProperty("status")
    private final HttpStatus status;
    @JsonProperty("message")
    private final String message;

    public UserNameNotFoundException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
