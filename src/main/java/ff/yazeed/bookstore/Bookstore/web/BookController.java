package ff.yazeed.bookstore.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class BookController {

	@RequestMapping("/index")
	public String book() {
		return "This is the index page";
	}
}