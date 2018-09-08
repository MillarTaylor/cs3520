

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyTests {


    Hex2Dec converter= new Hex2Dec();
    @Test
    public void hex2decTest(){

        String happyday1="ABBC";
int happyValue1=439;

int newval=converter.hexToDecimal(happyday1);
      //  assertEquals(converter.hexToDecimal(happyday1),happyValue1,"Dec value of ABBC is 439");

        String happyday2="af71";
        int happyValue2= 44913;
        int newval2=converter.hexToDecimal(happyday2);
        assertEquals(converter.hexToDecimal(happyday2),happyValue2," Dec value of af71 is 44913");
}

@Test
    public void char2decTest(){





}


}
