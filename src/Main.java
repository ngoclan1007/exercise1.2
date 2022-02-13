public class Main {
    public static void main(String[] args){

//        hình tròn
        double tinhChuvi= circle.perimeter(2);
        System.out.println("Chu vi hình tròn là " + tinhChuvi);


        double tinhDientich = circle.acreage(3);
        System.out.println("Diện tích hình tròn là " + tinhDientich);

//         hình vuông
        double tinhChuvivuong= square.perimeter(2);
        System.out.println("Chu vi hình vuông là " + tinhChuvivuong);

        double tinhdientichvuong= square.acreage(2);
        System.out.println("Diện tích hình vuông là " + tinhdientichvuong);


//         hình tam giác
        double tinhChuvitamgiac= triangle.perimeter(3, 5, 6);
        System.out.println("Chu vi tam giác là " + tinhChuvitamgiac);

        double tinhdientichtamgiac= triangle.acreage(4, 6);
        System.out.println("Diện tích tam giác là " + tinhdientichtamgiac);
    }
}
