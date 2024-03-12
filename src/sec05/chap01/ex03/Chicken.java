package sec05.chap01.ex03;

public class Chicken {
    int no; //매장 넘버
    String name; //매장 이름
    ChickenMenu[] menus; //치킨 메뉴 자료형이 인스턴스!

    Chicken(int no, String name, ChickenMenu[] menus){
        this.no = no;
        this.name = name;
        this.menus = menus;
    }
    String who ="후라이드";
    ChickenMenu orderMenu(String name){ //반환 자료형이 ChikenMenu 함수호출명 orderMenu
        for(ChickenMenu menu : menus){
            if(menu.name.equals(name)){
                System.out.println(name);
                return menu;
            }
        }
        return null;
    }
}
