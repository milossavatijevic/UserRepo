package action.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;
import validator.Validator;
import validator.impl.UserValidator;

public class LoginAction extends AbstractAction{
	private static Validator validator = new UserValidator();

	@Override
	public String execute(HttpServletRequest request) {
		String view = ViewConstants.LOGIN;
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			User user = new User(username, password);
			validator.validateObject(user);
			
			List<User> users = (List<User>) request.getServletContext().getAttribute("users");
			List<User> loggedUsers = (List<User>) request.getServletContext().getAttribute("loggedUsers");
			if (users.contains(user)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("loginUser", user);
				loggedUsers.add(user);
				request.getServletContext().setAttribute("loggedUsers", loggedUsers);
				view = ViewConstants.INDEX;
			} else {
				request.setAttribute("validationError", "The user doesn't exists!");
			}
		} catch (Exception e) {
			request.setAttribute("validationError", e.getMessage());
		}
		return view;

	}
}
