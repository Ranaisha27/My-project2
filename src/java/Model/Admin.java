

package Model;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
    @Id
    private String id;
    private String pass;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
   
    
    
}

