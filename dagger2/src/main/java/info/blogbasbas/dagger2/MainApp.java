package info.blogbasbas.dagger2;

import android.app.Application;

import info.blogbasbas.dagger2.dicomponent.DaggerDiComponent;
import info.blogbasbas.dagger2.dicomponent.DiComponent;
import info.blogbasbas.dagger2.module.AppModule;

/**
 * Created by User on 23/02/2018.
 */

public class MainApp extends Application {


    DiComponent component;
    public DiComponent getComponent() {
        return component;
    }
    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerDiComponent.builder().appModule(new AppModule(this))
                                    .build();

    }
}
