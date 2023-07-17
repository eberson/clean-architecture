package br.com.clean.architecture.enterprise.exception;

import java.io.Serial;

public class EnterpriseException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 2685829811056672770L;

    public EnterpriseException(String message) {
        super(message);
    }
}
