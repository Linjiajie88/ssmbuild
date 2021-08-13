import com.jiajie.pojo.Books;
import com.jiajie.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    @Test
    public void mytest(){
        //check bean
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = context.getBean("BookServiceImpl", BookService.class);
        for(Books b: bookServiceImpl.queryAllBook()){
            System.out.println(b);
        }
    }
}
