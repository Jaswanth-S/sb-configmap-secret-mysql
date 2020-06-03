package com.stackroute.sbservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/* Custom Exception already created and to be used */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Specified User Not Found")
public class UserNotFoundException extends Exception {
}
