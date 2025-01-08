package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Board;
import com.example.service.BoardService;

@RestController
@RequestMapping("/boards") // URL 경로를 "/boards"로 지정
public class BoardController {
	
	@Autowired
	private BoardService boardService; //BoardService를 자동 주입 (게시판 비즈니스 로직 처리)
	
	//게시글 등록 (CREATE)
	@PostMapping //POST (등록 또는 생성)
	public String createBoard(@RequestBody Board board) {
		//클라이언트로부터 받은 게시글 데이터(Board 객체)를 BoardService를 통해 저장
		boardService.createBoard(board);
		return "게시글이 성공적으로 등록되었습니다."; //게시글 생성 완료 메시지 반환
	}
	
	//게시글 조회 (READ) - 게시글 ID로 조회
	@GetMapping("/{id}") 
	public Board getBoardById(@PathVariable int id) {
		//URL에서 path variable로 전달된 id를 통해 게시글 조회
		return boardService.getBoardById(id); //해당 id에 맞는 게시글을 반환
	}

	//게시글 목록 조회 (READ) - 모든 게시글 조회
	@GetMapping
	public List<Board> getBoards() {
		//BoardService를 통해 모든 게시글을 리스트로 반환
		return boardService.getBoards();
	}

	//게시글 수정 (UPDATE)
	@PutMapping //PUT (수정 또는 갱신)
	public String updateBoard(@RequestBody Board board) {
		//클라이언트로부터 받은 게시글 데이터(Board 객체)를 BoardService를 통해 수정
		boardService.updateBoard(board);
		return "게시글이 성공적으로 수정되었습니다."; //수정 완료 메시지 반환
	}

    //게시글 삭제 (DELETE)
	@DeleteMapping("/{id}")
	public String deleteBoard(@PathVariable int id) {
		//클라이언트로부터 받은 게시글ID를 BoardService를 통해 삭제
		boardService.deleteBoard(id);
		return "게시글이 성공적으로 삭제되었습니다."; //삭제 완료 메시지 반환
	}

}
