class Rectangle extends Shape{
    public int length, width;
    
    public Rectangle(int length, int width, String name){
        super(name);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void draw(){
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area(){
        return (double)(length * width);
    }

}
