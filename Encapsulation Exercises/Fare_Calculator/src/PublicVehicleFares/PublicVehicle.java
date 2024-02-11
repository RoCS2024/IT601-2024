package PublicVehicleFares;

public class PublicVehicle {
        private int distance;
        private int fare;

        public PublicVehicle(){
        }

        public PublicVehicle(int distance, int fare){
            this.distance = distance;
            this.fare = fare;
        }

        public void setDistance(int distance){
            this.distance = distance;
        }
        public int getDistance() {
            return distance;
        }
        public void setFare(int fare) {
            this.fare = fare;
        }
        public int getFare() {
            return fare;
        }
}
