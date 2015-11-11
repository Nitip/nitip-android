package com.bananastech.nitip.activities.seller;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bananastech.nitip.R;
import com.bananastech.nitip.fragments.picker.DatePickerFragment;
import com.bananastech.nitip.models.ItemModel;
import com.bananastech.nitip.models.TripModel;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import cz.msebera.android.httpclient.Header;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class SellerCreateTripActivity extends AppCompatActivity {

    @Bind(R.id.activity_seller_create_topic_toolbar)
    Toolbar toolbar;

    @Bind(R.id.activity_seller_create_trip_et_origin)
    EditText et_origin;

    @Bind(R.id.activity_seller_create_trip_et_destination)
    EditText et_destination;

    @Bind(R.id.activity_seller_create_trip_et_from_date)
    EditText editTextFromDate;

    @Bind(R.id.activity_seller_create_trip_et_to_date)
    EditText editTextToDate;

    @OnClick(R.id.activity_seller_create_trip_btn_submit)
    public void Submit() {
        Toast.makeText(SellerCreateTripActivity.this, "Thank your for your share of information. Hopefully you can help other people :)", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 2000);
    }

    @OnFocusChange(R.id.activity_seller_create_trip_et_from_date)
    public void onFocusChangeFrom(boolean hasFocus) {
        DialogFragment dialogFragment =
                new DatePickerFragment() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        super.onDateSet(view, year, monthOfYear, dayOfMonth);
                        editTextFromDate.setText(String.valueOf(dayOfMonth) + "-" + String.valueOf(monthOfYear) + "-" + String.valueOf(year));
                    }
                };
        dialogFragment.show(getSupportFragmentManager(), "datepicker");
    }

    @OnFocusChange(R.id.activity_seller_create_trip_et_to_date)
    public void onFocusChangeTo(boolean hasFocus) {
        DialogFragment dialogFragment =
                new DatePickerFragment() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        super.onDateSet(view, year, monthOfYear, dayOfMonth);
                        editTextToDate.setText(String.valueOf(dayOfMonth) + "-" + String.valueOf(monthOfYear) + "-" + String.valueOf(year));
                    }
                };
        dialogFragment.show(getSupportFragmentManager(), "datepicker");
    }

    @OnClick(R.id.activity_seller_create_trip_btn_submit)
    public void submitTrip() {
        //submit
        long contohdate = 0;
        TripModel trip=new TripModel(et_destination.getText().toString(), et_origin.getText().toString(),contohdate,contohdate);
        Gson gson = new Gson();
        String json = gson.toJson(trip);
        AsyncHttpClient client = new AsyncHttpClient();

        //client.post("http://example.com")
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_create_trip);
        ButterKnife.bind(this);
        toolbar.setTitle("Create a Trip Plan");
    }
}
