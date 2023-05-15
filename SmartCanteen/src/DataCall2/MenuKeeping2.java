
package DataCall2;

import java.io.Serializable;

public class MenuKeeping2 implements Serializable {
    public String TypeMenu, LineMenu, ind ,egg, comnent;
    public boolean  option;
    public int order;
    public int money;
    
    public MenuKeeping2(){
        this("","", "", "", false);
    }
    public MenuKeeping2(String TypeMenu, String LineMenu, String ind, String egg, boolean option){
        this.TypeMenu = TypeMenu;
        this.LineMenu = LineMenu;
        this.ind = ind;
        this.egg = egg;
        this.option = true;
    }
    public MenuKeeping2(String TypeMenu, String LineMenu, String ind){
        this(TypeMenu, LineMenu, ind,"", false);
    }
    public MenuKeeping2(String TypeMenu, String LineMenu, String ind, String egg){
        this(TypeMenu, LineMenu, ind, egg, false);
    }
    public MenuKeeping2(String TypeMenu, String LineMenu, String ind,boolean option){
        this(TypeMenu, LineMenu, ind, "", true);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getTypeMenu() {
        return TypeMenu;
    }
    public String getLineMenu() {
        return LineMenu;
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
    public void setTypeMenu(String TypeMenu) {
        this.TypeMenu = TypeMenu;
    }
    public void setLineMenu(String LineMenu) {
        this.LineMenu = LineMenu;
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
    
}
