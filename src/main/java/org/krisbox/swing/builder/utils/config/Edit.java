package org.krisbox.swing.builder.utils.config;

import org.krisbox.swing.builder.utils.config.impl.EditChildrenImpl;

public interface Edit {
    int getKeyEvent();
    void setKeyEvent(String keyEvent);
    EditChildren getEditChildren();
    void setEditChildren(EditChildrenImpl editChildren);
    String toString();
    int hashCode();
    boolean equals(Object other);
}
