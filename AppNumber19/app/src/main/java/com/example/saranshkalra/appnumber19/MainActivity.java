package com.example.saranshkalra.appnumber19;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtCountryNames = findViewById(R.id.txtCountryNames);

        String[] countryNames = {"Afghanistan\n", "Albania\n", "Algeria\n", "American Samoa\n",
                                    "Andorra\n", "Angola\n", "Anguilla\n", "Antarctica\n", "Antigua and Bermuda\n",
                                    "Argentina\n", "Armenia\n", "Aruba\n", "Australia\n", "Austria\n",
                                    "Azerbaijan\n", "Bahamas\n", "Bahrain\n", "Bangladesh\n", "Barbados\n",
                                    "Belarus\n", "Belgium\n", "Belize\n", "Benin\n", "Bermuda\n", "Bhutan\n",
                                    "Bolivia\n", "Bosnia and Herzegovina\n", "Botswana\n", "Brazil\n",
                                    "Brunei Darussalam\n", "Bulgaria\n", "Burkina Faso\n", "Burundi\n"};

        String allCountryNames = "";

        for (String countryName : countryNames ) {

            allCountryNames += countryName;

        }

        txtCountryNames.setText(allCountryNames);


    }


}
