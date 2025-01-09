package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.Board;

@Mapper // @Mapper도 함께 사용하여 MyBatis 매퍼로 인식
public interface BoardMapper {
	
	//게시글 등록
	void createBoard(Board board);
	
	//게시글 조회 (ID 조회)
	Board getBoardById(int id);
	
	//모든 게시글 조회
	List<Board> getBoards();
	
	//게시글 수정
	void updateBoard(Board board);
	
	//게시글 삭제
	void deleteBoard(int id);
	
}
