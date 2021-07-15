package com.example.security.springsecurity.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//問４－１ コントローラーを意味するアノテーションを記述
//データを渡したり、受け取ったりするControllerクラスに付与
@Controller
public class AuthController {

	@Autowired
	private AccountRepository repository;

	public List<Account> get() {
		return (List<Account>) repository.findAll();
	}
    //全体処理の入り口
	@RequestMapping("/")
	public String index() {
		return "redirect:/top";
	}
    //取得の処理/loginデータを取ってくる。
	@GetMapping("/login")
	public String login() {
		return "login";
	}
    //投稿の処理、新しいデータを登録したりする。
	@PostMapping("/login")
	public String loginPost() {
		return "redirect:/login-error";
	}

	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}

	@RequestMapping("/top")
	public String top() {
		return "/top";
	}

}