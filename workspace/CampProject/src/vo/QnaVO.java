package vo;

public class QnaVO {
	
	//나 혼자만 쓸때는 바꿔도 된다. ctrl shift y : 소문자로 변경 (x가 대문자변경)
	private String qnaCode; // Dao에 매개변수로 쓸때는 여기에서 가져온다. 밑의 지역변수가 아니라
	private String memCode;
	private String qnaTitle;
	private String qnaCon;
	private String qnaDate;
	private String memNick; 
	
	public String getQnaCode() {
		return qnaCode;
	}
	public void setQnaCode(String qnaCode) {
		this.qnaCode = qnaCode;
	}
	public String getMemCode() {
		return memCode;
	}
	public void setMemCode(String memCode) {
		this.memCode = memCode;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	public String getQnaCon() {
		return qnaCon;
	}
	public void setQnaCon(String qnaCon) {
		this.qnaCon = qnaCon;
	}
	public String getQnaDate() {
		return qnaDate;
	}
	public void setQnaDate(String qnaDate) {
		this.qnaDate = qnaDate;
	}
	public String getMemNick() {
		return memNick;
	}
	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}
	
	
}
