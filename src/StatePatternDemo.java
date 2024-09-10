// State interface
interface PlayerState {
    void pressPlay(MediaPlayer player);
}

// Concrete state: Playing
class PlayingState implements PlayerState {
    @Override
    public void pressPlay(MediaPlayer player) {
        System.out.println("Pausing the media...");
        player.setState(new PausedState());
    }
}

// Concrete state: Paused
class PausedState implements PlayerState {
    @Override
    public void pressPlay(MediaPlayer player) {
        System.out.println("Resuming the media...");
        player.setState(new PlayingState());
    }
}

// Context class
class MediaPlayer {
    private PlayerState state;

    public MediaPlayer() {
        state = new PausedState(); // Initial state
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void pressPlayButton() {
        state.pressPlay(this);
    }
}

// Client code
public class StatePatternDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.pressPlayButton(); // "Resuming the media..."
        player.pressPlayButton(); // "Pausing the media..."
    }
}
