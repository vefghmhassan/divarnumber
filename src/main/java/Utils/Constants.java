package Utils;

import Models.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Constants {
    public static final String findNumberPhone = "";
    private static List<Token> tokens=getTokenList();

    private static List<Token> getTokenList() {
        if (tokens == null) {
            tokens = new ArrayList<>();
            tokens.add(new Token("Basic eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoiMDkzNTE3NzQ1OTEiLCJleHAiOjE2MjAyOTI3NDcuMjA1NzE1LCJ2ZXJpZmllZF90aW1lIjoxNjE4OTk2NzQ3LjIwNTcwNCwidXNlci10eXBlIjoicGVyc29uYWwiLCJ1c2VyLXR5cGUtZmEiOiJcdTA2N2VcdTA2NDZcdTA2NDQgXHUwNjM0XHUwNjJlXHUwNjM1XHUwNmNjIn0.8l5vY9Llmr5LNzUxeyYao-yZxjcCJ4gYZj_jdAYPOog"));
            tokens.add(new Token("Basic eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoiMDkzNjQ1NDg5MTUiLCJleHAiOjE2MTUxOTk0MTIuMDU0NjA4LCJ2ZXJpZmllZF90aW1lIjoxNjEzOTAzNDEyLjA1NDU4NywidXNlci10eXBlIjoicGVyc29uYWwiLCJ1c2VyLXR5cGUtZmEiOiJcdTA2N2VcdTA2NDZcdTA2NDQgXHUwNjM0XHUwNjJlXHUwNjM1XHUwNmNjIn0.ukqgV44NNdW3qfWHqYCuZt8hFAlJAxp6AKvZohEH9MQ"));
            tokens.add(new Token("Basic eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoiMDkxNzQxMzkyNTUiLCJleHAiOjE2MjAyOTkzNzMuMzUyOTYzLCJ2ZXJpZmllZF90aW1lIjoxNjE5MDAzMzczLjM1Mjk1OCwidXNlci10eXBlIjoicGVyc29uYWwiLCJ1c2VyLXR5cGUtZmEiOiJcdTA2N2VcdTA2NDZcdTA2NDQgXHUwNjM0XHUwNjJlXHUwNjM1XHUwNmNjIn0.iLBfkxCH9X9RHNboCQyyqrqzyLjTnxG6DfwUNBod4JE"));
            tokens.add(new Token("Basic eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjoiMDkzMzQyMjM0MzIiLCJleHAiOjE2MjAyOTg1MTguMTk4MDIxLCJ2ZXJpZmllZF90aW1lIjoxNjE5MDAyNTE4LjE5ODAxMywidXNlci10eXBlIjoicGVyc29uYWwiLCJ1c2VyLXR5cGUtZmEiOiJcdTA2N2VcdTA2NDZcdTA2NDQgXHUwNjM0XHUwNjJlXHUwNjM1XHUwNmNjIn0.ZrWt0GfAHnDBpaOxEgB_LFZkmq1LQSuS-kWtCInBOEQ"));
        }
        return tokens;
    }

    public static Token getToken() {
        Token tok = null;
//       Token  token=  getTokenList().get(randInt(0, getTokenList().size()-1));
//       if (token.isExpire) {
//           return getToken() ;
//       }else {
//           return token.token;
//       }
        for (int i = 0; i < tokens.size(); i++) {
            if (!tokens.get(i).isExpire) {
                tok = getTokenList().get(i);
                break;
            }
        }
        return tok;
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
