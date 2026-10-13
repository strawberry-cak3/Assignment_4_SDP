package decorator;

import hero.IHero;

public abstract class ItemDecorator implements IHero {
    protected IHero hero;

    public ItemDecorator(IHero hero) {
        this.hero = hero;
    }
    @Override
    public abstract String getDescription();

    @Override
    public abstract int getPrice();
    }

