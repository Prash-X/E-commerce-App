package dev.prashant.productService.exception;

public class NoProductPresentException extends RuntimeException{

    public NoProductPresentException(String message) {
        super(message);
    }
}
