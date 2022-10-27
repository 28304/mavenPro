package housing_for_rent.houseservice;

import housing_for_rent.domain.House;

import java.util.Scanner;

public class CRUD{
    Scanner scanner = new Scanner(System.in);
    public House add(){
        System.out.print("姓名：");
        String name1 = scanner.next();
        System.out.print("电话：");
        String phone1 = scanner.next();
        System.out.print("地址：");
        String address1 = scanner.next();
        System.out.print("月租：");
        int mon_rent1 = scanner.nextInt();
        System.out.print("状态：");
        String state1 = scanner.next();
        House house=new House(name1,phone1,address1,mon_rent1,state1);
        return house;
    }
//    public int del (House[] houses){
//        System.out.print("请输入要删除的编号");
//        int id = scanner.nextInt();
//        for (int i = 0; i < houses.length; i++){
//            if (i == id - 1){
////                houses[i] = null;
//                return i;
//            }
//        }
//        System.out.println("没有该编号的房屋");
//        return 0;
//    }

    public boolean del(House[] houses){
        System.out.print("请输入要删除的编号");
        int id = scanner.nextInt();
        if(id >= 1 && id < Service.housesLen){
            for (int i = 0; i < houses.length-1; i++) {
                if(i == id - 1){
                    for (int j = i; j < houses.length - 1; j++) {
                        houses[j] = houses[j + 1];
                        if(houses[j] != null){
                            houses[j].setId(j+1);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public House find(House[] houses){
        System.out.print("请输入要查找的编号");
        int id = scanner.nextInt();
        for (int i = 0;i < Service.housesLen; i++){
            if(houses[i].getId() == id) {
                return houses[i];
            }
        }
        return null;
    }

    public boolean update(House[] houses){
        System.out.print("请输入要修改的编号");
        int id = scanner.nextInt();
        for (int i = 0;i < Service.housesLen; i++){
            if(houses[i].getId() == id) {
                System.out.print("姓名：");
                String name1 = scanner.next();
                houses[i].setName(name1);
                System.out.print("电话：");
                String phone1 = scanner.next();
                houses[i].setPhone(phone1);
                System.out.print("地址：");
                String address1 = scanner.next();
                houses[i].setAddress(address1);
                System.out.print("月租：");
                int mon_rent1 = scanner.nextInt();
                houses[i].setMon_rent(mon_rent1);
                System.out.print("状态：");
                String state1 = scanner.next();
                houses[i].setState(state1);
                return true;
            }
        }
        return false;
    }

}
