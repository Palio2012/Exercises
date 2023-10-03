package model.exceptions;

public class DomainException extends RuntimeException{

    public static final long serailVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
