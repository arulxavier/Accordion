package com.fixent.component.accordion;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class LeftSidePanel 
extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	MenuClickEvent menuClickEvent;
	Map<String, String> rootMenu = new HashMap<String, String>();
	Map<String, Map<String, String>> subMenuMap = new HashMap<String, Map<String,String>>();

	public LeftSidePanel() {
		
		setName("Left Side Panel");
		setLayout(new BorderLayout());
	}
	
	public void setAccordion(MenuClickEvent menuClickEvent) {
		
//		menuClickEvent = new MenuClickEvent(this);
		
		AccordionView accordionView = new AccordionView();
		Accordion accordion = new Accordion(menuClickEvent, getRootMenu(), getSubMenuMap());
		accordionView.add(accordion);
		add(accordionView, BorderLayout.CENTER);
	}

	public Map<String, String> getRootMenu() {
		return rootMenu;
	}

	public void setRootMenu(Map<String, String> rootMenu) {
		this.rootMenu = rootMenu;
	}

	public Map<String, Map<String, String>> getSubMenuMap() {
		return subMenuMap;
	}

	public void setSubMenuMap(Map<String, Map<String, String>> subMenuMap) {
		this.subMenuMap = subMenuMap;
	}
	
	
}
