package texts;

public class AllTexts {
	
	private static AllTexts uniqueInstance;
	
	private static String myEmail = "myEmail@gmail.com";
	private static String passWord = "myPass";
	private static String to = "myFriendEmail@gmail.com";
	private static String subject = "Email with java";
	private static String message = "Hello my friend!";
	private static String file_Path = "C:\\myImages\\ImageToMyLittleFriend.jpg"; /* .gif .txt .jpg ... */
	
	private AllTexts() {
	}

	public static void setUniqueInstance(AllTexts uniqueInstance) {
		AllTexts.uniqueInstance = uniqueInstance;
	}

	public static String getMyEmail() {
		return myEmail;
	}

	public static void setMyEmail(String myEmail) {
		AllTexts.myEmail = myEmail;
	}

	public static String getPassWord() {
		return passWord;
	}

	public static void setPassWord(String passWord) {
		AllTexts.passWord = passWord;
	}

	public static String getTo() {
		return to;
	}

	public static void setTo(String to) {
		AllTexts.to = to;
	}

	public static String getSubject() {
		return subject;
	}

	public static void setSubject(String subject) {
		AllTexts.subject = subject;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		AllTexts.message = message;
	}

	public static String getFile_Path() {
		return file_Path;
	}

	public static void setFile_Path(String file_Path) {
		AllTexts.file_Path = file_Path;
	}
	
	
}
