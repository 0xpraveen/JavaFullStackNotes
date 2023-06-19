class User 
{
private String name,contact,email;
private int userid;

    public User() {
    }

    public User(String name, String contact, String email, int userid) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.userid = userid;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    } 
    
}
public class EncapsulateExample
{
	public static void main(String[] args)
	{
		User u=new User();
		//u.userid=100;//error , because private data member
		u.setUserid(1001);
		int userid=u.getUserid();
		System.out.println("User Id:"+userid);
	}
}
