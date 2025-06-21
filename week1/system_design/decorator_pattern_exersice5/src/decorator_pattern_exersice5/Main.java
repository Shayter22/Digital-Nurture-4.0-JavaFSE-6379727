package decorator_pattern_exersice5;

public class Main {
	  public static void main(String[] args) {
	        Notifier basicNotifier = new EmailNotifier();
	        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);
	        Notifier slackAndSMS = new SlackNotifierDecorator(smsNotifier);

	        slackAndSMS.send("System update at 10 PM tonight");
	    }
	}


