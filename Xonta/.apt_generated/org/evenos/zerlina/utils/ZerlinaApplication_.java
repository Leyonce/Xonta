//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.1.
//


package org.evenos.zerlina.utils;


public final class ZerlinaApplication_
    extends ZerlinaApplication
{

    private static ZerlinaApplication INSTANCE_;

    public static ZerlinaApplication getInstance() {
        return INSTANCE_;
    }

    /**
     * Visible for testing purposes
     * 
     */
    public static void setForTesting(ZerlinaApplication application) {
        INSTANCE_ = application;
    }

    @Override
    public void onCreate() {
        INSTANCE_ = this;
        init_();
        super.onCreate();
    }

    private void init_() {
    }

}
