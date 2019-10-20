package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main.flexiblerv;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * IFlexibleAdapterFactory.ViewHolder
 */

public abstract class FlexibleListViewHolder<E> extends RecyclerView.ViewHolder {
    private final FlexibleBaseListAdapterCallback mCallback;


    public FlexibleListViewHolder(@NonNull View itemView,
                                  FlexibleBaseListAdapterCallback callback) {
        super(itemView);
        mCallback = callback;
        itemView.setOnClickListener(view -> {
            if (null != getCallback()) {
                getCallback().onBaseEntryClicked(getAdapterPosition());
            }
        });
    }


    protected FlexibleBaseListAdapterCallback getCallback() {
        return mCallback;
    }


    public abstract void bind(@NonNull E entry);

}
