package com.rifkiadam.gryus.greatingapps.Menu.unit1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rifkiadam.gryus.greatingapps.R;
import com.rifkiadam.gryus.greatingapps.SecondActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SingleImage extends AppCompatActivity {


    private static final int PICK_IMAGE_REQUEST = 1;
    Bitmap bitmap,bmp,bmpdefault,save;
    private ImageView imageView;
    private Button mSaveImageButton;
    private Button mWriteOnImage;
    private TextView mTextOnImage;
    private String userInputValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_image);
        init();
    }

    private void init(){
        int imId = this.getIntent().getExtras().getInt("posisi");
        imageView = (ImageView)findViewById(R.id.main_background);
        int image = ImageAdapter.mThumbsIds[imId];
        imageView.setImageResource(image);

        mSaveImageButton = (Button)findViewById(R.id.save_image);
        mWriteOnImage = (Button)findViewById(R.id.write_on_image);
        mTextOnImage = (TextView)findViewById(R.id.text_on_image);

        mWriteOnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayTextBox();
            }
        });

        mSaveImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = findViewById(R.id.main_background);
                BitmapDrawable bitmapDrawable = (BitmapDrawable)imageView.getDrawable();
                save = bitmapDrawable.getBitmap();
                FileOutputStream outStream = null;
                File sdCard = Environment.getExternalStorageDirectory();
                File dir = new File(sdCard.getAbsolutePath() + "/GreetingApps");
                dir.mkdirs();
                String fileName = String.format("image_edit.jpg", System.currentTimeMillis());
                File outFile = new File(dir, fileName);
                try {
                    outStream = new FileOutputStream(outFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                save.compress(Bitmap.CompressFormat.JPEG, 100, outStream);
                try {
                    outStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
                //intent.setData(Uri.fromFile(file));
                //sendBroadcast(intent);

                Toast.makeText(SingleImage.this, "Save Images Success ", Toast.LENGTH_LONG).show();


            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try{

            Bitmap bp=(Bitmap)data.getExtras().get("data");
            imageView.setImageBitmap(bp);
            // Membuat Default
            bmpdefault=bp;
        }catch (Exception e){

        }
        // Ini Untuk Choose Gambar
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data !=null && data.getData() != null){
            Uri uri=data.getData();
            try{

                bitmap=MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                imageView.setImageBitmap(bitmap);
                // Membuat Defualt
                bmpdefault=bitmap;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    private void Update(){
        BitmapDrawable bitmapDrawable=(BitmapDrawable)imageView.getDrawable();
        bitmap=bitmapDrawable.getBitmap();
        bmp=bitmap;
    }


    private void displayTextBox(){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.custom_dialog, null);
        dialogBuilder.setView(dialogView);
        final EditText textContent = (EditText) dialogView.findViewById(R.id.add_text_on_image);
        dialogBuilder.setTitle("Input Your Text");
        dialogBuilder.setMessage("");
        dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                userInputValue = textContent.getText().toString();
                if(!userInputValue.equals("") || !userInputValue.isEmpty()){
                    // assign the content to the TextView object
                    mTextOnImage.setText(userInputValue);
                }
            }
        });
        dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.dismiss();
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }


}
