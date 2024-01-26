public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        SmartWatch watch = new SmartWatch();
        SmartTV tv = new SmartTV();

        phone.turnOn();
        phone.connectToInternet();
        phone.makeCall("+7059549602");
        phone.streamPhone("https://youtu.be/iwd8N6K-sLk?si=NmUsVCGXMeStLH14");

        watch.turnOn();
        watch.connectToInternet();
        watch.trackHeartRate();

        tv.turnOn();
        tv.connectToInternet();
        tv.streamVideo("https://youtu.be/iwd8N6K-sLk?si=NmUsVCGXMeStLH14");

        phone.connectToDevice(tv);
    }
}