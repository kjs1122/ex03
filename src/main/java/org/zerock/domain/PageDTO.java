package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {
	
	
	private int startPage;
	private int endPage;
	private boolean prev, next;
	private int realEnd;
	private int total;
	private Criteria cri;
	
	public PageDTO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		
		endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * cri.getAmount();
		startPage = endPage - (cri.getAmount()-1);
		
		realEnd = (int)(Math.ceil((total * 1.0) / cri.getAmount()));  
		
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		prev = this.startPage > 1;
		next = this.endPage < realEnd;
		
	}
	
	
	
	
	
	
	
	

//	private int startPage;
//	private int endPage;
//	private boolean prev, next;
//		
//	private int total;
//	private Criteria cri;
//	
//	public PageDTO(Criteria cri, int total) {
//		this.cri = cri;
//		this.total = total;
//		
//		this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
//		this.startPage = this.endPage - 9;
//		
//		int realEnd = (int) (Math.ceil((this.total * 1.0) / cri.getAmount()));
//		
//		if(realEnd < this.endPage) {
//			this.endPage = realEnd;
//		}
//		
//		this.prev = this.startPage > 1;
//		this.next = this.endPage < realEnd;
//	}
}
