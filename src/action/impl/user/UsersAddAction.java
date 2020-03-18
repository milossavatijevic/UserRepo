package action.impl.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import constants.ViewConstants;
import domain.User;

public class UsersAddAction extends AbstractAction {

	@Override
	public String execute(HttpServletRequest request) {
		//lepo napisan ovaj deo koda
		User user = getUser(request);
		List<User> users = (List<User>) request.getServletContext().getAttribute("users");
		users.add(user);
		request.getServletContext().setAttribute("users", users);
		return ViewConstants.ADD_USER;
	}
	
	private User getUser(HttpServletRequest request) {
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username, password, name, lastname);
		return user;
	}
	
}
