import java.util.Scanner;


public class Page {
	
	Scanner sc = new Scanner(System.in);
	private String title;
	private String text;
	protected int id = 0;
	
	Page(String title){
		if(title!= null && !(title.isEmpty()) ){
			this.title = title;
		}
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		if(title!= null && !(title.isEmpty()) ){
			this.text = text;
		}
	}
	
	public String getTitle() {
		return title;
	}
	void addText(String text){
		if(this.text == null){
			this.text = text;
			return;
		}
		this.text = this.text + " " + text;
	}
	
	void deleteText(){
		this.text = null;
	}
	
	String preview(){
		String preview = this.title + "\n" + this.text;
		return preview;
	}
	
	boolean searchWord(String word){
		String delimiters = "[\\s\\!\\.\\?\\,\\<\\> [0-9]]";
		String[] words = text.split(delimiters);
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(word)){
				return true;
			}
		}
		return false;
	}
	
	boolean containsDigits(){
		for (int i = 0; i < text.length(); i++) {
			if(Character.toString(text.charAt(i)).matches("[0-9]")){
				return true;
			}
		}
		return false;
	}
}
