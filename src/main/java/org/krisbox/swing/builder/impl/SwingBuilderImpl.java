package org.krisbox.swing.builder.impl;

import org.apache.log4j.Logger;
import org.krisbox.swing.builder.SwingBuilder;
import org.krisbox.swing.builder.utils.properties.AppProperties;
import org.krisbox.swing.builder.utils.properties.impl.AppPropertiesImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

import static org.krisbox.swing.builder.impl.SwingBuilderImpl.MENU_ROOT_ITEMS.*;

public class SwingBuilderImpl extends AppPropertiesImpl implements SwingBuilder {
    private Logger LOGGER;
    private String propertiesFile;
    private AppProperties appProperties;

    public SwingBuilderImpl() {
        super("/config.json");
        LOGGER = Logger.getLogger(SwingBuilderImpl.class);
    }

    public SwingBuilderImpl(String propertiesFile) {
        super(propertiesFile);
        LOGGER = Logger.getLogger(SwingBuilderImpl.class);
    }

    public JFrame buildSwing() {
        try {
            return createGUI();
        }catch(Exception ex){
            LOGGER.fatal(ex);
        }

        return null;
    }

    public JFrame buildSwing(String propertiesFile) {
        try {
            reloadAppConfig();
            return createGUI();
        }catch(Exception ex){
            LOGGER.fatal(ex);
        }

        return null;
    }

    private JFrame createGUI() {
        JFrame frame = new JFrame(getAppConfig().getApp().getTitle());

        frame.setSize(getAppConfig().getApp().getHeight(), getAppConfig().getApp().getWidth());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon("exit.png");

        menubar.add(createMenu(FILE));
        menubar.add(createMenu(EDIT));
        menubar.add(createMenu(VIEW));
        menubar.add(createMenu(HELP));

        frame.setJMenuBar(menubar);

        frame.pack();
        frame.setVisible(getAppConfig().getApp().getVisible());

        return frame;
    }

    private JMenu createMenu(MENU_ROOT_ITEMS rootItem){
        switch(rootItem){
            case FILE:
                JMenu newFileItem = new JMenu("File");
                newFileItem.setMnemonic(getAppConfig().getMenu().getFile().getKeyEvent());

                final int[] counter = {0};
                List<Integer> childEvents0 = getAppConfig().getMenu().getFile().getFileChildren().getChildKeyEvent();

                getAppConfig().getMenu().getFile().getFileChildren().getChild().forEach((child->{
                    JMenuItem eMenuItem = new JMenuItem(child);

                    eMenuItem.setMnemonic(childEvents0.get(counter[0]));
                    eMenuItem.addActionListener((ActionEvent event) -> {
                        LOGGER.info(child + " event occured");
                        System.exit(0);
                    });
                    newFileItem.add(eMenuItem);
                }));
                return newFileItem;
            case EDIT:
                JMenu newEditItem = new JMenu("Edit");
                newEditItem.setMnemonic(getAppConfig().getMenu().getEdit().getKeyEvent());

                final int[] counter1 = {0};
                List<Integer> childEvents1 = getAppConfig().getMenu().getEdit().getEditChildren().getChildKeyEvent();

                getAppConfig().getMenu().getEdit().getEditChildren().getChild().forEach((child->{
                    JMenuItem eMenuItem = new JMenuItem(child);

                    eMenuItem.setMnemonic(childEvents1.get(counter1[0]));
                    eMenuItem.addActionListener((ActionEvent event) -> {
                        LOGGER.info(child + " event occured");
                        System.exit(0);
                    });
                    newEditItem.add(eMenuItem);
                }));
                return newEditItem;
            case VIEW:
                JMenu newViewItem = new JMenu("View");
                newViewItem.setMnemonic(getAppConfig().getMenu().getView().getKeyEvent());

                final int[] counter2 = {0};
                List<Integer> childEvents2 = getAppConfig().getMenu().getView().getViewChildren().getChildKeyEvent();

                getAppConfig().getMenu().getView().getViewChildren().getChild().forEach((child->{
                    JMenuItem eMenuItem = new JMenuItem(child);

                    eMenuItem.setMnemonic(childEvents2.get(counter2[0]));
                    eMenuItem.addActionListener((ActionEvent event) -> {
                        LOGGER.info(child + " event occured");
                        System.exit(0);
                    });
                    newViewItem.add(eMenuItem);
                }));
                return newViewItem;
            case HELP:
                JMenu newHelpItem = new JMenu("Help");
                newHelpItem.setMnemonic(getAppConfig().getMenu().getHelp().getKeyEvent());

                final int[] counter3 = {0};
                List<Integer> childEvents3 = getAppConfig().getMenu().getHelp().getHelpChildren().getChildKeyEvent();

                getAppConfig().getMenu().getHelp().getHelpChildren().getChild().forEach((child->{
                    JMenuItem eMenuItem = new JMenuItem(child);

                    eMenuItem.setMnemonic(childEvents3.get(counter3[0]));
                    eMenuItem.addActionListener((ActionEvent event) -> {
                        LOGGER.info(child + " event occured");
                        System.exit(0);
                    });
                    newHelpItem.add(eMenuItem);
                }));
                return newHelpItem;
        }

        return null;
    }

    protected enum MENU_ROOT_ITEMS {
        FILE, EDIT, VIEW, HELP
    }
}