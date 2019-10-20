package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main.flexiblerv;

/**
 * Created by NickZT on 13.10.2019.
 */
public interface FlexibleBaseListAdapterCallback {
    void onBaseEntryClicked(int position);

    void onMoreActionsClicked(int position);

    void onSpecialKeyClicked(int position);
}