package be.intecbrussel.talker;

public class SpeakerImpl implements ISpeaker{
    @Override
    public void say(String textToSpeak) {
        System.out.println(textToSpeak);
    }
}
