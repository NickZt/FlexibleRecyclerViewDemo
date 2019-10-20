package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import ua.zt.mezon.graphomania.flexiblelistdemo.ui.main.flexiblerv.FlexibleBaseListAdapterCallback;
import ua.zt.mezon.graphomania.flexiblelistdemo.ui.main.flexiblerv.FlexibleListViewHolder;

/**
 * Created by NickZT on 13.10.2019.
 */
class FLItemObjViewHolderImpl<ItemObject> extends FlexibleListViewHolder<ItemObject> {
    private TextView mTitle;
    private TextView mSubtitle;

    public FLItemObjViewHolderImpl(@NonNull ViewGroup parent,
                                   FlexibleBaseListAdapterCallback callback) {
        this(inflateView(parent), callback);

    }

    public FLItemObjViewHolderImpl(View layoutView, FlexibleBaseListAdapterCallback callback) {
        super(layoutView, callback);
        mTitle = (TextView) itemView.findViewById(R.id.title);
        mSubtitle = (TextView) itemView.findViewById(R.id.title);
    }


    public static View inflateView(@NonNull ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(
                R.layout.grid_item, null);
    }

    @Override
    public void bind(@NonNull ItemObject entry) {

        mTitle.setText(((ua.zt.mezon.audiology.hearingtest.presentations.foreground.spokenfrag.ItemObject) entry).getTitle());
        mSubtitle.setText("0");
    }
}
