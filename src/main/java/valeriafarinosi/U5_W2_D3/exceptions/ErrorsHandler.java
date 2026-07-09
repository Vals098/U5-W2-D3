package valeriafarinosi.U5_W2_D3.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import valeriafarinosi.U5_W2_D3.payloads.ErrorsPayload;

import java.time.LocalDateTime;

//    classe responsabile della gestione degli errori di tutta l'applicazione
//    le future eccezioni arriveranno tutte dai metodi di questa classe
@RestControllerAdvice
public class ErrorsHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND) // 404
    public ErrorsPayload handleNotFound(NotFoundException ex) {
        return new ErrorsPayload(ex.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
    public ErrorsPayload handleGenericException(Exception ex) {

        ex.printStackTrace();

        return new ErrorsPayload("C'è stato un errore lato backend, giuro che lo risolviamo presto", LocalDateTime.now());
    }

}
