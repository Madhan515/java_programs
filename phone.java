
class Device{
    void powerSource(){

    }
    void turnOn(){
        powerSource();
        System.out.println("Turned on");
    }
}
class Mobile extends Device{
    void ScreenSize(){

    }
    void Makecall(){
        ScreenSize();
        System.out.println("Making a call!");
    }
}
class Android extends Mobile{
    void openplayStore(){
        
    }
}
class iphone  extends Mobile{
    void openAppStore(){
        
    }
}
class phone{
    public static void main(String[] args){
        Android a = new Android();
        iphone i = new iphone();
        a.turnOn();
        a.Makecall();
        i.turnOn();
        i.Makecall();
    }
}