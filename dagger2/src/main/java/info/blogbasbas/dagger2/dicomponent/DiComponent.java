package info.blogbasbas.dagger2.dicomponent;

import javax.inject.Singleton;

import dagger.Component;
import info.blogbasbas.dagger2.MainActivity;
import info.blogbasbas.dagger2.module.AppModule;
import info.blogbasbas.dagger2.module.UserModule;


@Singleton
@Component(modules = {AppModule.class, UserModule.class})
public interface DiComponent {

    void inject(MainActivity activity);


}