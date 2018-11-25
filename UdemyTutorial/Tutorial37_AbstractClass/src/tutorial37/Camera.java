package tutorial37;

class Camera extends Machine{

    @Override
    public void start() {
        System.out.println("Camera started");
    }

    @Override
    public void doStuff() {
        System.out.println("dO STUFF LIKE SNAPPING PHOTOS");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown the camera");
    }
}