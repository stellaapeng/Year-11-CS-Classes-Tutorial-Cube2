public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this();
        basicCube.setSide(side);
        this.setColor(color);
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public void setSide(int side){
        basicCube.setSide(side);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        String a = "Cube{side=" + getSide() + ", color=\"" + getColor() + "\"}";
        return a;
    }


    //the following methods have been started for you, but need to be completed
    public int calculateVolume() {
        return basicCube.calculateVolume();
    }
    public int calculateSurfaceArea() { 
        return basicCube.calculateSurfaceArea();
    }
    public Cube2 add(Cube2 otherCube) {
        int a = otherCube.getSide();
        int b = basicCube.getSide();
        double reality = Math.sqrt(a*a + b*b);
        int ideal = (int) reality;

        if (reality != ideal){
            throw new IllegalArgumentException("Sides have to form a pythagorean triple!");
        }
        return new Cube2(ideal, this.getColor());
    }

    public Cube2 minus(Cube2 otherCube) { 
        int a = otherCube.getSide();
        int b = basicCube.getSide();
        double reality = Math.sqrt(b*b-a*a);
        int ideal = (int) reality;

        if (reality != ideal){
            throw new IllegalArgumentException("Sides have to form a pythagorean triple!");
        }
        return new Cube2(ideal, this.getColor());
    }

    public boolean equals(Cube2 otherCube) { 
        if (this.getSide() == otherCube.getSide()&& this.getColor().equals(otherCube.getColor())){
            return true; 
        }
        else{
            return false;
        }
    }


}