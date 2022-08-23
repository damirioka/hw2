public abstract class Person implements Holiday {
    String name;
    int age;
//            ...
//            ...
//            ...

    Person(){
        name = "Max";
        age = 20;
//        ...
//        ...
//        ...
    }

    Person(String n, int a){
        name = n;
        age = a;
//        ...
//        ...
//        ...
    }

    void print(){
        System.out.println(name);
        System.out.println(age);
//        ...
//        ...
//        ...
    }
    abstract void sayHi();
    public void birthday(){
        age++;
    }
}
