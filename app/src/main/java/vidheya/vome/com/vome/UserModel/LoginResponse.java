package vidheya.vome.com.vome.UserModel;

import com.google.gson.annotations.SerializedName;

/**
 * Created by soniayadav on 19/10/17.
 */

public class LoginResponse {

        @SerializedName("access_token")
        public String accessToken;
        @SerializedName("token_type")
        public String tokenType;
        @SerializedName("userName")
        public String userName;
        @SerializedName(".issued")
        public String issuedAt;
        @SerializedName(".expires")
        public String expiredAt;

        public LoginResponse(String userName, String accessToken) {
            this.userName = userName;
            this.accessToken = accessToken;
        }




}
