package controller;

import javax.servlet.http.HttpServletRequest;

import action.AbstractAction;
import action.factory.ActionFactory;
import constants.ViewConstants;

public class ApplicationController {

	public String processRequest(String pathInfo, HttpServletRequest request) {
		String view = ViewConstants.LOGIN;
		AbstractAction action = ActionFactory.createActionFactory(pathInfo);
		if (action != null)
			view = action.execute(request);
		return view;
	}

}

