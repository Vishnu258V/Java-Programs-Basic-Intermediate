package accessSpecifiers.com;

import java.io.*;

class Login_Details implements Serializable {
    String name;
    int age;
    String email;
    transient String password;

    public Login_Details(String name, int age, String email, String password) {
        this.name = name;

        this.age = age;
        
        this.email = email;
        
        this.password = password;
    }

}

public class Transient1 {
    public static void main(String[] args) throws Exception {
        
    	Login_Details obj = new Login_Details("Harry", 18, "harry123@xyz.com", "TRANSIENT");
        
    	FileOutputStream login_details = new FileOutputStream("login_details.txt");
        
    	ObjectOutputStream out = new ObjectOutputStream(login_details);
        
    	out.writeObject(obj);
        
    	out.flush();
        
    	out.close();
        
    	login_details.close();
        
    	System.out.println("Details saved");
    }
}