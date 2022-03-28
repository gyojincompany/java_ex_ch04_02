
public class Grade {
	
	private int math;//수학 점수
	private int science;//과학 점수
	private int english;//영어 점수
	
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		int ave = (math+science+english)/3;
		return ave;
	}
	
	
	
}
