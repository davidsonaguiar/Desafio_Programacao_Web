package pweb2.form.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.validation.Valid;
import pweb2.form.Models.User;
import pweb2.form.Respositories.UserRepository;

@Controller
public class UserController implements WebMvcConfigurer {
  
  @Autowired
  UserRepository userRepository;

  @Override
	public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("form");
    registry.addViewController("/users").setViewName("users");
		registry.addViewController("/success").setViewName("success");		
	}

  @GetMapping("/")
  public String showForm(User user) {
    return "form";
  } 

  @PostMapping("/")
  public String getDataForm(@Valid User user, BindingResult result) {
    if(result.hasErrors()) {
      return "form";
    }

    userRepository.save(user);

    return "redirect:/success";
  }

  @GetMapping(value="/users")
  public String showUsers(Model model) {
    Iterable<User> users = userRepository.findAll();
    model.addAttribute("users", users);
    return "users";
  }
  
}
