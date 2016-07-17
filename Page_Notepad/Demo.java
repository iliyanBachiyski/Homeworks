
public class Demo {
	
	public static void main(String[] args) {
		/*
		Page p1 = new Page("First");
		p1.setText("Hello world!");
		System.out.println(p1.preview());
		System.out.println("-----------");
		p1.addText("Hello!It's me!");
		System.out.println(p1.preview());
		System.out.println("-----------");
		p1.deleteText();
		System.out.println(p1.preview());
		System.out.println("-----------");
		p1.addText("Hello!It's me!");
		System.out.println(p1.preview());
		System.out.println("**************");
		SimpleNotepad pad = new SimpleNotepad(10);
		pad.addText(1, "Hello");
		pad.preview();
		System.out.println("**************");
		pad.addText(2, "Zdraveite");
		pad.preview();
		System.out.println("**************");
		pad.deleteBeforeAddText(1, "Pak Sum Az");
		pad.preview();
		System.out.println("**************");
		pad.deteleText(1);
		pad.preview();
		System.out.println("//////////////////////////");
		SecuredNotepad pad1 = new SecuredNotepad(10 , "123a");
		pad1.addText(1, "Hello");
		pad1.preview();
		System.out.println("**************");
		pad1.addText(2, "Zdraveite");
		pad1.preview();
		System.out.println("**************");
		pad1.deleteBeforeAddText(1, "Pak Sum Az");
		pad1.preview();
		System.out.println("**************");
		pad1.deteleText(1);
		pad1.preview();
		*/
		
		Page p1 = new Page("First");
		p1.setText("Hello world! I am world boss!Who Are You?");
		System.out.println(p1.searchWord("boss"));
		System.out.println(p1.containsDigits());
		
		
		
		
	}
}
