package net.javaguides.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.logging.Logger;

import static java.util.logging.Level.SEVERE;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final Logger LOGGER = Logger.getLogger(ResourceNotFoundException.class.getName());

    public ResourceNotFoundException(String message) {
        super(message);
        LOGGER.log(SEVERE, message);
    }
}
