package Exercise_03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[2];
		
		books[0] = new Book("IS192832-0S", "LUNA DE PLUTON", "Dross", 400);
		books[1] = new Book("IS102039123-S", "MARTE", "José Maza", 230);
		
		for(Book book : books) {
			JOptionPane.showMessageDialog(null, book.toString());
		}
		if(books[1].getNumberOfPages() > books[0].getNumberOfPages()) {
			JOptionPane.showMessageDialog(null, "Mmm, Seeming be the book " 
											+ books[1].getTitle()+" has more pages");
		}else {
			JOptionPane.showMessageDialog(null, "Mmm, Seeming be the book " 
					+ books[0].getTitle()+" has more pages");
		}
			
	}

}
