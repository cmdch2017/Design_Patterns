package org.example.适配器模式;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 *
 * @author lst
 * @date 2023年12月01日 9:13
 */
public class DutchAddressAdapter extends DutchAdress {
    private Address address;

    private Boolean isHenan;

    /**
     * 这个适配器的设计思路是，当处理河南地址时，调用原先 DutchAdress 类的方法，而对于其他地址，调用 Address 接口的方法。适配器的作用是在两个不同的接口之间建立桥梁，使得它们可以协同工作，从而达到复用已有功能的目的。
     *
     * @param addr
     * @param isHenan
     * @return null
     * @author lst
     * @date 2023/12/1 9:53
     */
    public DutchAddressAdapter(Address addr, Boolean isHenan) {
        address = addr;
        this.isHenan = isHenan;
    }

    public void straat() {
        if (isHenan) {
            address.street();
        } else {
            super.straat();  // 如果是河南，调用原先的继承方法
        }
    }

    public void postcode() {
        address.zip();
    }

    public void plaats() {
        address.city();
    }
}
