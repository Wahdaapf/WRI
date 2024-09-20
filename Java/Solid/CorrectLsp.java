abstract class Bird {
    public abstract void move();
}

class FlyingBird extends Bird {
    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Penguin is swimming");
    }
}
