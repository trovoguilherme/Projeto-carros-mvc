package br.com.fiap.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.model.CarroModel;
import br.com.fiap.repository.CarroRepository;

@Controller
@RequestMapping("/carro")
public class CarroController {
	
	public CarroRepository repository = CarroRepository.getInstance();
	
	@GetMapping("/form")
	public String open(@RequestParam String page,
			           @RequestParam(required = false)Long id,
			           @ModelAttribute("carroModel")CarroModel carroModel,
			           Model model) {
		
		if("carro-editar".equals(page)) {
			model.addAttribute("carroModel", repository.findById(id));
		}
		
		return page;
	}
	
	@GetMapping()
	public String findAll(Model model) {
		model.addAttribute("carros", repository.findAll());
		return "carros";
	}
	
	@PostMapping()
	public String save(@Valid CarroModel carroModel, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			System.out.println("Passou no erro!");
			return "carro-novo";
			
		}
		repository.save(carroModel);
		redirectAttributes.addFlashAttribute("messages", "Carro cadastrado com sucesso!");
		
		return "redirect:/carro";
	}
	
	@GetMapping("/{id}")
	public String findById(@PathVariable("id")long id, Model model) {
		model.addAttribute("carro", repository.findById(id));
		return "carro-detalhe";
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable("id")long id, @Valid CarroModel carroModel,  BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return "carro-editar";
		}
		carroModel.setId(id);
		repository.update(carroModel);
		redirectAttributes.addFlashAttribute("messages", "Carro editado com sucesso!");
		return "redirect:/carro";
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id")long id, RedirectAttributes redirectAttributes) {
		repository.deleteById(id);
		redirectAttributes.addFlashAttribute("messages", "Produto excluído com sucesso!");
		return "redirect:/carro";
	}

}
