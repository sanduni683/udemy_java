package tutorial26;

class Tree extends tutorial26.Plant {
    @Override
    public void grow() {
        System.out.println("tutorial26.Tree is growing");
    }

    public void shedLeaves(){
        System.out.println("Leaves are shedding");
    }
}
