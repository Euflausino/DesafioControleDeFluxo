public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    public ParametrosInvalidosException(Throwable cause) {
        super("O segundo parâmetro deve ser maior que o primeiro", cause);
    
    }
}