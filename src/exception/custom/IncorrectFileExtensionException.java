package exception.custom;

public class IncorrectFileExtensionException extends RuntimeException{
    public IncorrectFileExtensionException(String errorMessage, Throwable err){
        super(errorMessage, err);

    }

}