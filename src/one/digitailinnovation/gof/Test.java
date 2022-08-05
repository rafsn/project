package one.digitailinnovation.gof;

import one.digitailinnovation.gof.facade.Facade;
import one.digitailinnovation.gof.singleton.SingletonEager;
import one.digitailinnovation.gof.singleton.SingletonLaz;
import one.digitailinnovation.gof.singleton.SingletonLazyHolder;
import one.digitailinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

//      Singleton
        SingletonLaz lazy = SingletonLaz.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

//      Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

//      Facade
        Facade facade = new Facade();
        facade.migrarCliente("Rafael", "41315555");
    }
}
