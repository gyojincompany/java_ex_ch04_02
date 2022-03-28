import java.util.Scanner;

public class GradeOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scann.nextInt();//수학 점수
		int science = scann.nextInt();//과학 점수
		int english = scann.nextInt();//영어 점수
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		scann.close();
		

	}

}
