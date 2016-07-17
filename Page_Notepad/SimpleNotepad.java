
public class SimpleNotepad implements INotepad {
	
	Page[] pages;

	SimpleNotepad(int pages){
		this.pages = new Page[pages];
		for (int i = 0; i < this.pages.length; i++) {
			this.pages[i] = new Page("Title" + (i+1));
			this.pages[i].id = i+1;
		}
	}
	
	@Override
	public void addText(int id , String text) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].id == id){
				pages[i].addText(text);
				System.out.println("Text Added!");
				return;
			}
		}
	}

	@Override
	public void deleteBeforeAddText(int id , String text) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].id == id){
				pages[i].deleteText();
				System.out.println("Text Deleted!");
				pages[i].addText(text);
				System.out.println("Text Added!");
				return;
			}
		}
	}

	@Override
	public void deteleText(int id) {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].id == id){
				pages[i].deleteText();
				System.out.println("Text Deleted!");
				return;
			}
		}

	}

	@Override
	public void preview() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i].getTitle() != null || pages[i].getText() != null){
				System.out.println(pages[i].preview());
			}
		}
	}

}
