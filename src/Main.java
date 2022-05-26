public class Main {
    public static void main(String[] args) {
        byte clientOS = 0;
        if (clientOS==0) {
            System.out.println("Установите версию для IOS по ссылке");
        } else {
            System.out.println("Установите версию для Android по ссылке");
        }

        // Задание 2

        ;
        int year = 2014;

        if (clientOS==0 && year<=2015) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
        } else if(clientOS==1&&year<=2015) {
            System.out.println("Установите облегченную версию на Android по ссылке");
        }else if(clientOS==0&&year>=2015) {
            System.out.println("Установите версию для IOS по ссылке");
        } else if(clientOS==1&&year>=2015){
            System.out.println("Установите версию для Android по ссылке");
        }
        // Задание 3
        int yearIsNow =2021;
        if (yearIsNow %4 ==0&&yearIsNow %100 !=0||yearIsNow %400 ==0){
            System.out.println("Год являеться високосным");
        } else {
            System.out.println("Год не являеться високосным");

            //Задание 4
            int distation = 95;
            int days = 0;
            if (distation<20)
                days =1;
            else if (distation>=20&&distation<60)
                days =2;
            else if (distation>=60&&distation<100)
                days= 3;
            System.out.println("Потребуеться дней :"+days);
            //Задание 5

            int mountNomber = 12;
            switch (mountNomber){
                case 12:
                    System.out.println("Зима");
                    break;
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;

                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;

                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
            }

        }
    }
}



