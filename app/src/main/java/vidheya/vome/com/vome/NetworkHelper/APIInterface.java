package vidheya.vome.com.vome.NetworkHelper;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import vidheya.vome.com.vome.UserModel.LoginResponse;

/**
 * Created by soniayadav on 19/10/17.
 */

public interface APIInterface {
    @FormUrlEncoded
    @POST("/TOKEN")
    Call<LoginResponse> doLoginUserWithField(@Field("grant_type") String grant_type, @Field("username") String username,@Field("password") String password);
}
