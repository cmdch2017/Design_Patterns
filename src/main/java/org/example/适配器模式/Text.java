package org.example.适配器模式;

/**
 * @author lst
 * @date 2023年12月01日 9:21
 */
public class Text {
    public static void main(String[] args) {
        Address addr=new Address();
        DutchAddressAdapter addrAdapter=new DutchAddressAdapter(addr,false);
        System.out.println("\n The DutchAddress \n");
        testDutch(addrAdapter);
    }

    private static void testDutch(DutchAdress addr) {
        addr.straat();
        addr.postcode();
        addr.plaats();
    }
}
