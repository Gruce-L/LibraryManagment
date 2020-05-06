import book.BookList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TestMain {

    /**
     * 如果实现 1 进入管理员界面， 2 进入普通用户界面，需要跳转，
     * 就需要使用向上转型，把void改成User，通过User接收
     */
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1、管理员；  2、普通用户");
        int choice = scanner.nextInt();

        if(choice == 1){
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        /*
        第一步：准备书籍
         */
        BookList bookList = new BookList();

        /*
        第二步：登录
         */
        User user = login();
        while (true) {
            //当选好序号后，根据序号进入对应用户的方法
            int choice = user.menu();
            //选择是几，就可以应用对应的方法
            user.doOperation(bookList, choice);
        }

    }
}

