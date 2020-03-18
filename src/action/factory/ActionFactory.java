package action.factory;

import action.AbstractAction;
import action.impl.LoginAction;
import action.impl.LogoutAction;
import action.impl.user.UsersAddAction;
import action.impl.user.UsersAllAction;

public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action =null;
		
		if(actionName.equalsIgnoreCase("/login")) {
			action = new LoginAction();
		}
		
		if(actionName.equalsIgnoreCase("/logout")) {
			action = new LogoutAction();
		}
		
		if(actionName.equalsIgnoreCase("/users/all")) {
			action = new UsersAllAction();
		}
		
		if(actionName.equalsIgnoreCase("/users/add")) {
			action = new UsersAddAction();
		}
		
//		if(actionName.equalsIgnoreCase("/users/login")) {
//			action = new LogoutAction();
//		}
		
		
		return action;
	}
}
