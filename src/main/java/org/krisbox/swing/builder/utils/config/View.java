package org.krisbox.swing.builder.utils.config;

import org.krisbox.swing.builder.utils.config.impl.ViewChildrenImpl;

public interface View {
    int getKeyEvent();
    void setKeyEvent(String keyEvent);
    ViewChildrenImpl getViewChildren();
    void setViewChildren(ViewChildrenImpl viewChildren);
    String toString();
    int hashCode();
    boolean equals(Object other);
}
