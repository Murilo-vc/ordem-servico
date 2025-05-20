package org.example.murilo.ordemservico.handler.exception;

import org.example.murilo.ordemservico.domain.constants.ErrorMessages;
import org.example.murilo.ordemservico.enumeration.OperationEnum;

public class OperationMissingException extends BaseException {

    public OperationMissingException() {
        super(ErrorMessages.OPERATION_MISSING, OperationEnum.LOGOUT);
    }
}
