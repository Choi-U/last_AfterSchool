package choiU;
import java.util.Scanner;
class People{
	private String name;
	private int KorG;
	private int EngG;
	private int MathG;
	private int SumG;
	private int AvgG;
	private int RankG;

	void setName(String name) {
		this.name=name;
	}
	void setKorG(int kor) {
		this.KorG=kor;
	}
	void setEngG(int eng) {
		this.EngG=eng;
	}
	void setMathG(int math) {
		this.MathG=math;
	}
	void setRankG(int rank) {
		this.RankG=rank;
	}
	String getname() {
		return this.name;
	}
	int getKor() {
		return this.KorG;
	}
	int getEng() {
		return this.EngG;
	}
	int getMath() {
		return this.MathG;
	}
	int getSum() {
		return this.getKor()+this.getEng()+this.getMath();
	}
	double getAvg(int num) {
		return this.getSum()/num;
	}
	int getRank() {
		return this.RankG;
	}
	void printScore(int num) {
		System.out.printf("%3s %3d %3d %3d %3d %3.2f %3d \n",
				this.getname(),this.getKor(),this.getEng(),this.getMath(),this.getSum()
				,this.getAvg(num),this.getRank());
		
	}
}
public class chq213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("성적처리 할 인원의 수(숫자 입력):");
		int num=s.nextInt();
		
		//객체배열 선언
		People stu[]=new People[num];
		
		//객체배열 초기화
		for(int i=0; i<stu.length;i++) {
			stu[i]=new People();
		}
	for(int i=0; i<stu.length;i++) {
		System.out.println("성명 입력:");
		stu[i].setName(s.next());
		System.out.println("국어 점수 입력:");
		stu[i].setKorG(s.nextInt());
		System.out.println("영어 점수 입력:");
		stu[i].setEngG(s.nextInt());
		System.out.println("수학 점수 입력:");
		stu[i].setMathG(s.nextInt());
	}
	for(int i=0; i<stu.length; i++) {
		int rank=1;
		for(int j=0; j<stu.length; j++) {
			if(stu[i].getSum()<stu[j].getSum()) rank ++;
		}
		stu[i].setRankG(rank);
	}
	System.out.println("====================출력====================");
	System.out.printf("%3s %3s %2s %2s %3s %3s %4s \n",
			"성명","국어","영어","수학","합계","평균","석차");
		for(int i=0; i<stu.length; i++) {
			stu[i].printScore(num);
		}
	}

}
