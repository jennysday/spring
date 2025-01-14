package com.example.service.impl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.Board;
import com.example.mapper.BoardMapper;
import com.example.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	private final BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

	//게시글 등록
	@Override
	public String createBoard(Board board) {
		board.setWriteDate(getCurrentTime());
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
		board.setUpdateDate(getCurrentTime());
		boardMapper.updateBoard(board); //Mapper를 통해 게시글 수정
		return "게시글이 성공적으로 수정되었습니다.";
	}

	//게시글 삭제
	@Override
	public String deleteBoard(int id) {
		boardMapper.deleteBoard(id); //Mapper를 통해 게시글 삭제
		return "게시글이 성공적으로 삭제되었습니다.";
	}
	
    //현재 시간
    private Timestamp getCurrentTime() {
    	LocalDateTime currentTime = LocalDateTime.now();
    	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	//return currentTime.format(formatter); //시간을 "yyyy-MM-dd HH:mm:ss" 형식으로 반환
    	return Timestamp.valueOf(currentTime);  // Timestamp로 변환하여 반환
    }
}
