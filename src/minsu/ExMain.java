package minsu;

class Buyer{
	private int MyMoney;
	private int AppleCnt;
	//기본생성자로 돈이 10000원이 있고, 사과갯수가 0개라는 기본값을 설정
	public Buyer() {
		this(10000,0);
	}

	
	public Buyer(int myMoney, int appleCnt) {
		
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	public void Payment(Seller seller, int money) {
		//1 MyMoney에서 money만큼 차감
		MyMoney -=money;
		//2 seller에게 money 전달,//3 seller로부터 사과개수 받기
		int cnt=seller.Receive(money);
		
		//4 사과개수를 멤버인 AppleCnt 누적
		AppleCnt+=cnt;
	}
	public void showInfo() {
		//속성 정보를 Console에 출력
		System.out.println("-----구매자정보-----");
		System.out.println("보유 금액 : "+MyMoney);
		System.out.println("사과 개수 : "+AppleCnt);
	}
}
class Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	
	public Seller() {
		this(100000,100,1000);
	}
	
	public Seller(int myMoney, int appleCnt, int price) {
		
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	public int Receive(int money) {
		//1 money를 MyMoney에 누적
		MyMoney+=money;
		//2 money에 해당되는 만큼 사과개수를 계산
		int revcnt=money/Price;
		//3 AppleCnt에서 계산된 만큼의 사과개수를 차감
		AppleCnt-=revcnt;
		//4 계산된 사과개수를 리턴
		return revcnt;
	}
	public void ShowInfo() {
		//속성 정보를 Console에 출력
		System.out.println("-----판매자정보-----");
		System.out.println("보유 금액 : "+MyMoney);
		System.out.println("사과 개수 : "+AppleCnt);
		System.out.println("개당 가격 : "+Price);
	}
}



public class ExMain {
	public static void main(String[] args) {
		Seller 사과장수1 = new Seller(100000,100,1000); //보유금액, 사과개수, 개당가격
		Buyer 이주현 = new Buyer(10000,0); //보유금액, 사과개수
		Buyer 황다은 = new Buyer(20000,0);
		Buyer 김민수 = new Buyer(30000,0);
		이주현.Payment(사과장수1, 2000);
		사과장수1.ShowInfo();
		이주현.showInfo();
	}
}
