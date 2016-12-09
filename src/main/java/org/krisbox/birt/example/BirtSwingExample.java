package org.krisbox.birt.example;

import org.krisbox.swing.builder.impl.SwingBuilderImpl;

import javax.swing.*;

public class BirtSwingExample {
    JFrame birtSwingExample;

    public BirtSwingExample() {
        birtSwingExample = new SwingBuilderImpl().buildSwing();
    }

    public static void main(String[] args) {
        new BirtSwingExample();
    }
}
