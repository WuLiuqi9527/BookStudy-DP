package facade;

/**
 * 这个类是什么意思呢，就是说现在又一个叫 Hell Road PostOffice（地狱路邮局）提供了一种新型的
 * 服务，客户只要把信的内容以及收信地址给他们，他们就会把信写好，封好，并发送出去，这种服务提出
 * 时大受欢迎呀，这简单呀，客户减少了很多工作。
 */
public class ModernPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
