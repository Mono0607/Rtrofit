package Eduardo.Yanies.rtrofit_app8

import com.google.gson.annotations.SerializedName

data class DogResponse(
    @SerializedName("status") var status:String,
    @SerializedName("message") var images:List<String>
)