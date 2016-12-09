
package org.krisbox.swing.builder.utils.config.impl;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.events.EventMapper;
import org.krisbox.swing.builder.utils.config.HelpChildren;

public class HelpChildrenImpl implements HelpChildren {

    @SerializedName("child")
    @Expose
    private List<String> child = null;
    @SerializedName("childKeyEvent")
    @Expose
    private List<String> childKeyEvent = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HelpChildrenImpl() {
    }

    /**
     * 
     * @param child
     * @param childKeyEvent
     */
    public HelpChildrenImpl(List<String> child, List<String> childKeyEvent) {
        super();
        this.child = child;
        this.childKeyEvent = childKeyEvent;
    }

    /**
     * 
     * @return
     *     The child
     */
    public List<String> getChild() {
        return child;
    }

    /**
     * 
     * @param child
     *     The child
     */
    public void setChild(List<String> child) {
        this.child = child;
    }

    /**
     * 
     * @return
     *     The childKeyEvent
     */
    public List<Integer> getChildKeyEvent() {
        List<Integer> mappedEvents = new ArrayList<Integer>();
        childKeyEvent.forEach((event->{
            mappedEvents.add(EventMapper.mapKeyEvent(event));
        }));

        return mappedEvents;
    }

    /**
     * 
     * @param childKeyEvent
     *     The childKeyEvent
     */
    public void setChildKeyEvent(List<String> childKeyEvent) {
        this.childKeyEvent = childKeyEvent;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(child).append(childKeyEvent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HelpChildren) == false) {
            return false;
        }
        HelpChildrenImpl rhs = ((HelpChildrenImpl) other);
        return new EqualsBuilder().append(child, rhs.child).append(childKeyEvent, rhs.childKeyEvent).isEquals();
    }

}
