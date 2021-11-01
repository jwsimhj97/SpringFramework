package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller	//presentation-layer.xml�� Controller ��� �κа� ���� ����
public class InsertBoardController {
	 @RequestMapping(value="/insertBoard.do")	//presentation-layer.xml�� HandlerMapping ��� �κа� ���� ����
	 //@RequestMapping : HandlerMapping ���, �޼ҵ� Ÿ�Կ� ������� ȣ�� �� ������ ����
	 //�޼ҵ� Ÿ�Կ� ���� @GetMapping, @PostMapping���ε� ����� �����ϸ� ���� ���, PostMapping�� �� post �޼ҵ尡 ���εǴ� ���
	 
	 //Command ��ü : ����ڰ� ������ �����͸� ������ VO�� �ٷ� ����
	 //				����� �Է� ���� �������� �ڵ尡 ������� ������ ����ȭ ����
	 // 			����� �Է� input�� name �Ӽ��� VO ��������� �̸��� �������ִ� ���� �߿��ϴ�.
	 // 			�׷��� BoardVO Ŭ������ ��������� insertBoard�� �ش� ������ �ڵ����� ������ �ȴ�. 
	 public String insertBoard(BoardVO vo, BoardDAO boardDAO) {	//VO ��ü�� �ٷ� ������
		 System.out.println("�� ��� ó��");
			
			/*
			 * //1. ����� �Է����� ����(insertBoard.jsp���� ���۵� ���� ����) String title =
			 * request.getParameter("title"); String writer =
			 * request.getParameter("writer"); String content =
			 * request.getParameter("content");
			 * 
			 * //2. DB ���� ó��(BoardDAO�� �޼ҵ� ȣ��) BoardVO vo = new BoardVO();
			 * vo.setTitle(title); vo.setWriter(writer); vo.setContent(content);
			 */
			
		 	boardDAO.insertBoard(vo);
			
		 	//ȭ�� �׺���̼�(�Խñ� ��� �Ϸ� �� �Խñ� ������� �̵�)
			return "redirect:getBoardList.do"; //redirect�� ���ָ� �׳� ȭ�鸸 �̵��Ǵµ�, redirect�� �ָ� �ּҰ� ���� �����
	 }
}