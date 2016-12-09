package org.krisbox.swing.builder.utils.config;

import java.util.List;

public interface EditChildren {
    List<String> getChild();
    void setChild(List<String> child);
    List<Integer> getChildKeyEvent();
    void setChildKeyEvent(List<String> childKeyEvent);
    String toString();
    int hashCode();
    boolean equals(Object other);
}
