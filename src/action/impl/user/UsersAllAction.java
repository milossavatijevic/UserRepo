package action.impl.user;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;

public class UsersAllAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		String view = ViewConstants.ALL_USERS;
		return view;
	}

}
