



package ex1;
import java.util.Scanner;


public class ex1 {

    public static void main(String[] args) {

        int d=0, m=0, y=0, d1=0, y1=0, cm=0, um=0;
        String m1 = null;

        Datas ds = new Datas(d, m, y);
        Datas ds1 = new Datas(m1, d1, y1);
        Datas ds2 = new Datas(cm, um);
        Scanner scan = new Scanner(System.in);


        System.out.println("Insira o dia, o mês e o ano em numeros: ");
        ds.setDay(scan.nextInt());
        ds.setMounth(scan.nextInt());
        ds.setYear(scan.nextInt());
        System.out.println("Insira o mês por extenso: ");
        ds1.setMn(scan.next());
        System.out.println("Insira o dia: ");
        ds1.setDay1(scan.nextInt());
        System.out.println("Insira ano: ");
        ds1.setYear1(scan.nextInt());

        System.out.println("Insira os dias do ano: ");
        ds2.setCalander1(scan.nextInt());
        System.out.println("Insira a data a ser subtraida: ")
        ds2.setCalander(scan.nextInt());
        System.out.println(ds.getDay() + "/" + ds.getMounth() + "/" + ds.getYear());
        System.out.println(ds1.getMn()+"/"+ds1.getDay1()+"/"+ds1.getYear1());
        System.out.println(ds2.getCalander());
    }

}
