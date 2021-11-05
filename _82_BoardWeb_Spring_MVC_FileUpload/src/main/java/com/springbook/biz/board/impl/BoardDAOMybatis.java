package com.springbook.biz.board.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardFileVO;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.Criteria;

@Repository
public class BoardDAOMybatis {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardVO vo) {
		System.out.println("====> Mybatis�� insertBoard() ��� ó��");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}	
	
	public void updateBoard(BoardVO vo) {
		System.out.println("====> Mybatis�� updateBoard() ��� ó��");
		mybatis.update("BoardDAO.updateBoard", vo);
	}	
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("====> Mybatis�� deleteBoard() ��� ó��");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("====> Mybatis�� getBoard() ��� ó��");
		return (BoardVO)mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo, Criteria cri) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("board", vo);
		cri.setStartNum((cri.getPageNum() - 1) * cri.getAmount());
		paramMap.put("criteria", cri);
		System.out.println("====> Mybatis�� getBoardList() ��� ó��");
		return mybatis.selectList("BoardDAO.getBoardList", paramMap);
	}
	
	public int selectBoardCount(BoardVO vo) {
		return mybatis.selectOne("BoardDAO.selectBoardCount", vo);
	}
	
	public int getBoardSeq() {
		return mybatis.selectOne("BoardDAO.getBoardSeq");
	}
	
	public void insertBoardFileList(List<BoardFileVO> fileList) {
		for(BoardFileVO boardFile : fileList) {
			mybatis.insert("BoardDAO.insertBoardFileList", boardFile);
		}
	}
	
	public List<BoardFileVO> getBoardFileList(int seq) {
		return mybatis.selectList("BoardDAO.getBoardFileList", seq);
	}
	
	public void deleteFile(BoardFileVO vo) {
		mybatis.delete("BoardDAO.deleteFile", vo);
	}
	
	public void updateFile(BoardFileVO vo) {
		mybatis.update("BoardDAO.updateFile", vo);
	}
	
	public void deleteFileList(int seq) {
		mybatis.delete("BoardDAO.deleteFileList", seq);
	}
}
