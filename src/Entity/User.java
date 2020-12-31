package Entity;

public class User {
	
	private String id,name,pwd;
	
	public User() {
		super();
	}
	
	public User(String id,String name,String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public void setId(String id) {
        this.id = id;
    }
	
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    public String getPwd() {
        return pwd;
    }
}