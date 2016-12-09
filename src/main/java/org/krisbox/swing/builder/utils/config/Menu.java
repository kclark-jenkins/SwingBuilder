package org.krisbox.swing.builder.utils.config;

import org.krisbox.swing.builder.utils.config.impl.EditImpl;
import org.krisbox.swing.builder.utils.config.impl.FileImpl;
import org.krisbox.swing.builder.utils.config.impl.HelpImpl;
import org.krisbox.swing.builder.utils.config.impl.ViewImpl;

public interface Menu {
    File getFile();
    void setFile(FileImpl file);
    Edit getEdit();
    void setEdit(EditImpl edit);
    View getView();
    void setView(ViewImpl view);
    Help getHelp();
    void setHelp(HelpImpl help);
    String toString();
    int hashCode();
    boolean equals(Object other);

}
