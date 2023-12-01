package org.example.工厂模式;

/**
 * @author lst
 * @date 2023年12月01日 16:42
 */
public class ShotAssistant {
    public Computer suggest(String purpose){
        Computer computer=null;
        if(purpose.equals("戴尔")){
            return new DellComputer();
        }else if(purpose.equals("联想")){
            return new LianxiangComputer();
        }
        return computer;
    }
}
