package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * 新增图书
 */

public class AddOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();

        /**
         * 因为nextInt和nextLine不能一起用，所以只能把nextLine变成nextInt
         * 因为nextInt输入后键入回车，nextLine会读取这个回车，所以才会直接跳出
         */
        System.out.println("请输入图书的类型");
        String type = scanner.next();

        Book book = new Book(name, author, price, type);

        //默认以尾插法的形式放置
        int curSize = bookList.getUsedSize();
        bookList.setBooks(curSize, book);
        bookList.setUsedSize(curSize + 1);
        System.out.println("新增成功！");
    }

}
