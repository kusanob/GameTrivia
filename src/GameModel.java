import java.util.Observable;

public class GameModel extends Observable{
	private String question;
	private String answer;
	private int questionNum;
	
	public GameModel(){
		this.question1();
	}
	
	public void question1(){
		question = "What is the captial of Canada?";
		answer = "ottawa";
		questionNum = 1;
		
	}
	
	public void question2(){
		question = "What city has the largest population in Canada?";
		answer = "toronto";
		questionNum = 2;
	}
	
	
	public void question3(){
		question = "How provinces are there in Canada?";
		answer = "10";
		questionNum = 3;
	}
	
	public void question4(){
		question = "How many terrotories are there in Canada?";
		answer = "3";
		questionNum = 4;
	}
	
	public boolean answerQuestion(String ans){
		ans = ans.toLowerCase();
		if(ans.equals(answer)){
			return true;
		}else{
			return false;
		}
	}
	
	public void setNextQuestion(){
		if(questionNum==1){
			this.question2();
			this.setChanged();
			this.notifyObservers();
			return;
		}
			
		if(questionNum==2){
			this.question3();
			this.setChanged();
			this.notifyObservers();
			return;
		}
		
		if(questionNum==3){
			this.question4();
			this.setChanged();
			this.notifyObservers();
			return;
		}
		
		if(questionNum==4){
			this.question1();	
			this.setChanged();
			this.notifyObservers();
			return;
		}
	}
	
	//next step. Implement littel qol things
	public boolean finish(String ans){
		if(questionNum==4){
			if(this.answerQuestion(ans)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	public String getQuestion(){
		return question;
	}
	
	public int getQuestionNum(){
		return questionNum;
	}
	
	
}