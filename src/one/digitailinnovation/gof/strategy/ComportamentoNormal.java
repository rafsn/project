package one.digitailinnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("movendo-se normalmente...");
    }
}