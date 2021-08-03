package com.bit.springBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;
import com.bit.springBoard.dto.BoardDto;

public class BoardContentCommand implements BoardCommand {
	
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = (HttpServletRequest)map.get("request"); //request라는 이름으로 모델에 저장
		int id = Integer.parseInt(req.getParameter("id"));
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.contentView(id);
		model.addAttribute("contentView", dto);
	}

}
