package com.gzeinnumer.dpi;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gzeinnumer.edf.MyLibDialog;

public class DialogPreviewImageSetting extends MyLibDialog {

    protected String path = "";
    protected String content = "";
    protected Bitmap bitmap = null;
    protected int corner = R.drawable.dialog_preview_image;
    protected boolean enableZoom = false;

    public DialogPreviewImageSetting() {
    }

    public static DialogPreviewImageSetting newInstance() {
        return new DialogPreviewImageSetting();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (enableZoom) {
            return inflater.inflate(R.layout.dialog_preview_image_zoom, container, false);
        } else {
            return inflater.inflate(R.layout.dialog_preview_image, container, false);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!enableZoom)
            setCanvasWidth(0.95);
        else
            setCanvasWidth(1);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.img);
        TextView textView = view.findViewById(R.id.tv_desc);

        LinearLayout _dialogCanvas = view.findViewById(R.id.dialog_canvas_image_preview);
        _dialogCanvas.setBackground(requireActivity().getResources().getDrawable(corner));

        if (content.length() > 0) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(content);
        }

        if (path.length() > 0 && path != null) {
            Bitmap bmImg = BitmapFactory.decodeFile(path);
            imageView.setImageBitmap(bmImg);
        }

        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }

        if (enableZoom) {
            ImageView imgClose = view.findViewById(R.id.btn_close);
            imgClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getDialog().dismiss();
                }
            });
        }

        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    dialog.dismiss();
                }
                return true;
            }
        });
    }

}