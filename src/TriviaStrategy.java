import java.util.Observable;

public abstract class TriviaStrategy extends Observable{
	
//	public void question1(){}
//	public void question2(){}
//	public void question3(){}
//	public void question4(){}
//	public boolean answerQuestion(String s){return false;}
//	public void setNextQuestion(){}
//	public boolean isFinished(String s){return false;}
//	public String getQuestion(){return "holder";}
//	public int getQuestionNum(){return 1;}

	public void setNextQuestion(){}
	public boolean isFinished(){return false;}
	public boolean answerQuestion(String s){return false;}
	public String getQuestion(){return "holder";}
	public int getQuestionNum(){return 1;}
	

}
