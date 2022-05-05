package Excersize;


class Library
{ 
  String[] books;
  int no_of_books;  
  Library()
  {
     this.books=new String[100];
     this.no_of_books=0;  
  }
  void add_books(String book)
  {
    this.books[no_of_books]=book;
    no_of_books++;
    System.out.println(book +" has been added to labrary");
  }
  void show_available_books()
  {
    System.out.println("Available books Are: ");
     for(String show:this.books)
     {
          if(show==null)
          {
               break;  
          }
           System.out.print("* "+show+"\n");
      }
  }
	public static void main(String[]args)
        {
             Library lab = new Library();
                     lab.add_books("Rich Dad Poor Dad");
                     lab.add_books("Time Doesn't Stop");
                     lab.add_books("Wings Of Fire");
                     lab.add_books("How To  Master");
                     lab.show_available_books();
        }
}