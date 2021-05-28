package facade;

public interface LetterProcess {
    void writeContext(String context);

    void fillEnvelope(String address);

    void letterIntoEnvelope();

    void sendLetter();
}
