package test.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import test.dto.BookVO;

@WebService
public interface BookShelfService {
	@WebMethod
	public  String insertBook(BookVO bookVO);
	
	@WebMethod
	public  BookVO getBook(String title);
	
	@WebMethod
	public String name();
}
