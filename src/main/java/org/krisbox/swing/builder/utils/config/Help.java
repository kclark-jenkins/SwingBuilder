package org.krisbox.swing.builder.utils.config;

import org.krisbox.swing.builder.utils.config.impl.HelpChildrenImpl;

public interface Help {
    int getKeyEvent();
    void setKeyEvent(String keyEvent);
    HelpChildrenImpl getHelpChildren();
    void setHelpChildren(HelpChildrenImpl helpChildren);
    String toString();
    int hashCode();
    boolean equals(Object other);
}
