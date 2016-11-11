package dblp;

public class Incollection 
{
	private String pages;
	private String crossref;
	private String booktitle;
	private String ee;
	
	public String getPages()
	{
		return this.pages;
	}
	public String getCrossref()
	{
		return this.crossref;
	}
	public String getBookTitle()
	{
		return this.booktitle;
	}
	public String getEE()
	{
		return this.ee;
	}
	
	public void setPages(String pages)
	{
		this.pages = pages;
	}
	public void setCeossRef(String crossRef)
	{
		this.crossref = crossRef;
	}
	public void setBookTitle(String title)
	{
		this.booktitle = title;
	}
	public void setEE(String eee)
	{
		this.ee = eee;
	}
	
}
