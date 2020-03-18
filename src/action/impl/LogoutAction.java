package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class LogoutAction extends AbstractAction {
	@Override
	public String execute(HttpServletRequest request) {
		User user = (User)request.getSession().getAttribute("loginUser");
		List<User> loggedUsers = (List<User>) request.getServletContext().getAttribute("loggedUsers");
		loggedUsers.remove(user);
		request.getServletContext().setAttribute("loggedUsers", loggedUsers);
		request.getSession().invalidate();
		return ViewConstants.LOGIN;
	}
}
