import decorator.*;
import hero.*;

public class Main {
    public static void main(String[] args) {
        IHero Invoker = new Invoker();
        IHero NagaSiren = new NagaSiren();

        System.out.println(Invoker.getDescription() + " | В кармане "
                + Invoker.getPrice() + " золота");
        System.out.println(NagaSiren.getDescription() + " | В кармане "
                + NagaSiren.getPrice() + " золота");

        IHero InvokerWithBlinkDagger = new BlinkDaggerDecorator(new Invoker());
        System.out.println(InvokerWithBlinkDagger.getDescription());
        System.out.println(InvokerWithBlinkDagger.getPrice());

        IHero NagaWithAghanimsScepter = new AghanimsScepterDecorator(new NagaSiren());
        System.out.println(NagaWithAghanimsScepter.getDescription());
        System.out.println(NagaWithAghanimsScepter.getPrice());

        IHero fullBuildInvoker = new AghanimsScepterDecorator
                (new BlinkDaggerDecorator
                        (new Invoker()));
        System.out.println(fullBuildInvoker.getDescription());

        System.out.println(fullBuildInvoker.getPrice());







    }
}
