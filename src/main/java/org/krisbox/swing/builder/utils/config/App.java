package org.krisbox.swing.builder.utils.config;

public interface App {
    String getTitle();
    void setTitle(String title);
    Integer getHeight();
    void setHeight(Integer height);
    Integer getWidth();
    void setWidth(Integer width);
    Boolean getVisible();
    void setVisible(Boolean visible);
    String toString();
    int hashCode();
    boolean equals(Object other);
}
