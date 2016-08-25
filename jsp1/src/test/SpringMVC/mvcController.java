package test.SpringMVC;

import java.util.List;
import java.util.jar.Attributes.Name;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.MatchService;
import com.entry.FixedIncome;

@Controller
@RequestMapping("/a")
public class mvcController {
	
	@Value("#{sys.name}")
	public String name;

	@Autowired
	private MatchService matchService;
	
	@RequestMapping("/hello{type}")
	public String hello(Model model,HttpServletRequest request,@PathVariable("type")String type) {
		System.out.println(type);
		int count=request.getSession().getAttribute("count")==null?0:Integer.parseInt(request.getSession().getAttribute("count").toString());
		request.getSession().setAttribute("count", count+1);
		List<FixedIncome> fixedIncomes=matchService.method3();
		model.addAttribute("fixedIncomes", fixedIncomes);
		return "n2";
	}
	
	@PostConstruct
	private void cons(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			System.out.println(name);
		}
	}
	
}

