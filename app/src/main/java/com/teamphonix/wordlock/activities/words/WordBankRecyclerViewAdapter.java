package com.teamphonix.wordlock.activities.words;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.teamphonix.wordlock.activities.words.placeholder.PlaceholderContent.PlaceholderItem;
import com.teamphonix.wordlock.databinding.ItemWordListBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class WordBankRecyclerViewAdapter extends RecyclerView.Adapter<WordBankRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public WordBankRecyclerViewAdapter(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(ItemWordListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mTvWord.setText(mValues.get(position).word);
        holder.mCheckBoxFavourite.setChecked( holder.mItem.isFavourite);
        holder.mCheckBoxFavourite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mTvWord;
        public final CheckBox mCheckBoxFavourite;
        public PlaceholderItem mItem;

        public ViewHolder(ItemWordListBinding binding) {
            super(binding.getRoot());
            mTvWord = binding.tvWord;
            mCheckBoxFavourite = binding.checkBoxFavourite;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mCheckBoxFavourite.getText() + "'";
        }
    }
}