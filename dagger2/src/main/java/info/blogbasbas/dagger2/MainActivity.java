package info.blogbasbas.dagger2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import info.blogbasbas.dagger2.model.UserService;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserService service;

    @Inject
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView message = (TextView) findViewById(R.id.message);
        TextView messageNoPref = (TextView) findViewById(R.id.message1);

        ((MainApp)getApplication()).getComponent().inject(this);

        service.addNewUser("id","Bas","Umar");



        messageNoPref.setText("No Pref : "+service.getUser().getId()
                +" | "+service.getUser().getFirstName()
                +" | "+service.getUser().getLastName());




        preferences.edit().putString(service.getUser().getId(),
                            service.getUser().toString())
                            .apply();
        message.setText(" Inserted :"+preferences.getString(service.getUser().getId(),""));



    }
}
