package pweb2.form;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import jakarta.validation.Valid;

@Controller
public class Form implements WebMvcConfigurer {

  @Override
	public void addViewControllers(ViewControllerRegistry registry) {
    registry.addRedirectViewController("/", "form");
		registry.addViewController("/success").setViewName("success");
	}

  @GetMapping("/")
  public String showForm(DataForm dataForm) {
    return "form";
  }

  @PostMapping("/")
  public String getDataForm(@Valid DataForm dataForm, BindingResult result) {
    if(result.hasErrors()) {
      return "form";
    }

    return "redirect:/success";
  }
}
