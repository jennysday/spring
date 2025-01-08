package com.example.dto;

import java.sql.Timestamp;

import lombok.Builder;
import lombok.Data;

/*
@Getter: 모든 필드에 대해 자동으로 getter 메서드를 생성합니다.
@Setter: 모든 필드에 대해 자동으로 setter 메서드를 생성합니다.
@ToString: toString() 메서드를 자동으로 생성하여 객체의 문자열 표현을 반환합니다.
@EqualsAndHashCode: equals()와 hashCode() 메서드를 자동으로 생성합니다.
@NoArgsConstructor: 매개변수가 없는 기본 생성자를 자동으로 생성합니다.
@AllArgsConstructor: 모든 필드를 매개변수로 받는 생성자를 자동으로 생성합니다.

@Data: @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 포함하는 어노테이션으로, DTO 클래스에서 자주 사용됩니다.
@Builder: 빌더 패턴을 사용하여 객체를 생성할 수 있게 도와줍니다
*/

@Data
@Builder
public class Board {

    private int rownum; //행번호 
    private int num; //게시글 번호
    private int id; //게시글ID 
    private String title; //게시글 제목
    private String content;//게시글 내용
    private String writer; //작성자
    private Timestamp writeDate; //작성일
    private Timestamp updateDate; //수정일
        
}


