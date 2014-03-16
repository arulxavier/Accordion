package com.fixent.component.accordion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public final class Accordion 
extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AccordionMenu accordionMenu;
    
    MenuClickEvent menuClickEvent;
    Map<String, String> rootMenu = new HashMap<String, String>();
	Map<String, Map<String, String>> subMenuMap = new HashMap<String, Map<String,String>>();

    public Accordion(MenuClickEvent menuClickEvent, 
    				 Map<String, String> rootMenu, 
    				 Map<String, Map<String, String>> subMenuMap) {
    	
    	this.rootMenu = rootMenu;
    	this.subMenuMap = subMenuMap;
    	
    	try {

    		this.menuClickEvent = menuClickEvent;
            initComponents();
            setSize(200, 450);

            accordionMenu = new AccordionMenu();
            createSampleMenuStructure(accordionMenu);
            accordionMenu.setBackground(Color.white);
            accordionMenu.setForeground(new Color(255,255,255));
            accordionMenu.setFont(new Font("monospaced", Font.PLAIN, 17));
            accordionMenu.setMenusSize(38);
            accordionMenu.setMenuBorders(new javax.swing.border.LineBorder(Color.WHITE, 1, true));
            setMouseAdapter(accordionMenu);
            cont2.add(accordionMenu);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void createSampleMenuStructure(AccordionMenu target) {
    	
    	for (int i = 1; i <= getRootMenu().size(); i++) {
    		
    		String rootKey = "menu"+i;
    		String rootValue = getRootMenu().get(i+"");
    		target.addNewMenu(rootKey, rootValue);
    		Map<String, String> subMenus = getSubMenuMap().get(rootValue);
    		for (int j = 1; j <= subMenus.size(); j++) {
				
    			String subKey = "submenu1."+j;
    			String subValue = subMenus.get(j+"");
    			target.addNewLeafTo(rootKey, subKey, subValue);
			}
			
		}
        target.calculateAvaiableSpace();
    }

    public void setMouseAdapter(AccordionMenu menu) {
        for (AccordionLeafItem leaf : menu.getAllLeafs()) {
            leaf.addMouseListener(this.menuClickEvent);
        }
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        cont2 = new JPanel();

        setBackground(Color.white);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new GridLayout(1, 3, 30, 0));


        cont2.setBackground(Color.white);
        cont2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
        cont2.setLayout(new BoxLayout(cont2, BoxLayout.LINE_AXIS));
        jPanel1.add(cont2);

        setLayout(new BorderLayout());
        add(jPanel1);
    }

    private JPanel cont2;
    private JPanel jPanel1;

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
