/**
 * This program searches for contacts using binary and sequential search.
 * 
 * @author Olga Redko
 * @version 04/09/2017
 */
public class Contact
{
    private String name;
    private String relation;
    private String bday;
    private String phone;
    private String email;
    
    Contact(String name, String relation, String bday, String phone, String email)
    {
        this.name = name;
        this.relation = relation;
        this.bday = bday;
        this.phone = phone;
        this.email = email;
    }
    
    	public void setName(String name) 
	{
		this.name = name;
	}
	public void setRelation(String relation) 
	{
		this.relation = relation;
	}
	public void setBday(String bday) 
	{
		this.bday = bday;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getName() 
	{
		return name;
	}
	public String getRelation() 
	{
		return relation;
	}
	public String getBday() 
	{
		return bday;
	}
	public String getPhone() 
	{
		return phone;
	}
	public String getEmail() 
	{
		return email;
	}
    
    public String toString()
    {
        return String.format("%-15s %-14s %-14s %-18s %-15s", name, relation, bday, phone, email);
    }
}