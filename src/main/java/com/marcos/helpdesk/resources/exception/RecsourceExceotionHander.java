package com.marcos.helpdesk.resources.exception;

import com.marcos.helpdesk.services.exception.ObjectnotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RecsourceExceotionHander {

    @ExceptionHandler(ObjectnotFoundException.class)
    public ResponseEntity<StandardErro> objecteNotFoundException(ObjectnotFoundException ex, HttpServletRequest request){
        StandardErro standardErro = new StandardErro(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),
                "object not found", ex.getMessage(), request.getRequestURI());
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardErro);
    }

}
