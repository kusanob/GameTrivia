
public class Tuple {
	private String question;
	private String answer;
	
	
	public Tuple(String ques, String ans){
		question = ques;
		answer = ans;
	}
	
	
	
	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	public String toString(){
		return this.getQuestion() + ": " + this.answer;
	}

	public static void main(String[] args) {
		Tuple a = new Tuple("Hello", "World");
		System.out.println(a);

	}

}
