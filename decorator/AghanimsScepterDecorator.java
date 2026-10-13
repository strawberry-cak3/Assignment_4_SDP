package decorator;

import hero.IHero;

public class AghanimsScepterDecorator extends ItemDecorator {
    public AghanimsScepterDecorator(IHero hero) {
        super(hero);
    }

    @Override
    public String getDescription() {
        return hero.getDescription() + " + Aghanim's Scepter";
    }

    @Override
    public int getPrice() {
        return hero.getPrice() + 4200;
    }
}
