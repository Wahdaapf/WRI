interface Worker {
    void work();
    void eat();
}

class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Developer is working");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating");
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        // Robot tidak perlu makan, namun dipaksa untuk mengimplementasikan metode eat
        throw new UnsupportedOperationException();
    }
}
