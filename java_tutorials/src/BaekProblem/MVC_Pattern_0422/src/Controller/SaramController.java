package Controller;

import java.util.Scanner;

import Resource.R;
import View.View;

public class SaramController implements R {
	
	
	Scanner scan = new Scanner(System.in);
	
	public void process() {

		menu.show();// ��ü������ �ݺ�
		View view = null;
		int takeNum=0;
		try {
			
			
			takeNum=scan.nextInt();
			
			switch (takeNum) {

			case 1:
//				out.println("�Է±�� ����");
				view = input;
				break;
			case 2:
//				out.println("��±�� ����");
				view = output;
				break;
			case 3:
//				out.println("�˻���� ����");
				view =search;
				break;
			case 4:
//				out.println("������� ����");
				view = modify;
				break;
			case 5:
//				out.println("������� ����");
				view = delete;
				break;
			case 6:
//				out.println("������ ����");
				view = finish;
				break;
			default:
				out.println("�ٽ� �Է��ϼ���.");
				process();//���ȣ��
				
			}//������ ����ġ�� �ۿ����Ѵ�. ����ġ���� ���� view���� �������� �Ǵ�
			
			view.show();
			
		} catch (Exception e) {
			
			System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
			scan=new Scanner(System.in);
			saramController.process();
			//try catch�� ���� �߻��� ���ѹݺ� ���������� scan �缱��, �缱�������� R �������̽����մ� ��ĳ�ʿ� ������
			//SaramcontrollerŬ������  ��ĳ�� ������ü�� ����
		}
		
		
		
		

	}

}
