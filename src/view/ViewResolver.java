package view;

import java.util.HashMap;
import java.util.Map;

import constants.PageConstants;
import constants.ViewConstants;

public class ViewResolver {
	private Map<String, String> pages;

	public ViewResolver() {
		pages=new HashMap<String, String>(){
			{
				put(ViewConstants.INDEX, PageConstants.PAGE_INDEX);
				put(ViewConstants.LOGIN, PageConstants.PAGE_LOGIN);
				put(ViewConstants.ALL_USERS, PageConstants.PAGE_ALL_USERS);
				put(ViewConstants.ADD_USER, PageConstants.PAGE_ADD_USER);
			}
		};
	}
	
	public String getPage(String view) {
		if(pages.containsKey(view))
			return pages.get(view);
		return null;
	}
}
