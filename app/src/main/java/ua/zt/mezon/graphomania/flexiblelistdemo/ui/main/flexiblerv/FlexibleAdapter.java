package ua.zt.mezon.graphomania.flexiblelistdemo.ui.main.flexiblerv;

import android.content.Context;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by NickZT on 12.10.2019.
 */
public class FlexibleAdapter extends RecyclerView.Adapter<FlexibleListViewHolder> {
    private List<Object> mItemList = new ArrayList<>();
    private Context context;
    private IFlexibleAdapterFactory mAdapterFactory;
    private FlexibleBaseListAdapterCallback mAdapterCallback;

    public FlexibleAdapter(Context context,
                           IFlexibleAdapterFactory factory,
                           FlexibleBaseListAdapterCallback callback) {
        this.mAdapterFactory = factory;
        this.context = context;
        this.mAdapterCallback = callback;
    }

    public List<Object> getItemList() {
        return mItemList;
    }

    public void setItemList(List<Object> itemList) {
        mItemList = itemList;
    }

    public void addAllItem(List<Object> itemList) {
        mItemList.addAll(itemList);
    }

    public void clear() {
        mItemList.clear();
    }

    @Override
    public FlexibleListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return (FlexibleListViewHolder) mAdapterFactory.newInstance(parent, viewType, mAdapterCallback);

    }

    @Override
    public void onBindViewHolder(@NonNull FlexibleListViewHolder holder, int position) {
        holder.bind(mItemList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mAdapterFactory.getItemViewType(mItemList.get(position));
    }

    @Override
    public int getItemCount() {
        return this.mItemList.size();
    }

    public void add(Object itemObject) {
        mItemList.add(itemObject);
    }

    public Object get(int position) {
        return mItemList.get(position);
    }
}
