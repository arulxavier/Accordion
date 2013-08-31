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

import javax.swing.ImageIcon;

public class AccordionLeafItem extends AccordionItem {

    /**
     * Default constructor.
     * @param text Title of menu item.
     */
    public AccordionLeafItem(String text) {
        super(text);
    }

    /**
     * Sets default mouse events. Show <code>HAND_CURSOR</code> when mouse is over.
     * Also shows an HIGHLIGHT on item only if <code>background</code> color of item
     * is different from parent <code>background</code>.
     * 
     * @return {@link MouseAdapter} object.
     */
    @Override
    public MouseAdapter getDefaultMouseActions() {
        return new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                setOpaque(false);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setOpaque(false);
                repaint();
            }
        };
    }

    /**
     * Creates a null item as background surface. It is allowed to return NULL objects here.
     * Null object is equal to transparent surface.
     * @return
     */
    @Override
    public Paint getDefaultBackgroundPaint() {
    	Color c1, c2;
    	c2 = new Color(214,224,232);
        return new GradientPaint(0, 0, c2, 0, getHeight(), c2);
    }
}
