package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

//SpringFramework���� �����ϴ� Controller, interface�� handleRequest�޼ҵ�� ���� Ÿ�� ModelAndView
@Controller
public class LoginController {
	//GET������� ��û�� ���� �α���ȭ������, Post������� ��û�� ���� �α��� ó��
	//@RequestMapping(value="/login.do", method = RequestMethod.GET)
	@GetMapping(value="/login.do")	//�� �ڵ�� ���� �ǹ�
	//userVO�� �̸����� Command ��ü�� ������
	//�̸��� ���� ���� �ÿ� �ڵ����� ù ���ڰ� �ҹ��ڷ� ����� �̸����� ������
	//Command�� �̸� ���� : @ModelAttribute("user") -> user�� �̸��� Command ��ü ����
	public String loginView(@ModelAttribute("user")UserVO vo) {
		System.out.println("�α��� ȭ������ �̵�");
		//�α���ȭ������ �̵��� ó�� �Է°� ����
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}
	
	//@RequestMapping(value="/login.do", method = RequestMethod.POST)
	@PostMapping(value="/login.do")
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		System.out.println("�α��� ó��");
		UserVO user = userDAO.getUser(vo);
		//�α��� ���� �� �Խ��� ��� ��ȸ ȭ������ �̵�
		if(userDAO.getUser(vo) != null) {
			//redirect : viewResolver�� �����ϰ� �ٷ� �����̷�Ʈ
			//UserVO�� name ������ session ������ �����ҿ� userNAme�̶�� Ű ������ ����
			session.setAttribute("userName", user.getName());
			//UserVO ��ü�� session ������ �����ҿ� user��� Ű ������ ����
			//session.setAttribute("user", user);
			return "redirect:getBoardList.do";
		//�α��� ���� �� �ٽ� �α��� ȭ������ �̵�
		} else {
			return "login.jsp";
		}
	}
}
