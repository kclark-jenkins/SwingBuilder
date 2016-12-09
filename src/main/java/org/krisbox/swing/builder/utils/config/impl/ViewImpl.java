
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.events.EventMapper;
import org.krisbox.swing.builder.utils.config.View;

public class ViewImpl implements View {

    @SerializedName("KeyEvent")
    @Expose
    private String keyEvent;
    @SerializedName("ViewChildren")
    @Expose
    private ViewChildrenImpl viewChildren;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ViewImpl() {
    }

    /**
     * 
     * @param keyEvent
     * @param viewChildren
     */
    public ViewImpl(String keyEvent, ViewChildrenImpl viewChildren) {
        super();
        this.keyEvent = keyEvent;
        this.viewChildren = viewChildren;
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
     *     The viewChildren
     */
    public ViewChildrenImpl getViewChildren() {
        return viewChildren;
    }

    /**
     * 
     * @param viewChildren
     *     The ViewChildren
     */
    public void setViewChildren(ViewChildrenImpl viewChildren) {
        this.viewChildren = viewChildren;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyEvent).append(viewChildren).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof View) == false) {
            return false;
        }
        ViewImpl rhs = ((ViewImpl) other);
        return new EqualsBuilder().append(keyEvent, rhs.keyEvent).append(viewChildren, rhs.viewChildren).isEquals();
    }

}
