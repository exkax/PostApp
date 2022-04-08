package kg.geektech.postapp.ui.posts;

import android.app.AlertDialog;

import kg.geektech.postapp.data.models.Post;

public interface OnClick {
    void onClick(Post post);
    AlertDialog onLongClick(Post post);
}
