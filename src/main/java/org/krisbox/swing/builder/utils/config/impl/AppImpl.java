
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.config.App;

public class AppImpl implements App {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("visible")
    @Expose
    private Boolean visible;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppImpl() {
    }

    /**
     * 
     * @param title
     * @param height
     * @param visible
     * @param width
     */
    public AppImpl(String title, Integer height, Integer width, Boolean visible) {
        super();
        this.title = title;
        this.height = height;
        this.width = width;
        this.visible = visible;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The visible
     */
    public Boolean getVisible() {
        return visible;
    }

    /**
     * 
     * @param visible
     *     The visible
     */
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(title).append(height).append(width).append(visible).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppImpl) == false) {
            return false;
        }
        AppImpl rhs = ((AppImpl) other);
        return new EqualsBuilder().append(title, rhs.title).append(height, rhs.height).append(width, rhs.width).append(visible, rhs.visible).isEquals();
    }

}
