package Controller;

import java.util.Scanner;

import Resource.R;
import View.View;

public class SaramController implements R {
	
	
	Scanner scan = new Scanner(System.in);
	
	public void process() {

		menu.show();// 자체적으로 반복
		View view = null;
		int takeNum=0;
		try {
			
			
			takeNum=scan.nextInt();
			
			switch (takeNum) {

			case 1:
//				out.println("입력기능 선택");
				view = input;
				break;
			case 2:
//				out.println("출력기능 선택");
				view = output;
				break;
			case 3:
//				out.println("검색기능 선택");
				view =search;
				break;
			case 4:
//				out.println("수정기능 선택");
				view = modify;
				break;
			case 5:
//				out.println("삭제기능 선택");
				view = delete;
				break;
			case 6:
//				out.println("종료기능 선택");
				view = finish;
				break;
			default:
				out.println("다시 입력하세요.");
				process();//재귀호출
				
			}//실행은 스위치문 밖에서한다. 스위치문은 무슨 view값이 들어갔는지만 판단
			
			view.show();
			
		} catch (Exception e) {
			
			System.out.println("잘못된 값이 입력되었습니다.");
			scan=new Scanner(System.in);
			saramController.process();
			//try catch문 오류 발생시 무한반복 방지를위해 scan 재선언, 재선언을위해 R 인터페이스에잇는 스캐너와 별개로
			//Saramcontroller클래스에  스캐너 전역객체로 선언
		}
		
		
		
		

	}

}
