package hello;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by huimin on 3/31/16.
 */
public class Server {

    @Id
    private String id;

    private String objectId;
    private ResourceInfo shortId;
    private ResourceInfo lifetime; // = 86400;
    private ResourceInfo defaultMinPeriod; // = 1;
    private ResourceInfo defaultMaxPeriod; // = null;
    private ResourceInfo disable; // = null;
    private ResourceInfo disableTimeout; // = 86400;
    private ResourceInfo notificationStoringWhenDiabledOrOffiline; // = true;
    private ResourceInfo binding; // = "U";
    private ResourceInfo registrationUpdateTrigger; // = null;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = "1";
    }

    public ResourceInfo getShortId() {
        return shortId;
    }

    public void setShortId(ResourceInfo shortId) {
        shortId.setResourceId("0");
        shortId.setResourceName("Short Server ID");
        this.shortId = shortId;
    }

    public ResourceInfo getLifetime() {
        return lifetime;
    }

    public void setLifetime(ResourceInfo lifetime) {
        lifetime.setResourceId("1");
        lifetime.setResourceName("Lifetime");
        this.lifetime = lifetime;
    }

    public ResourceInfo getDefaultMinPeriod() {
        return defaultMinPeriod;
    }

    public void setDefaultMinPeriod(ResourceInfo defaultMinPeriod) {
        defaultMinPeriod.setResourceId("2");
        defaultMinPeriod.setResourceName("Default Minimum Period");
        this.defaultMinPeriod = defaultMinPeriod;
    }

    public ResourceInfo getDefaultMaxPeriod() {
        return defaultMaxPeriod;
    }

    public void setDefaultMaxPeriod(ResourceInfo defaultMaxPeriod) {
        defaultMaxPeriod.setResourceId("3");
        defaultMaxPeriod.setResourceName("Default Maximum Period");
        this.defaultMaxPeriod = defaultMaxPeriod;
    }

    public ResourceInfo getDisable() {
        return disable;
    }

    public void setDisable(ResourceInfo disable) {
        disable.setResourceId("4");
        disable.setResourceName("Disable");
        this.disable = disable;
    }

    public ResourceInfo getDisableTimeout() {
        return disableTimeout;
    }

    public void setDisableTimeout(ResourceInfo disableTimeout) {
        disableTimeout.setResourceId("5");
        disableTimeout.setResourceName("Disable Timeout");
        this.disableTimeout = disableTimeout;
    }

    public ResourceInfo getNotificationStoringWhenDiabledOrOffiline() {
        return notificationStoringWhenDiabledOrOffiline;
    }

    public void setNotificationStoringWhenDiabledOrOffiline(ResourceInfo notificationStoringWhenDiabledOrOffiline) {
        notificationStoringWhenDiabledOrOffiline.setResourceId("6");
        notificationStoringWhenDiabledOrOffiline.setResourceName("Notification Storing When Disabled or Offline");
        this.notificationStoringWhenDiabledOrOffiline = notificationStoringWhenDiabledOrOffiline;
    }

    public ResourceInfo getBinding() {
        return binding;
    }

    public void setBinding(ResourceInfo binding) {
        binding.setResourceId("7");
        binding.setResourceName("Binding");
        this.binding = binding;
    }

    public ResourceInfo getRegistrationUpdateTrigger() {
        return registrationUpdateTrigger;
    }

    public void setRegistrationUpdateTrigger(ResourceInfo registrationUpdateTrigger) {
        registrationUpdateTrigger.setResourceId("8");
        registrationUpdateTrigger.setResourceName("Registration Update Trigger");
        this.registrationUpdateTrigger = registrationUpdateTrigger;
    }
}
