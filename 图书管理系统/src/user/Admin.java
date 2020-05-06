package user;

import operation.*;

import java.util.Scanner;

public class Admin extends User{

    //子类重写父类方法
    public Admin(String name){
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    //重写User中的menu方法
    @Override
    public int menu() {
        System.out.println("=================");
        System.out.println("Hello!" + " " + this.name +"欢迎加入图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("=================");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

}
