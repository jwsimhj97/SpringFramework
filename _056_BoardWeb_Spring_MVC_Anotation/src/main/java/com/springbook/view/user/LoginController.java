package com.springbook.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

//SpringFramework���� �����ϴ� Controller, interface�� handleRequest�޼ҵ�� ���� Ÿ�� ModelAndView
@Controller
public class LoginController {
	@RequestMapping(value="/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("�α��� ó��");
		
		//�α��� ���� �� �Խ��� ��� ��ȸ ȭ������ �̵�
		if(userDAO.getUser(vo) != null) {
			//redirect : viewResolver�� �����ϰ� �ٷ� �����̷�Ʈ
			return "redirect:getBoardList.do";
		//�α��� ���� �� �ٽ� �α��� ȭ������ �̵�
		} else {
			return "redirect:getBoardList.do";
		}
	}
}
