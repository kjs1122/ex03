package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired )
	private BoardMapper mapper;
	
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testInsert() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("삽입제목");
//		board.setContent("삽입내용");
//		board.setWriter("newbie");
//		
//		mapper.insertSelectKey(board);
//		
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void testRead() {
//
//		BoardVO board = mapper.read(5L);
//		
//		log.info(board);
//	}
////	
//	@Test
//	public void testDelete() {
//		
//		log.info("DELETE COUNT : "+ mapper.delete(3L));
//	}
//	
//	@Test
//	public void testUpdate() {
//		
//		BoardVO board = new BoardVO();
//
//		board.setBno(5L);
//		board.setTitle("수정제목");
//		board.setContent("수정내용");
//		board.setWriter("user0000");
//		
//		
//		int count = mapper.update(board);
//		log.info("update count : " + count);
//	}
	
//	@Test
//	public void testCirteria() {
//		Criteria cri = new Criteria(3,10);
//		cri.setPageNum(3);
//		cri.setAmount(10);
//		List<BoardVO> list =  mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board));
//	}
	
	@Test
	public void testSearch() {
		Criteria cri = new Criteria();
		
		cri.setKeyword("새로");
		cri.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
}
