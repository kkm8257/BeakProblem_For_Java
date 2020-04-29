package mvc.model;

public class DAO {

	DTO[] peopleArr=new DTO[10];
	int top=0;
	
	//싱글톤패턴
	private DAO() {	}
	private static DAO instance;
	public static DAO getInstance() {
		
		if(instance==null)instance=new DAO();
		return instance;
	}
	
	
	public void insert(DTO dto) {

		if(top>=peopleArr.length) {
			
			System.out.println("못들어갑니다");
			return ;
		}
		
		
		peopleArr[top++]=dto;
		System.out.println("입력되었습니다.");
	}
	
	public void printAll() {
		
		for(int i =0; i<top;i++) {
			
			System.out.println(peopleArr[i]);
			
		}
		
		
	}
	
}
