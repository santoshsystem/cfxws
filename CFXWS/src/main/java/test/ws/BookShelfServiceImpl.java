package test.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import test.dto.BookVO;

@WebService(endpointInterface="test.ws.BookShelfService", serviceName="bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {

	List<BookVO> list = new ArrayList<BookVO>();
	
	public String insertBook(BookVO bookVO) {
		list.add(bookVO);
        return "Book with name : " + bookVO.getBookName() + " is now available on the shelf";  //To change body of implemented methods use File | Settings | File Templates.
	}

	public BookVO getBook(String title) {
		BookVO bo = null;
		for(BookVO v:list) {
			if(v.getBookName().equals(title)) {
				bo=v;
				break;
			}
		}
		
		if(bo == null) {
			bo = new BookVO();
			bo.setAuthor("Dummy");
			bo.setBookId(1);
			bo.setBookName("dummy");
		}
		return bo;
	}

	public String name() {
		return "Welcome Santosh!!";
	}
	
	

}
