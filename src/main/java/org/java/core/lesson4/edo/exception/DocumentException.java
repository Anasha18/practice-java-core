package org.java.core.lesson4.edo.exception;

import java.util.UUID;

public class DocumentException extends RuntimeException {

    public DocumentException(UUID id) {
        super(
                String.format("Document with id: %s not found ", id.toString())
        );
    }

    public DocumentException(String message) {
        super(message);
    }
}
