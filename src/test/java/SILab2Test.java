import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testCriteriaEveryStatement() {
        RuntimeException excp;

        excp = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertTrue(excp.getMessage().contains("The user is not instantiated"));

        excp = assertThrows(RuntimeException.class, () -> SILab2.function(new User(null,null,null),null));
        assertTrue(excp.getMessage().contains("The user is missing some mandatory information"));

        //What if the password contains name ??? It isn't allowed
        assertFalse(()->SILab2.function(new User("Viktor","viktorjovev",null),null));

        //If length of the password is smaller than 8
        assertFalse(()->SILab2.function(new User("Viktor","jovev",null),null));

        //if the password doesn't contain special character
        assertFalse(()->SILab2.function(new User("Viktor","Jovev456",null),null));

        //if the password passed all conditions
        assertTrue(()->SILab2.function(new User("Viktor","Jovev$456",null),null));
    }

    @Test
    public void testCriteriaMultiplieCondition(){
        RuntimeException excp;

        excp = assertThrows(RuntimeException.class, () -> SILab2.function(new User(null,null,null),null));
        assertTrue(excp.getMessage().contains("The user is missing some mandatory information"));

        excp = assertThrows(RuntimeException.class, () -> SILab2.function(new User(null,"password",null),null));
        assertTrue(excp.getMessage().contains("The user is missing some mandatory information"));

        excp = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Username",null,null),null));
        assertTrue(excp.getMessage().contains("The user is missing some mandatory information"));


        assertFalse(()->SILab2.function(new User("Viktor","jovevasdasd",null),null));

        assertFalse(()->SILab2.function(new User("Viktor","jovev$!@#",null),null));

        assertFalse(()->SILab2.function(new User("Viktor","JovevViktorche",null),null));

        assertFalse(()->SILab2.function(new User("Viktor","JovevV#$!@#",null),null));

        assertFalse(()->SILab2.function(new User("Viktor","jovev45678",null),null));

        assertFalse(()->SILab2.function(new User("Viktor","jovev$@456",null),null));

        assertFalse(()->SILab2.function(new User("Viktor","Jovev45678",null),null));



    }

}