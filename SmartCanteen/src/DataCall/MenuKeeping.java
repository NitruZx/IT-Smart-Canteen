package DataCall;

import java.io.Serializable;

public class MenuKeeping implements Serializable{
    private String menuName, ind, egg, comnent;
    private boolean  option;
    private int order;
    
    public  MenuKeeping(){
        this("", "", "", false);
    }
    public MenuKeeping(String menuName, String ind, String egg, boolean option){
        this.menuName = menuName;
        this.ind = ind;
        this.egg = egg;
        this.option = true;
    }
    public MenuKeeping(String menuName, String ind){
        this(menuName, ind, "", false);
    }
    public MenuKeeping(String menuName, String ind, String egg){
        this(menuName, ind, egg, false);
    }
    public MenuKeeping(String menuName, String ind, boolean option){
        this(menuName, ind, "", true);
    }


    
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public void setInd(String ind) {
        this.ind = ind;
    }
    public void setEgg(String egg) {
        this.egg = egg;
    }
    public void setComnent(String comnent) {
        this.comnent = comnent;
    }
    public void setOption(boolean option) {
        this.option = option;
    }
    public void setOrder(int order) {
        this.order = order;
    }

    public String getMenuName() {
        return menuName;
    }
    public String getInd() {
        return ind;
    }
    public String getEgg() {
        return egg;
    }
    public String getComnent() {
        return comnent;
    }
    public boolean isOption() {
        return option;
    }
    public int getOrder() {
        return order;
    }
    
}
