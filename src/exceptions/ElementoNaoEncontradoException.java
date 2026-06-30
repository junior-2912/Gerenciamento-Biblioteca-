package exceptions;

public class ElementoNaoEncontradoException extends RuntimeException{
    public ElementoNaoEncontradoException(String msg) {
        super(msg);
    }
}
