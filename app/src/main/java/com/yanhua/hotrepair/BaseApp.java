public class BaseApp extends Application{
    @Override
    protected void attachBaseContext(Context base) {

        MultiDex.install(this);
        super.attachBaseContext(base);
    }
}