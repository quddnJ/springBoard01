package com.bit.springBoard.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.springBoard.command.BoardCommand;
import com.bit.springBoard.command.BoardContentCommand;
import com.bit.springBoard.command.BoardDeleteCommand;
import com.bit.springBoard.command.BoardListCommand;
import com.bit.springBoard.command.BoardModifyCommand;
import com.bit.springBoard.command.BoardWriteCommand;

@Controller
public class BoardController {

	BoardCommand command;
	
	@RequestMapping(value = "writeView")
	public String writeView() {return "writeView";}
	
	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String write(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new BoardWriteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		command = new BoardListCommand();
		command.execute(model);
		return "list";//views/list.jsp 호출
	}
	
	@RequestMapping(value = "contentView")
	public String contentView(HttpServletRequest req, Model model) {
		model.addAttribute("request",req);
		command = new BoardContentCommand();
		command.execute(model);
		return "contentView";
	}
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modify(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new BoardModifyCommand();
		command.execute(model);
		return "redirect:list";
	}
	@RequestMapping(value = "delete")
	public String delete(HttpServletRequest req, Model model) {
		model.addAttribute("request", req);
		command = new BoardDeleteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
}



