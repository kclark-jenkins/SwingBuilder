package org.krisbox.swing.builder.utils.config;

import org.krisbox.swing.builder.utils.config.impl.AppImpl;
import org.krisbox.swing.builder.utils.config.impl.BirtImpl;
import org.krisbox.swing.builder.utils.config.impl.MenuImpl;

public interface AppConfig {
    AppImpl getApp();
    void setApp(AppImpl app);
    MenuImpl getMenu();
    void setMenu(MenuImpl menu);
    BirtImpl getBirt();
    void      setBirt(BirtImpl birt);
    String toString();
    int hashCode();
    boolean equals(Object other);
}
