package housing_for_rent.houseservice;

import housing_for_rent.domain.House;

public class Service {
    private House[] houses;
    private CRUD add = new CRUD();
    public static int housesLen=0;

    public Service() {
        this.houses = new House[1];
    }

    public void addHouses() {
        if (houses[houses.length - 1] != null) {
            Expand();
        }
        House house = add.add();
        for (int i = 0; i < houses.length; i++){
            if (houses[i] == null){
                house.setId(i+1);
                houses[i] = house;
                break;
            }
        }
        housesLen++;
    }

    public House[] list(){
        return houses;
    }

    private void Expand(){
        House[] houses1 = new House[houses.length * 2];
        for (int i = 0; i < houses.length; i++){
            houses1[i] = houses[i];
        }
        houses=houses1;
    }

    public void del(){
        if(housesLen != 0){
            boolean del = add.del(houses);
            if(del){
                housesLen--;
                System.out.println("删除成功");
            }else {
                System.out.println("暂无数据");
            }
        }else
        {
            System.out.println("暂无数据");
        }
    }
    public House find(){
        return add.find(houses);
    }
    public void update(){
        boolean update = add.update(houses);
        if(update){
            System.out.println("修改成功");
        }else {
            System.out.println("查找失败");
        }
    }
}
