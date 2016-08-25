package test.SpringMVC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.MatchService;
import com.entry.FixedIncome;

@Controller
@RequestMapping("/")
public class mvcController {

	@Autowired
	private MatchService matchService;
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		List<FixedIncome> fixedIncomes=matchService.method3();
		model.addAttribute("fixedIncomes", fixedIncomes);
		return "n2";
	}
}

