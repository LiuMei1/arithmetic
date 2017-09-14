package com.niuniu.bstree;

public class Book implements Comparable<Book>{

	String title;
	String ibsn;
	String author;
	int price;
	public Book() {
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ibsn == null) ? 0 : ibsn.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (ibsn == null) {
			if (other.ibsn != null)
				return false;
		} else if (!ibsn.equals(other.ibsn))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	
	
}
