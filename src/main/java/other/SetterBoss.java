package other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterBoss {
    private OtherBeanB otherBeanB;

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB){
        this.otherBeanB = otherBeanB;
    }
}
