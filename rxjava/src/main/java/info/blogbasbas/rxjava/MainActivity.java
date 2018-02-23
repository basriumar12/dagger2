package info.blogbasbas.rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Observable;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        io.reactivex.Observable data = io.reactivex.Observable.just("1",2,"4");
          data.subscribe(new Observer() {
              @Override
              public void onSubscribe(Disposable d) {

              }

              @Override
              public void onNext(Object o) {
                  Log.d("", "onNext: "+o.toString());

              }

              @Override
              public void onError(Throwable e) {

              }

              @Override
              public void onComplete() {
                  Log.d("", "onComplete: ");
              }
          });
        Flowable data2 = Flowable.just(1,3,2,50,40,80);
        data2.map(new Function() {
            @Override
            public Object apply(Object o) throws Exception {
                Double dataconvert = Double.parseDouble(o.toString());
                return dataconvert;
            }
        });
        data2.filter(new Predicate() {
            @Override
            public boolean test(Object o) throws Exception {
                double d = Double.parseDouble(o.toString());
                Boolean hei = d > 7;
                return hei;
            }
        });

    }
}
