package com.mateusrangel.exceptions;

public abstract class HttpExceptions extends RuntimeException{
    public HttpExceptions(String menssage, Exception httpEror){
        super();
    }
}
