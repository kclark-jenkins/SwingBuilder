
package org.krisbox.swing.builder.utils.config.impl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.krisbox.swing.builder.utils.config.AppConfig;

public class AppConfigImpl implements AppConfig {

    @SerializedName("app")
    @Expose
    private AppImpl app;
    @SerializedName("menu")
    @Expose
    private MenuImpl menu;
    @SerializedName("birt")
    @Expose
    private BirtImpl birt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AppConfigImpl() {
    }

    /**
     * 
     * @param app
     * @param birt
     * @param menu
     */
    public AppConfigImpl(AppImpl app, MenuImpl menu, BirtImpl birt) {
        super();
        this.app = app;
        this.menu = menu;
        this.birt = birt;
    }

    /**
     * 
     * @return
     *     The app
     */
    public AppImpl getApp() {
        return app;
    }

    /**
     * 
     * @param app
     *     The app
     */
    public void setApp(AppImpl app) {
        this.app = app;
    }

    /**
     * 
     * @return
     *     The menu
     */
    public MenuImpl getMenu() {
        return menu;
    }

    /**
     * 
     * @param menu
     *     The menu
     */
    public void setMenu(MenuImpl menu) {
        this.menu = menu;
    }

    /**
     * 
     * @return
     *     The birt
     */
    public BirtImpl getBirt() {
        return birt;
    }

    /**
     * 
     * @param birt
     *     The birt
     */
    public void setBirt(BirtImpl birt) {
        this.birt = birt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(app).append(menu).append(birt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppConfig) == false) {
            return false;
        }
        AppConfigImpl rhs = ((AppConfigImpl) other);
        return new EqualsBuilder().append(app, rhs.app).append(menu, rhs.menu).append(birt, rhs.birt).isEquals();
    }

}
