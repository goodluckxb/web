package test.SpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.MatchService;

@Controller
@RequestMapping("/")
public class mvcController {

	@Autowired
	private MatchService matchService;
	
	@RequestMapping("/hello")
	public String hello() {
		matchService.method1();
		matchService.method2();
		return "jsp/n2.jsp";
	}
}

