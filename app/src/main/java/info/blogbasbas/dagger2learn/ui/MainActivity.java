package info.blogbasbas.dagger2learn.ui;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import info.blogbasbas.dagger2learn.R;
import info.blogbasbas.dagger2learn.model.User;
import info.blogbasbas.dagger2learn.model.UserService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    UserService service;
    User user;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = new User();
        TextView message = (TextView) findViewById(R.id.message);
        service = new UserService(user);

        service.addNewUser("01","Bas","Umar ");

        message.setText("ID " +service.getUser().getId()+ "| First Name :"
                            +service.getUser().getFirstName()
                            +"| Last Name :"+service.getUser().getLastName());

    }


}
