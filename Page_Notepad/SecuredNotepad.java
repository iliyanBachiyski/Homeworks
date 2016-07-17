import java.util.Scanner;


public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad {
	Scanner sc = new Scanner(System.in);
	private String password;
	private boolean flag = true;
	SecuredNotepad(int pages , String pw) {
		super(pages);
		if(pw!=null && !(pw.isEmpty()) ){
			this.password = pw;
		}
	}

	@Override
	public boolean checkPassword(String pw) {
			if(pw.equals(password)){
				return true;
			}	
			
			return false;
	
	}
	
	@Override
	public void addText(int id , String text) {
		System.out.println("Insert Password: ");
		flag = true;
		while(flag){
			if(checkPassword(sc.next()) ){
				for (int i = 0; i < pages.length; i++) {
					if(pages[i].id == id){
						pages[i].addText(text);
						System.out.println("Text Added!");
						flag = false;
						return;
					}
				}
			}
			System.out.println("Wrong Password!Insert again: ");
		}
	}

	@Override
	public void deleteBeforeAddText(int id , String text) {
		System.out.println("Insert Password: ");
		flag = true;
		while(flag){
			if(checkPassword(sc.next()) ){
				for (int i = 0; i < pages.length; i++) {
					if(pages[i].id == id){
						pages[i].deleteText();
						System.out.println("Text Deleted!");
						pages[i].addText(text);
						System.out.println("Text Added!");
						flag = false;
						return;
					}
				}
			}
			System.out.println("Wrong Password!Insert again: ");
		}
	}

	@Override
	public void deteleText(int id) {
		System.out.println("Insert Password: ");
		flag = true;
		while(flag){
			if(checkPassword(sc.next()) ){
				for (int i = 0; i < pages.length; i++) {
					if(pages[i].id == id){
						pages[i].deleteText();
						System.out.println("Text Deleted!");
						flag = false;
						return;
					}
				}
			}
			System.out.println("Wrong Password!Insert again: ");
		}
	}

	@Override
	public void preview() {
		System.out.println("Insert Password: ");
		flag = true;
		while(flag){
			if(checkPassword(sc.next()) ){
				for (int i = 0; i < pages.length; i++) {
					if(pages[i].getTitle() != null || pages[i].getText() != null){
						System.out.println(pages[i].preview());
					}
				}
				flag = false;
			}else{
				System.out.println("Wrong Password!Insert again: ");
			}
		}
	}
}
