package info.blogbasbas.dagger2.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import info.blogbasbas.dagger2.model.User;
import info.blogbasbas.dagger2.model.UserService;


@Module
public class UserModule {

    @Provides
    @Singleton
    public UserService provideUserService() {
        return new UserService(new User());
    }

}