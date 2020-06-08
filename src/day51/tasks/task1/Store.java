package day51.tasks.task1;

import day51.tasks.task1.phone.Career;
import day51.tasks.task1.phone.IOSPhone;

public class Store {

    public static void main(String[] args) {
        IOSPhone iphone11 = new IOSPhone();

        iphone11.setName("IPhone 11 pro max");
        iphone11.setCondition(Condition.NEW);
        iphone11.setModel("IPhone");
        iphone11.setCareer(Career.UNLOCKED);

        System.out.println(iphone11);
    }
}
