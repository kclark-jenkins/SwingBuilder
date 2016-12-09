package org.krisbox.swing.builder;

import javax.swing.*;

public interface SwingBuilder {
    JFrame buildSwing();
    JFrame buildSwing(String propertiesFile);
}
