package dblp;

public class Proceedings extends DBLPObject
{
	private String editor;
	private String volume;
	private String ee;
	private String isbn;
	private String booktitle;
	private String series;
	private String publisher;
	
	public String getEditor()
	{
		return this.editor;
	}
	public String getVolume()
	{
		return this.volume;
	}
	public String getEE()
	{
		return this.ee;
	}
	public String getISBN()
	{
		return this.isbn;
	}
	public String getBookTitle()
	{
		return this.booktitle;
	}
	public String getSeries()
	{
		return this.series;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	
	public void setEditor(String editor)
	{
		this.editor = editor;
	}
	public void setVolume(String volume)
	{
		this.volume = volume;
	}
	public void setEE(String ee)
	{
		this.ee = ee;
	}
	public void setISBN(String ISBN)
	{
		this.isbn = ISBN;
	}
	public void setBookTitle(String title)
	{
		this.booktitle = title;
	}
	public void setSeries(String series)
	{
		this.series = series;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
}
