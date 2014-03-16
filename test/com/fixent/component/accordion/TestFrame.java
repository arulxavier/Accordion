package com.fixent.component.accordion;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;

public class TestFrame 
extends JFrame{
	
	
	Map<String, String> rootMenu = new HashMap<String, String>();
	Map<String, Map<String, String>> subMenuMap = new HashMap<String, Map<String,String>>();
	Map<String, String> masterSubMenu = new HashMap<String, String>();
	Map<String, String> studentSubMenu = new HashMap<String, String>();
	
	public TestFrame() {
		
		rootMenu.put("1", "Publish");
		
		masterSubMenu.put("1", "Book");
		masterSubMenu.put("2", "Subscriber");
		masterSubMenu.put("3", "Delivery");
		masterSubMenu.put("4", "Notification");
		
		subMenuMap.put("Master", masterSubMenu);
		LeftSidePanel leftSidePanel = new LeftSidePanel();
		MenuClickEvent menuClickEvent = new MenuClickEvent(leftSidePanel);
		Accordion accordion = new Accordion(menuClickEvent, rootMenu, subMenuMap);
		add(accordion);
		setSize(200, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		TestFrame frame = new TestFrame();
	}

}
