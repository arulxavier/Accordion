package com.fixent.component.accordion;

import java.awt.event.MouseAdapter;

public class MenuClickEvent 
extends MouseAdapter {

	LeftSidePanel leftSidePanel;
	 public MenuClickEvent(LeftSidePanel leftSidePanel) {
		this.leftSidePanel = leftSidePanel;
	}

//	@Override
//     public void mousePressed(MouseEvent e) {
//
//     	System.out.println("Clicked"); 
//     	AccordionItem item = (AccordionItem) e.getSource();
//        
//        System.out.println("Source name: " + item.getName() + "; Source Title: " + item.getText());
//     	
//     	for (Component component2 : leftSidePanel.getParent().getComponents()) {
//			
//			if (component2 instanceof JScrollPane) {
//				
//				for (Component component : ((JScrollPane) component2).getComponents()) {
//					
//					if (component instanceof JViewport) {
//						
//						/*RightSidePanel rightSidePanel = (RightSidePanel)((JViewport) component).getComponents()[0];
//						rightSidePanel.removeAll();
//						if (item.getText().equalsIgnoreCase("Base Info")) {
//							rightSidePanel.add(new StudentDashboardController().view,BorderLayout.CENTER);
//						} else {
//							
//						}
//						rightSidePanel.repaint();*/
//					}
//				}
//				
//			}
//		}
//         
//     }
}
