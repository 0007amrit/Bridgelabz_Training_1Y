package SmartHomeAutomation;

public class SnartHome{
    public static void activateLight(String trigger, LightAction action ){
        System.out.println("Trigger Recieved : "+trigger);
        action.execute();
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        activateLight("Voice Comand", () -> System.out.println("Setting lights to Rosey Pink"));
        
        activateLight("Motion Detected",()->{
            System.out.println("Flash light 2 times.");
            System.out.println("Brightness set to 100%");
        });
        activateLight("Sunset (6.00 PM)",() ->System.out.println("Dimming to 20% night mode"));
    }
}
