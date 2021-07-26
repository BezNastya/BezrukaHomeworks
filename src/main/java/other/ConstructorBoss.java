package other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBoss {
    private OtherBeanA otherBeanA;
    @Autowired
    public ConstructorBoss(OtherBeanA otherBeanA){
        this.otherBeanA = otherBeanA;
    }
}
