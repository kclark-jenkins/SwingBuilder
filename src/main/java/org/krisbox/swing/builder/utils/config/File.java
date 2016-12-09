package org.krisbox.swing.builder.utils.config;

import org.krisbox.swing.builder.utils.config.impl.FileChildrenImpl;

public interface File {
    int getKeyEvent();
    void setKeyEvent(String keyEvent);
    FileChildrenImpl getFileChildren();
    void setFileChildren(FileChildrenImpl fileChildren);
    String toString();
    int hashCode();
    boolean equals(Object other);
}
