package PrincicipioSegregacion;

public class EmailSender {
    public static void sendEmail(IEmail e, String message){
//Envia un mensaje la direccion IEmail e.
    }

    public void main(String args[]){
        GmailAccount gmail = new GmailAccount();
        gmail.setEmailAddress("juan@gmail.com");
        EmailSender.sendEmail(gmail, "hola");
    }
}
