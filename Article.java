package dblp;

public class Article 
{
	private String pages;
	private String volume;
	private String journal;
	private String ee;
	
	public String getPages()
	{
		return this.pages;
	}
	public String getVolume()
	{
		return this.volume;
	}
	public String getJournal()
	{
		return this.journal;
	}
	public String getEE()
	{
		return this.ee;
	}
	
	public void setPages(String page)
	{
		this.pages = pages;
	}
	public void setVolume(String vol)
	{
		this.volume = vol;
	}
	public void setJournal(String jour)
	{
		this.journal = jour;
	}
	public void setEE(String EE)
	{
		this.ee = EE;
	}
}
