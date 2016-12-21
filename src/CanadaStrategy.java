import java.util.ArrayList;

public class CanadaStrategy extends TriviaStrategy {
	private ArrayList<Tuple> Trivia;
	private int questionNum;
	
	
	public CanadaStrategy(){
		questionNum = 0;
		Trivia = new ArrayList<Tuple>();
		Trivia.add(new Tuple("What is the capital of Canada?", "ottawa"));
		Trivia.add(new Tuple("What city has the largest population in Canada?", "toronto"));
		Trivia.add(new Tuple("How many provinces are in Canada?", "10"));
		Trivia.add(new Tuple("How many terrotories are there?", "3"));
		Trivia.add(new Tuple("What day is Canadas birthday?", "july 1"));
		Trivia.add(new Tuple("What is the population of Canada", "36million"));
		Trivia.add(new Tuple("How many official languages does Canada have?", "2"));
		Trivia.add(new Tuple("What are the two languages?", "english french"));
		Trivia.add(new Tuple("What is the smallest province?", "prince edward island"));
		Trivia.add(new Tuple("Did you enjoy the game?", "yes"));
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