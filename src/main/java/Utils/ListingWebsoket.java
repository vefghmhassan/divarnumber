package Utils;

import com.google.gson.Gson;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.apache.poi.ss.formula.functions.T;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;

public  abstract class ListingWebsoket<T> extends WebSocketListener{
    public  T t;
    @Override
    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        super.onOpen(webSocket, response);

    }

    @Override
    public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
        super.onMessage(webSocket, text);
        t=new Gson().fromJson(text, (Type) t);
        onmessage(t);
    }
    abstract  void onmessage(T t);
}
