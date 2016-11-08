package dblp;

public class PHDThesis extends DBLPObject
{
	private String school;
	private String ee;
	private String note;
	
	public String getSchool()
	{
		return this.school;
	}
	public String getEE()
	{
		return this.ee;
	}
	public String getNote()
	{
		return this.note;
	}
	
	public void setSchool(String school)
	{
		this.school  = school;
	}
	public void setEE(String ee)
	{
		this.ee = ee;
	}
	public void setNote(String note)
	{
		this.note = note;
	}
}
