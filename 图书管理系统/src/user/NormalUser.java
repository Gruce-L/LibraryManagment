package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User{

    public NormalUser(String name){
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    //选择功能是有返回值的，即选择的序号，所以menu应该是int方法，同时父类的menu也为int方法
    @Override
    public int menu() {
        System.out.println("=================");
        System.out.println("Hello!" + " " + this.name +"欢迎加入图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=================");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
