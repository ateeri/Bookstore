package bookstore.projekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import bookstore.projekti.domain.BookRepository;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BookController {

    private BookRepository repository;

    public BookController(BookRepository repository){
        this.repository = repository;
    }

    @GetMapping("index")
    public String index(){
        return "!!!";
    }

    @GetMapping("booklist")
    public String bookList(Model model){
        model.addAttribute("books", repository.findAll());
        return "booklist";
    }

}
