package housing_for_rent.houseview;

import housing_for_rent.domain.House;
import housing_for_rent.houseservice.Service;

import java.util.Scanner;

public class mainMenu {
    private boolean loop = true;
    private Service service = new Service();

    public void listHouses(){
        System.out.println("------------------房屋列表-----------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = service.list();
        for (int i = 0; i < Service.housesLen; i++){
            System.out.println(houses[i]);
        }
        System.out.println("------------------房屋列表显示完毕-----------------");
    }
    public void Menu(){
        do {
            System.out.println("------------------房屋出租系统-----------------");
            System.out.println("\t\t\t\t1.新 增 房 屋");
            System.out.println("\t\t\t\t2.查 找 房 屋");
            System.out.println("\t\t\t\t3.删 除 房 屋");
            System.out.println("\t\t\t\t4.修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5.房 屋 列 表");
            System.out.println("\t\t\t\t6.退      出");
            Scanner scanner = new Scanner(System.in);
            System.out.print("请1输入1~6：");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    service.addHouses();
                    System.out.println("添加成功");
                    break;
                case 2:
                    System.out.println("查 找 房 屋");
                    System.out.println(service.find());
                    break;
                case 3:
                    service.del();
                    break;
                case 4:
                    System.out.println("修 改 房 屋 信 息");
                    service.update();
                    break;
                case 5:
                    listHouses();
                    break;
                case 6:
                    System.out.println("退      出");
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (loop);
    }
}
