package com.github.github.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Username not found")
public class UserNameNotFoundException extends Exception {

    private final HttpStatusCode status;
    private final String message;

    public UserNameNotFoundException(HttpStatusCode status, String message) {
        this.status = status;
        this.message = message;
    }
}
