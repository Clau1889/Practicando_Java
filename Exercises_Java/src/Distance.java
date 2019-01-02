public class Distance {
    private Integer a;
    private Double b;
    private Integer c;


    public double distance1 (int a, double b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

        return a+b+c;
    }

    public double distance1(int x, double y){
        a = x;
        b = y;

        return x+y;
    }


}
