package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * 
 * @author oscarsanjuan
 * Event Handler for transition from Main View to Level Selection View
 */
public class MainController implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent event) {

		try {
			Main.stage.setScene(Main.levelSelect.levelSelectScene);
			Main.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
