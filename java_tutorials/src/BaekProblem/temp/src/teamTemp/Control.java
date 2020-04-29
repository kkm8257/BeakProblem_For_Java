package teamTemp;

import java.util.Scanner;

public class Control {

	static int Index = 0;
	static int maxIndex=10;
	
	public static void main(String[] args) {

		int button;
		

		People[] PhoneBook = new People[10];

		// 0���� �Է� X

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("\n1.�Է�    2.��ü����    3.����    4.����    5.������");

//			try {

				button = sc.nextInt();

				if (button == 1) {

					System.out.println("\n�̸��� �Է��ϼ���");
					String Name = sc.next();

					System.out.println("\n��ȭ��ȣ�� �Է��ϼ���");
					String Phone = sc.next();

					
					if(OverlapCheck(PhoneBook, Name)) {
						
						People p = new People(Index, Name, Phone);
						PhoneBook[Index] = p;

						Index++;
						if (Index == maxIndex) {

							System.out.println("====��ȭ��ȣ�ΰ� ���� á���ϴ�====");
							System.out.println("====��ȭ��ȣ�� ũ�⸦ �ø��ϴ�====");
							
							People[] tempArray=new People[PhoneBook.length+10];
							for(int i=0;i<PhoneBook.length;i++) {
								tempArray[i]=PhoneBook[i];
							}
							PhoneBook=tempArray;
							
							maxIndex+=10;
						}
					}
					else {
						
						System.out.println("�̸��� �ߺ��˴ϴ�.");
						
					}
					
					
					
					

				} else if (button == 2) {
					System.out.println();
					for (int i = 0; i <= Index - 1; i++) {

						System.out.println("Index : " + PhoneBook[i].getIdx() + "     �̸� : " + PhoneBook[i].getName()
								+ "     ��ȭ��ȣ : " + PhoneBook[i].getPhone());

					}
					System.out.println("\n");

				} else if (button == 3) {
					
					int FindIndex = 0;
					boolean flag = false;
					System.out.println("\n������ ������� �̸��� �Է��ϼ���");
					String FindName = sc.next();

					for (int i = 0; i < PhoneBook.length; i++) {

						if(PhoneBook[i]==null)continue;
						
						if (PhoneBook[i].getName().equals(FindName)) {
							FindIndex = PhoneBook[i].getIdx();
							flag = true;
							// �ߺ����ϰ� �պκ��� �߰������ʿ�
						}

					}

					if (flag == true) {
						System.out.println("\n���� ������ �̸��� �Է��ϼ���");
						String NewName = sc.next();
						System.out.println("\n���� ������ ��ȣ�� �Է��ϼ���");
						String NewNumber = sc.next();

						PhoneBook[FindIndex].setName(NewName);
						PhoneBook[FindIndex].setPhone(NewNumber);

					} else if (flag == false) {
						System.out.println("�̸��� ã�� ���Ͽ����ϴ�.");
					}


				} else if (button == 4) {
					
					
					System.out.println("\n������ �̸��� �Է��ϼ���.");
					String delName=sc.next();
					
					int FindIndex = 0;
					boolean flag = false;
					
					
					
					for (int i = 0; i < PhoneBook.length; i++) {

						if(PhoneBook[i]==null)continue;
						
						if (PhoneBook[i].getName().equals(delName)) {
							FindIndex = PhoneBook[i].getIdx();
							flag=true;
							// �ߺ����ϰ� �պκ��� �߰������ʿ�
						}

					}
					
					if (flag == false) {
						System.out.println("�̸��� ã�� ���Ͽ����ϴ�.");
					}
					
					else {
						
						Resort(PhoneBook,FindIndex);
						
						
						
					}



				} else if (button == 5) {
					System.out.println("========================���α׷� ����========================");
					for (int i = 0; i <= Index - 1; i++) {

						System.out.println("Index : " + PhoneBook[i].getIdx() + "     �̸� : " + PhoneBook[i].getName()
								+ "     ��ȭ��ȣ : " + PhoneBook[i].getPhone());

					}
					System.out.println("=========================================================");
					break;
				} else {
					System.out.println("�ٽ� �Է��ϼ���~~~");
				}
			}

//			catch (Exception e) {
//				System.out.println("���� �߻� �ٽ� �Է��ϼ���.");
//				System.out.println(e);
//			}
//		}
	}

	public static People[] Resort(People[] PhoneBook,int delIdx) {

//		System.out.println("Index : "+Index);
//		System.out.println("delIdx : "+delIdx);
		
		
		for(int i=delIdx; i<Index-1; i++) {
			PhoneBook[i] = PhoneBook[i + 1];

			PhoneBook[i].setIdx(PhoneBook[i].getIdx()-1);			
			
       }
		--Index;
		
		return PhoneBook;
		
	}
	
	public static boolean OverlapCheck(People[] p, String name) {

		for (int i = 0; i < p.length; i++) {

			if(p[i]==null) {return true;}
			
			else if (name.equals(p[i].getName())) {
				return false;
			}

		}

		return true;

	}

}
