package facade;

/**
 * 门面模式【Facade Pattern】
 */
public class Client {

    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();

        /** 那这个过程与高内聚的要求相差甚远，你想，你要知道这四个步骤，而且还要知道这四个步骤的顺序，一旦出错，信就不可能邮寄出去 */
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your old lover. I'd like to....");
        letterProcess.fillEnvelope("Happy Road No. 666,God Province,Heaven");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

        System.out.println("--------------华丽的分割线----------------");

        //现代化的邮局，有这项服务，邮局名称叫 Hell Road
        ModernPostOffice hellRoadPostOffice = new ModernPostOffice();
        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作；
        String address = "Happy Road No. 666,God Province,Heaven";
        String context = "Hello,It's me,do you know who I am? I'm your old lover. I'd like to....";
        hellRoadPostOffice.sendLetter(context, address);
    }
}
