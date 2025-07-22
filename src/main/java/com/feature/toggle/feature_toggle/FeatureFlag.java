package com.feature.toggle.feature_toggle;



public class FeatureFlag {

    boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "FeatureFlag{" +
                "enabled=" + enabled +
                '}';
    }
}
