package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class AppController {

	@Autowired
	private UserRepository repo1;
	@Autowired
	private NewExpanseRepository expanse;
	@Autowired
	private NewExpanseService exservice;
//	@Autowired
//	private CategoryRepository catrepo;
	@GetMapping("")
	public String viewHomePage(){
	
	return "index";

	}
	@GetMapping("/profile")
	public String afterlogin(Model model) {
		List<NewExpanse>listExpenses = exservice.findAll();
		model.addAttribute("listExpenses",listExpenses);
		return "profile";
	}
	@GetMapping("/register")
	public String showSignUp(Model model) {
		model.addAttribute("user",new User());
		return "signup";
	}
	@PostMapping("/process_register")
	public String registration(User user)
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String str = encoder.encode(user.getPassword());
		user.setPassword(str);
		repo1.save(user);
		return "success";
	}
	
	@GetMapping("/createExpense")
	public String formexpense(Model model) {
		model.addAttribute("expense",new NewExpanse());
		return "expanse"; 
	}
	
	@GetMapping("/createCategory")
	public String formcategory(Model model) {
		model.addAttribute("category",new Category());
		return "category"; 
	}
	
	@PostMapping("/process_expense")
	public String expensedetails(NewExpanse ex)
	{
		System.out.println(ex);
		expanse.save(ex);
		return "/profile";
		
	}
	
	@Autowired private CategoryService catservice;
	@PostMapping("/saveNewCategory")
	public String categorydetails(Category ex)
	{
		System.out.println(ex);
		catservice.save(ex);
		return "profile";
		
	}
	
	
	//
	
	
////	@GetMapping("")
//	public String newCategory() {
//		return "categoryPage";
//	}
//	
//	@GetMapping("")
//	public String Expanse() {
//		return "expanse";
//	}
}
