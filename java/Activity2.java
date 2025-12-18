package com.example;
import java.util.Random;
public class Activity2 {
    public static void main(String[] args){
        Random random=new Random();
        int total=random.nextInt(6)+5;
        for (int i=1;i<total;i++){
            int choice=random.nextInt(4);
            switch (choice) {
                case 0:
                    new Human().fun1();
                    break;
                case 1:
                    new Boy().fun2();
                    break;
                case 2:
                    new Girl().fun3();
                    break;
                case 3:
                    new Robot().fun4();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Total Population:"+ Human.Population);

    }
}
