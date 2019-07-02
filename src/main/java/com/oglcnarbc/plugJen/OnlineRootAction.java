package com.oglcnarbc.plugJen;

import hudson.Extension;
import hudson.model.RootAction;

import javax.annotation.CheckForNull;

@Extension
public class OnlineRootAction implements RootAction {
    @CheckForNull
    @Override
    public String getIconFileName() {
        return "clipboard.png";
    }

    @CheckForNull
    @Override
    public String getDisplayName() {
        return "oglcnarbc-plugg";
    }

    @CheckForNull
    @Override
    public String getUrlName() {
        return "https://www.linkedin.com/in/oglcnarbc/";
    }
}
