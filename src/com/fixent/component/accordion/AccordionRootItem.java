/*
 *  Copyright 2010 Daniele.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.fixent.component.accordion;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccordionRootItem extends AccordionItem {

    private AccordionBranch branchPanel;

    /**
     * Simple constructor. Create a void JPanel, it will contains menu leafs.
     * @param text Title of menu.
     */
    public AccordionRootItem(String text) {
        super(text);
        this.branchPanel = new AccordionBranch();
    }

    /**
     * Sets default mouse events. Show <code>HAND_CURSOR</code> when mouse is over.
     * @return {@link MouseAdapter} object.
     */
    @Override
    public MouseAdapter getDefaultMouseActions() {
        return new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        };
    }

    /**
     * Creates a {@link GradientPaint} surface for background; 3D effect for menu item.
     * @return
     */
    @Override
    public Paint getDefaultBackgroundPaint() {
        Color c1, c2;
        if (isSelected()) {
//        	c2 = new Color(61, 86, 109);
        	c2 = new Color(240, 122, 66);
            c1 = new Color(204,0,0);
        } else {
//        	c2 = new Color(145, 160, 175);
        	c2 = new Color(240, 122, 66);
             c1 = new Color(153,204,255);
        }
        return new GradientPaint(0, 0, c2, 0, getHeight(), c2);
    }

    /**
     *
     * @return JPanel object that is leaf containter. It is used as an handle to
     * relative panel, rather than create it externally and bind them togheter.
     */
    public AccordionBranch getBranchPanel() {
        return branchPanel;
    }
}
