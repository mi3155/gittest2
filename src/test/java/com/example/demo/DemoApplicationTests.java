package com.example.demo;

import com.example.demo.Entity.Board;
import com.example.demo.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootTest
@RequiredArgsConstructor
class DemoApplicationTests {

	@Autowired
	private BoardRepository boardRepo;

//	@Test
//	void func1() {
//		for(int i=2; i<=600;i++){
//			Board board = Board.builder()
//					.email("bbb"+i+"@naver.com")
//					.content("내용"+i)
//					.pwd("1234")
//					.regdate("2021-12-03")
//					.subject("제목"+i)
//					.count(0)
//					.build();
//			boardRepo.save(board);
//		}
//	}
//
//	@Test
//	public void func2(){
//		//페이지당 게시물의 개수
//		Pageable pageable = PageRequest.of(0,10);
//		//게시물 가져오기
//		Page<Board> list = boardRepo.findAll(pageable);
////		System.out.println(list);
////		for(Board board : list.getContent()){
////			System.out.println(board);
////		}
//
//		System.out.println("총 페이지수 " + list.getTotalPages());
//		System.out.println("전체 게시물 수  " + list.getTotalElements());
//		System.out.println("현재 페이지 번호  " + list.getNumber());
//		System.out.println("페이지당 게시물 수 " + list.getSize());
//		System.out.println("다음페이지존재여부 : " + list.hasNext());
//		System.out.println("이전페이지존재여부 : " + list.hasPrevious());
//		System.out.println("시작페이지 여부 : " + list.isFirst());
//
//
//	}
//
//	@Test
//	public void Func2(){
//		//Sort
//		Sort sort1 = Sort.by("num").descending();
//		//페이지당 게시물의 개수
//		Pageable pageable = PageRequest.of(0,10,sort1);
//		//게시물 가져오기
//		Page<Board> list = boardRepo.findAll(pageable);
//
//		for(Board board : list.getContent()){
//			System.out.println(board);
//		}
//
//	}

}
