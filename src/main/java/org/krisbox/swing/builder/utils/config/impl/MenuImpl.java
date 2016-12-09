
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.config.File;
import org.krisbox.swing.builder.utils.config.Help;
import org.krisbox.swing.builder.utils.config.Menu;
import org.krisbox.swing.builder.utils.config.View;

public class MenuImpl implements Menu {

    @SerializedName("File")
    @Expose
    private FileImpl file;
    @SerializedName("Edit")
    @Expose
    private EditImpl edit;
    @SerializedName("View")
    @Expose
    private ViewImpl view;
    @SerializedName("Help")
    @Expose
    private HelpImpl help;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MenuImpl() {
    }

    /**
     * 
     * @param help
     * @param file
     * @param edit
     * @param view
     */
    public MenuImpl(FileImpl file, EditImpl edit, ViewImpl view, HelpImpl help) {
        super();
        this.file = file;
        this.edit = edit;
        this.view = view;
        this.help = help;
    }

    /**
     * 
     * @return
     *     The file
     */
    public File getFile() {
        return file;
    }

    /**
     * 
     * @param file
     *     The File
     */
    public void setFile(FileImpl file) {
        this.file = file;
    }

    /**
     * 
     * @return
     *     The edit
     */
    public EditImpl getEdit() {
        return edit;
    }

    /**
     * 
     * @param edit
     *     The Edit
     */
    public void setEdit(EditImpl edit) {
        this.edit = edit;
    }

    /**
     * 
     * @return
     *     The view
     */
    public View getView() {
        return view;
    }

    /**
     * 
     * @param view
     *     The View
     */
    public void setView(ViewImpl view) {
        this.view = view;
    }

    /**
     * 
     * @return
     *     The help
     */
    public Help getHelp() {
        return help;
    }

    /**
     * 
     * @param help
     *     The Help
     */
    public void setHelp(HelpImpl help) {
        this.help = help;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(file).append(edit).append(view).append(help).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MenuImpl) == false) {
            return false;
        }
        MenuImpl rhs = ((MenuImpl) other);
        return new EqualsBuilder().append(file, rhs.file).append(edit, rhs.edit).append(view, rhs.view).append(help, rhs.help).isEquals();
    }

}
