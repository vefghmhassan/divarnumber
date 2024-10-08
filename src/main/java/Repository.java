import Models.Token;
import Models.divar.CategoryDTO;
import Models.divar.Divar;
import Models.divar.JsonSchemaDTO;
import Models.NumberDivar;
import Utils.Constants;
import com.google.gson.Gson;
import okhttp3.*;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

public class Repository {
    public static String getnumberdivar(String link) {
        String num = "";
        Token token=null;
        if (Constants.getToken() != null) {
            token=Constants.getToken();
        }else {
            System.console().flush();
        }
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder().url("https://api.divar.ir/v8/posts/" + link + "/contact")
                .method("GET", null)
                .addHeader("Authorization",
                        token.token
                        )
                .build();
        Response response;
        try {
            response = client.newCall(request).execute();
            if (response.code()==200) {
                NumberDivar nm = new Gson().fromJson(response.body().string(), NumberDivar.class);
                num = nm.widgets.contact.phone;
            }else  if (response.code()==429){
                token.setExpire(true);
                getnumberdivar(link);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return num.replace("(پنهان‌شده؛ چت کنید)", "").replace("(پنهان‌شده)","");

    }


    public static String GetData(int page ,String  category) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Divar divar=new Divar();
        divar.setPage(page);
        divar.setJsonSchema(new JsonSchemaDTO(new CategoryDTO(category)));
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType,new Gson().toJson(divar));
        Request request = new Request.Builder()
                .url("https://api.divar.ir/v5/search/1/"+category)
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
     Response response = client.newCall(request).execute();


        return  response.body().string();
    }
    public static   void testweb(){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder().url("wss://api-pub.bitfinex.com/ws/2").build();


        client.newWebSocket(request, new WebSocketListener() {
            @Override
            public void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
                super.onClosed(webSocket, code, reason);
                System.out.print("onClosed");
            }

            @Override
            public void onClosing(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
                super.onClosing(webSocket, code, reason);
                System.out.print("onClosed");

            }

            @Override
            public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t, @Nullable Response response) {
                super.onFailure(webSocket, t, response);
                System.out.print("onFailure");

            }

            @Override
            public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
                super.onMessage(webSocket, text);
                System.out.print("\n"+text);
            }

            @Override
            public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
                super.onMessage(webSocket, bytes);
                System.out.print(bytes);
            }

            @Override
            public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
                super.onOpen(webSocket, response);
                System.out.print("onOpen");
                webSocket.send("{ \"event\": \"subscribe\", \"channel\": \"ticker\", \"symbol\": \"tBTCUSD\"}");
                webSocket.send("What's up ?");
                webSocket.send(ByteString.decodeHex("deadbeef"));
                webSocket.close(1000, "Goodbye !");
            }
        });
    //    client.dispatcher().executorService().shutdown();
    }
}
