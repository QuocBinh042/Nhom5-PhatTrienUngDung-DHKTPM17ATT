package Start;

import app.Card;
//import app.Login;
import app.Tab;
import connectDB.ConnectDB;

public class main {
	public static void main(String[] args) {
		try {
			ConnectDB.getInstance().connect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		new Card().setVisible(true);
	}
}
