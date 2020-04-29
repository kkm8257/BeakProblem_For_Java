package View;

import Model.SaramDTO;

public class Modify implements View {

	@Override
	public void show() {
		out.println("\n############### 수정기능 ###############\n");
		
		String SearchID="";
		String changeName="";
		String changeAge="";
		
		SaramDTO TempObject;
		
		out.print("아이디를 입력하시면 해당 아이디에 대한 정보를 수정합니다.\n수정 할 아이디를 입력하세요  >>>  ");
		
		while(true) {
			
			SearchID=scan.next();
			if(request.containsKey(SearchID)) {
				break;
			}
			else {
				out.print("다시 입력하세요!  >>>  ");
			}
			
		}
		
		TempObject=request.get(SearchID);
		
		
		
		out.print("바꿀 이름 입력 : ");
		changeName=scan.next();
		TempObject.setName(changeName);
		
		out.print("바꿀 나이 입력 : ");
		changeAge=scan.next();
		TempObject.setAge(changeAge);
		
		////위코드 확인해서 돌려볼껏
		
		
		saramController.process();
	}

}
