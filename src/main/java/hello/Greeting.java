package hello;
//The implementation of the method body relies on a view technology, 
//in this case Thymeleaf, to perform server-side rendering of the HTML. 
public class Greeting
{
	private long id;
	private String content;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}
}