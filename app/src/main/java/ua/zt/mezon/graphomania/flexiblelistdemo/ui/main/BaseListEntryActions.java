package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main;

import androidx.annotation.NonNull;

public interface BaseListEntryActions {

    int UNDEFINED_VALUE = -1;

    /**
     * @return Returns the unique id of the media
     */
    long getId();

    /**
     * @return Returns the title of the media
     */
    @NonNull
    String getTitle();

}