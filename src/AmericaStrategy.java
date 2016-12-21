import java.util.ArrayList;

public class AmericaStrategy extends TriviaStrategy {
	private ArrayList<Tuple> Trivia;
	private int questionNum;
	
	
	public AmericaStrategy(){
		questionNum = 0;
		Trivia = new ArrayList<Tuple>();
		Trivia.add(new Tuple("What is the capital of America?", "washington"));
		Trivia.add(new Tuple("What state has the largest population in America?", "california"));
		Trivia.add(new Tuple("How many states are in America?", "50"));
		Trivia.add(new Tuple("Where is the tech capital of America?", "silicon valley"));
		
	}
	
	
	public void setNextQuestion(){
		questionNum++;
		this.setChanged();
		this.notifyObservers();
	}
	
	
	public boolean isFinished(){
		if(questionNum==Trivia.size()-1){
			return true;
		}
		return false;
	}
	
	
	public boolean answerQuestion(String n){
		if(Trivia.get(questionNum).getAnswer().equals(n)){
			return true;
		}
		return false;
	}
	
	
	public String getQuestion(){
		return Trivia.get(questionNum).getQuestion();
	}
	
	
	public int getNum(){
		return questionNum;
	}	
}