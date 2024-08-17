package AboutCompreble;

public class Animal implements Comparable<Animal>{
    int age;
    String name;
    int height;

    Animal(int age,String name,int height){
        this.age=age;
        this.name=name;
        this.height=height;
    }
    @Override
    public String  toString() {
        return "Animal{"+
                "}";
    }
    @Override
    public int compareTo(Animal o) {
        return 0;
    }
    void a(){

    }
}
