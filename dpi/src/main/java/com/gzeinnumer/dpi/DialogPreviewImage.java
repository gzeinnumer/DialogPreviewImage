package com.gzeinnumer.dpi;

import android.graphics.Bitmap;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DialogPreviewImage extends DialogPreviewImageSetting {

    public static final String TAG = "DialogPreviewImage";

    private final FragmentManager _context;
    private final FragmentTransaction _transaction;

    public DialogPreviewImage(FragmentManager context) {
        this._context = context;

        _transaction = _context.beginTransaction();
        Fragment previous = _context.findFragmentByTag(DialogPreviewImage.TAG);
        if (previous != null) {
            _transaction.remove(previous);
        }
    }

    public DialogPreviewImage setImage(String path) {
        this.path = path;
        return this;
    }

    public DialogPreviewImage setImage(Bitmap bitmap) {
        this.bitmap = bitmap;
        return this;
    }

    public DialogPreviewImage setContent(String content) {
        this.content = content;
        return this;
    }

    public DialogPreviewImage enableZoom() {
        this.enableZoom = true;
        return this;
    }

    public void show() {
        this.show(_transaction, DialogPreviewImage.TAG);
    }

    public void dismiss() {
        this.dismiss();
    }
}
