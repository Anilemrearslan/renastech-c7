public class deneme {

    public static void main(String[] args) {
        A MyA = new A();
        MyA.animalsound("woqfgh");

        B MyB = new B();

        MyB.animalsound("auugh");
    }

}


class A {

    public void animalsound(String name){
        System.out.println("something");
    }

    public void animalsound(String name, int age){
        System.out.println("something");
    }

}

class B extends A {

    @Override
    public void animalsound(String name){
        System.out.println("another thing");
    }
}
