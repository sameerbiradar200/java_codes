package UserInputs;

import java.util.Scanner;


public class UserInputs {
    Scanner sc = new Scanner(System.in);


    public  int User_Int (){
        System.out.println("enter int value : ");
        return sc.nextInt();
    }

    public  String User_String (){
        System.out.println("enter String value : ");
        return sc.next();
    }

    public int[] User_Array(){
        System.out.println("enter length of string 1 to n");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<=n-1;i++){
            System.out.println("enter int value at index "+i+" : ");
            a[i]=sc.nextInt();
        }
        return a;
    }



}
