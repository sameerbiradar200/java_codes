package learnArray;

import UserInputs.UserInputs;

import java.util.Arrays;

public class simpleArray {


    public static void main(String[] args) {
        UserInputs u =new UserInputs();
        int[] b=u.User_Array();
        System.out.println(Arrays.toString(b));
    }
}
