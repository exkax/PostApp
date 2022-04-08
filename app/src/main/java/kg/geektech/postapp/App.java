package kg.geektech.postapp;

import android.app.Application;

import kg.geektech.postapp.data.remote.PostApi;
import kg.geektech.postapp.data.remote.RetroFitClient;

public class App extends Application {
    private RetroFitClient retroFitClient;
    public static PostApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        retroFitClient = new RetroFitClient();
        api = retroFitClient.createApi();
    }

}
