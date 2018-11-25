package tutorial37;

abstract class  Machine{
    private int id;

    public void getId() {
        System.out.println(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    //this is exactly like method in interface(abstract method) but with KEYWORD ABSTRACT AND CHILD CLASS SHOULD INHERIT THIS AND IMPLEMENT THIS METHOD IN THEIR CLASSES
    public abstract void start();
    public abstract void doStuff();
    public abstract void shutdown();

    public void run(){
        start();
        doStuff();
        shutdown();
    }
}