package one.digitailinnovation.gof.singleton;

public class SingletonLaz {
    private static SingletonLaz instancia;

    private SingletonLaz() {
        super();
    }
    public static SingletonLaz getInstancia() {
        if(instancia == null) {
            instancia = new SingletonLaz();
        }
        return instancia;
    }
}
