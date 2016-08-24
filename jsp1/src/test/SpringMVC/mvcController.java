package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class mvcController {

	@RequestMapping("/hello")
	public String hello() {
		return "jsp/n2.jsp";
	}
}

