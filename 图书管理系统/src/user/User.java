package user;

import book.Book;
import book.BookList;
import operation.IOperation;

public abstract class User {
    protected String name;

    //把删除等操作放置在数组中
    protected IOperation[] operations;

    public User(String name){
        this.name = name;
    }

    /*
    选择功能是有返回值的，即选择的序号，所以menu应该是int方法，同时父类的menu也为int方法
     */
    public abstract int menu();

    //根据选择的序号进行对所存储的书目的操作
    public void doOperation(BookList bookList, int choice){
        this.operations[choice].work(bookList);
    }
}
