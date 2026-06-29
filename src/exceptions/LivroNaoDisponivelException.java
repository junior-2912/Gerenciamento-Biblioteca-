package exceptions;

public class LivroNaoDisponivelException extends RuntimeException {
    public LivroNaoDisponivelException(String message) {
        super(message);
    }
}
