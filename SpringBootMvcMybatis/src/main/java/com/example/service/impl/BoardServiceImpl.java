package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Board;
import com.example.mapper.BoardMapper;
import com.example.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper; //BoardMapper 의존성 주입

	//게시글 등록
	@Override
	public String createBoard(Board board) {
		boardMapper.createBoard(board); //Mapper를 통해 DB에 게시글 저장
		return "게시글이 성공적으로 등록되었습니다.";
	}
	
	//게시글 조회 (ID로 조회)
	@Override
	public Board getBoardById(int id) {
		return boardMapper.getBoardById(id); //Mapper를 통해 게시글 조회
	}

	//모든 게시글 조회
	@Override
	public List<Board> getBoards() {
		return boardMapper.getBoards(); //Mapper를 통해 모든 게시글 조회
	}
	
	//게시글 수정
	@Override
	public String updateBoard(Board board) {
		boardMapper.updateBoard(board); //Mapper를 통해 게시글 수정
		return "게시글이 성공적으로 수정되었습니다.";
	}

	//게시글 삭제
	@Override
	public String deleteBoard(int id) {
		boardMapper.deleteBoard(id); //Mapper를 통해 게시글 삭제
		return "게시글이 성공적으로 삭제되었습니다.";
	}
		
}
