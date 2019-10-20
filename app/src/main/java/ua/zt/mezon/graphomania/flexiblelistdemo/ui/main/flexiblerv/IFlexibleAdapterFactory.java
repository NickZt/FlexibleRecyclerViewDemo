package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main.flexiblerv;

import android.view.ViewGroup;

/**
 * Created by NickZT on 13.10.2019.
 */
public abstract class IFlexibleAdapterFactory {
    public abstract FlexibleListViewHolder newInstance(ViewGroup parent, int viewType,
                                                       FlexibleBaseListAdapterCallback callback);

    public abstract int getItemViewType(Object o);

}
