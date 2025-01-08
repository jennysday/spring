package com.example.service;

import java.util.List;

import com.example.dto.Board;

public interface BoardService {
    
	// 게시글 등록
    String createBoard(Board board);
    
    // 게시글 조회 (ID로 조회)
    Board getBoardById(int id);
    
    // 모든 게시글 조회
    List<Board> getBoards();
    
    // 게시글 수정
    String updateBoard(Board board);
    
    // 게시글 삭제
    String deleteBoard(int id);

}
