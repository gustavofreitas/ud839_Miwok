package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColor;
    private MediaPlayer mMediaPlayer;

    public WordAdapter(Context context, List<Word> words, int backgroundColor) {
        super(context, 0, words);
        this.mBackgroundColor = backgroundColor;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        View textContainer = listItemView.findViewById(R.id.text_view_container);

        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        textContainer.setBackgroundColor(color);

        final Word word = getItem(position);

        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTranslationTextView.setText(word.getDefaultTranslation());

        TextView miwokTranlationTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTranlationTextView.setText(word.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (word.hasImage()) {
            imageView.setImageResource(word.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;

    }


}
