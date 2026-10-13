package decorator;

import hero.IHero;

public class BlinkDaggerDecorator extends ItemDecorator {
    public BlinkDaggerDecorator(IHero hero) {
        super(hero);
    }

    @Override
    public String getDescription() {
        return hero.getDescription() + "c Blink Dagger";
    }
    @Override
    public int getPrice() {
        return hero.getPrice() + 2250;
    }
}
