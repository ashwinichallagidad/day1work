class AreaExample{
    public static int area(int side)
    {
        return side*side;
    }
    public static int area(int length,int breadth)
    {
        return length*breadth;
    }
}

public static void main(String[] args) {
    int squareArea=area(5);
    int rectangleArea=area(4,6);
    System.out.println("Area of Square:"+squareArea);
    System.out.println("Area of Rectangle:"+rectangleArea);

}
