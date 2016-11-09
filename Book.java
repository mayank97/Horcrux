package dblp;

public class Book extends DBLPObject
{
	private String editor;
	private String series;
	private int volume;
	private String publisher;
	private String isbn;
	private String booktitle;
	private String ee;
	
	
	public String getEditor()
	{
		return this.editor;
	}
	public String getSeries()
	{
		return this.series;
	}
	public int getVolume()
	{
		return this.volume;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	public String getISBN()
	{
		return this.isbn;
	}
	public String getBookTitle()
	{
		return this.booktitle;
	}
	public String getEE()
	{
		return this.ee;
	}
	
	public void setEditor(String editor)
	{
		this.editor = editor;
	}
	public void setSeries(String series)
	{
		this.series = series;
	}
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public void setISBN(String isbn)
	{
		this.isbn = isbn;
	}
	public void setBookTitle(String booktitle)
	{
		this.booktitle = booktitle;
	}
	public void setEE(String ee)
	{
		this.ee = ee;
	}
	
}

