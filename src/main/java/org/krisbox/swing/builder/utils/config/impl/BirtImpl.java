
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.config.Birt;

public class BirtImpl implements Birt {

    @SerializedName("home")
    @Expose
    private String home;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BirtImpl() {
    }

    /**
     * 
     * @param home
     */
    public BirtImpl(String home) {
        super();
        this.home = home;
    }

    /**
     * 
     * @return
     *     The home
     */
    public String getHome() {
        return home;
    }

    /**
     * 
     * @param home
     *     The home
     */
    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(home).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Birt) == false) {
            return false;
        }
        BirtImpl rhs = ((BirtImpl) other);
        return new EqualsBuilder().append(home, rhs.home).isEquals();
    }

}
