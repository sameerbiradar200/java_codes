package LearnCollections.CustomeCollection;

import java.util.Arrays;

public class CustomList {

    Object[] objArray={};
    int size =0;


    public CustomList(){
        objArray=new Object[10];
    }

    public void add(Object obj){

        if(size==objArray.length)
            increseCapcity();
        objArray[size++]=obj;
    }

    public void increseCapcity(){
        int newCapcity =(objArray.length*3)/2;
        objArray = Arrays.copyOf(objArray ,newCapcity);
    }

    public int size(){
        return size;
    }

    public void display(){
        System.out.print("[");
        for (int i =0 ; i<size;i++){
            System.out.print(objArray[i]);
            if (i!=(size-1))
                System.out.print(",");
        }
        System.out.println("]");

    }
    public  void remove(int a){
        if (a < 0 || a >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index input: " + a);
        }
        for (int i = a; i < size - 1; i++) {
            objArray[i] = objArray[i + 1];
        }
        objArray[size - 1] = null;
        size--;
    }

    public Object get (int index){
        if (index<0||index>size)
            throw new ArrayIndexOutOfBoundsException("invalid index input"+index);

        return objArray[index];
    }

    public static void main(String[] args) {

        CustomList c =new CustomList();

        System.out.println(c.size());

        c.add("sameer0");
        c.add("sameer1");
        c.add("sameer2");
        c.add("sameer3");

        System.out.println(c.size()+" ");

        c.display();

        System.out.println(c.get(3));
        c.remove(0);
        c.display();





    }
}
