package View;

public class Delete implements View {

	@Override
	public void show() {

		String DeleteID="";
		
		
		out.println("\n############### 삭제기능 ###############\n");
		
		out.print("삭제할 ID를 입력하세요.  >>>");
		DeleteID=scan.next();
		
		request.remove(DeleteID);
		
		if(!request.containsKey(DeleteID)) {
			
			out.println("\n성공적으로 삭제되었씁니다.\n");
			
		}
		
		saramController.process();
	}

}
