public class Monitor extends Device{
    private int x;
    private int y;

    public Monitor (String serialNumber, String munufacturer, double cost, int y, int x) {
        super();(serialNumber, munufacturer, cost);
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return super.toString() +
                ",x=" + x +
                ",y=" + y ;
    }//меняем на супер что бы дополнил новые значения "x" и "y"

    @Override
    public boolean equals(Object obj){
        if ((!super.equals(obj)){
            return false;
        }
        if ((this.getClass() != obj.getClass()){
            return false;
        }
        Monitor other = (Monitor) obj;
        return (this.x == other.x) && this.y == other.y);
    }
    @Override
    public int hashCode() {
        int res = super.hashCode();
        res = 31 * res + x;
        res = 31 * res + y;
        return res;
    }
}
