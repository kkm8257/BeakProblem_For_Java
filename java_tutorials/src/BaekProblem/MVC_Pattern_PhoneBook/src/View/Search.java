package View;

public class Search implements View {

	
	
	@Override
	public void show() {
		out.println("\n############### 검색기능 ###############\n");
		
		String SearchID="";
		
		out.print("아이디를 입력하시면 해당 아이디에 대한 정보를 제공합니다.\n알아보고자 하는 아이디를 입력하세요  >>>  ");
		//scan입력받기 구현
		
		SearchID=scan.next();
		
		out.println("\n찾은 ID : "+SearchID + " --->>> [ "+request.get(SearchID)+" ]\n");
		
		
		saramController.process();
	}

}
