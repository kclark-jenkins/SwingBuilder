
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.events.EventMapper;
import org.krisbox.swing.builder.utils.config.File;

public class FileImpl implements File {

    @SerializedName("KeyEvent")
    @Expose
    private String keyEvent;
    @SerializedName("FileChildren")
    @Expose
    private FileChildrenImpl fileChildren;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FileImpl() {
    }

    /**
     * 
     * @param keyEvent
     * @param fileChildren
     */
    public FileImpl(String keyEvent, FileChildrenImpl fileChildren) {
        super();
        this.keyEvent = keyEvent;
        this.fileChildren = fileChildren;
    }

    /**
     * 
     * @return
     *     The keyEvent
     */
    public int getKeyEvent() {
        return EventMapper.mapKeyEvent(keyEvent);
    }

    /**
     * 
     * @param keyEvent
     *     The KeyEvent
     */
    public void setKeyEvent(String keyEvent) {
        this.keyEvent = keyEvent;
    }

    /**
     * 
     * @return
     *     The fileChildren
     */
    public FileChildrenImpl getFileChildren() {
        return fileChildren;
    }

    /**
     * 
     * @param fileChildren
     *     The FileChildren
     */
    public void setFileChildren(FileChildrenImpl fileChildren) {
        this.fileChildren = fileChildren;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyEvent).append(fileChildren).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FileImpl) == false) {
            return false;
        }
        FileImpl rhs = ((FileImpl) other);
        return new EqualsBuilder().append(keyEvent, rhs.keyEvent).append(fileChildren, rhs.fileChildren).isEquals();
    }

}
