

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Hex2DecTest {
Hex2Dec converter = new Hex2Dec();
    @Test
    void hexToDecimal() {

        String happyday1="ABBC";
        int happyValue1=43964;

        int newval=converter.hexToDecimal(happyday1);
         assertEquals(converter.hexToDecimal(happyday1),happyValue1,"Dec value of ABBC is 43964");

        String happyday2="af71";
        int happyValue2= 44913;
        int newval2=converter.hexToDecimal(happyday2);
        assertEquals(converter.hexToDecimal(happyday2),happyValue2," Dec value of af71 is 44913");
    }

    @Test
    void hexCharToDecimal() {

        int x =converter.hexCharToDecimal('A');
        assertEquals(converter.hexCharToDecimal('A'),10,"Dec value of 'A' is 10");
    }
}