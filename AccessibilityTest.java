package accessibility;

public class AccessibilityTest 
{
	private String category;
	private String Gresult;
	private String Wresult;
	private String Sresult;
	private String Aresult;
	private String description;
	
	public AccessibilityTest(String category, String Gresult, String Wresult, String Sresult, String Aresult, String description)
	{
		this.category = category;
		this.Gresult = Gresult;
		this.Wresult = Wresult;
		this.Sresult = Sresult;
		this.Aresult = Aresult;
		this.description = description;
	}
	
	public String getCat()
	{
		return this.category;
	}
	
	public String getG()
	{
		return this.Gresult;
	}
	
	public String getW()
	{
		return this.Wresult;
	}
	
	public String getS()
	{
		return this.Sresult;
	}
	
	public String getA()
	{
		return this.Aresult;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	@Override
	public String toString()
	{
		return category + " " + Gresult + " " + Wresult + " " + Sresult + " " + Aresult + " " + description;
	}
}
