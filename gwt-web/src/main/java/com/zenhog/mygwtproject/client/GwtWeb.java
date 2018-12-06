package com.zenhog.mygwtproject.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtWeb implements EntryPoint {
    public void onModuleLoad() {
        RootPanel root = RootPanel.get();
        Label theGreeting = new Label("Hello World!");
        root.add(theGreeting);
    }
}
