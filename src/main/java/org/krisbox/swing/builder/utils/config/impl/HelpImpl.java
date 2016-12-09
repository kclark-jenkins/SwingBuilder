
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.events.EventMapper;
import org.krisbox.swing.builder.utils.config.Help;

public class HelpImpl implements Help {

    @SerializedName("KeyEvent")
    @Expose
    private String keyEvent;
    @SerializedName("HelpChildren")
    @Expose
    private HelpChildrenImpl helpChildren;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HelpImpl() {
    }

    /**
     * 
     * @param keyEvent
     * @param helpChildren
     */
    public HelpImpl(String keyEvent, HelpChildrenImpl helpChildren) {
        super();
        this.keyEvent = keyEvent;
        this.helpChildren = helpChildren;
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
     *     The helpChildren
     */
    public HelpChildrenImpl getHelpChildren() {
        return helpChildren;
    }

    /**
     * 
     * @param helpChildren
     *     The HelpChildren
     */
    public void setHelpChildren(HelpChildrenImpl helpChildren) {
        this.helpChildren = helpChildren;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyEvent).append(helpChildren).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Help) == false) {
            return false;
        }
        HelpImpl rhs = ((HelpImpl) other);
        return new EqualsBuilder().append(keyEvent, rhs.keyEvent).append(helpChildren, rhs.helpChildren).isEquals();
    }

}
