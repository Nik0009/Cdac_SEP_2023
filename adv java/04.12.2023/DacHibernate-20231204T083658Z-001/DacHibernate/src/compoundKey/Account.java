package compoundKey;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    
    @Id
    private CompoundKey ck;
    private String userName;

    public CompoundKey getCk() {
        return ck;
    }

    public void setCk(CompoundKey ck) {
        this.ck = ck;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
