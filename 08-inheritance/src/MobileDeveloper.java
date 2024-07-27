public class MobileDeveloper extends Developer {
    Boolean ios;
    Boolean android;

    public MobileDeveloper() {
        System.out.println("Subclass MobileDeveloper No-Args constructor");
    }

    public boolean getIos() {
        return this.ios;
    }

    public void setIos(boolean ios) {
        this.ios = ios;
    }

    public boolean getAndroid() {
        return this.android;
    }

    public void setAndroid(boolean android) {
        this.android = android;
    }
}
