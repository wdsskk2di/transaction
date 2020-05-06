package com.care.service;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.ui.Model;

import com.care.transaction_dao.TicketDAO;
import com.care.transaction_dto.TicketDTO;

public class TicketResultServiceImple implements TicketService{
	private TicketDAO dao;
	
	public TicketResultServiceImple() {
		String config = "classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		dao = ctx.getBean("dao", TicketDAO.class);
	}
		
	@Override
	public void execute(Model model) {
		model.addAttribute("result", dao.resultTicket());		
	}

}
