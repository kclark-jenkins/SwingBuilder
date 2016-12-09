
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.events.EventMapper;
import org.krisbox.swing.builder.utils.config.Edit;
import org.krisbox.swing.builder.utils.config.EditChildren;

public class EditImpl implements Edit {

    @SerializedName("KeyEvent")
    @Expose
    private String keyEvent;
    @SerializedName("EditChildren")
    @Expose
    private EditChildrenImpl editChildren;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EditImpl() {
    }

    /**
     * 
     * @param keyEvent
     * @param editChildren
     */
    public EditImpl(String keyEvent, EditChildrenImpl editChildren) {
        super();
        this.keyEvent = keyEvent;
        this.editChildren = editChildren;
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
     *     The editChildren
     */
    public EditChildren getEditChildren() {
        return editChildren;
    }

    /**
     * 
     * @param editChildren
     *     The EditChildren
     */
    public void setEditChildren(EditChildrenImpl editChildren) {
        this.editChildren = editChildren;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyEvent).append(editChildren).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Edit) == false) {
            return false;
        }
        EditImpl rhs = ((EditImpl) other);
        return new EqualsBuilder().append(keyEvent, rhs.keyEvent).append(editChildren, rhs.editChildren).isEquals();
    }

}
