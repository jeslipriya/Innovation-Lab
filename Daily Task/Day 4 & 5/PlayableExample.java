interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {  
        System.out.println("Guitar class");
    }
}

class Piano implements Playable {
    @Override
    public void play() {  
        System.out.println("Piano class");
    }
}

public class PlayableExample {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();
        myGuitar.play();
        myPiano.play();
    }
}
