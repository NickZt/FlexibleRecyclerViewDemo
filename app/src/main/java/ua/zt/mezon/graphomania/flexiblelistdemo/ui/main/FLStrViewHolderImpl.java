package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import ua.zt.mezon.audiology.hearingtest.presentations.widgets.flexiblerv.FlexibleBaseListAdapterCallback;
import ua.zt.mezon.audiology.hearingtest.presentations.widgets.flexiblerv.FlexibleListViewHolder;

/**
 * Created by NickZT on 13.10.2019.
 */
class FLStrViewHolderImpl<String> extends FlexibleListViewHolder<String> {
    private TextView mTitle;

    public FLStrViewHolderImpl(@NonNull ViewGroup parent,
                               FlexibleBaseListAdapterCallback callback) {
        this(inflateView(parent), callback);

    }

    public FLStrViewHolderImpl(View layoutView, FlexibleBaseListAdapterCallback callback) {
        super(layoutView, callback);
        mTitle = (TextView) itemView.findViewById(R.id.title);
    }


    public static View inflateView(@NonNull ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(
                R.layout.word_grid_item, null);
    }

    @Override
    public void bind(@NonNull String entry) {
        mTitle.setText((java.lang.String) entry);
    }
}
