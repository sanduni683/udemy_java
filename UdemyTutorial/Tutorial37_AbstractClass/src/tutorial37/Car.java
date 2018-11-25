package tutorial37;

class Car extends Machine {

    @Override
    public void start() {
        System.out.println("tutorial22.Car started");
    }

    @Override
    public void doStuff() {
        System.out.println("Do some stuff like breaking gear");
    }

    @Override
    public void shutdown() {
        System.out.println("tutorial22.Car shutdown");
    }
}