// package first.userPackage;

import java.util.Scanner;

public class VolumeOfBOx {

    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    VolumeOfBOx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    static public  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your width, height, depth");
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double d = sc.nextDouble();
        VolumeOfBOx obj = new VolumeOfBOx(w, h, d);// construtor obj
        double result = obj.volume();
        System.out.println(result);
    }
}
public class p{}
