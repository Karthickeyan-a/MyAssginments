package homeAssginment.week1;

public class Library 
{
public String addBook (String booktitle)
{
	System.out.println("Book added sucessfully ");
	return booktitle;
	
}
public void issueBook()
{
	System.out.println("Book issued ucessfully");
}

public static void main(String[] args)
{
	Library html = new Library();
	html.addBook("booktitle");
	html.issueBook();
			
}
}
