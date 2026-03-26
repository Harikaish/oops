class Notifier {
public void send(String message) {
System.out.println("General Notification: " + message);
}
protected void send(String message, String email) {
System.out.println("Email sent to " + email + ": " + message);
}
void send(String message, int phone) { // default access
System.out.println("SMS sent to " + phone + ": " + message);
}
private void send(String message, boolean internal) {
System.out.println("Internal Notification: " + message);
}
public void accessPrivate(String message) {
send(message, true); // calling private method internally
}
}
class AppNotifier extends Notifier {
public void testMethods() {
send("Welcome User");                 
send("Check Email", "user@mail.com");  
send("OTP", 1234567890);              
}
}
public class Main3 {
public static void main(String[] args) {
AppNotifier app = new AppNotifier();
app.send("Hello!");
app.send("Verify Email", "test@mail.com");
app.send("Code", 987654321);
app.testMethods();
app.accessPrivate("System Update"); // indirect call to private method
}
}
   