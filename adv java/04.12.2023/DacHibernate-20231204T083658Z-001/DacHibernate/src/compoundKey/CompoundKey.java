package compoundKey;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class CompoundKey implements Serializable{
    private int userId;
    private int accNo;

    public CompoundKey(int userId, int accNo) {
        this.userId = userId;
        this.accNo = accNo;
    }

    public int getUserId() {
        return userId;
    }

    public int getAccNo() {
        return accNo;
    }
    
    
}
