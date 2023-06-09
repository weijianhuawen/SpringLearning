import com.mvc.restful.config.SpringConfig;
import com.mvc.restful.mode.Book;
import com.mvc.restful.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookTest {
    @Autowired
    private BookService bookService;

    @Test
    public void test1() {
        List<Book> list = bookService.findAll();
        System.out.println(list);
        Book book = bookService.findByBid(1);
        System.out.println(book);

        book = new Book();
        book.setName("数据结构与算法");
        book.setClassify("计算机基础");
        book.setDescription("线性表，顺序表，队列，栈，哈希表，二叉树，图论等");
        bookService.insert(book);
    }
}
