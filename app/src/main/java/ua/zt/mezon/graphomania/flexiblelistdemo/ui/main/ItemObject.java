package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main;

import androidx.annotation.NonNull;
import ua.zt.mezon.audiology.hearingtest.presentations.base.BaseListEntryActions;

/**
 * Created by NickZT on 12.10.2019.
 */
public class ItemObject implements
        BaseListEntryActions {
    long mId = 0;
    private String mTitle;
    private String mSubtitle;


    public ItemObject(String tmp) {
        mTitle = tmp;
    }


    @Override
    public long getId() {
        return mId;
    }

    @NonNull
    @Override
    public String getTitle() {
        return mTitle;
    }

}