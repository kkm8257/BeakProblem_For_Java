package teamTemp;

import java.util.Scanner;

public class Control {

	static int Index = 0;
	static int maxIndex=10;
	
	public static void main(String[] args) {

		int button;
		

		People[] PhoneBook = new People[10];

		// 0에는 입력 X

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("\n1.입력    2.전체보기    3.수정    4.삭제    5.나가기");

//			try {

				button = sc.nextInt();

				if (button == 1) {

					System.out.println("\n이름을 입력하세요");
					String Name = sc.next();

					System.out.println("\n전화번호를 입력하세요");
					String Phone = sc.next();

					
					if(OverlapCheck(PhoneBook, Name)) {
						
						People p = new People(Index, Name, Phone);
						PhoneBook[Index] = p;

						Index++;
						if (Index == maxIndex) {

							System.out.println("====전화번호부가 가득 찼습니다====");
							System.out.println("====전화번호부 크기를 늘립니다====");
							
							People[] tempArray=new People[PhoneBook.length+10];
							for(int i=0;i<PhoneBook.length;i++) {
								tempArray[i]=PhoneBook[i];
							}
							PhoneBook=tempArray;
							
							maxIndex+=10;
						}
					}
					else {
						
						System.out.println("이름이 중복됩니다.");
						
					}
					
					
					
					

				} else if (button == 2) {
					System.out.println();
					for (int i = 0; i <= Index - 1; i++) {

						System.out.println("Index : " + PhoneBook[i].getIdx() + "     이름 : " + PhoneBook[i].getName()
								+ "     전화번호 : " + PhoneBook[i].getPhone());

					}
					System.out.println("\n");

				} else if (button == 3) {
					
					int FindIndex = 0;
					boolean flag = false;
					System.out.println("\n수정할 사용자의 이름을 입력하세요");
					String FindName = sc.next();

					for (int i = 0; i < PhoneBook.length; i++) {

						if(PhoneBook[i]==null)continue;
						
						if (PhoneBook[i].getName().equals(FindName)) {
							FindIndex = PhoneBook[i].getIdx();
							flag = true;
							// 중복못하게 앞부분은 추가구현필요
						}

					}

					if (flag == true) {
						System.out.println("\n새로 저장할 이름을 입력하세요");
						String NewName = sc.next();
						System.out.println("\n새로 저장할 번호를 입력하세요");
						String NewNumber = sc.next();

						PhoneBook[FindIndex].setName(NewName);
						PhoneBook[FindIndex].setPhone(NewNumber);

					} else if (flag == false) {
						System.out.println("이름을 찾지 못하였습니다.");
					}


				} else if (button == 4) {
					
					
					System.out.println("\n삭제할 이름을 입력하세요.");
					String delName=sc.next();
					
					int FindIndex = 0;
					boolean flag = false;
					
					
					
					for (int i = 0; i < PhoneBook.length; i++) {

						if(PhoneBook[i]==null)continue;
						
						if (PhoneBook[i].getName().equals(delName)) {
							FindIndex = PhoneBook[i].getIdx();
							flag=true;
							// 중복못하게 앞부분은 추가구현필요
						}

					}
					
					if (flag == false) {
						System.out.println("이름을 찾지 못하였습니다.");
					}
					
					else {
						
						Resort(PhoneBook,FindIndex);
						
						
						
					}



				} else if (button == 5) {
					System.out.println("========================프로그램 종료========================");
					for (int i = 0; i <= Index - 1; i++) {

						System.out.println("Index : " + PhoneBook[i].getIdx() + "     이름 : " + PhoneBook[i].getName()
								+ "     전화번호 : " + PhoneBook[i].getPhone());

					}
					System.out.println("=========================================================");
					break;
				} else {
					System.out.println("다시 입력하세요~~~");
				}
			}

//			catch (Exception e) {
//				System.out.println("오류 발생 다시 입력하세요.");
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
