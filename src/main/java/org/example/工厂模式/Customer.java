package org.example.工厂模式;

/**
 * @author lst
 * @date 2023年12月01日 16:44
 */
public class Customer {
    public static void main(String[] args) {
        ShotAssistant shotAssistant = new ShotAssistant();
        Computer c = shotAssistant.suggest("联想");
        System.out.println(c.describe());
    }
}
