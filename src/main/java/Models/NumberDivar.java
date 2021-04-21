package Models;

import com.google.gson.annotations.SerializedName;

public class NumberDivar {
    @SerializedName("widgets")
    public WidgetsDTO widgets;
    @SerializedName("token")
    public String token;


    public static class WidgetsDTO {
        /**
         * contact : {"phone":"09126458175","chat":true,"is_good_time":true}
         */

        @SerializedName("contact")
        public ContactDTO contact;

      
        public static class ContactDTO {
            /**
             * phone : 09126458175
             * chat : true
             * is_good_time : true
             */

            @SerializedName("phone")
            public String phone;
            @SerializedName("chat")
            public Boolean chat;
            @SerializedName("is_good_time")
            public Boolean isGoodTime;
        }
    } 

}
