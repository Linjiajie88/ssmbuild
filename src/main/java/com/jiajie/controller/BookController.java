package com.jiajie.controller;

import com.jiajie.pojo.Books;
import com.jiajie.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // query all books and return to jsp
    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allbook";
    }
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allbook";
    }

    @RequestMapping("/toUpDate")
    public  String toUpdate(int id,Model model){
        Books prebooks = bookService.queryBookById(id);
        model.addAttribute("pBook",prebooks);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public  String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allbook";
    }

    @RequestMapping("/deleteBook")
    public  String deleteBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allbook";
    }

    @RequestMapping("/queryBookName")
    public  String searchBook(String bookName,Model model){
        List<Books> list = bookService.queryBookByName(bookName);
        System.out.println(bookName);
        System.out.println(list);
        model.addAttribute("list",list);
        return "allbook";
    }
}
