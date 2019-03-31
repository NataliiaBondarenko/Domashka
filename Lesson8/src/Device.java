public class Device {

    public class Device {
        private String serialNumber;
        private String manufacturer;
        private double cost;

        public Device(String serislNumer, String manufacturer, double cost) {
            this.serialNumber = serislNumer;
            this.manufacturer = manufacturer;
            this.cost = cost;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {

            return this.getClass().getSimpleName() + ":serialNumber=" +
                    ": serialNumber='" + serialNumber +
                    ", manufacturer='" + manufacturer +
                    ", cost=" + cost; // беру класс  + название класса
        }
        @Override
        public boolean equals (Object obj){
        if (this ==obj){
        return true;
        }
        if (obj == null || !(obj instanceof Device)){
            return false;
        }
        Device other = (Device)obj;
        Double.compare (this.cost, other.cost) != 0) {
    return false;
            }
            return (this.manufacturer.equalsIgnoreCase(other.manufacturer)&& (this.serialNumber.equalsIgnoreCase(other.serialNumber))
        }
        @Override
        public int hashCode(){
            int res = 17;
            res 31 * res + double.hashCode(cost);
            res 31 * res + manufacturer.hashCode();
            return  (31 * res + serialNumber.hashCode();
            }

    }
}